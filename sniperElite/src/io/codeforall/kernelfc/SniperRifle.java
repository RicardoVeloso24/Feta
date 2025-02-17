package io.codeforall.kernelfc;

public class SniperRifle {

    private int bulletDamage = 50;

    public void shoot(Enemy enemy){
            enemy.hit(bulletDamage);
    }

    public void shootBarrel (Barrel barrel){
        barrel.hit(bulletDamage);
    }

    public void setBulletDamage(int bulletDamage) {
        this.bulletDamage = bulletDamage;
    }
}
