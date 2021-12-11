#include <iostream>
#include<vector>
using namespace std;

int main() 
{
	int n;
  cin >> n;
  vector<int> arr;
  for(int i=0;i<n;i++){
    int val;
    cin >> val;
  	arr.push_back(val);
  }
  int index, entry;
  cin >> index >> entry;
  auto itPos = arr.begin() + index-1;
  auto newval = arr.insert(itPos , entry);
  for(int j=0;j<arr.size();j++) {
    cout << arr[j] << " ";
  }
  
}