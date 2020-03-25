import math
def isPrime(num):
    try:
        num=eval(num)
    except:
        print("您输入的不是一个数字")
        exit(-1)
    else:
        if num%1!=0:
            print("您输入的不是一个数字")
            exit(-1)
        else:
            for i in range(int(math.sqrt(num)),1,-1):
                if num%i==0:
                    return False
            else:
                return True

def main():
    num=input("请输入一个数字：")
    if isPrime(num):
        print("您输入的是一个质数")
    else:
        print("您输入的不是一个质数")

main()