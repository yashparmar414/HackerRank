/*  
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 * LinkedIn :- https://www.linkedin.com/in/yashparmar414/
 * Hackerrank :- https://www.hackerrank.com/yashparmar414/
 * GitHub :- https://github.com/yashparmar414/
*/
#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,score,prevBest=-1,prevWorst=1e9,bestCount=0,worstCount=0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin>>score;
        if(score<prevWorst){
            prevWorst=score;
            ++worstCount;
        }
        if(score>prevBest){
            prevBest=score;
            ++bestCount;
        }
    }
    cout<<(bestCount-1)<<" "<<(worstCount-1);
    return 0;
}