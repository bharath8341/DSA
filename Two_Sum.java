brute force approach:

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && (nums[i]+nums[j])==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
}

optimized approach :

class Solution {
    public int[] twoSum(int[] nums, int t) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(t-nums[i])){
                int[] ans={hm.get(t-nums[i]),i};
                return ans;
            }
            hm.put(nums[i],i);
        }
        int[] a={0,0};
        return a;
    }
}
