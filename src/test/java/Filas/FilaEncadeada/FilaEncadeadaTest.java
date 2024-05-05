package Filas.FilaEncadeada;

import org.junit.Test;

import static org.junit.Assert.*;

public class FilaEncadeadaTest {

    @Test
    public void estaVazia(){
        FilaEncadeada<Integer> fila = new FilaEncadeada<>();

        assertEquals(fila.estaVazia() , true);

    }

    @Test
    public void NaoestaVazia(){
        FilaEncadeada<Integer> fila = new FilaEncadeada<>();

        fila.inserir(10);

        assertEquals(fila.estaVazia() , false);

    }

    @Test
    public void conferiEnfilaramento(){
        FilaEncadeada<Integer> fila = new FilaEncadeada<>();

        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        assertEquals(fila.retirar().intValue() , 10);
        assertEquals(fila.retirar().intValue() , 20);
        assertEquals(fila.retirar().intValue() , 30);
        assertEquals(fila.estaVazia() , true);

    }

    @Test
    public void confereLiberar(){
        FilaEncadeada<Integer> fila = new FilaEncadeada<>();

        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        fila.liberar();

        assertTrue(fila.estaVazia());

    }

}