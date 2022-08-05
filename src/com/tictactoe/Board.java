package com.tictactoe;

public class Board {
    static char[] game;
    static void board(){
        game=new char[10];
        for(int i=0;i<10;i++){
            game[i]='.';
        }
    }

    public static void main(String[] args) {

        System.out.println("welcome to the game");

        board();

    }
}
