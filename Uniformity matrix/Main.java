#include<iostream>
using namespace std;
int main()
{
  int flag, counteven=0, countodd=0, dim, mat[20][20];
  cin >> dim;
  for(int i =0; i<dim; i++) {
    for(int j =0; j<dim; j++) {
      cin >> mat[i][j];
      if(mat[i][j]%2 == 0) {
        flag=0;
      	counteven++;
      }
      else {
        flag=1;
      	countodd++;
      }
    }
  }
  if(counteven == (dim*dim) || countodd == (dim*dim))
    cout << "Yes";
  else
    cout << "No";
}