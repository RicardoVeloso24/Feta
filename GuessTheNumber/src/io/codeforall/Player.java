package io.codeforall;

public class Player {
    private String playerName;
    private double playerNumber;
    private double winningNumber;

    public Player( String name){
        this.playerName = name;
    }

    public Player (){

    }

    public String getPlayerName(){
        return this.playerName;
    }

    public double getPlayerNumber(){
        return this.playerNumber;
    }

    public double getWinningNumber(){
        return this.winningNumber;
    }

    public void setPlayerName(String name){
        this.playerName = name;
    }

    public void setPlayerNumber(double number){
        this.playerNumber = number;
    }
    public void setWinningNumber(double winningNumber){
        this.winningNumber = winningNumber;
    }


}

