bool isPalindrome(long long int x) {
    long long int temp = (x);
    long long int sum=0;
    while(temp!=0){
        int val = temp%10;
        sum*=10;
        sum+=val;
        temp/=10;
    }
    if((x)==sum && x>=0){
        return true;
    }
    else{
        return false;
    }
}