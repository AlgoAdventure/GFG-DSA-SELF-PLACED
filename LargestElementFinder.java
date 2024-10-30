import java.util.Scanner;

public class LargestElementFinder {
    public int findLargest(int[] arr) {
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[res]) {
                res = i;
            }
        }
        return arr[res];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        LargestElementFinder finder = new LargestElementFinder();
        int result = finder.findLargest(nums);
        System.out.println("The largest element is: " + result);
    }
}
