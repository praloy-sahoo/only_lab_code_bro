import java.util.Scanner;

public class ContainerOptimal {

    static int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int maxWater = 0;

        while (i < j) {

            int width = j - i;
            int h = Math.min(height[i], height[j]);
            int area = width * h;

            maxWater = Math.max(maxWater, area);

            // move the pointer with smaller height
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter heights:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        System.out.println("Maximum water (Optimal): " + maxArea(height));

        sc.close();
    }
}
