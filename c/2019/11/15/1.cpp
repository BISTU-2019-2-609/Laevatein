#include<stdio.h>
#include<string.h>

void find_longest_word(char sentence[]);

int main(){
    char sentence[65536];
    fgets(sentence,65535,stdin);
    find_longest_word(sentence);
    return 0;
}

void find_longest_word(char sentence[]){
    char word[256][65536];
    int no=0,destion=0;
    for(int i=0;i<=255;i++){
        while(true){
            if(sentence[i]==32){
                no++;
                destion=0;
                continue;
            }
            word[no][destion]=sentence[i];
            i++;
        }
    }
    for(int i=0;i<no;i++){
        int now=0,longest=0,longest_no=0;
        now=strlen(word[i]);
        if(now>=longest){
            longest=now;
            longest_no=i;
        }
        printf("%s",word[longest_no]);
    }
}