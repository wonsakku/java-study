package strategy.sample02.practice01.strategy.attack;

public class PunchStrategy implements AttackStrategy{


    @Override
    public void attack() {
        System.out.println("진심 펀치");
    }
}
