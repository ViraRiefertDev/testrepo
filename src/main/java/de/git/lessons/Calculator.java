package de.git.lessons;

public class Calculator {

    public double sum(double numberOne, double numberTwo){
        return numberOne + numberTwo;
    }

    public double multiplication(double numberOne, double numberTwo){
        return numberOne*numberTwo;
    }

    public double divide(double numberOne, double numberTwo){
        if(numberTwo == 0){
            System.out.println("ERROR!!!");
        }
        return numberOne/numberTwo;
    }
}
