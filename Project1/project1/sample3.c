#include <stdio.h>
#include <string.h>
void func(int i,const int a){
    int j = 5, b = 10;
    while(1){
        if(i < a)
            i++;
        else if(j < b)
            j++;
        else
            break;
    }
}
int main(){
    int q[] = {111,222,333};
    q[2] = 90/10;
    q[1] = q[1] % 100;
    if(q[0] != 111){
        ;
    }
    int fi_075 = 0, fa_123 = 123;
    func(fi_075, fa_123);
    return 0;
}
