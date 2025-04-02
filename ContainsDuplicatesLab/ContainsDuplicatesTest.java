package ContainsDuplicatesLab;

public class ContainsDuplicatesTest {
    public static void main(String[] args) {
        ContainsDuplicates cd = new ContainsDuplicates();

        // Test cases
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println(cd.containsDuplicate(nums1)); // Expected: false

        int[] nums2 = {1, 2, 3, 4, 1};
        System.out.println(cd.containsDuplicate(nums2)); // Expected: true

        int[] nums3 = {};
        System.out.println(cd.containsDuplicate(nums3)); // Expected: false

        int[] nums4 = {1, 1, 1, 1};
        System.out.println(cd.containsDuplicate(nums4)); // Expected: true

        int[] nums5 = {1};
        System.out.println(cd.containsDuplicate(nums5)); // Expected: false
    }
}