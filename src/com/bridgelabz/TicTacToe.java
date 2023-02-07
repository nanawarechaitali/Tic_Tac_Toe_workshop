package com.bridgelabz;

public class TicTacToe{
    static int player = 0;
    static int BOARD[][] = new int[3][3];
    static boolean isEmpty = true;

    static void initBOARD(){
        System.out.println("Welcome to TicTacToe game \nComputer choose o\nPlayer choose x");
        for(int i = 0;i<BOARD.length;i++){
            for(int j = 0;j<BOARD[i].length;j++){
                BOARD[i][j] =-10;

            }
        }
        System.out.println("Board is this:");

    }


}
