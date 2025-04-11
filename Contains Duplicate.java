brute force approach:
class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]) return true;
            }
        }
        return false;
    }
}

optimized approach :
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])){
                return true;
            }
            else{
                s.add(nums[i]);
            }
        }
        return false;
    }
}
