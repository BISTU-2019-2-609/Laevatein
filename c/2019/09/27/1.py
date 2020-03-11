print("程序中有存储一个数字，你可以尝试一下猜出这个数字")
while True:
    a=int(input("请输入您猜的数字："))
    if a==12:
        print("您猜对了")
        break
    else:
        if a<12:
            print("您猜的数字小了")
        else:
            print("您猜的数字大了")