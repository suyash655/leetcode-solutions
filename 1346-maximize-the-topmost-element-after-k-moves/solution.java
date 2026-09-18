class Solution {
    public int maximumTop(int[] nums, int k) {

        if(k==0) return nums[0];
        if(nums.length==1) return k%2==0 ? nums[0]:-1;
        if(k==1) return nums[1];
       
            int max=-1;
            int max1=-1;
            int j=k;
            int num2=0;
        if(k<nums.length){
            num2=nums[k];

        }

          

        for(int i=0;i<nums.length;i++){
            if(k>nums.length){
                max=Math.max(max,nums[i]);
            }else{
                if(j>1){
                    max1=Math.max(max1,nums[i]);
                }else{
                    max=max1;
                }
                j--;
                
            }
        
            
            
            
        }

        if(k<nums.length){
            max=Math.max(max,num2);
        }
        return max;
    }
}
