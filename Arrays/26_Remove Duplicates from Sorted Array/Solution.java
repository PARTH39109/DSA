class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,j;

        for(j=1;j<nums.length;j++) {

            if(nums[j-1]!=nums[j])
            {
                nums[i]=nums[j];
                i++;
            }

        }
        return i;
    }
}