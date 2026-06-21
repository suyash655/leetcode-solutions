class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int[] copy=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==val){
                nums[i]=-1;
            }
        }
        int l=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=-1){
                copy[l]=nums[i];
                l++;
            }
        }

        for(int j=0;j<n;j++){
            nums[j]=copy[j];
        }
        return l;

    }
}
