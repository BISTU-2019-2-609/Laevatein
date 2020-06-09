text=input("请输入一段文字：")
alpha=0
chinese=0
number=0
space=0
other=0
for character in text:
    if u'\u4e00' <= character <= u'\u9fa5':
        chinese+=1
    elif character.isdigit():
        number+=1
    elif character.isspace():
        space+=1
    elif character.isalpha():
        alpha+=1
    else:
        other+=1
print("这段文字有{}个中文字符，{}个英文字符，{}个数字，{}个空格和{}个其他字符".format(chinese,alpha,number,space,other))