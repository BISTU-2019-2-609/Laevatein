n=input("请输入一组元素(以空格分隔):")
InputList=n.split(" ")
if len(InputList) == len(set(InputList)):
    print("没有重复的元素")
else:
    print("有重复的元素，总共有{}个".format(len(InputList)-len(set(InputList))))