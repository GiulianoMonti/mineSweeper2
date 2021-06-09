package minesweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many mines?");
        int mines = sc.nextInt();
        Board board = new Board(mines);
        board.createBoard();
        board.printBoard(4);
    }
}

