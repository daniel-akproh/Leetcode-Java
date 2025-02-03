
import jdk.jfr.SettingControl;

// Binary Search = Searching at midpoint value and cutting away 
// the container in half each time based on whether it contains the target value.

class BinarySearch {
    public int search(int[] nums, int target) {
        if (nums.length == 0) // can't search an empty array
            return -1;
        
        // Bound indices
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int midpoint = left + (right - left) / 2;
            if (nums[midpoint] == target) {
                return midpoint;
            }
            else if (nums[midpoint] > target) {
                right = midpoint - 1;
            } else {
                left = midpoint + 1;
            }
        }

        return -1;
    };
};
