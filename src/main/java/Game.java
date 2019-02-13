import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    ArrayList<Player> players;

    Game() {
        players = new ArrayList<Player>();
        System.out.println("Старт новой игры");
        Scanner scannerName = new Scanner(System.in);
        System.out.println("Первый игрок введи свое имя");
        Player playerOne = new Player(scannerName.nextLine());
        players.add(playerOne);
        System.out.println("Второй игрок введи свое имя");
        Player playerTwo = new Player(scannerName.nextLine());
        players.add(playerTwo);
        System.out.println(playerOne.getName() + ", " + playerTwo.getName() + " Добро пожаловать");
    }

    void startRound() {
        int i = 0;
        do {
            System.out.printf("%s, твой ход:", players.get(i).getName());
            i = (i == 0) ? 1 : 0;




        } while (!isEnd());
    }

    private boolean isEnd() {
        return false;
    }
}
