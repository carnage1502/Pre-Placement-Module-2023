class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int left=0,right=0;
        while(right<n){
            if(nums[right]==0) right++;
            else{
                swap(nums,left,right);
                left++;
                right++;
            }
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}