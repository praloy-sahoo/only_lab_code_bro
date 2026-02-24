/*
3. Input n and consider an array of 1 to n natural numbers. Skip every second value and print the
resulting series. Then select every third value from the remaining numbers. Print the resulting series.
Repeat this process till the skip count becomes greater than the length of the list.
{1,2,3,4,5,6,7,8,9,10}→{1,3,5,7,9}→{1,7}

*/
import java.util.Scanner;
import java.util.ArrayList;



public class Problem_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("enter the n"));
        int n = sc.nextInt();
        ArrayList<Integer>arr = new ArrayList<>();
        for(int i =1;i<=n;i++){
            arr.add(i);
        }
        int skip_count = 2;
        System.out.println(arr);
        while(skip_count<=arr.size()){
            ArrayList<Integer>temp_list = new ArrayList<>();
            for(int i=0;i<arr.size();i++){
                if((i)%skip_count==0){
                    temp_list.add(arr.get(i));
                }
            }
            arr  = temp_list;
            System.out.println(temp_list);
            skip_count++;
        }
        sc.close();
    }
}
