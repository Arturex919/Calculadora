import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotaTest {

    @Test
    public void main() {
        System.out.println("main");
        String[]args=null;
        Nota.main(args);
    }
    @Test
    void notas() {
        int a=5,b=4,c=8;
        int nota=5;
        int expectativa=5;
        int resul=Nota.notas(nota);
        assertEquals(expectativa,resul);
    }
    @Test
    void reprobadoNotas() {
        int a=5,b=4,c=8;
        int nota=0;
        int expectativa=5;
        int resul=Nota.notas(nota);
        assertEquals(expectativa,resul);
    }
}