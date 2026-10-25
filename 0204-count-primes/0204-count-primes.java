import java.util.*;
class Solution {
    public int countPrimes(int n) {
        int primes[]=new int[n];
        Arrays.fill(primes,1);
        int count=0;
        for(int i=2;i<primes.length;i++){
            if(primes[i]==1){
                count++;
                for(int j=i*2;j<primes.length;j+=i)
                // j=i*2 means like 3*2 = 6 then j+=i means j=6+3 = 9 then 9+3=12 like that we mark 0
                {
                    primes[j]=0;
                }
            }

        }
        return count;
    }
}