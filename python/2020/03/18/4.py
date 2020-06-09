import random

target=random.randint(1,10)
times=0
num=-1
while(num!=target):
    times+=1
    num=eval(input("请输入一个零到十的整数："))
    if(num<target):
        print("很遗憾，猜小了！")
    elif(num>target):
        print("很遗憾，猜大了！")
else:
    print("祝贺您，您第{}次猜对了！".format(times))