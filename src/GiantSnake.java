public class GiantSnake extends Monster {

    public static String scream = "Ssssss";

    public GiantSnake(String name) {
        super(name + " the GiantSnake", 15);
    }


    public void growl() {
        System.out.println(scream);
    }

    @Override
    public void attack(Entity m) {
        growl();
    }

}