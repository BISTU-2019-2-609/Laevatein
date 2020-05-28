from requests import get
from os import system
from lxml import etree
from sys import platform

URL = "https://piao.qunar.com/ticket/list.htm?keyword=%E5%8C%97%E4%BA%AC&region=%E5%8C%97%E4%BA%AC&page={}"
URL_HADE = "https://piao.qunar.com"
TITTLE = "//*[@id=\"search-list\"]/div[{}]/div/div[2]/h3/a/text()"
HREF = "//*[@id=\"search-list\"]/div[{}]/div/div[2]/h3/a/@href"
DESCRIPTION = "//*[@id=\"mp-charact\"]/div[1]/div[1]/div[1]/p/text()"

if (platform in ["win32", "cygwin"]):
    SYSTEM_FLAG = "nt"
elif (platform in ["linux", "darwin"]):
    SYSTEM_FLAG = "unix"

def clearScreen():
    if (SYSTEM_FLAG == "nt"):
        system("cls")
    elif (SYSTEM_FLAG == "unix"):
        system("clear")
    else:
        system("cls")
        system("clear")

def printProgrammeDescription():
    clearScreen()
    print("搜索北京热门景点资料")
    print("数据来源：去哪儿网（quna.com）")
    print("-"  * 30)

def getPageContent(pageNumber):
    attractionList = []
    page = get(URL.format(pageNumber))
    try:
        page = etree.HTML(page.text)
        for i in range(15):
            attraction = {}
            attraction["Name"] = page.xpath(TITTLE.format(i + 1))[0]
            attraction["Url"] = page.xpath(HREF.format(i + 1))[0]
            attractionList.append(attraction)
            if (attraction["Name"] == ""):
                raise ConnectionError()
        return attractionList
    except:
        print("网络错误，请稍后重试")
        exit(-1)

def printAttractionList(pageNumber, attractionList):
    printProgrammeDescription()
    print("第{}页：".format(pageNumber))
    i = 1
    for attraction in attractionList:
        print("\t{}.{} {}".format(pageNumber, i, attraction["Name"]))
        i += 1
    print("-" * 30)

def getAttractionDescription(Url):
    try:
        page = get(Url)
        page = etree.HTML(page.text)
        attractionDescription = page.xpath(DESCRIPTION)
        if (attractionDescription == ""):
            raise ConnectionError()
        return attractionDescription
    except:
        print("网络错误，请稍后重试")
        exit(-1)

def printAttractionDescription(attractionName, attractionDescription):
    printProgrammeDescription()
    print(attractionName)
    for p in attractionDescription:
        print(p)
    print("-" * 30)

def main():
    printProgrammeDescription()
    pageNumber = 1
    attractions = getPageContent(pageNumber)
    while(True):
        printAttractionList(pageNumber, attractions)
        print("输入景点前序号可查看景点介绍，输入P+数字（如P5）可跳转到指定页面，输入0可退出程序")
        command = input("请输入指令：")
        if (command == "0"):
            break
        elif (command[0] in ["P", "p"]):
            try:
                int(command[1:])
            except:
                print("输入指令有误，请重新输入")
                input("按回车继续")
                continue
            pageNumber = command[1:]
            attractions = getPageContent(pageNumber)
            printAttractionList(pageNumber, attractions)
        elif (command.find(".") != -1):
            attractionIndex = command[command.index(".") + 1:]
            try:
                attractionIndex = int(attractionIndex) - 1
            except:
                print("输入指令有误，请重新输入")
                input("按回车继续")
                continue
            Name = str(attractions[attractionIndex]["Name"])
            Url = str(attractions[attractionIndex]["Url"])
            Url = Url[:Url.index("?")]
            attractionDescription = getAttractionDescription(URL_HADE + Url)
            printAttractionDescription(Name, attractionDescription)
            input("按回车返回上一级")
        else:
            print("输入指令有误，请重新输入")
            input("按回车继续")

main()