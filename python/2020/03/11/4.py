num=int(input("请输入一个数字："))
tenth=int(num/10000)
th=int((num-tenth*10000)/1000)
hu=int((num-tenth*10000-th*1000)/100)
ten=int((num-tenth*10000-th*1000-hu*100)/10)
one=num-tenth*10000-th*1000-hu*100-ten*10
if(tenth==one and th==ten):
    print("这是一个回文数")
else:
    print("这不是一个回文数")