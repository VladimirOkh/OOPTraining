public class Monster {
    private int HP;
    private int damage;
    private String name;

    public Monster(String name, int damage){
        System.out.println("Monster " + name + " was created");
        this.name = name;
        this.damage = damage;
    }

    public void growl(){
        System.out.print(" " + name + " growled\n");
    }


    public void attack(){
        System.out.println("Monster " + name +  " attacked with damage " + damage);
    }




    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
