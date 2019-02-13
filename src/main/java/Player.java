
public class Player {
    private String name;
    private int numberOfWins;
    private char typeKey;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

  /*  public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }*/

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = this.numberOfWins + numberOfWins;
    }
}
