package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Field;
import io.codeforall.bootcamp.field.Position;

public class CarFactory {

    public static  Car getNewCar() {

        int brand = ((int) (Math.random() * 2));
        if (brand == 0) {

            Position pos = new Position((int)(Math.random() * (Field.getWidth())),((int)(Math.random() * (Field.getHeight()))));
            Car car = new FiatCar();
            car.setPos(pos);
            car.setStatusCar(statusCar.FIAT);
            car.setDirection(Direction.randomDirection());
            return car;
        } else {
            Position pos = new Position((int)(Math.random() * (Field.getWidth())),(int)(Math.random() * (Field.getHeight())));
            //getNewCar().setPos(pos);
            Car car = new MustangCar();
            car.setPos(pos);
            car.setStatusCar(statusCar.MUSTANG);
            car.setDirection(Direction.randomDirection());
            return car;
        }
    }


}
