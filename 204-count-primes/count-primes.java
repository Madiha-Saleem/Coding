class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0]=isPrime[1]=false;
        int i,j,c=0;
        for(i=2;i*i<n;i++){
            if(isPrime[i]){
                for(j=i*i;j<n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        for(i=2;i<n;i++){
            if(isPrime[i])
            c++;
        }
        return c;
    }
}


/*int i,c=1;
        if(n<=2) return 0;
        for(i=2;i<n;i++){
            if(isPrime(i))
            c++;
        }
        return c;
    }
    boolean isPrime(int n){
        if(n%2==0)
        return false;
        int i,c=0;
        for(i=3;i*i<=n;i+=2){
            if(n%i==0)
            return false;
        }
        return true;*/