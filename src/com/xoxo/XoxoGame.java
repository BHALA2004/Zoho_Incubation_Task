package com.xoxo;

import java.util.Scanner;

public class XoxoGame {
    public static void getInput(char[][] Board,char b,int rowX,int columnX){

        Board[rowX][columnX]=b;

    }

    public static void print(char[][] Board){
        for (int i = 0;i<Board.length;i++){
            for(int j=0;j<Board[0].length;j++){
                System.out.print(Board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean rowcheck(char[][] Board,int row,char b){
        int count = 0;
       for (int i = 0;i<Board.length;i++){
           if(Board[row][i]==b){
               count++;
           }
       }
       return count==Board.length?true:false;
    }
    public static boolean colcheck(char[][] Board,int col,char b){
        int count = 0;
        for (int i = 0;i<Board.length;i++){
            if(Board[i][col]==b){
                count++;
            }
        }
        return count==Board.length?true:false;
    }
    public static boolean diagonalcheck(char[][] Board,int i,char b){
        int count  = 0;
        if(i==0){
        for (i = 0;i<Board.length;i++){
            if(Board[i][i]==b){
                count++;
            }

        }}
        else {
            int row = 0;
            for (int val = i;val>=0;val--){
                if(Board[row][val]==b){
                    count++;
                }
                row++;
            }
        }
        return count==Board.length?true:false;
    }
    public static void main(String[] args) {

        int count = 0;
        char[][] Board = new char[3][3];
        boolean[][] check = new boolean[3][3];
        for(int i = 0;i<check.length;i++){
            for(int j = 0;j< check.length;j++){
                check[i][j]=true;
            }
        }
        boolean loopcase = true;
        int count1  = 0;
        char currentPlayer = 'X';
        while (loopcase) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter row player :");
            int rowX = scanner.nextInt() - 1;
            System.out.println("Enter column for player:");
            int columnX = scanner.nextInt() - 1;

            // If spot is already taken, skip this iteration and ask for a new input
            if (!check[rowX][columnX]) {
                System.out.println("Already Have Value");
                continue;
            }





                getInput(Board,currentPlayer, rowX, columnX);
                print(Board);count1++;
                check[rowX][columnX] = false;

                for (int i = 0; i < Board.length; i++) {
                    if (rowcheck(Board, i, 'X')) {
                        System.out.println("X wins");
                        loopcase = false;
                        System.exit(1);
                    }
                }

                for (int i = 0; i < Board.length; i++) {
                    if (colcheck(Board, i, 'X')) {
                        System.out.println("X wins");
                        loopcase = false;
                        System.exit(1);
                    }
                }

                if (diagonalcheck(Board, 0, 'X')) {
                    System.out.println("X wins");
                    loopcase = false;
                    System.exit(1);
                } else if (diagonalcheck(Board, Board.length - 1, 'X')) {
                    System.out.println("X wins");
                    loopcase = false;
                    System.exit(1);
                }
             currentPlayer=currentPlayer=='X'?'O':'X';


                for (int i = 0; i < Board.length; i++) {
                    if (rowcheck(Board, i, 'O')) {
                        System.out.println("O wins");
                        loopcase = false;
                        System.exit(1);
                    }
                }

                for (int i = 0; i < Board.length; i++) {
                    if (colcheck(Board, i, 'O')) {
                        System.out.println("O wins");
                        loopcase = false;
                        System.exit(1);
                    }
                }

                if (diagonalcheck(Board, 0, 'O')) {
                    System.out.println("O wins");
                    loopcase = false;
                    System.exit(1);
                } else if (diagonalcheck(Board, Board.length - 1, 'O')) {
                    System.out.println("O wins");
                    loopcase = false;
                    System.exit(1);
                }

            if(count1==9){
                System.out.println("Match Draw");System.exit(1);
            }

        }


    }
}
