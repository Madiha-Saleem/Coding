class Solution {
    static final int MOD=1000000007;
    public int numPrimeArrangements(int n) {
        int primeCount=0,i;
        for(i=2;i<=n;i++){
            if (isPrime(i))
                primeCount++;
        }
        int nonPrimeCount=n-primeCount;
        long ans=(fact(primeCount)*fact(nonPrimeCount))%MOD;
        return (int)ans;
        }
    public boolean isPrime(int n){
        int c=0,i,ctr=0;
        for(i=1;i<=n;i++){
            if(n%i==0)
            c++;
        }
        if(c==2)
        return true;
        else
        return false;
    }
    public long fact(int n){
        int i;
        long f=1;
        for(i=1;i<=n;i++){
            f=(f*i)%MOD;
        }
        return f;
    }
}