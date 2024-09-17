package com.xoxo;

import java.util.Scanner;

public class XoxoGame {
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
            for (int val = i;val>=Board.length;val--){
                if(Board[val][val]==b){
                    count++;
                }
            }
        }
        return count==Board.length?true:false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] Board = new char[3][3];
        boolean loopcase = true;
        while (loopcase){
            System.out.println("Enter row player X:");
            int rowX = scanner.nextInt()-1;
            System.out.println("Enter column for player X:");
            int columnX = scanner.nextInt()-1;
            Board[rowX][columnX]='X';
            print(Board);
            for(int i = 0;i<Board.length;i++){
                if(rowcheck(Board,i,'X')){
                    System.out.println("X wins");loopcase=false;System.exit(1);
                }
            }
            for(int i = 0;i<Board.length;i++){
                if(colcheck(Board,i,'X')){
                    System.out.println("X wins");loopcase=false;System.exit(1);
                }
            }

            if(diagonalcheck(Board,0,'X')){
                System.out.println("X wins");loopcase=false;System.exit(1);
            }
            else if(diagonalcheck(Board,Board.length-1,'X')){
                System.out.println("X wins");loopcase=false;System.exit(1);
            }

            System.out.println("Enter row  Player O:");
            int rowO = scanner.nextInt()-1;
            System.out.println("Enter column for Player O:");
            int columnO = scanner.nextInt()-1;
            Board[rowO][columnO]='O';
            print(Board);
            for(int i = 0;i<Board.length;i++){
                if(rowcheck(Board,i,'O')){
                    System.out.println("O wins");loopcase=false;System.exit(1);
                }
            }
            for(int i = 0;i<Board.length;i++){
                if(colcheck(Board,i,'O')){
                    System.out.println("O wins");loopcase=false;System.exit(1);
                }
            }
            if(diagonalcheck(Board,0,'O')){
                System.out.println("O wins");loopcase=false;System.exit(1);
            }
            else if(diagonalcheck(Board,Board.length-1,'O')){
                System.out.println("O wins");loopcase=false;System.exit(1);
            }



        }
    }
}
