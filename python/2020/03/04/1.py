tempstr = eval('input("请输入温度（华氏度以F结尾，摄氏度以C结尾）：")')
if tempstr[-1] == "F":
    print("其对应的摄氏度为：{:.0f}C".format((float(tempstr[:-1])-32)/1.8))
elif tempstr[-1] == "C":
    print("其对应的华氏度为：{:.0f}F".format(float(tempstr[:-1])*1.8+32))
else:
    print("输入不合规！")