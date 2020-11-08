#include <iostream>
using namespace std;
#define add(a,b) (a+b)
#define sub(a,b) (a-b)
#define mul(a,b) (a*b)
#define mod(a,b) (a%b)
int main()
{
    int a,b;
    cin>>a>>b;
    cout<<add(a,b)<<endl<<sub(a,b)<<endl<<mul(a,b)<<endl<<mod(a,b);
    return 0;
}