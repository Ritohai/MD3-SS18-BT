package bt2;

public class TestThread {
    public static void main(String[] args) {
        OldThread oldThread = new OldThread();
        EvenThread evenThread = new EvenThread();

        oldThread.start();
        try {
            oldThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        evenThread.start();
    }
}
