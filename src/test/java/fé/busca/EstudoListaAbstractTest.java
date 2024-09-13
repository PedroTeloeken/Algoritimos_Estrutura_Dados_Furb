package fé.busca;

import org.junit.Test;

import static org.junit.Assert.*;

public class EstudoListaAbstractTest {

    EstudoListaOrdenada lista = new EstudoListaOrdenada();

    @Test
    public void Teste1() {

        lista.inserir(100);
        lista.inserir(20);
        lista.inserir(70);
        lista.inserir(1);

        assertEquals("1,20,70,100", lista.toString());

    }

    private void alimentarLista(){
        lista.inserir(0);
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);
        lista.inserir(50);
        lista.inserir(60);
        lista.inserir(70);
        lista.inserir(80);
        lista.inserir(90);
        lista.inserir(100);
    }


    @Test
    public void Teste2() {

        assertEquals(2, lista.buscar(20));

    }

}