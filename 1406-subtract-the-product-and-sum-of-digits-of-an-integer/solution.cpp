class Solution {
public:
    int subtractProductAndSum(int n) {
        
        int sum=0;
        int product=1;
        int i=1;
        while(n!=0) {
            i=n%10;
            product=product*i;
            sum=sum+i;
            n=n/10;
        
            
             
        }
        int subtract=product-sum;
        cout<<subtract;
        return subtract;
    
       
       
        
    }
    
        
    
};
