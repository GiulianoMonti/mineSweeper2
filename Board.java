package minesweeper;

import java.util.Arrays;
import java.util.Random;


public class Board {

    private int size;
    private int mines;
    int count =0;
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
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != mine) {
                    minesT = count(i,j);
                      if (minesT == 0)
                      board[i][j] = safe;
                    else
                        board[i][j] = Character.forDigit(minesT,10);;
                }
            }
        }

    }

    private int count(int row, int col) {
        int totalMines = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                try {
                    if (mine==(board[row + i][col + j])) {
                        totalMines++;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {
                }
            }
        }
        return totalMines;
    }

}




