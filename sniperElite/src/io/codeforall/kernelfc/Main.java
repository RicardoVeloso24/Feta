package io.codeforall.kernelfc;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
        System.out.println("Shoots Fired: " + game.getShotsFired());
    }
}
