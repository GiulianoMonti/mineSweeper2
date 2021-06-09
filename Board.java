package minesweeper;

import java.util.Arrays;
import java.util.Random;


public class Board {
    private int size;
    private int mines;
    int mineC = 0;
    char safe = '.';
    char mine = 'X';

    private char[][] board;
    private char[][] moves;

    public Board(int mines) {
        this.mines = mines;
        board = new char[9][9];
        moves = new char[9][9];

    }

    public void printBoard(int x) {
        int r = 1;
//        System.out.print(" |123456789| \n");
        for (char[] chars : board) {
//            System.out.print(r + "|");
            for (char a : chars) {
                System.out.print(a);
            }
//            System.out.print("| ");
//            r++;
            System.out.println();
        }
    }

    public void createBoard() {
        int minesT;
        int x;
        int y;
        Random random = new Random();
        for (char[] chars : board) {
            Arrays.fill(chars, safe);
        }
        while (mineC < mines) {
            x = random.nextInt(9);
            y = random.nextInt(9);
            if (board[x][y] != mine) {
                board[x][y] = mine;
                mineC++;
            }
        }
    }


}

