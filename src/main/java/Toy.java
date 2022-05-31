public class Toy extends Thread {

    volatile boolean tumblr;
    final static int TURN_OFF_TIME = 1500;

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                if (tumblr) {
                    tumblr = false;
                    Thread.currentThread().join();
                    Thread.sleep(TURN_OFF_TIME);
                    System.out.println("Тумблер выключен!");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }

    public boolean turnOffTumblr() {
        new Thread().start();
        return tumblr = true;
    }

}
