#include<iostream>
#include<algorithm>
#include<array>
#include<math.h>
#include<bits/stdc++.h>
#define ll long long int
#define usi unsigned short int
using namespace std;

int arr[10007];
void solve() {
	ll n, k;
	cin >> n >> k;
	ll a[n + 1];
	map<ll, ll> mp;
	ll ans = 0;
	for (ll i = 0; i < n; i++) {
		cin >> a[i];
	}
	ll col[n + 1][n + 1] = {0};
	for (ll i = 0; i < n; i ++) {
		for (ll j = 0; j < n; j++) {
			col[i][j] = 0;
		}
	}
	for (ll i = 0; i < n; i++) {
		mp.clear();
		for (ll j = i; j < n; j++) {
			col[i][j] = (j == 0) ? 0 : col[i][j - 1];
			if (mp.count(a[j])) {
				if (mp[a[j]] == 1) {
					col[i][j]++;
				}
				col[i][j]++;
			}
			mp[a[j]]++;
		}
	}
	ans = 1e18;
	ll table = 100;
	ll dp[101][1001] = {0};
	for (int i = 0; i <= table; i++) {
		for (ll j = 0; j <= table; j++) {
			dp[i][j] = 0;
		}
	}
	for (ll i = 1; i < n + 1; i++) {
		dp[1][i] = col[0][i - 1];
	}
	for (ll i = 2; i <= table; i++) {
		dp[i][1] = 0;
	}
	for (ll i = 2; i <= table; i++) {
		for (ll j = 2; j <= n; j++) {
			ll best = 1e18;
			for (ll p = 1; p < j; p++) {
				best = min(best, dp[i - 1][p] + col[p][j - 1]);
			}
			dp[i][j] = best;
		}
	}
	cout << "\nCOL:" << endl;
	for (int i = 0; i < (n + 1); i++) {
		for (int j = 0; j < (n + 1); ++j) {
			cout << col[i][j] << "   ";
		}
		cout << endl;
	}
	cout << "\nDP:" << endl;
	for (int i = 1; i < (n + 2); i++) {
		for (int j = 1; j < (n + 2); ++j) {
			cout << dp[i][j] << "   ";
		}
		cout << endl;
	}
	for (table = 1; table <= (n + 2); table++) {
		ans = min(table * k + dp[table][n], ans);
		cout << ans << endl;
	}

}

int main() {
#ifndef ONLINE_JUDGE
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);
#endif
	ios_base::sync_with_stdio(false);	cin.tie(NULL);
	int t;	cin >> t;
	while (t--) {
		solve();
	}
}
