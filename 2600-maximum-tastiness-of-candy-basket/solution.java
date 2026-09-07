class Solution {
    private boolean canpick(int d,int [] price, int k){
        int lastpick=price[0];
        int cnt=1;
        int i=1;
        while(i<price.length){
           

            if(price[i]>=lastpick+d){
                lastpick=price[i];
                cnt++;
                
                
            }
        
            if(cnt==k){
                return true;
            }
            i++;
        }
        return false;
    }
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int low=0;
        int high=price[price.length-1]-price[0];
        int answer=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canpick(mid,price,k)){
                answer=mid;
                low=mid+1;

            }else{
                high=mid-1;
            }
        }
        return answer;
        
    }
}
