import java.util.ArrayList;

public class Field {
    ArrayList<Character> field;

    public Field() {
        field = new ArrayList<>();
        for (int i = 0; i < 9 ; i++) {
            field.add(Integer.toString(i).charAt(0));
        }
    }

    void show() {
        System.out.println(" +---+--+---+--+---+ ");
        for (int i = 0; i < field.size(); i++) {
            System.out.print(" | " + field.get(i) + " | ");
            if ((i+1) % 3 == 0) {
                System.out.println("\n +---+--+---+--+---+ ");
            }
        }
    }
}
