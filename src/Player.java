import java.util.Objects;

public class Player extends Human{
    String things = "";

    Backpack backpack = new Backpack();


    public void take(String thing){
        things += thing + ",";
    }

    class Backpack{



        @Override
        public String toString() {
            if (Objects.equals(things, ""))
                return "the backpack is empty";
            return things.substring(0, things.length() - 1) + " in the backpack";
        }
    }

    public Player(String name) {
        super(name);
    }
}

