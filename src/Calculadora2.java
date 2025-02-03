public class Calculadora2 {
    public static void main(String[] args) {
        int a=2, b=3,c=10,d=2;
        int res= multiplicacion(a,b);
        int res2= division(c,d);
        System.out.println("3 * 2= "+ res);
        System.out.println("10 / 2 = "+res2);
    }
    public static int suma(int a, int b){
        return a + b;
    }
    public static int resta(int a, int b){
        return a - b;
    }
    public static int multiplicacion(int a, int b){
        return  a*b;
    }
    public static int division(int c , int d){
        return  c / d;
    }

}
