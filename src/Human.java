public class Human extends Entity {

    public Human(String name) {
        super(name + " the Man");
    }


    @Override
    public void attack(Entity m) {
        m.damage(5);
    }

}