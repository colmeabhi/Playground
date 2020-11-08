#include<iostream>
using namespace std;
int main()
{
  int mat[10][10], dim, sumDiag1=0, sumDiag2=0, arrCheck[10], sumRow=0, sumCol=0, count=0;
  cin >> dim;
    for(int i =0; i<dim; i++) {
      for(int j =0; j<dim; j++) {
        cin >> mat[i][j];

        sumRow += mat[i][j];
      }
      //cout << sumRow << endl;
      count++;
      arrCheck[i] = sumRow;
      sumRow = 0;
    }
  for(int i =0; i<dim; i++) {
    for(int j =0; j<dim; j++) {
      sumCol += mat[j][i];
      if(i == (dim-1-j)) 
        sumDiag2 += mat[i][j];
      
      if(i == j) 
        sumDiag1 += mat[i][j];
    }
    //cout << sumCol << endl;
    arrCheck[i+count] = sumCol;
    sumCol = 0;
  }
if(sumDiag1 == sumDiag2)
  cout << "Yes";
else
  cout << "No";
}