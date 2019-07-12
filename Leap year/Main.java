#include<stdio.h>
int main()
{
  int year,a; 
  scanf("%d",&year);
  if(year%400==0)
    a=1;
  if(year%4==0)
    a=1;
  if(year%100==0)
    a=0;
  if(a==1)
    printf("Leap year");
  else 
    printf("Not Leap year");
  //Type your code here
  return 0;
}