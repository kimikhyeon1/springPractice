package org.example.practicespring.designPattern.strategy;

public class StrategyBow implements Strategy{


    @Override
    public void runStrategy() {
        System.out.println("활쏘기");
    }
}
