package io.codeforall.kernelfc;

abstract class Enemy extends GameObject implements Destroyable {
    private int health = 100;
    private boolean isDead = false;
    private boolean isDestroyed = false;

    public boolean isDead() {
        return isDead;
    }

    public void hit(int shoot){
    }

    @Override
    public void getMessage (){
        System.out.println("Enemy created!");
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public boolean getDead(){
        return isDead;
    }
    @Override
    public boolean isDestroyed (){
        return isDestroyed;
    };
}
