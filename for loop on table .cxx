#include<iostream>
#include<conio.h>

using namespace std;

int main()
{
	int num;
	cout<<"Enter a num:";
	cin>>num;
	cout<<"multiplication table of :"<<num;
	for(int i=1;i<=10;++i)
	{
	    cout<<num<<"*"<<i<<"="<<num*i<<endl;
	}
	return 0;
}