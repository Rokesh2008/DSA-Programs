#include <ctype.h>
#include <limits.h>

int myAtoi(char* s) {
    int i = 0;
    long long fin = 0;
    int sign = 1;
    while(s[i] == ' ') i++;
    if(s[i] == '-' || s[i] == '+') {
        if(s[i] == '-') sign = -1;
        i++;
    }
    while(isdigit(s[i])) {
        fin = fin * 10 + (s[i] - '0');
        if(sign == 1 && fin > INT_MAX) return INT_MAX;
        if(sign == -1 && -fin < INT_MIN) return INT_MIN;
        i++;
    }
    return (int)(sign * fin);
}
