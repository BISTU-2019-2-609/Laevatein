str = eval('input("请输入金额（美元以USD结尾，人民币以CNY结尾）：")')
if str[-3:] == "USD":
    print("可兑换为：{}CNY".format((float(str[:-3])*8)
elif str[-3:] == "CNY":
    print("可兑换为：{}USD".format(float(str[:-3])/8)
else:
    print("输入不合规！")