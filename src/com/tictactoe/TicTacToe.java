package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    static char[] game;
    static char player;
    static char computer;
    static boolean winner=false;
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
                System.out.println("invalid ,position has already been taken");
            }
        }
    }
    static void toss(){

        int result=(int)Math.floor(Math.random()*10);
        if(result==1){
            System.out.println("Player has won");
        }else {
            System.out.println("computer has won");
        }

    }

    static void move(){
        if (game[0]==game[1] && game[1]==game[2] && game[2]==player){
            winner=true;
        } else if(game[3]==game[4] && game[4]==game[5] && game[5]==player){
            winner=true;
        } else if(game[6]==game[7] && game[7]==game[8] && game[8]==player){
            winner=true;
        } else if (game[0]==game[3] && game[3]==game[6] && game[6]==player) {
            winner=true;
        } else if (game[1]==game[4] && game[4]==game[7] && game[7]==player) {
            winner=true;
        } else if (game[2]==game[5] && game[5]==game[8] && game[8]==player) {
            winner=true;
        } else if (game[0]==game[4] && game[4]==game[8] && game[8]==player) {
            winner=true;
        } else if (game[2]==game[4] && game[4]==game[6] && game[6]==player) {
            winner=true;
        }
    }

    public static void main(String[] args) {

        System.out.println("welcome to the game");

        board();
        toss();
        input();
        showBoard();
        play();
        move();
    }
}
