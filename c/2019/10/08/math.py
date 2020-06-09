def f(x): #待找零点的函数
    ff=(x**3)-(4*(x**2))+1
    return ff

def get(l,r,m):
    if f(l)*f(m)<0: #零点在区间左半部分
        r=m
        m=(l+r)/2
    if f(r)*f(m)<0: #零点在区间右半部分
        l=m
        m=(l+r)/2
    return l,r,m


def main():
    l=0 #区间左界限
    r=1 #区间右界限
    n=0
    while n<10000:
        m=(l+r)/2 #区间中点
        if f(m)==0:
            print("The zero point is {}".format(m))
            break #如果区间中点是零点，则输出零点并结束程序
        else:
            l,r,m=get(l,r,m)
            n+=1 #不是则进行下一次计算
    else:
        if l==r:
            l=l-0.0000000000000001
            r=r+0.0000000000000001
        #如果因为精度上限导致区间界限相同，则略微扩大区间
        print("The zero point is in ({},{})".format(l,r))
        
main()