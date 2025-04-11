brute force apporach:

class Solution {
    public int missingNumber(int[] nums) {
        for(int i=0;i<=nums.length;i++){
            int f=0;
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    f=1;
                    break;
                }
            }
            if(f==0) return i;
        }
        return nums.length+1;
    }
}

optimized apporach:
    
class Solution {
    public int missingNumber(int[] nums) {
        long sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        return (int)(((n*(n+1))/2)-sum);
    }
}
