package io.codeforall;


public class Machine {
    public static double numGen;

    public Machine (){

    }
    public static double numGenerator(){
        return Math.ceil(Math.random()*10);
    }
    public static void firstHand (Player player1){
        player1.setWinningNumber(numGenerator());
        player1.setPlayerNumber(numGenerator());
    }

    public static void hand(Player player1){
        System.out.println("You missed, try again");
        System.out.println(player1.getPlayerNumber());
        System.out.println(player1.getWinningNumber());
        player1.setPlayerNumber(Machine.numGenerator());
    }
    public static void winning (Player player1){
        System.out.println("you guessed it");
        System.out.println(player1.getPlayerNumber());
        System.out.println(player1.getWinningNumber());
    }

}
