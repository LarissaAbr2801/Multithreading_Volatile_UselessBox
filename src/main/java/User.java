public class User extends Thread {

    private volatile boolean tumblr;
    private final static int TURN_ON_TIME = 1500;
    private final static int QUANTITY_OF_ON_TUMBLR = 10;
    private Toy toy;

    public User(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < QUANTITY_OF_ON_TUMBLR; i++) {
                Thread.sleep(TURN_ON_TIME);
                tumblr = toy.turnOffTumblr();
                System.out.println("Пользователь включил тумблер!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.printf("%s завершил игру\n", getName());
            toy.interrupt();
        }
    }

}
