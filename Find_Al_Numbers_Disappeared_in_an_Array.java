Approach 1:

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<Integer>();
        boolean f=false;
        for(int i=1;i<=nums.length;i++){
            f=false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    f=true;
                    break;
                }
            }
            if(!f){
                ans.add(i);
            }
        }
        return ans;
    }
}

Approach 2:

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(!bs(nums,i+1)) ans.add(i+1);
        }
        return ans;
    }
    public boolean bs(int[] nums,int t){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==t) return true;
            else if(nums[mid]>t) e=mid-1;
            else s=mid+1;
        }
        return false;
    }
}


Approach 3:

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<Integer>();
        int i=0;
        while(i<nums.length){
            if(nums[nums[i]-1] != nums[i]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }else {
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1) ans.add(i+1);
        }
        return ans;
    }
}

Approach 4:

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1]>0) nums[Math.abs(nums[i])-1]*=-1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) ans.add(i+1);
        }
        return ans;
    }
}
