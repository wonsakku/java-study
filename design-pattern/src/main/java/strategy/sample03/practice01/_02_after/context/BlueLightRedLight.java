package strategy.sample03.practice01._02_after.context;

import strategy.sample03.practice01._02_after.strategy.Speed;

public class BlueLightRedLight {

    private Speed speed;

    public BlueLightRedLight(Speed speed) {
        this.speed = speed;
    }

    public void blueLight(){
        speed.blueLight();
    }

    public void redLight(){
        speed.redLight();
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }
}
