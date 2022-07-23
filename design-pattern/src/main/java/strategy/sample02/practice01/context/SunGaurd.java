package strategy.sample02.practice01.context;

import strategy.sample02.practice01.strategy.attack.AttackStrategy;
import strategy.sample02.practice01.strategy.move.MovingStrategy;

public class SunGaurd extends Robot{

    public SunGaurd(String name, MovingStrategy movingStrategy, AttackStrategy attackStrategy) {
        super(name, movingStrategy, attackStrategy);
    }

    @Override
    public void move() {
        this.movingStrategy.move();
    }

    @Override
    public void attack() {
        this.attackStrategy.attack();
    }
}
