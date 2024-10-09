int main(){
   int a;
   a = 1;
   a = a+1;
   if(a < 1){
      printf("a == 2:\n");
      if(a > 1){
         printf("It's wrong.\n");
      }
   }
   else{
      printf ( "Yes, a == %d" , a ) ;
   }
}
