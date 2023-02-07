package com.bridgelabz;

import java.util.Scanner;

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
        disBoard();

    }
    static void disBoard(){
        int count =0;
        for(int i =0;i<BOARD.length;i++){
            System.out.println("------------");
            System.out.println("||");
            for(int j =0; j<BOARD[i].length;j++){
                if(BOARD[i][j] == 0){
                    count++;
                    System.out.println(" o | ");
                    
                }else if(BOARD[i][j] == 1){
                    count++;
                    System.out.println(" x | ");
                }else
                    System.out.println(" | ");
            }
            System.out.println("|");
        }
        if(count == 9){
            isEmpty = false;
        }
        System.out.println("--------------");
    }
    static void putValue(){
        int i;
        int j;
        if(player % 2 ==1){
            i = (int)(Math.random()*10)%3;
            j = (int)(Math.random()*10)%3;
            
        }else{
            Scanner sc = new Scanner(Sysytem.in);
            System.out.println("Enter the value of x and y by space");
            i = sc.nextInt();
            j = sc.nextInt();
        }
        if(BOARD[i][j] == -10){
            if(player % 2 ==0){
                BOARD[i][j] =0;
            }else{
                BOARD[i][j] =1;
                System.out.println("Computer choosing "+i+" "+j);
                
            }
            
        }else
            putValue();
    }
    
    


}
