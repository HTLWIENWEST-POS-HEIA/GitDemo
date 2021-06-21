package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public double plus(double a, double b){
        return a+b;
    }
    public double minus(double a, double b){
        return a-b;
    }
    public double mult(double a, double b){
        return a*b;
    }
    public double divid(double a, double b){
        return if(a > 0 && b > 0)(a/b);
    }
// griess.p19 add modulo    
    public int modulo(int a, int b){
        return a%b;
    }
}
