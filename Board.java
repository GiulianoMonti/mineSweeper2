package minesweeper;

import java.util.Arrays;
import java.util.Random;


public class Board {

    private final int mines;
    int count = 0;
    int mineC = 0;
    char safe = '.';
    char mine = 'X';
    char addMine = '*';
    char freeSpace = '/';
    private final char[][] boardBack;
    private final char[][] boardFront;

    boolean runGame;

    public Board(int mines) {
        this.mines = mines;
        boardBack = new char[9][9];
        boardFront = new char[9][9];
        runGame = true;

    }

    // TEST BOARD IN THE BACK

//    public void testBoard() {
//        int r = 1;
//        System.out.println(" |123456789| \n" +
//                "-|---------| ");
//        for (char[] chars : boardBack) {
//            System.out.print(r + "|");
//            for (char a : chars) {
//                System.out.print(a);
//            }
//            System.out.print("| ");
//            r++;
//            System.out.println();
//        }
//        System.out.println("-|---------| ");
//    }


    public void printBoard() {
        int r = 1;
        System.out.println(" |123456789| \n" +
                "-|---------| ");
        for (char[] chars : boardFront) {
            System.out.print(r + "|");
            for (char a : chars) {
                System.out.print(a);
            }
            System.out.print("| ");
            r++;
            System.out.println();
        }
        System.out.println("-|---------| ");
    }

    public void createBoard() {
        int minesT;
        int x;
        int y;
        Random random = new Random();
        for (char[] chars : boardBack) {
            Arrays.fill(chars, safe);
        }
        for (char[] chars : boardFront) {
            Arrays.fill(chars, safe);
        }
        while (mineC < mines) {
            x = random.nextInt(9);
            y = random.nextInt(9);
            if (boardBack[x][y] != mine) {
                boardBack[x][y] = mine;
                mineC++;
            }
        }
        for (int i = 0; i < boardBack.length; i++) {
            for (int j = 0; j < boardBack[i].length; j++) {
                if (boardBack[i][j] != mine) {
                    minesT = count(i, j);
                    if (minesT == 0) {
                        boardBack[i][j] = safe;
                    } else {
                        boardBack[i][j] = Character.forDigit(minesT, 10);
                    }
                }
            }
        }

    }

    private int count(int row, int col) {
        int totalMines = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                try {
                    if (mine == (boardBack[row + i][col + j])) {
                        totalMines++;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {
                }
            }
        }
        return totalMines;
    }

    public boolean check(int i, int j, String s) {
        if (i >= 0 && i < boardBack.length && j >= 0 && j < boardBack[i].length) {

            return true;
        }
        System.out.println("Coordinates should be from 1 to 9");
        return true;
    }

    public void move(int i, int j, String s) {  // needs to be fixed too, if you write wrong option return

        if ("mine".equals(s)) {
            moveMine(i, j);

        }else
        if ("free".equals(s)) {
            moveFree(i, j);
        }else{
            System.out.println("Wrong option |write free or mine");
            return;
        }
    }

    public void moveMine(int i, int j) {
        if (boardFront[i][j] == addMine) {

            boardFront[i][j] = safe;
            count--;
            return;
        } else {
            boardFront[i][j] = addMine;

        }

        if (boardBack[i][j] == mine) {
            boardFront[i][j] = addMine;
            if (boardFront[i][j] == addMine) {
                count++;
            }
        }

        checkWin();
    }


    public void moveFree(int i, int j) {
        if (boardBack[i][j] > 0) {
            boardFront[i][j] = boardBack[i][j];
        }
        if (boardBack[i][j] == mine) {
            System.out.println("you stepped on a mine and failed!");
            runGame = false;
            printBoard();
        }
        if (boardBack[i][j] == safe) {

            floodFill(i, j);

        }

    }


    // check free spaces // chequea los espacios vacios
    void floodFill(int x, int y) {
        if (x < 0 || y < 0 || y > 8 || x > 8 || boardBack[x][y] < 9)
            return;
        if (boardBack[x][y] != safe) {
            boardFront[x][y] = boardBack[x][y];
        }
        if (boardBack[x][y] == addMine) {
            boardFront[x][y] = freeSpace;
        }
        if (boardBack[x][y] == safe) {
            boardBack[x][y] = freeSpace;
            boardFront[x][y] = freeSpace;
            floodFill(x + 1, y);
            floodFill(x - 1, y);
            floodFill(x, y - 1);
            floodFill(x, y + 1);
            floodFill(x+1, y + 1);
            floodFill(x-1, y - 1);
            floodFill(x-1, y + 1);
            floodFill(x+1, y - 1);

        }
    }


    public void checkWin() {

        if (this.count == this.mines) {
            System.out.println("Congratulations! You found all mines!");
            printBoard();
            runGame = false;
        }
    }
}



