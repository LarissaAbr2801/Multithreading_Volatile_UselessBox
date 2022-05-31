public class User extends Thread {

    private volatile boolean tumblr;
    private final static int TURN_ON_TIME = 1500;
    private final static int QUANTITY_OF_ON_TUMBLR = 10;
    Toy toy;

    public User(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < QUANTITY_OF_ON_TUMBLR; i++) {
                tumblr = true;
                Thread.sleep(TURN_ON_TIME);
                System.out.println("Пользователь включил тумблер!");
                tumblr = toy.turnOffTumblr();
                //Thread.currentThread().join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }

}
