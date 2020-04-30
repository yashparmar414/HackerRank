/*  
 * https://www.hackerrank.com/challenges/between-two-sets/problem
 * Mail :- yashparmar414@gmail.com
 * LinkedIn :- https://www.linkedin.com/in/yashparmar414/
 * Hackerrank :- https://www.hackerrank.com/yashparmar414/
 * GitHub :- https://github.com/yashparmar414/
*/
#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);
vector<string> split(const string &);

/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

int getStepwiseGCD(int a, int b) 
{ 
     while (b > 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
int getGCD(vector<int> arr) 
{ 
    int gcd = arr.at(0);
        for (int i = 1; i < arr.size(); i++)
            gcd = getStepwiseGCD(gcd, arr.at(i));
        return gcd;
}
int getStepwiseLCM(int a, int b) {
    return a * (b / getStepwiseGCD(a, b));
}
int getLCM(vector<int> arr) {
    int lcm = arr.at(0);
    for (int i = 1; i < arr.size(); i++) 
        lcm = getStepwiseLCM(lcm, arr.at(i));
    return lcm;
}

int getTotalX(vector<int> arr1, vector<int> arr2) {
    if(arr1.at(arr1.size()-1) > arr2.at(0))
        return 0;
    int lcm = getLCM(arr1);
    int gcd = getGCD(arr2); 
    int count = 0;
    for(int i = lcm,j=2; i<=gcd; i=lcm*j,j++)
        if(gcd%i==0)
            count++;
    return count;
}
  
int main()
{
    int n,m;
	cin>>n>>m;
    vector<int> arr(n);
	vector<int> brr(m);
    for (int i = 0; i < n; i++) 
        cin>>arr[i];

    for (int i = 0; i < m; i++) 
        cin>>brr[i] ;

    int total = getTotalX(arr, brr);
    cout << total << "\n";
    return 0;
}
