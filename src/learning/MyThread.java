package learning;

public class MyThread implements Runnable {

    private boolean isActive;

    void disable () {
        isActive = false;
    }

    MyThread() {
        isActive = true;
    }

    @Override
    public void run() {

        System.out.printf("%s started... \n", Thread.currentThread().getName());

        int counter = 1;

        while (isActive) {
            System.out.println("Loop " + counter++);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }

            if (counter == 20) break;
        }

        System.out.printf ("%s finished... \n", Thread.currentThread().getName() );
    }
}
