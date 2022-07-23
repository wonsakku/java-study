package strategy.sample02.practice01.strategy.move;

public class WalkingStrategy implements MovingStrategy{

    @Override
    public void move() {
        System.out.println("Walking");
    }
}
