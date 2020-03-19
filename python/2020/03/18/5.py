import random

target=random.randint(0,100)
times=0
num=-1
while(num!=target):
    num=input("请输入一个零到一百的整数：")
    try:
        try:
            num=eval(num)
        except:
            raise(ValueError("NotNumber"))
        if(num%1!=0):
            raise(ValueError("NotInt"))
        elif(not(0<=num<=100)):
            raise(ValueError("OutOfRange"))
    except:
        print("您输入的不是零到一百的整数，请重新输入！")
    else:
        times+=1
        if(num<target):
            print("很遗憾，猜小了！")
        elif(num>target):
            print("很遗憾，猜大了！")
else:
    print("祝贺您，您第{}次猜对了！".format(times))