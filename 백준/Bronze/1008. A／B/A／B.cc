#include<stdio.h>

int main(void){
    int a,b;
    double output = 0;
    scanf("%d %d",&a,&b);
  
    printf("%0.9f",(double)a/b);
    return 0;
}