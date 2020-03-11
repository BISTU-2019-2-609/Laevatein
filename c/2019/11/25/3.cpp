#include <stdio.h>
#define NUM_STUDENTS 4
#define NUM_CLASSES 5
#define ID_LENGTH 15
void avg_class(int *scores, int n);
void find_fail(char (*ids)[ID_LENGTH], int *scores, int n);
void find_better(char *ids, int (*scores)[NUM_CLASSES], int avg_score, int min_score);
int main(void){
    char ids[NUM_STUDENTS][ID_LENGTH];
    int scores[NUM_STUDENTS][NUM_CLASSES];
    int n=0;
    int avg_score=0,min_score=0;
    for(int i=0;i<NUM_STUDENTS;i++){
        scanf("%s",ids[i]);
        for (int j=0;j<NUM_CLASSES;j++){
            scanf("%d",&scores[i][j]);
        }
    }
    printf("\n要计算平均成绩的课程序号：[0--%d]",NUM_CLASSES-1);
    scanf("%d",&n);
    avg_class(*scores,n);
    printf("\n要统计不及格课程的数量：[1--%d]",NUM_CLASSES);
    scanf("%d",&n);
    find_fail(ids,*scores,n);
    printf("\n不低于的平均成绩：");
    scanf("%d",&avg_score);
    printf("不低于的全部成绩：");
    scanf("%d",&min_score);
    find_better(*ids,scores,avg_score,min_score);
    return 0;
}

void avg_class(int *scores,int n){
    int i;
    float sum=0,avg;
    scores+=n;
    for(i=0;i<4;i++){
        sum=sum+*scores;
        scores+=5;
    }
    avg=sum/4;
    printf("序号%d的课程平均成绩为%.2f\n",n,avg);
}

void find_fail(char (*ids)[ID_LENGTH],int *scores,int n){
    int i,z=0,j,e;
    float sum=0,avg;
    for(j=0;j<4;j++){
        for(i=0;i<5;i++){
            if(*scores<60){
                z++;
            }
            scores++;
        }
        if(z>=n){
            ids+=j;
            printf("%s",*ids);
            scores-=5;
            printf("全部成绩:");
            for(e=0;e<5;e++){
                printf(" %d",*scores);
                sum+=*scores;
                scores++;
            }
            avg=sum/5;
            printf(" 平均成绩:%.2f",avg);
        }
        ids-=j;
        z=0;
    }
}

void find_better(char *ids,int (*scores)[NUM_CLASSES],int avg_score,int min_score){
    int i,j,z=0,e,t,a;
    float sum=0,avg;
    for(i=0;i<4;i++){
        for(j=0;j<5;j++){
            if(*(*(scores+i)+j)>=min_score){
                z++;
            }
            sum+=*(*(scores+i)+j);
        }
        avg=sum/5;
        if((z==5)||(avg>=avg_score)){
            for(t=0;t<15;t++){
                printf("%c",*ids);
                ids++;
            }
            printf(" 全部成绩：");
            for(e=0;e<5;e++){
                printf(" %d",*(*(scores+i)+e));
            }
            printf(" 平均成绩:%.2f\n",avg);
        }
        else{
            for(a=0;a<15;a++){
                    ids++;
            }
        }
        sum=0;
        z=0;
    }
}