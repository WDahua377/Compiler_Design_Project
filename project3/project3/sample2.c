void main(){
   int num = 10, r = 7;

   printf("Please enter a number:");
   scanf("%d", &num);

   if(num >= 10){
      num -= 1;
   }
   if(num <= 10){
      num = 1 + r;
   }
   else{
      num += 1;
   }
   
   printf("The number is %d\n",num);
}