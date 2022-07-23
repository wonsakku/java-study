package strategy.sample03.practice01._01_before;

import strategy.sample03.practice01._02_after.strategy.Normal;

public class BlueLightRedLight {

    private int speed;

    public BlueLightRedLight(int speed) {
        this.speed = speed;
    }

    public void blueLight(){
        if(speed == 1){
            System.out.println("무  궁  화   꽃   이   ");
        }else if(speed == 2){
            System.out.println("무궁화 꽃이");
        }else{
            System.out.println("무광꼬치");
        }


    }
    public void redLight(){
        if(speed == 1){
            System.out.println("피 었 습 니 다 .");
        }else if(speed == 2){
            System.out.println("피었습니다.");
        }else{
            System.out.println("폈슴다.");
        }


    }
}
