package io.codeforall.kernelfc;

public class Game {

    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;
    private int shotsFired = 0;

    public void start(){
        gameObjects = createObjects(5);
        sniperRifle = new SniperRifle();

        for (int i = 0; i < gameObjects.length; i++){
            if (gameObjects[i] instanceof Enemy){
                while (((Enemy) gameObjects[i]).getHealth() > 0){
                    sniperRifle.shoot((Enemy)gameObjects[i]);
                    shotsFired++;
                }
            } else if (gameObjects[i] instanceof Barrel){
                while (((Barrel) gameObjects[i]).isDestroyed() == false){
                    sniperRifle.shootBarrel((Barrel)gameObjects[i]);
                    shotsFired++;
                }
            } else {
                System.out.println("You cannot shoot Trees!");
            }
        }
    }

    public GameObject[] createObjects(int numbObject){

        int random = 0;

        GameObject[] objects = new GameObject[numbObject];

        for (int i = 0; i < numbObject; i++){

            random = ((int)(Math.random() * 6));

            if (random == 0){
                GameObject gameObject = new Tree();
                gameObject.getMessage();
                objects[i] = gameObject;
            } else if (random > 0 && random < 3) {
                GameObject gameObject = new SoldierEnemy();
                gameObject.getMessage();
                objects[i] = gameObject;
            } else if (random > 2 && random < 5){
                GameObject gameObject = new ArmouredEnemy();
                gameObject.getMessage();
                objects[i] = gameObject;
            } else {
                GameObject gameObject = new Barrel();
                gameObject.getMessage();
                objects[i] = gameObject;
            }
        }
        return objects;
    }

    public int getShotsFired() {
        return shotsFired;
    }
}
