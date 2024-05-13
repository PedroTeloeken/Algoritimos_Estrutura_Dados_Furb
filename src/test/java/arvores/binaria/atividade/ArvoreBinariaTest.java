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

    @Test
    public void conferiRepresentacaoTextual() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> noArvore4 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> noArvore2 = new NoArvoreBinaria<Integer>(2, null, noArvore4);

        NoArvoreBinaria<Integer> noArvore5 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> noArvore6 = new NoArvoreBinaria<Integer>(6);

        NoArvoreBinaria<Integer> noArvore3 = new NoArvoreBinaria<Integer>(3, noArvore5, noArvore6);


        NoArvoreBinaria<Integer> noArvore1 = new NoArvoreBinaria<Integer>(1, noArvore2, noArvore3);

        arvore.setRaiz(noArvore1);


        assertEquals(arvore.toString(), "<1<2<><4<><>>><3<5<><>><6<><>>>>");
    }

    @Test
    public void confereSePertence() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> noArvore4 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> noArvore2 = new NoArvoreBinaria<Integer>(2, null, noArvore4);

        NoArvoreBinaria<Integer> noArvore5 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> noArvore6 = new NoArvoreBinaria<Integer>(6);

        NoArvoreBinaria<Integer> noArvore3 = new NoArvoreBinaria<Integer>(3, noArvore5, noArvore6);


        NoArvoreBinaria<Integer> noArvore1 = new NoArvoreBinaria<Integer>(1, noArvore2, noArvore3);

        arvore.setRaiz(noArvore1);


        assertTrue(arvore.pertence(1));
    }

    @Test
    public void confereSeNaoPertence() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> noArvore4 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> noArvore2 = new NoArvoreBinaria<Integer>(2, null, noArvore4);

        NoArvoreBinaria<Integer> noArvore5 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> noArvore6 = new NoArvoreBinaria<Integer>(6);

        NoArvoreBinaria<Integer> noArvore3 = new NoArvoreBinaria<Integer>(3, noArvore5, noArvore6);


        NoArvoreBinaria<Integer> noArvore1 = new NoArvoreBinaria<Integer>(1, noArvore2, noArvore3);

        arvore.setRaiz(noArvore1);


        assertTrue(arvore.pertence(3 ));
    }

    @Test
    public void confere6() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> noArvore4 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> noArvore2 = new NoArvoreBinaria<Integer>(2, null, noArvore4);

        NoArvoreBinaria<Integer> noArvore5 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> noArvore6 = new NoArvoreBinaria<Integer>(6);

        NoArvoreBinaria<Integer> noArvore3 = new NoArvoreBinaria<Integer>(3, noArvore5, noArvore6);


        NoArvoreBinaria<Integer> noArvore1 = new NoArvoreBinaria<Integer>(1, noArvore2, noArvore3);

        arvore.setRaiz(noArvore1);


        assertTrue(arvore.pertence(6 ));
    }


    @Test
    public void conferNaoPertence() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> noArvore4 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> noArvore2 = new NoArvoreBinaria<Integer>(2, null, noArvore4);

        NoArvoreBinaria<Integer> noArvore5 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> noArvore6 = new NoArvoreBinaria<Integer>(6);

        NoArvoreBinaria<Integer> noArvore3 = new NoArvoreBinaria<Integer>(3, noArvore5, noArvore6);


        NoArvoreBinaria<Integer> noArvore1 = new NoArvoreBinaria<Integer>(1, noArvore2, noArvore3);

        arvore.setRaiz(noArvore1);


        assertFalse(arvore.pertence(10));
    }

    @Test
    public void contarNos() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> noArvore4 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> noArvore2 = new NoArvoreBinaria<Integer>(2, null, noArvore4);

        NoArvoreBinaria<Integer> noArvore5 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> noArvore6 = new NoArvoreBinaria<Integer>(6);

        NoArvoreBinaria<Integer> noArvore3 = new NoArvoreBinaria<Integer>(3, noArvore5, noArvore6);

        NoArvoreBinaria<Integer> noArvore1 = new NoArvoreBinaria<Integer>(1, noArvore2, noArvore3);

        arvore.setRaiz(noArvore1);

        assertEquals(arvore.contarNos() , 6);
    }

}