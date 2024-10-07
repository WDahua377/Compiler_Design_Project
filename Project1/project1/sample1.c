#include <stdio.h>
int main(){
   int a = 0,b = 0;
   long l;
   char c;
   double d;
   struct A{
      float n;
   }p;
   scanf("%d %c",&a,&c);
   for(int i = 0;i < 10;i++){
      a += b+i;
   }
   //hello i am comment
   /* yeah */
   printf("%d and %c\n", a, c);
   return 0;
}
