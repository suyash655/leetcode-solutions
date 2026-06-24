class Solution {
    public int trap(int[] height) {

        int n=height.length;
    
        int[] arr1=new int[n];
        
    
       int suffixmax=-1;
    
    for(int i=n-1;i>=0;i--){
        
     suffixmax=Math.max(suffixmax,height[i]);
     arr1[i]=suffixmax;
        
    }
        int cnt=0;
        int m=-1;
    for(int i=0;i<n;i++){
        if(height[i]>m){
            m=height[i];
        }
        
        int rightmax=arr1[i];

        if(height[i]<m && height[i]<rightmax){
            cnt+=Math.min(m,rightmax)-height[i];
        }
    }

    return cnt;


    }
}
