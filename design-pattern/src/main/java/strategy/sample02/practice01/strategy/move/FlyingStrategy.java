package strategy.sample02.practice01.strategy.move;

public class FlyingStrategy implements MovingStrategy{

    @Override
    public void move() {
        System.out.println("Fly High");
    }
}
