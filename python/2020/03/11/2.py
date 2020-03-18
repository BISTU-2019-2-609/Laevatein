ablity=1
for i in range(1,366):
    if(i%7 in [4,5,6,7]):
        ablity=ablity*1.01
        print("{}天后能力值为：{}".format(i,ablity))
print("365天后能力值为：{}".format(ablity))