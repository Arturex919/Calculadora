import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculadora2Test {

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculadora2.main(args);
    }

    @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 1;
        int b = 2;
        int expResult = 3;
        int result = Calculadora.suma(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testSuma_1() {
        System.out.println("suma");
        int a = -2;
        int b = -5;
        int expResult = -7;
        int result = Calculadora.suma(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Calculadora.resta(a, b);
        assertEquals(expResult, result);
    }
    @Test
    void testMultiplicacion() {
        int a=2, b=3;
        System.out.println("Multiplicacion");
        int expectativa=6;
        int resul =Calculadora2.multiplicacion(a,b);
        assertEquals(expectativa,resul);
    }
    @Test
    void testMultiplicacion2() {
        int a=5, b=2;
        System.out.println("Multiplicacion");
        int expectativa=10;
        int resul =Calculadora2.multiplicacion(a,b);
        assertEquals(expectativa,resul);
    }

    @Test
    void division() {
        int c=10, d=2;
        System.out.println("division");
        int expectativa=5;
        int resul =Calculadora2.division(c,d);
        assertEquals(expectativa,resul);
    }
    @Test
    void testDivision2(){
        int c=40 ,d=10;
        System.out.println("division 2");
        int expectativa = 4;
        int resul=Calculadora2.division(c,d);
        assertEquals(expectativa,resul);
    }
}