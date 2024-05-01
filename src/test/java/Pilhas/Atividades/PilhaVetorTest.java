package Pilhas.Atividades;

import org.junit.Test;

import static org.junit.Assert.*;

public class PilhaVetorTest {


    @Test
    public void conferiEstaVazia() {

        PilhaVetor pilha = new PilhaVetor(10);

        assertEquals(pilha.estaVazia(), true);

    }

    @Test
    public void conferiNaoEstaVazia() {
        PilhaVetor pilha = new PilhaVetor(10);

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);


        assertEquals(pilha.estaVazia(), false);
    }

    @Test
    public void conferiDesempilhamento() {
        PilhaVetor pilha = new PilhaVetor(10);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        assertEquals(pilha.pop(), 30);
        assertEquals(pilha.pop(), 20);
        assertEquals(pilha.pop(), 10);
        assertEquals(pilha.estaVazia(), true);

    }

    @Test
    public void conferiErroTamanhoMaior() {
        PilhaVetor pilha = new PilhaVetor(3);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        assertThrows(RuntimeException.class, () -> {
            pilha.push(40);
        });

    }

    @Test
    public void conferiErroDesempilhamento() {
        PilhaVetor pilha = new PilhaVetor(3);

        assertThrows(RuntimeException.class, () -> {
            pilha.pop();
        });

    }

    @Test
    public void conferiPeek() {
        PilhaVetor pilha = new PilhaVetor(10);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        assertEquals(pilha.peek(), 30);
        assertEquals(pilha.pop(), 30);

    }

    @Test
    public void conferiLiberar() {
        PilhaVetor pilha = new PilhaVetor(10);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        pilha.liberar();

        assertEquals(pilha.estaVazia(), true);

    }

    @Test
    public void conferiConcatenar() {
        PilhaVetor pilha = new PilhaVetor(10);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        PilhaVetor pilha2 = new PilhaVetor(10);

        pilha.push(40);
        pilha2.push(50);

        pilha.concatenar(pilha2);


        assertEquals(pilha.toString(), "50, 40, 30, 20, 10, ");

    }

}