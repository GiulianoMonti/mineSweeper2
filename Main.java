package minesweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("How many mines do you want on the field?");

        int mines = Integer.parseInt(sc.nextLine()); // add exception here later some day

        Board board = new Board(mines);

        board.createBoard();


        while (board.runGame) {
            board.printBoard();

            //board.testBoard();
            try {
                System.out.println("Set/unset mines marks or claim a cell as free:");

                String[] c = sc.nextLine().split(" ");

                if (board.check(Integer.parseInt(c[1]) - 1, Integer.parseInt(c[0]) - 1, c[2])) {
                    board.move(Integer.parseInt(c[1]) - 1, Integer.parseInt(c[0]) - 1, c[2]);
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ERROR : Insert coordinates + mine or free " +
                        "Ej:1 1 free");
            }

        }
    }
}

