def isNum(num):
    try:
        eval(num)
    except:
        return False
    else:
        return True

def main():
    num=input("请输入一些字符：")
    if isNum(num):
        print("这是个数字")
    else:
        print("这不是个数字")

main()