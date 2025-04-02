package IsThereSumLab;

public class IsThereSum {
    /**
     * Checks whether there exist two numbers in an array that add up to a given target sum.
     * This implementation uses a nested for loop to check the sum of different index pairs in the array.
     *
     * @param arr An array of integers.
     * @param target The target sum to check for.
     * @return true if any two distinct numbers in the array add up to the target, false otherwise.
     */
    public boolean check(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}