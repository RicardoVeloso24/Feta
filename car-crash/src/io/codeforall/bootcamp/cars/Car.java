package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Field;
import io.codeforall.bootcamp.field.Position;

 abstract public class Car {

     private Position pos ;

     private statusCar status;

     private Direction direction;

     public Car(){

        // this.setPos(pos);
     }

     public void setStatusCar(statusCar status) {
         this.status = status;
     }

     /** The position of the car on the grid */


    public Position getPos() {

        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public boolean isCrashed() {
        if(status == statusCar.COLIDED){
            return true;
        } else return false;
    }

     public void setDirection(Direction direction) {
         this.direction = direction;
     }

     public Direction getDirection() {
         return direction;
     }

     public statusCar getStatus() {
         return status;
     }

     public void mvForwardCar (Car car){
        switch(car.getDirection()){
            case UP:
                car.pos.setRow(car.pos.getRow()+1);
                break;
            case DOWN:
                car.pos.setRow(car.pos.getRow()-1);
                break;
            case LEFT:
                car.pos.setCol(car.pos.getCol()-1);
                break;
            case RIGHT:
                car.pos.setCol(car.pos.getCol()+1);
                break;
        }
     }

     public void newDirection (Car car){
         switch(car.getDirection()){
             case UP:
                 car.setDirection(Direction.DOWN);
                 break;
             case DOWN:
                 car.setDirection(Direction.UP);
                 break;
             case LEFT:
                 car.setDirection(Direction.RIGHT);
                 break;
             case RIGHT:
                 car.setDirection(Direction.LEFT);
                 break;
         }
     }

     public void newCrashes (Car[] cars){
        int myself = 2;
         for (int i = 0; i < cars.length; i++) {
             if(this.pos == cars[i].pos){
                 myself--;
                 if (myself < 1){
                     this.setStatusCar(statusCar.COLIDED);
                     cars[i].setStatusCar(statusCar.COLIDED);
                 }
             }


         }

     }
 }
