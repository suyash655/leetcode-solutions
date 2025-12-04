class Solution {
    public void swap(int[] nums,int a, int b){
       int temp=nums[a];
       nums[a]=nums[b];
       nums[b]=temp;
    }
    public void moveZeroes(int[] nums) {

        int n=nums.length;
        int j=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
            
            

        }
        //if arrays has no zeroes
        if(j==-1) return;


    

        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                swap(nums,i,j);
                j++;
            }
        }






        
    //     int n=nums.length;
    //   int[] temp=new int[n];
    //   int j=0;


    //   for(int i=0;i<n;i++){
    //      if(nums[i]!=0){
    //          temp[j++]=nums[i];
    //      }
    //   }

    //   for(int i=0;i<j;i++){
    //      nums[i]=temp[i];
    //   }

    //   for(int i=j;i<n;i++){
    //      nums[i]=0;
    //  }

            
        
        
    }

}
