#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
    int marks ;
    cout << "ENTER YOUR MARKS:";
    cin>>marks;
    
    if (marks >= 90){
        cout <<"Grade A+"<<endl;
    }
    else if (marks >= 80) {
        cout<<"Grade A"<<endl;
        
    }
      else if (marks >= 60) {
        cout<<"Grade B"<<endl;
    }
      else if (marks >= 50) {
        cout<<"Grade C"<<endl;
    }
      else if (marks >= 35) {
        cout<<"Grade B"<<endl;
    }
      else if (marks <= 34) {
        cout<<"Fail"<<endl;
    }
    return 0;
}