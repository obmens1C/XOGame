package model;

import controller.Controller;

import java.util.ArrayList;
import java.util.Scanner;

/**Объект класса <strong>Game</strong> создает игровой процесс,
 * хранит <em>ArrayList</em> игроков
 * крутит игровой цикл до победного
 * <code>isWin == true</code>
 * @author Panfit
 * @version 1.2
 */

public class Game {
    /**
     * <strong>ArrayList</strong> игроков
     */
    private ArrayList<Player> players;
    /**
    *флаг окончания игры
    */
    private boolean win;
    private Scanner scanner;
    /**
     * объект <code>field</code> игрового поля
     */
    private Field field;
    /**
     * раньше пятого хода никто не победит,
     * отключим проверку <code>isWin</code>
     */
    private int countCheck;

    public Game() {
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

    /**
     * инициализируем конструктором <code>ArrayList</code> игроков
     * @param playerOne - первый игрок, всегда ходит первый
     * @param playerTwo - второй игрок, ходит после первого
     */
    public Game(Player playerOne, Player playerTwo) {
        players = new ArrayList<>();
        players.add(playerOne);
        players.add(playerTwo);
    }

    /**
     * основной цикл объекта <code>Game</code>
     */
    public void startRound() {
        int i = 0;
        int step;
        Player currentPlayer;
        countCheck = 0;

        do {
            currentPlayer = players.get(i);
            System.out.printf("%s, твой ход:\n", currentPlayer.getName());
            step = scanner.nextInt();

            field.setStep(step, currentPlayer.getTypeKey());
            field.show();

            if (countCheck > 4) {
                win = field.checkWin(step, currentPlayer.getTypeKey());
            }

            i = (i == 0) ? 1 : 0;
           countCheck++;
        } while (!isEnd());
        System.out.printf("Поздравляем, %s! Победа!\n", currentPlayer.getName());
        currentPlayer.setNumberOfWins(1);
        System.out.printf("Количество побед %d", currentPlayer.getNumberOfWins());
    }

    /**
     * @return возвращает результат победы
     */
    private boolean isEnd() {
        return win;
    }

    /**
     * основной цикл для <em>JavaFX</em> оболочки
     * @param controller передадим для работы с объектами формы
     */
    public void startRoundFX(Controller controller) {
        controller = null;
        System.exit(0);
    }
}
