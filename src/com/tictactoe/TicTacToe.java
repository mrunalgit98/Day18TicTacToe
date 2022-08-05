package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    static char[] game;
    static void board(){
        game=new char[10];
        for(int i=0;i<10;i++){
            game[i]='.';
        }
    }
    static void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("choose X OR O ");
        char player=sc.next().charAt(0);
        char computer;
        if(player=='X'){
            computer='O';
            System.out.println("position " +player);
        }else{
            computer ='X';
            System.out.println("Position " +player);
        }
    }

    public static void main(String[] args) {

        System.out.println("welcome to the game");

        board();
        input();
    }
}
