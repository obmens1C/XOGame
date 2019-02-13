import java.util.ArrayList;
import java.util.Scanner;

class Game {
    private ArrayList<Player> players;
    private boolean win;
    private Scanner scanner;
    private Field field;

    Game() {
        players = new ArrayList<>();
        System.out.println("Старт новой игры");

        scanner = new Scanner(System.in);
        System.out.println("Первый игрок введи свое имя");
        Player playerOne = new Player(scanner.nextLine());
        System.out.println("Играем крестиками");
        playerOne.setTypeKey('X');
        players.add(playerOne);

        System.out.println("Второй игрок введи свое имя");
        Player playerTwo = new Player(scanner.nextLine());
        System.out.println("Играем ноликами");
        playerTwo.setTypeKey('O');
        players.add(playerTwo);

        System.out.println("Добро пожаловать " + playerOne.getName() + ", " + playerTwo.getName());

        field = new Field();
        field.show();
    }

    void startRound() {
        int i = 0;
        int step;
        Player currentPlayer;

        do {
            currentPlayer = players.get(i);
            System.out.printf("%s, твой ход:\n", currentPlayer.getName());
            step = scanner.nextInt();

            field.checkStep(step, currentPlayer.getTypeKey());
            field.show();

            checkWin(step, currentPlayer);
            i = (i == 0) ? 1 : 0;
        } while (!isEnd());
        System.out.printf("Поздравляем, %s! Победа!\n", currentPlayer.getName());
        System.out.printf("Количество побед %d", currentPlayer.getNumberOfWins());
    }

    private void checkWin(int step, Player player) {



        if (step == 5) {
            win = true;
            player.setNumberOfWins(1);
        }
    }

    private boolean isEnd() {
        return win;
    }
}
