package io.codeforall.kernelfc;

public enum BarrelType {
    PLASTIC,
    WOOD,
    METAL;

    private int maxDamage ;

    private int getMaxDamage(){
        return maxDamage;
    }

    public static BarrelType getRandomBarrel(){
        int barrelType = ((int)(Math.random() * 3));
        switch (barrelType){
            case 0:
                return PLASTIC;
            case 1:
                return WOOD;
            case 2:
                return METAL;
            default:
                System.out.println("test");
                return PLASTIC;
        }
    }
}
