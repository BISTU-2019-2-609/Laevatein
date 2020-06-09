dict = {}
file = None
digits = '0123456789'

def readWords():
    global file
    file = open('C:\\Users\\GM\\Desktop\\补充单词.txt','r',encoding = 'GBK')
    string = file.read()

def editMode():
    print('*'*50)
    print('*'*50)
    while True:
        word = input("(按数字键退出)请输入您想添加或修改的单词:")
        if word in digits:
            print('*'*50)
            print('*'*50)
            return
        print('---------------------------------')
        description = input('请输入您的解释:\n')
        try:
            dict[word] += ',%s'%description
        except KeyError:
            dict[word] = '%s'%description
        print('----------添加完成--------------')

def searchMode():
    print('*'*50)
    print('*'*50)
    while True:
        word = input("(按数字键退出)想查的单词:")
        if word in digits:
            print('*'*50)
            print('*'*50)
            return
        print('---------------------------------')
        try:
            print(dict[word])
        except KeyError:
            print('对不起，这个单词没有收录')
            print('---------------------------------')

def interface():
    def switch(option):
        funcdic = {
            1:lambda: searchMode(),
            2:lambda: editMode(),
            3:lambda: exit()
        }
        return funcdic[option]()
        while True:
            print('----------欢迎使用英汉词典----------')
            print('1.查询单词\n2.添加单词\n3.退出\n')
            option = int(input('请输入您的选择：'))
            switch(option)

interface()