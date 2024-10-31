public class commonFactors{
    public int comFactors(int a, int b) {
        int gcdValue = gcd(a,b);
       int count = 0;
        
        for(int i=1; i<=gcdValue; i++){
            if(gcdValue % i == 0){
                count++;
                }
            }
       return count;
    }
    private int gcd(int a, int b){
        if( b ==0){
            return a;
        }
        
        return gcd(b, a%b);
        }
}