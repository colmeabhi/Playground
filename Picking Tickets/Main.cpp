#include <iostream>
#include <vector>
#include<algorithm> 
using namespace std;

int main() 
{
   vector <int> arr;
	int count = 0;
  int flag = 0;
  int maxi=0;
  int n, val;
  cin >> n;
  for(int i=0;i<n;i++) {
    cin >> val;
    arr.push_back(val);
  }
  sort(arr.begin(), arr.end());
  for(int i=0;i<arr.size();i++) {
    int diff = arr[i+1]-arr[i];
    if(diff==0||diff==1) {
      count++;
      flag=1;
    } else {
      if(count>maxi) 
        maxi=count;
      count = 0;
    }
  }
    if(flag==1)
      cout<< max(count,maxi)+1;
    else 
      cout<< count;
  }