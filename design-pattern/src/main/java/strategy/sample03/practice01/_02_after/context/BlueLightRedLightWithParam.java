package strategy.sample03.practice01._02_after.context;

import strategy.sample03.practice01._02_after.strategy.Speed;

public class BlueLightRedLightWithParam {

    public void blueLight(Speed speed){
        speed.blueLight();
    }

    public void redLight(Speed speed){
        speed.redLight();
    }
}
