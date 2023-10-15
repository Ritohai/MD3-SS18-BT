package bt3;

public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println("Lazy Prime: " + i);
            }
        }
    }
    public boolean isPrime(int n) {
        if(n <=1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
