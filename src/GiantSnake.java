public class GiantSnake extends Monster{
    public static String scream = "Ssssss";

    public GiantSnake(String name) {
        super(name + " the Snake", 7);

    }

    @Override
    public void attack() {
        super.attack();
        growl();
        System.out.println("     ...and hid in the grass");
    }

    @Override
    public void growl() {
        System.out.print(scream);
        super.growl();
    }

    public void growl(boolean isLoud) {
        if(isLoud) {
            System.out.print(scream.toUpperCase());
            super.growl();
        }
        else growl();
    }
}
