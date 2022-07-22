class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0,r=nums.length-1;
        int p=nums.length-1;
        int[] res=new int[nums.length];
        while(l<=r){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                res[p]=nums[l]*nums[l];
                l++;
            }else{
                res[p]=nums[r]*nums[r];
                r--;
            }
            p--;
        }
        return res;
    }
}