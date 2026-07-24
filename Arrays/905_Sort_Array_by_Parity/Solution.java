class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int i=0,j=n-1,temp;

        while(i<j) {

            if(nums[i]%2 > nums[j]%2) {
                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;

            }

            if(nums[i]%2==0) {i++;}
            if(nums[j]%2!=0) {j--;}

        }
        return nums;
    }
}