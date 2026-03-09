
/*
1. An integer array representing height of length n is given as input. There are n vertical lines drawn
from the array such that the two endpoints of the i

th line are (i, 0) and (i, height[i]). Any two lines
along with the x-axis form a container that can hold water. Find the largest container that can hold
maximum water. Collection classes are NOT allowed.
*/

import java.util.Scanner;

public class Ques1 {
    static int max_AREA(int[] height){
        int n = height.length;
        int max_area = 0;
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int cur_width = j-i; 
                int cur_height = Math.min(height[i],height[j]);
                int area = cur_height*cur_width;
                max_area = Math.max(area,max_area);
            }
        }
        return max_area;
    }
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the row");
int n = sc.nextInt();
int height[] = new int[n];
System.out.println("enter the heights");
for(int i=0;i<n;i++){
    height[i] = sc.nextInt();
}
System.out.println("max area is "+max_AREA(height));

}

}
