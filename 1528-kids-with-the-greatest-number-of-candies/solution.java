class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList list = new ArrayList<>();
        int n=Arrays.stream(candies).max().getAsInt();
        for(int i=0;i<candies.length;i++){
            
                if(candies[i]+extraCandies>=n){
                    list.add(true);
                    }
                     else{
                    list.add(false);
                }

                    
                
               
            }
            return list;
        }
        
    }

