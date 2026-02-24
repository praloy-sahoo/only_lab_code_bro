import java.util.Scanner;

public class ContainerBrute {

    static int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int width = j - i;
                int h = Math.min(height[i], height[j]);
                int area = width * h;

                maxWater = Math.max(maxWater, area);
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

        System.out.println("Maximum water (Brute Force): " + maxArea(height));

        sc.close();
    }
}
