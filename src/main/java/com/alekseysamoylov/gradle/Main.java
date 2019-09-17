package com.alekseysamoylov.gradle;


import org.apache.commons.math3.random.RandomGeneratorFactory;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(RandomGeneratorFactory.createRandomGenerator(new Random()).nextInt(100));
    }
}
