class Solution {
    public String reverseWords(String s) {
        if(s==null||s.length()==0) return "";
        char[] arr=s.toCharArray();
        int n=arr.length;
        //reverse thes string
        reverse(arr,0,n-1);
        //reverse every word +clean spaces
        int i=0;
        while(i<n){
            while(i<n && arr[i]==' ') i++;
            if(i==n) break;
        int j=i;
            while(j<n && arr[j]!=' ') j++;

            reverse(arr,i,j-1);
            i=j;
            
        }
        //remove extra spaces
        int start=0;
        int end=0;
        while(end<n){
            while(end<n && arr[end]==' ') end++;
            if(end==n) break;

            if(start>0){
                arr[start++]=' ';
            }


            while(end<n && arr[end]!=' '){
                arr[start++]=arr[end++];
            }
        }
        
        return new String(arr,0,start);


    }
    public void reverse(char[] arr,int start,int end){
        while(start<end){
            char temp=arr[end];
          arr[end]=arr[start];
          arr[start]=temp;
          start++;
          end--;

        }
    }
}
