#include<iostream>
using namespace std;

struct employees {
  char name[20];
  int id,salary,hra,da,ma,pf,insurance;
}e[100];

int main()
{
  int n, eid;
  cout << "Enter the number of employees: "<< endl;
  cout << "Enter your input for every employee: " << endl;
  cin >> n;
	for(int i=0;i<n;i++) {
    	cout << "Employee ID:" << endl;
      	cin >> e[i].id;
      	cout << "Employee Name:" << endl;
      	cin >> e[i].name;
      	cout << "Basic Salary, HRA:" << endl;
      	cin >> e[i].salary >> e[i].hra;
      	cout << "DA, Medical Allowance:" << endl;
      	cin >> e[i].da >> e[i].ma;
      	cout << "PF and Insurance:" << endl;
      	cin >> e[i].pf >> e[i].insurance;
    }
  cout << "Enter employee ID to get payslip:" << endl;
  cin >> eid;
  for(int i=0;i<n;i++) {
    if(eid == e[i].id) {
      cout << "Salary Slip of Rajkumar " << endl;
      cout << "Employee ID: "<< e[i].id<< endl;
      cout << "Basic Salary: "<< e[i].salary<< endl;
      cout << "House Rent Allowance: "<< e[i].hra<< endl;
      cout << "Dearness Allowance: "<< e[i].da<< endl;
      cout << "Medical Allowance: "<< e[i].ma<< endl;
      cout << "Gross Salary: "<< (e[i].salary+e[i].hra+e[i].da+e[i].ma)*12<<" Rupees" << endl;
      cout << "Deductions: " << endl;
      cout << "Provident fund: "<< e[i].pf<< endl;
      cout << "Insurance: "<< e[i].insurance<< endl;
      cout << "Net Salary: "<< (e[i].salary+e[i].hra+e[i].da+e[i].ma-e[i].pf-e[i].insurance)*12<<" Rupees" << endl;
	}
  }
}
