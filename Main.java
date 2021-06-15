package minesweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many mines do you want on the field?");

        int mines = Integer.parseInt(sc.nextLine());
        Board board = new Board(mines);
        board.createBoard();


        while (board.runGame) {
            board.printBoard();
            System.out.println("Set/delete mine marks (x and y coordinates):");
            String[] c = sc.nextLine().split(" ");
            if (board.check(Integer.parseInt(c[1]) - 1, Integer.parseInt(c[0]) - 1,c[2])) {
                board.move(Integer.parseInt(c[1]) - 1, Integer.parseInt(c[0]) - 1,c[2]);
            }
        }

    }
}

