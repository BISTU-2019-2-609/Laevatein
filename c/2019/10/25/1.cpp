#include<stdio.h>
#include<string.h>
int main(){
    FILE*stream;
    char names[10][255];
    int i,n,k;
    char tmp[255];
    for(i=0;i<10;i++){
        fgets(names[i],255,stream);
    }
    for(n=0;n<10;n++){
        for(k=0;k<9-n;k++){
            if (strcmp(names[k],names[k+1])>0){
                strcpy(tmp,names[k]);
                strcpy(names[k],names[k+1]);
                strcpy(names[k+1],tmp);
            } 
        }
    }
    printf("\n");
    for(i=0;i<10;i++){
        puts(names[i]);
    }
    return 0;
}