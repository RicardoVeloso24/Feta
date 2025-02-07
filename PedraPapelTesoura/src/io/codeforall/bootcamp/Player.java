package io.codeforall.bootcamp;

public class Player {

    private String name;
    private int victories;
    private RPS hand;


    public Player(String name){
            this.name = name;
    }



    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


    public void setVictories(int victories){
        this.victories = victories;
    }

    public int getVictories(){
        return this.victories;
    }
    public void setHand(RPS hand){
        this.hand = hand;
    }

    public RPS getHand(){
        return this.hand;
    }


}

