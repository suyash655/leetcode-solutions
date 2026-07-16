class Solution {
    public void reverseString(char[] s) {
    //     StringBuilder sb=new StringBuilder();
    //     for(char c:s){
    //         sb.append(c);
    //     }
    //     String k=sb.reverse().toString();

    //String k=new String(s);

   
   
   int n=s.length-1;
   int m=0;

   while(m<n){
    char c=s[n];
    s[n]=s[m];
    s[m]=c;
    n--;
   m++;
   }

   




        
    }
}
