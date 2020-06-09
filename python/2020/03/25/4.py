def multi(*args):
    sum=1
    args=args[0]
    for i in args:
        sum*=eval(i)
    return sum

def main():
    num_text=input("请输入一串数字，以空格分隔:")
    print("这些数字的乘积是：{}".format(multi(num_text.split(" "))))

main()