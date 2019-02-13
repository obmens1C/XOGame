
class Player {
    private String name;
    private int numberOfWins;
    private char typeKey;

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

  /*  public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }*/

    void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = this.numberOfWins + numberOfWins;
    }
}
