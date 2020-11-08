#include<iostream>
using namespace std;

struct employee {
  char name[20], designation[20];
  int id, salary, age;
}e1;

int main() {
  cout << "Enter name:" << endl;
  cin >> e1.name;
  cout << "Enter ID:" << endl;
  cin >> e1.id;
  cout << "Enter age:" << endl;
  cin >> e1.age;
  cout << "Enter designation:" << endl;
  cin >> e1.designation;
  cout << "Enter Salary:" << endl;
  cin >> e1.salary;
  cout << "Employee Details" << endl;
  cout << "Name of the Employee : " << e1.name << endl;
  cout << "ID of the Employee : " << e1.id << endl;
  cout << "Age of the Employee : " <<e1.age << endl;
  cout << "Designation of the Employee : "<< e1.designation << endl;
  cout << "Salary of the Employee : "<< e1.salary << endl;
}
