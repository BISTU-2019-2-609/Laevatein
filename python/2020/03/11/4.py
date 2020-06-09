num=input("请输入一个数字：")
num1=""
try:
    int(num)
except:
    print("您输入的不是一个数字")
    exit(-1)
for i in range(len(num)-1,-1,-1):
    num1=num1+num[i]
if num1==num:
    print("您输入的是回文数")
else:
    print("您输入的不是回文数")