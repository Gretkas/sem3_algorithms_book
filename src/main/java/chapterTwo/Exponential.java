package chapterTwo;

import javax.swing.*;
import java.util.Date;
import java.util.LinkedList;


public class Exponential {



    public double exp(double x, int n){
        if (n  == 0){
            return 1;
        }
        double d = exp(x, n-1);

        x  *= d;
        return x;
    }

    /**
     * Exp 3 double.
     *
     * @param x the x
     * @param n the n
     * @return the double
     */
    public double exp3(double x, int n){
        if(n  == 0){
            return 1;
        }
        double d = exp3(x*x, n/2);
        if (n % 2 != 0) {
            return x*d;
        }
        else {
            return d;
        }
    }


    public String timeCalculator(double x, int n){
        Date start = new Date();
        int rounds = 0;
        double time;
        Date end;
        do{
            Math.pow(x, n);
            end = new Date();
            ++rounds;
        }while (end.getTime()-start.getTime()<1000);
        time = (double)(end.getTime()-start.getTime())/rounds;
        return "milliseconds each round"+time;
    }
    public static void main(String[] args) {
        System.out.println("test");
    }
}