def gcd(a,b):
    if(a%b==0):
        return b
    else:
        c=gcd(b,a%b)
        return c

nums=input("请输入两个数，以空格分隔：")
num=nums.split(" ")
try:
    numa=eval(num[0])
    numb=eval(num[1])
except:
    print("您输入的不是数字")
    exit(-1)
if numa%1!=0 or numb%1!=0:
    print("您输入的不是整数")
    exit(-1)
if numa>numb:
    gcdm=gcd(numa,numb)
elif numa<numb:
    gcdm=gcd(numb,numa)
elif numa==numb:
    gcdm=numa
print("这两个数的最大公因数是{}".format(gcdm))
ncmn=int((numa*numb)/gcdm)
print("最小公倍数是{}".format(ncmn))