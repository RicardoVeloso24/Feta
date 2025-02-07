package io.codeforall.bootcamp;

public class Game {



    public void handWin(Player player1, Player player2){
    if(player1.getHand(RPS.choseHand()) == player2.getHand(RPS.choseHand())){
        System.out.println("Its  tie!! Play again");
    } else if(player1.getHand() == "ROCK" && player2.getHand() == "SCISSORS" ||
            player1.getHand() == "PAPER" && player2.getHand() == "ROCK" ||
            player1.getHand() == "SCISSORS" && player2.getHand() == "PAPER"){
        player1.setVictories(player1.getVictories() + 1);
    }
    }

    public void handWin(Player player1, Player player2) {


    }
    }







    public static void Play(int plays, Player player1, Player player2){
        while(plays > 0){



        }

    }


}
