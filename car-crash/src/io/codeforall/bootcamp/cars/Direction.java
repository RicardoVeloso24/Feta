package io.codeforall.bootcamp.cars;

public enum Direction {
    UP,
    RIGHT,
    DOWN,
    LEFT;

    //Verificar se as direçoes n tomam todas o mesmo valor
    public static Direction randomDirection (){
        int dir = 0;
        dir = ((int)(Math.random() * 4));

        switch(dir){
            case 0:
                return UP;
            case 1:
               return RIGHT;
            case 2:
                return DOWN;
            case 3:
                return LEFT;
        }
        return UP;
    }


}
