import java.util.ArrayList;

class Field {
    private ArrayList<Character> field;
    private ArrayList<int[]> winPairs;

    private int[] pair1 = {1, 2, 3};
    private int[] pair2 = {1, 4, 7};
    private int[] pair3 = {1, 5, 9};
    private int[] pair4 = {2, 5, 8};
    private int[] pair5 = {3, 6, 9};
    private int[] pair6 = {3, 5, 7};
    private int[] pair7 = {4, 5, 6};
    private int[] pair8 = {7, 8, 9};

    Field() {
        field = new ArrayList<>();
        for (int i = 1; i <= 9 ; i++) {
            field.add(Integer.toString(i).charAt(0));
        }

        winPairs = new ArrayList<>();
        winPairs.add(pair1);
        winPairs.add(pair2);
        winPairs.add(pair3);
        winPairs.add(pair4);
        winPairs.add(pair5);
        winPairs.add(pair6);
        winPairs.add(pair7);
        winPairs.add(pair8);

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

    void setStep(int step, char typeKey) {
        field.set(step-1, typeKey);
    }

    boolean checkWin(int step, char typeKey) {
        int counter = 1;
        ArrayList<int[]> pairs = getPairs(step);

        for (int[] pair : pairs) {
            for (int j : pair) {
                if (field.get(j) == typeKey) {
                    counter++;
                }
            }
            if (counter == 3) {
                return true;
            }
        }
        return false;
    }

    ArrayList<int[]> getPairs(int step) {
        ArrayList<int[]> pairsChecked = new ArrayList<>();
        for (int[] pairChecked : winPairs) {
            for (int i = 0; i < pairChecked.length; i++) {
                if (pairChecked[i] == step) {
                    pairsChecked.add(pairChecked);
                }
            }
        }
        return pairsChecked;
    }
}
