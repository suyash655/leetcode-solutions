class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int s=0;
        int e=n-1;
        int store=0;
        while(s<e){
            int nk=Math.min(height[s],height[e]);
            
            store=Math.max( store,nk*(e-s));
            if(height[s]<height[e]){
                s++;
            }else{
                e--;
            }
        }
        return store;
    }
}
