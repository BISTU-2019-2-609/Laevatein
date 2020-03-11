getgrade=input("请输入所有人的成绩，以空格分隔：\n")
grade=getgrade.split(" ")
target_grade=int(input("请输入要查找的成绩：\n"))
count=0
for person in grade:
    if int(person)==target_grade:
        count+=1
print("成绩为 {} 的学生有 {} 人".format(target_grade,count))