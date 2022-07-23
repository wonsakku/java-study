package strategy.sample03.practice01._02_after.strategy;

public class VeryFast implements Speed{

    @Override
    public void blueLight() {
        System.out.println("무광꽃치 ");
    }

    @Override
    public void redLight() {
        System.out.println(" 폈슴다.");
    }
}
