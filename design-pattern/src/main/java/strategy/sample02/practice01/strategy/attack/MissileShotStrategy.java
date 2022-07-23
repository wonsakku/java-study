package strategy.sample02.practice01.strategy.attack;

public class MissileShotStrategy implements AttackStrategy{

    @Override
    public void attack() {
        System.out.println("미사일");
    }
}
