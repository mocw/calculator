package pl.lodz.uni.math;

public class Calculator {

    public Calculator() {}

    public float dodaj(float a, float b){
        return a+b;
    }

    public float odejmij(float a, float b){
        return a-b;
    }

    public float pomnoz(float a, float b){
        return a*b;
    }

    public float podziel(float a, float b) throws ArithmeticException {
        if( b == 0) throw new ArithmeticException("Dzielenie przez zero!");
       try {
            float result = a/b;
            return result;
       } catch (ArithmeticException e){}
       return 0;
    }

    public float podniescDoPotegi(float l, float p){
        return (float) Math.pow(l,p);
    }

    public double pierwiastekKwadratowy(double l) throws ArithmeticException {
        if( l < 0 ) throw new ArithmeticException("Pierwiastek z liczby ujemnej!");
        return Math.sqrt(l);
    }
}
