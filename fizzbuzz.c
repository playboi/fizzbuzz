#include<stdio.h>

int main(){

  for(int i = 1; i <= 100; i++ ){
    if( i % 3  == 0){

      if(i % 5 == 0){
        printf("FizzBuzz\n");
      }

      printf("Fizz\n");
    }else{
      if( i % 5 == 0){
        printf("Buzz\n");
      }else{
         printf("%d\n", i);
      }
    }
  }

  return 0;
}
