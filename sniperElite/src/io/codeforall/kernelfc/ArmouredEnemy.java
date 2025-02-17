package io.codeforall.kernelfc;

public class ArmouredEnemy extends Enemy{
    private int armour = 100;

    @Override
    public void hit (int bulletDamage){
        if (bulletDamage > armour){
            bulletDamage = bulletDamage - armour;
            armour = 0;
            System.out.println("Armoured Enemy hit");
            setHealth(getHealth()-bulletDamage);
        } else {
            armour = armour - bulletDamage;
            System.out.println("Armour hit");

        }
        if (getHealth() < 1) {
            setHealth(0);
            setDead(true);
            System.out.println("Armored Soldier down!");
        }
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }
}
