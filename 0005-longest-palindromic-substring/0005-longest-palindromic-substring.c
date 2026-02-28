#include<string.h>
char* longestPalindrome(char* s) {
    int len = strlen(s),count = 0,maxcount = 1;
    static char str[5000] = " ";
    static char fin[5000];
    fin[0]=s[0];
    fin[1]='\0';
    for(int i = 0;i<len;i++){
        for(int j = i+1;j<len;j++){
            int l = i, r = j;
            int ok = 1;

            while(l < r){
                if(s[l] != s[r]){
                    ok = 0;
                    break;
                }
                l++;
                r--;
            }
            count = j-i+1;
            if(ok){
            if(count>maxcount){
                maxcount = count;
                for(int k = 0;k<count;k++){
                    fin[k]=s[i+k];
                }
                fin[count]='\0';
            }}
        }        
    }
    return fin;
}