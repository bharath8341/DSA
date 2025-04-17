Approach 1:

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[j]<nums[i]) res[i]++;
            }
        }
        return res;
    }
}


Approach 2:

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count[]=new int[101];
        int res[]=new int[nums.length];
        for(int num:nums){
            count[num]++;
        }
        for(int i=1;i<101;i++){
            count[i]+=count[i-1];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                res[i]=0;
            }else{
                res[i]=count[nums[i]-1];
            }
        }
        return res;
    }
}
