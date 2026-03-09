#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

class Solution {
public:
    int maxArea(vector<int>& height) {
        int n = height.size();
        int i =0,j = n-1;
        int max_water = 0;
        while(i<j){
            int w = j-i;
            int h = min(height[i],height[j]);
            int area = w*h;
            max_water = max(max_water,area);
            // move greddiyly
            if(height[i]>height[j]){
                // means we move j
                j--;
            }else{
                i++;
            }
        }
        return max_water;
    }
};