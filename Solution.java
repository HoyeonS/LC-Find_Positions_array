class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        boolean first_found = false;
        boolean last_found = false;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target && !first_found)
            {
                first = i;
                first_found = true;
            }
            if(nums[nums.length - i - 1] == target && !last_found) {
                last = nums.length - i - 1;
                last_found = true;
            }
            if(i == nums.length - i - 1 && !first_found && !last_found )
                break;
                
        }
        int[] ans = new int[2];
        ans[0] = first;
        ans[1] = last;
        return ans;
    }
}