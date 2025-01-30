import java.util.HashSet;

public class solution {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        for (int i = 0; i<nums.length; i++) {
            if (numbers.contains(nums[i])) {
                return true;
            }
            numbers.add(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        boolean result = containsDuplicate(new int[] { 1, 2, 3, 1 });
        System.out.println(result);
    }
}
