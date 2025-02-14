package io.codeforall.bootcamp;

import io.codeforall.bootcamp.cars.Car;
import io.codeforall.bootcamp.cars.CarFactory;
import io.codeforall.bootcamp.cars.MustangCar;
import io.codeforall.bootcamp.field.Field;
import io.codeforall.bootcamp.field.Position;

public class Game {

    public static final int MANUFACTURED_CARS = 20;

    /**
     * Container of Cars
     */
    private Car[] cars;

    /**
     * Animation delay
     */
    private int delay;

    public Game(int cols, int rows, int delay) {

        Field.init(cols, rows);
        this.delay = delay;

    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {
        cars = new Car[MANUFACTURED_CARS];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = CarFactory.getNewCar();

        }
        Field.draw(cars);


    }

    /**
     * Starts the animation
     *
     * @throws InterruptedException
     */
        public void start () throws InterruptedException {

            while (true) {

                // Pause for a while
                Thread.sleep(delay);

                // Move all cars
                moveAllCars();

                // Update screen
                Field.draw(cars);

            }

        }

        private void moveAllCars () {
            for (int i = 0; i < cars.length; i++) {
                if (!(cars[i].isCrashed())) {
                    if(cars[i].getPos().getCol() > 0 && cars[i].getPos().getCol() < Field.getWidth() &&
                            cars[i].getPos().getRow() > 0 && cars[i].getPos().getRow() < Field.getHeight()){
                        cars[i].mvForwardCar(cars[i]);
                        cars[i].newCrashes(cars);
                    } else {
                        cars[i].newDirection(cars[i]);
                        cars[i].mvForwardCar(cars[i]);
                        cars[i].newCrashes(cars);
                    }

                }

            }
        }

    }

