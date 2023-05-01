public class Main {

    public static void main(String[] args) {
        Zombie zombie1 = new Zombie("Bob");
        zombie1.attack();
        zombie1.growl();
        zombie1.growl(true);
        zombie1.growl(false);

//        Zombie zombie2 = new Zombie("Aaron", 10);
//        zombie2.attack();
    }
}
