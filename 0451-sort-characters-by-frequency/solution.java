class Solution {
    public String frequencySort(String s) {
       StringBuilder answer=new StringBuilder();
       Map<Character,Integer> hm=new HashMap<>();
       for(char ch : s.toCharArray()){
        hm.put(ch,hm.getOrDefault(ch,0)+1);
       }
       List<Character> mn=new ArrayList(hm.keySet());
       mn.sort((ob1,ob2)->hm.get(ob2)-hm.get(ob1));
       for(char ch: mn){
        for(int i=0;i<hm.get(ch);i++){
            answer.append(ch);
        }
       }
       return answer.toString();
       
    }
}
