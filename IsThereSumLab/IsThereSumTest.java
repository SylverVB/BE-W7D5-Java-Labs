package IsThereSumLab;

public class IsThereSumTest {
    public static void main(String[] args) {
        IsThereSum isThereSum = new IsThereSum();

        // Test Case 1
        int[] arr1 = {1, 2, 3, 4, 5};
        int target1 = 9; // 4 + 5 = 9
        boolean result1 = isThereSum.check(arr1, target1);
        System.out.println("Test Case 1: " + result1 + " (Expected: true)");

        // Test Case 2
        int[] arr2 = {10, 15, 3, 7};
        int target2 = 17; // 10 + 7 = 17
        boolean result2 = isThereSum.check(arr2, target2);
        System.out.println("Test Case 2: " + result2 + " (Expected: true)");

        // Test Case 3
        int[] arr3 = {1, 2, 3, 4, 5};
        int target3 = 10; // No two numbers add up to 10
        boolean result3 = isThereSum.check(arr3, target3);
        System.out.println("Test Case 3: " + result3 + " (Expected: false)");

        // Test Case 4
        int[] arr4 = {0, -1, 2, -3, 1};
        int target4 = -2; // -3 + 1 = -2
        boolean result4 = isThereSum.check(arr4, target4);
        System.out.println("Test Case 4: " + result4 + " (Expected: true)");
    }
}
