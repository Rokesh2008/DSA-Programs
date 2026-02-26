int lengthOfLongestSubstring(char* s) {
    int len = strlen(s);
    int max = 0,i=0;
    while(i<len && (isalpha(s[i]) || s[i]==' ')){
        int count = 1,isthere = 0;
        for(int j = i+1;j<len;j++){
            for(int k = j-1;k>=i;k--){
                if(s[k]==s[j]){
                    isthere = 1;
                }
            }
            if(isthere==1){
                break;
            }
            count++;
        }
        if(count>max){
            max = count;
        }
        i++;
    }
    return max;
}