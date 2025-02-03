import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

    class CalculadoraTest {

        @Test
        public void testMain() {
            System.out.println("main");
            String[] args = null;
            Calculadora.main(args);
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


        @ParameterizedTest
        @ValueSource(ints = {2, 3, 4, 5, 8})
        public void testEsPar(int n) {
            System.out.println("esPar");
            assertTrue(Calculadora.esPar(n));
        }
    }

