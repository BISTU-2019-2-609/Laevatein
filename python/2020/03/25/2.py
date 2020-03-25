def isOdd(num):
    if num%2==0:
        return True
    else:
        return False

def main():
    num=int(input("请输入一个数字："))
    if isOdd(num):
        print("这是个偶数")
    else:
        print("这不是个偶数")

main()