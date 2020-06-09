#include<stdio.h>
int main(){
    void judge(char);
    while (true){
        printf("Please input a character:");
        char letter;
        scanf("%c",&letter);
        getchar();
        if (letter==35){
            printf("End of Pragamme.\n");
            break;
        }
        else{
            judge(letter);
        }
    }
}

void judge(char chara){
    if(chara>=48 && chara<=57){
        printf("This is a number.\n");
    }
    else if(chara>=65 && chara<=90){
        printf("This is a capital.\n");
    }
    else if(chara>=97 && chara<=122){
        printf("This is a lowercase letter.\n");
    }
    else{
        printf("This is a other character.\n");
    }
}