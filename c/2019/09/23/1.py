print("这个程序将帮助您计算存款所得\n目前这个程序仅能以一年为单位进行计算")
deposit=float(input("请输入本金："))
rate=float(input("请输入利率："))
cycle=int(input("请输入存期："))
money=deposit
year=0
while year<cycle:
    money=money*(1+(rate/100))
    year=year+1
    print("第 {} 年结束时，您账户总额为 {} 元".format(year,money))
print("经过 {} 年，您的的存款所得为 {} 元".format(year,money-deposit))