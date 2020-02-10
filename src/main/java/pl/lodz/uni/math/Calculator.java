package pl.lodz.uni.math;

public class Calculator {

    public Calculator() {}

    public float dodaj(int a, float b){
        return a+b;
    }

    public float odejmij(float a, float b){
        return a-b;
    }

    public float pomnoz(float a, float b){
        return a*b;
    }

    public float podziel(float a, float b) throws ArithmeticException {
       try {
            float result = a/b;
            return result;
       } catch (ArithmeticException e){}
       return 0;
    }
}
