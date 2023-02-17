import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ej9Test {

    @Test
    void testBreakpoint(){      //Este test solo se utiliza para llamar al metodo con unos valores especificos y comprobar el metodo con un breakpoint
        ej9.ej9('N',1000,14);
    }

    @Test
    void test1(){
        assertNotEquals(1000, ej9.ej9('N',1000,1));     //En este caso de prueba da fallo ya que el sueldo no ha sido modificado
    }

    @Test
    void test2(){
        assertNotEquals(1001, ej9.ej9('E',1001,1));     //En este caso de prueba tambien da fallo ya que el sueldo no ha sido modificado
    }
    @Test
    void test3(){
        assertEquals(1000, ej9.ej9('R',1000,1));
    }
    @Test
    void test4(){
        assertEquals(1000, ej9.ej9('N',1000,0));
    }
    @Test
    void test5(){
        assertEquals(999, ej9.ej9('N',999,1));
    }


}