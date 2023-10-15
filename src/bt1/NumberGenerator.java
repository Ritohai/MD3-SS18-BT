package bt1;

public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Number: " + i + " | Thread: " + Thread.currentThread().getId() + "| Hash Code: " + Thread.currentThread().hashCode());
            try {
                Thread.sleep(500);
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
