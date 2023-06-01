/* Given an array of integers nums which is sorted in ascending order, and an integer target,
write a function to search target in nums. If target exists, then return its index. Otherwise,
return -1.

You must write an algorithm with O(log n) runtime complexity.

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4 */

public class q6 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int ans = search(nums, 9);

        System.out.println(ans);
    }

    public static int search(int[] nums, int target) {
        int l=0;
        int r=nums.length - 1;

        while(l < r){
            int mid = l + (r-l)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] >= target){
                r = mid;
            } else {
                l = mid +1;
            }
        }
       if (nums[l] != target) return -1;
        return l;

    }
}
