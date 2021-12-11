#include<iostream>
using namespace std;
#include<string.h>
union book
{
char name[20];
int price;
};
int main()
{
    union book a;
    cout<<"Enter the Book details\n";
    cout<<"Enter the Book name\n";
    cin>>a.name;
    cout<<"Enter the Book price\n";
    cin>>a.price;
    cout<<"Book Details\n";
    cout<<a.name<<" "<<a.price<<"\n";
    cout<<"Enter the Book name\n";
    cin>>a.name;
    cout<<"Book Name : "<<a.name;
    return 0;
}