package com.Watson.ObeyingDesignPrinciples.InterfaceSegregationPrinciple;

/**
 * Created by Long on 3/31/2017.
 */
public class Shark implements WaterAnimal{
    public void swim() {
        System.out.println("Swimming. . .");
    }

    public void dive() {
        System.out.println("Dive.");
    }

}
