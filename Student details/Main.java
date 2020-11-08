#include <iostream>
using namespace std;
#include<string.h>
struct Student
{
char name[30];
char department[20];
int yearOfStudy;
float cgpa;
}st[10];
int main()
{
    int i,n,j;
    cout<<"Enter the number of students\n";
    cin>>n;
    for(i=1;i<=n;i++)
    {
        cout<<"Enter the details of student "<<i<<"\n";
        cout<<"Enter name\n";
        cin>>st[i].name;
        cout<<"Enter department\n";
        cin>>st[i].department;
        cout<<"Enter year of study\n";
        cin>>st[i].yearOfStudy;
        cout<<"Enter cgpa\n";
        cin>>st[i].cgpa;
    }
    cout<<"Details of students";
    for(i=n,j=1;i>0;i--,j++)
    {
        cout<<"\nStudent "<<j;
        cout<<"\nName:"<<st[i].name;
        cout<<"\nDepartment:"<<st[i].department;
        cout<<"\nYear of study:"<<st[i].yearOfStudy;
        cout<<"\nCGPA:"<<st[i].cgpa;
    }
    return 0;
}