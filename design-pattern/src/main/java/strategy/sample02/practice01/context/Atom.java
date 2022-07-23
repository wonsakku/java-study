package strategy.sample02.practice01.context;

import strategy.sample02.practice01.strategy.attack.AttackStrategy;
import strategy.sample02.practice01.strategy.move.MovingStrategy;

public class Atom extends Robot{

    public Atom(String name, MovingStrategy movingStrategy, AttackStrategy attackStrategy) {
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
