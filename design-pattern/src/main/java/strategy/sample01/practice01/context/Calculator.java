package strategy.sample01.practice01.context;

import strategy.sample01.practice01.Item.Item;
import strategy.sample01.practice01.strategy.DiscountStrategy;

import java.util.List;

public class Calculator {

    private DiscountStrategy discountStrategy;

    public Calculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public int calculate(List<Item> items){

        int sum = 0;

        for(Item item : items){
            sum += discountStrategy.getDiscountPrice(item.getPrice());
        }

        return sum;
    }
}
