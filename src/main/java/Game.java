import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    ArrayList<Player> players;
    boolean win;
    Scanner scanner;

    Game() {
        players = new ArrayList<Player>();
        System.out.println("Старт новой игры");
        scanner = new Scanner(System.in);
        System.out.println("Первый игрок введи свое имя");
        Player playerOne = new Player(scanner.nextLine());
        players.add(playerOne);
        System.out.println("Второй игрок введи свое имя");
        Player playerTwo = new Player(scanner.nextLine());
        players.add(playerTwo);
        System.out.println("Добро пожаловать " + playerOne.getName() + ", " + playerTwo.getName());
    }

    void startRound() {
        int i = 0;
        int step;
        String currentPlayerName;

        do {
            currentPlayerName = players.get(i).getName();
            System.out.printf("%s, твой ход:\n", currentPlayerName);
            step = scanner.nextInt();
            checkWin(step, players.get(i));
            i = (i == 0) ? 1 : 0;
        } while (!isEnd());
        System.out.printf("Поздравляем, %s! Победа!\n", currentPlayerName);
    }

    private void checkWin(int step, Player player) {
        if(step == 5) {
            win = true;
            player.setNumberOfWins(1);
        }
    }

    private boolean isEnd() {
        return win;
    }
}
