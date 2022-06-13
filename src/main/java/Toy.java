public class Toy extends Thread {

    private boolean tumblr;

    @Override
    public void run() {
            while (!isInterrupted()) {
                if (tumblr) {
                    System.out.println("Тумблер выключен!");
                    tumblr = false;
                }
            }

    }

    public boolean turnOffTumblr() {
        return tumblr = true;
    }

}
