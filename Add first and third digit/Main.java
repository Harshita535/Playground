#include<stdio.h>
int main()
{
  int a,dig1,dig3,s;
  scanf("%d",&a);
  dig1=a/100;
  dig3=a%10;
  s=dig1+dig3;
  printf("%d", s);
  //Type your code here
  return 0;
}