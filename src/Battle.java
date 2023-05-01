public class Battle {
    final private static int MAX = 5;
    private Monster[] monsters;
    private int n = 0;

    Battle(){
        monsters = new Monster[MAX];
    }

    public void add(Monster monster) {
        if (n < MAX) {
            monsters[n++] = monster;
        } else System.out.println("No more monsters in battle!");
    }


    public void start() {
        run();
    }

    void run(){
        for (int i = 0; i < n; i++){
            if (monsters[i] != null){
                monsters[i].attack();
            }
        }
    }
}
