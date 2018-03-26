package org.kj.mvn;

public class Calculator {

//    public int add(int i, int j){
//        return i + j;
//    }

    CalculatorService service;

    public int perform(int i, int j){
        return service.add(i,j) * i;
    }



}
