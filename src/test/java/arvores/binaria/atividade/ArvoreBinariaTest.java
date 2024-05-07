package arvores.binaria.atividade;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArvoreBinariaTest {

    @Test
    public void testEstaVazia() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        assertEquals(arvore.estaVazia(), true);
    }

    @Test
    public void testNaoEstaVazia() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        NoArvoreBinaria<Integer> noArvore = new NoArvoreBinaria<Integer>(10);

        arvore.setRaiz(noArvore);
        assertEquals(arvore.estaVazia(), false);
    }


}