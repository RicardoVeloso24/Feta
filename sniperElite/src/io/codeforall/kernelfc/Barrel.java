package io.codeforall.kernelfc;

import java.sql.SQLOutput;

public class Barrel extends GameObject implements Destroyable {
    private BarrelType barrelType;
    private int currentDamage = 0;
    private boolean isDestroyed = false;

    public Barrel (){
        this.barrelType = BarrelType.getRandomBarrel();
    }

    @Override
    public void hit(int shoot){
        switch (barrelType){
            case PLASTIC:
                isDestroyed = true;
                System.out.println("Plastic barrel damaged");
                System.out.println("Plastic barrel destroyed.");
                break;
            case WOOD:
                if(currentDamage == 1){
                    isDestroyed = true;
                    System.out.println("Wood barrel damaged");
                    System.out.println("Wood barrel destroyed.");
                } else {
                    currentDamage++;
                    System.out.println("Wood barrel damaged.");
                }
                break;
            case METAL:
                if (currentDamage == 2){
                    isDestroyed = true;
                    System.out.println("Metal barrel damaged");
                    System.out.println("Metal barrel destroyed.");
                } else {
                    currentDamage ++;
                    System.out.println("Metal barrel damaged.");
                }
                break;
            default:
                System.out.println("Uiiii");
        }
    }

    @Override
    public boolean isDestroyed() {
        return isDestroyed;
    }

    @Override
    public void getMessage (){
        System.out.println("Barrel created!");
    }
}
