package strategy.sample03.practice01._02_after.strategy;

public class Normal implements Speed{

    @Override
    public void blueLight() {
        System.out.println("무 궁 화   꽃 이 ");
    }

    @Override
    public void redLight() {
        System.out.println(" 피 었 습 니 다.");
    }
}
