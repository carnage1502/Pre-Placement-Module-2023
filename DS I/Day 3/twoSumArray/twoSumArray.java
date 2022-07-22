class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res=new int[2];
        Map<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(ans.containsKey(target-numbers[i])){
                res[1]=i+1;
                res[0]=ans.get(target-numbers[i])+1;
            }
            ans.put(numbers[i],i);
        }
        return res;
    }
}