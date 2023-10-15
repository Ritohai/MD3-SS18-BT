package bt3;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        for (int i = 2; i <= 100; i++) {
            if(isPrime(i)) {
                System.out.println("Optimized " + i);
            }
        }
    }
    public boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        if(n<=3) {
            return true;
        }
        if (n %2 == 0 || n%3 == 0 ) {
            return false;
        }
        for (int i = 5; i < Math.sqrt(n); i+=6) {
            if(n % i == 0 || n %(i+2) == 0) {
                return false;
            }
        }
        return true;
    }
}
