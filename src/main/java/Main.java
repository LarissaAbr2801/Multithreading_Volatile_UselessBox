public class Main {

    public static void main(String[] args) {
        Toy toy = new Toy();
        User user = new User(toy);
        toy.start();
        user.start();
    }
}
