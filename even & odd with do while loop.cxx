#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
	int num;
	char a;
	do
	{
	   cout<<"ENTER A NUM=";
	   cin>>num;
	   if(num%2==0)
	   {
	      cout<<"EVEN NUM"<<endl;
	   }
	   else 
	  cout<<"ODD NUM"<<endl;
	  
	  cout<<"DO YOU WANT TO CLICK MORE PRESS Y/N=  ";
	  cin>>a;    
	}
	while(a=='y');
	
	return 0;
}