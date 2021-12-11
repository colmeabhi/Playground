#include<bits/stdc++.h>
using namespace std;
int CountSpecificNumber(int m,int n);
int main()
{
	int m,n;
	cin>>m>>n;
	cout<<CountSpecificNumber(m,n);
	return 0;
}
int CountSpecificNumber(int m,int n)
{
	if(m<=n)
	{
		int i,count=0;
		for(i=m;i<=n;i++)
		{
			int num=i,flag=1;
			while(num)
			{
				int n = num%10;
				num=num/10;
				if(n == 1 || n == 4 || n == 9)
					continue;
				else
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				count++;
		}
	return count;
	}
	return -1;
}