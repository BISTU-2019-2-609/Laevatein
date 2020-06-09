#include<stdio.h>
int main(){
    int mc=0,fc=0,cc=0,money;
    while (mc<=100)
    {
        while (fc<=100-mc)
        {
            while (cc<=100-mc-fc)
            {
                if ((cc+fc+mc==100) && ((cc/3)+(fc*3)+(mc*5)==100))
                {
                    printf("公鸡数量：%d\n",mc);
                    printf("母鸡数量：%d\n",fc);
                    printf("小鸡数量：%d\n\n",cc);
                    cc=cc+3;
                }
                else
                {
                    cc=cc+3;
                }
                
            }
            cc=0;
            fc++;
        }
        fc=0;
        mc++;
    }
    
}