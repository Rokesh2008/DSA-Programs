#include<limits.h>
int reverse(int x){
    long long int temp = x,sum=0;
    while(temp!=0){
        int val=temp%10;
        sum*=10;
        sum+=val;
        
        temp/=10;
    }   
    if(sum>=INT_MAX || sum<=INT_MIN){
            return 0;
        }
    else if(x<0){
        sum=-sum;
        return -sum;
    }
    else{
        return sum;
    }
}