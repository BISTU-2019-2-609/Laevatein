ablity=1
days=0
for i in range(1,366):
    if(days<=10):
        days=days+1
    else:
        days=0
        continue
    if(days%7 in [4,5,6,7]):
        ablity=ablity*1.01
print("每隔10天休息一天，一年后的能力值为：{}".format(ablity))
days=0
ablity=1
for i in range(1,366):
    if(days<=15):
        days=days+1
    else:
        days=0
        continue
    if(days%7 in [4,5,6,7]):
        ablity=ablity*1.01
print("每隔15天休息一天，一年后的能力值为：{}".format(ablity))
