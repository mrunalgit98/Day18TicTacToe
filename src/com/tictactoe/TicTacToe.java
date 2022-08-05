package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    static char[] game;
    static char player;
    static char computer;
    static int location=0;
    static void board(){
        game=new char[10];
        for(int i=0;i<9;i++){
            game[i]='*';
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
    static void showBoard(){
        System.out.println("|---|---|---|");
        System.out.println("| " + game[0] + " | "
                + game[1] + " | " + game[2]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + game[3] + " | "
                +
                game[4] + " | " + game[5]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + game[6] + " | "
                + game  [7] + " | " + game[8]
                + " |");
        System.out.println("|---|---|---|");

    }

    static void play(){
        while (location < 9){
            Scanner sc1 =new Scanner(System.in);
            System.out.println("enter position from 0 to 9");
            int position = sc1.nextInt();
            if(game[position]=='*'){
                game[position]=player;
                showBoard();
                location++;
                play();
            }else {
                System.out.println("invalid ");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("welcome to the game");

        board();
        input();
        showBoard();
        play();
    }
}
