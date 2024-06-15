package Filas.FilaVetor;

import org.junit.Test;

import static org.junit.Assert.*;

public class FilaVetorTest {

    @Test
    public void estaVazia() {
        FilaVetor<Integer> fila = new FilaVetor<>(10);

        assertTrue(fila.estaVazia());
    }

    @Test
    public void naoEstaVazia() {
        FilaVetor<Integer> fila = new FilaVetor<>(10);

        fila.inserir(10);

        assertEquals(fila.estaVazia(), false);
    }

    @Test
    public void ConfereDesenfileramento() {
        FilaVetor<Integer> fila = new FilaVetor<>(10);

        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        assertEquals(fila.retirar().intValue(), 10);
        assertEquals(fila.retirar().intValue(), 20);
        assertEquals(fila.retirar().intValue(), 30);

        assertEquals(fila.estaVazia(), true);
    }

    @Test
    public void FilaCheiaException() {
        FilaVetor<Integer> fila = new FilaVetor<>(3);

        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);


        assertThrows(RuntimeException.class, () -> {
            fila.inserir(40);
        });

    }

    @Test
    public void FilaVaziaException() {
        FilaVetor<Integer> fila = new FilaVetor<>(3);

        assertThrows(RuntimeException.class, fila::retirar);

    }

    @Test
    public void testePeak() {
        FilaVetor<Integer> fila = new FilaVetor<>(10);

        fila.inserir(10);
        fila.inserir(30);
        fila.inserir(20);


        assertEquals(fila.peak().intValue(), 10);
    }

    @Test
    public void TesteLiberar() {
        FilaVetor<Integer> fila = new FilaVetor<>(10);

        fila.inserir(10);
        fila.inserir(30);
        fila.inserir(20);

        fila.liberar();

        assertEquals(fila.estaVazia(), true);
    }

    @Test
    public void TesteConcatenar() {

        FilaVetor<Integer> fila = new FilaVetor<>(5);

        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        FilaVetor<Integer> fila2 = new FilaVetor<Integer>(3);

        fila2.inserir(40);
        fila2.inserir(50);

        FilaVetor<Integer> filaConcatenada = fila.criarFilaConcatenada(fila2);

        assertEquals(filaConcatenada.toString(), " 10; 20; 30; 40; 50;");
        assertEquals(filaConcatenada.peak().intValue(), 10);

    }

    @Test
    public void TesteConcatenar222() {

        FilaVetor<Integer> fila = new FilaVetor<>(10);

        fila.inserir(1);
        fila.inserir(2);
        fila.inserir(3);
        fila.inserir(4);
        fila.retirar();
        fila.inserir(10);
        assertEquals(fila.limite, 10);


        fila.encolher();
        assertEquals(fila.limite, 4);

       assertEquals(fila.tamanho, 4);
        //assertEquals(fila.limite, 4);

        // assertEquals(fila.toString() , "");

    }

}