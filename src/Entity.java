abstract class Entity implements Fighter {
    private final String name;
    private int hp = 100;
    private boolean destroyed;

    @Override
    public void attack(Entity entity) {

    }


    public Entity(String name) {
        this.name = name;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    protected boolean damage(int dhp) {
        this.hp -= dhp;
        if (hp < 0) {
            this.destroyed = true;
            System.out.println("Monster " + this.name + " was destroyed");
            return true;
        }
        return false;
    }
}
