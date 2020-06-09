from random import randint

CharacterList="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"

def rancre():
    password=""
    for i in range(8):
        password+=CharacterList[randint(0,61)]
    return password

def main():
    for i in range(10):
        print("第{}个密码：{}".format(i, rancre()))

main()