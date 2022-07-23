package strategy.sample03.practice01._02_after;

import strategy.sample03.practice01._02_after.context.BlueLightRedLight;
import strategy.sample03.practice01._02_after.context.BlueLightRedLightWithParam;
import strategy.sample03.practice01._02_after.strategy.Fast;
import strategy.sample03.practice01._02_after.strategy.Normal;
import strategy.sample03.practice01._02_after.strategy.Speed;

public class Client {

    public static void main(String[] args) {
        BlueLightRedLight game = new BlueLightRedLight(new Normal());
        game.blueLight();
        game.redLight();


        BlueLightRedLightWithParam game2 = new BlueLightRedLightWithParam();
        game2.blueLight(new Normal());
        game2.redLight(new Fast());

        game2.blueLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("무우 구웅 후와 꾸오치");
            }

            @Override
            public void redLight() {
                System.out.println("피이 어엇었 스읍 느이 드으아");
            }
        });

    }
}
