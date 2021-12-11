#include <iostream>
#include <string>
using namespace std;

class classroom {
	private:
  	int roll;
  	string name;
  	float percentage;
  	public:
  	void setdata(int rolls,string names,float percentages) {
      roll = rolls;
      cout << "Student's Roll No.: " << roll << endl;
      name = names;
      cout << "Student's Name: " << name << endl;
      percentage = percentages;
      cout << "Student's Percentage: " << percentage << endl;
}
};

int main() 
{
	classroom c1;
 	c1.setdata(0, "None", 0);
    return 0;
}