#include<iostream>
#include <algorithm>
using namespace std;
 
struct college {
  char name[100], city[100];
  int ey;
  float pp;
}col[100];

int main()
{
  int n, sizeofarr;
  cout << "Enter the number of colleges" << endl;
  cin >> n;
  for(int i=0; i<n; i++) {
    cout << "Enter the details of college " << i+1 <<endl;
    cout << "Enter name" << endl;
    cin >> col[i].name;
    cout << "Enter city" << endl;
    cin >> col[i].city;
    cout << "Enter year of establishment" << endl;
    cin >> col[i].ey;
    cout << "Enter pass percentage" << endl;
    cin >> col[i].pp;
  }

	cout << "Details of colleges" << endl;
  for(int i=0;i<n;i++) {
    cout << "College:" << i+1 << endl;
    cout << "Name:" << col[i].name << endl;
    cout << "City:" << col[i].city << endl;
    cout << "Year of establishment:" << col[i].ey << endl;
    cout << "Pass percentage:" << col[i].pp << endl;
  }
    
    
}