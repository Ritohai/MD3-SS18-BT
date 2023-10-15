package bt3;

public class Main {
    public static void main(String[] args) {
        Runnable lazyPrimeTask = new LazyPrimeFactorization();
        Runnable optimizedPrimeTask = new OptimizedPrimeFactorization();

        Thread lazyThread = new Thread(lazyPrimeTask);
        Thread optimizedThread = new Thread(optimizedPrimeTask);

        lazyThread.start();
        optimizedThread.start();
    }
}
