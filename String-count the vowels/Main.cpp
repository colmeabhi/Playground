#include<iostream>
using namespace std;
#include<string.h>
int main()
{
    char a[10];
    cin>>a;
    int i,count=0;
    for(i=0;a[i]!='\0';i++)
    {
        if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
        {
        count++;
        }
    }
    cout<<"Number of vowels: "<<count;
    return 0;
}