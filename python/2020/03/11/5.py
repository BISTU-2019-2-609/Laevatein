str1='+'
str2=' - '*4
str3='|'
for i in range(1,12):
    if i in [1,6,11]:
        print("{0}{1}{0}{1}{0}".format(str1,str2))
    else:
        print("{0}{1}{0}{1}{0}".format(str3," "*len(str2)))