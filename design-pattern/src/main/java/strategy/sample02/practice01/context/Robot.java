package strategy.sample02.practice01.context;

import strategy.sample02.practice01.strategy.attack.AttackStrategy;
import strategy.sample02.practice01.strategy.move.MovingStrategy;

public abstract class Robot {

    private String name;
    protected MovingStrategy movingStrategy;
    protected AttackStrategy attackStrategy;

    public Robot(String name, MovingStrategy movingStrategy, AttackStrategy attackStrategy) {
        this.name = name;
        this.movingStrategy = movingStrategy;
        this.attackStrategy = attackStrategy;
    }

    public abstract void move();

    public abstract void attack();

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
}
