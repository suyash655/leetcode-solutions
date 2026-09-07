class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int sum=0;
        if(height.length==1){
            return 0;
        }
    while(left<right){
        int cnt=Math.min(height[left],height[right]);
        sum=Math.max(sum,(right-left)*cnt);
    
        if(height[left]>height[right]){
            right--;
        }else{
            left++;
        }
        
    }
    return sum;
        
    }
}
