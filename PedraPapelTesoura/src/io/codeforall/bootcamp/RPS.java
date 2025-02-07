package io.codeforall.bootcamp;

public enum RPS {

    ROCK,
    PAPER,
    SCISSORS;




    public static RPS choseHand(){
        int num = (int)Math.ceil(Math.random()*3);

        switch(num){
            case 1:
                return ROCK;
            case 2:
                return PAPER;
            default:
                return SCISSORS;
        }
    }


}




