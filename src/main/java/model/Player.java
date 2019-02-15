package model;

class Player {
    private String name;
    private int numberOfWins = 0;
    private char typeKey;

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    int getNumberOfWins() {
        return numberOfWins;
    }

    void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = this.numberOfWins + numberOfWins;
    }

    void setTypeKey(char typeKey) {
        this.typeKey = typeKey;
    }

    char getTypeKey() {
        return typeKey;
    }
}
