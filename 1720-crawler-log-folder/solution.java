class Solution {
    public int minOperations(String[] logs) {
        int sum=0;

       for(int i=0;i<logs.length;i++){
            String op=logs[i];

            if(op.equals("./")){

            }else if(op.equals("../")){
                if(sum>0){
                sum-=1;
                }

            }else if(!op.equals("./") && !op.equals("../")){
                sum+=1;
            }
       }
       return sum;

        
    }
}
