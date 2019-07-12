#include<stdio.h>
int main()
{
  int a,dig,sum=0;
  scanf("%d",&a);
  while(a>0)
  {
    dig=a%10;
    sum+=dig;
    a/=10;
  }
  printf("%d",sum);//Type your code here
  return 0;
}