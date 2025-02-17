package io.codeforall.kernelfc;

public class SoldierEnemy extends Enemy {

    @Override
    public void hit(int bulletDamage) {
        setHealth(getHealth() - bulletDamage);
        System.out.println("Soldier enemy hit for: " + bulletDamage);
        if (getHealth() < 1) {
            setHealth(0);
            setDead(true);
            System.out.println("Soldier down!");
        }
    }
}