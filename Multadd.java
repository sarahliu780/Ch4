public class Multadd{
    public static double multadd(double a, double b, double c) {
        return a*b+c;
    }
    public static double expSum(double x) {
        return multadd(x, Math.exp(x*(-1)), Math.sqrt(1-(Math.exp(x*(-1)))));
    }
    public static void main(String[] args) {
        //multadd test
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        double abc = multadd(a, b, c);
        System.out.println(abc);
        //sin and cos equation
        double sincos = multadd(1.0, (Math.sin(Math.PI/4)), (Math.cos(Math.PI/4)/2));
        System.out.println(sincos);
        //log equation
        double log = multadd(1.0, 1.0, Math.log10(20)); //log 10 = 1
        System.out.println(log);
        //expSum method
        double x = 1.0;
        double expSumAns = expSum(x);
        System.out.println(expSumAns);
    }
}