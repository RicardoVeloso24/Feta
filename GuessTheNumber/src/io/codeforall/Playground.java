package io.codeforall;

public class Playground {

    public static void main(String[] args) {
    Player player1 = new Player ("Ze");
    Machine.firstHand(player1);

    while(player1.getPlayerNumber() != player1.getWinningNumber()){
        Machine.hand(player1);
    }
    Machine.winning(player1);

    }


}
