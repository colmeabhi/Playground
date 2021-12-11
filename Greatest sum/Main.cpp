#include<iostream>
using namespace std;
#include<string.h>
int main()
{
    int r,c,i,j,a[100][100],sum,sum1,m1,mi;
    cin>>r>>c;
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            cin>>a[i][j];
        }
    }
    cout<<"Sum of rows is";
    for(i=0;i<r;i++)
    {
        sum=0;
        for(j=0;j<c;j++)
        {
             sum=sum+a[i][j];  
         
        }
        if(i==0)
        {
            mi=1;
            m1=sum;
        }
        else if(m1<sum)
        {
            mi=i+1;
            m1=sum;
        }
        cout<<" "<<sum;
    }
    cout<<"\nRow "<<mi<<" has maximum sum";
    cout<<"\nSum of columns is";
    for(i=0;i<c;i++)
    {
        sum1=0;
        for(j=0;j<r;j++)
        {
            sum1=sum1+a[j][i];   
        }
        if(i==0)
        {
            mi=1;
            m1=sum1;
        }
        else if(m1<sum1)
        {
            mi=i+1;
            m1=sum1;
        }
        cout<<" "<<sum1;
    }
    cout<<"\nColumn "<<mi<<" has maximum sum";
    return 0;
}