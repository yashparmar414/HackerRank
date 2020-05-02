/*  
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem
 * LinkedIn :- https://www.linkedin.com/in/yashparmar414/
 * Hackerrank :- https://www.hackerrank.com/yashparmar414/
 * GitHub :- https://github.com/yashparmar414/
*/
#include <bits/stdc++.h>
using namespace std;
int birthday(vector<int> s, int d, int m) {
    int count=0;
    for(int i=0;i<=(s.size()-m);i++){
        int sum=0;
        for(int j=i;j<(i+m);j++)
            sum+=s[j];
        if(sum==d)
            count++;
    }
    return count;
}

int main()
{
    int n,m,d;
	cin>>n;
    vector<int> s(n);
	for (int i = 0; i < n; i++)
		cin>>s[i];
    cin>>d>>m;
	cout << birthday(s, d, m) << "\n";
	return 0;
}