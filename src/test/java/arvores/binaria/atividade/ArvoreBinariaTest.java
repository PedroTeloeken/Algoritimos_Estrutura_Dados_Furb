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
    public void confereSeNaoPertence22() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> noArvore4 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> noArvore2 = new NoArvoreBinaria<Integer>(4 , null , noArvore4);

        NoArvoreBinaria<Integer> noArvore5 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> noArvore6 = new NoArvoreBinaria<Integer>(6);

        NoArvoreBinaria<Integer> noArvore3 = new NoArvoreBinaria<Integer>(3 , noArvore5 , noArvore6);

        NoArvoreBinaria<Integer> noArvore1 = new NoArvoreBinaria<Integer>(1 , noArvore2 , noArvore3);

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

    @Test
    public void isDegenerada() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> noArvore4 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> noArvore77 = new NoArvoreBinaria<Integer>(4);


        NoArvoreBinaria<Integer> noArvore5 = new NoArvoreBinaria<Integer>(5 , noArvore4 , null);

        NoArvoreBinaria<Integer> noArvore6 = new NoArvoreBinaria<Integer>(6 , noArvore5 , null);

        NoArvoreBinaria<Integer> noArvore7 = new NoArvoreBinaria<Integer>(7 , noArvore6 , null);

        arvore.setRaiz(noArvore7);

        assertEquals(arvore.isDegenerada() , true);
    }

    @Test
    public void isDegenerad22a() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> noArvore4 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> noArvore77 = new NoArvoreBinaria<Integer>(4);

        NoArvoreBinaria<Integer> noArvore5 = new NoArvoreBinaria<Integer>(5 , noArvore4 , null);

        NoArvoreBinaria<Integer> noArvore6 = new NoArvoreBinaria<Integer>(6 , null , noArvore5);

        NoArvoreBinaria<Integer> noArvore7 = new NoArvoreBinaria<Integer>(7 , noArvore6 , null);

        NoArvoreBinaria<Integer> noArvore8 = new NoArvoreBinaria<Integer>(8, null , noArvore6);

        NoArvoreBinaria<Integer> noArvore9 = new NoArvoreBinaria<Integer>(9, noArvore8 , null);

        NoArvoreBinaria<Integer> noArvore10 = new NoArvoreBinaria<Integer>(10, null , noArvore9);

        arvore.setRaiz(noArvore10);

        assertEquals(arvore.isDegenerada() , true);

    }

    @Test
    public void isDegenerad22a22() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> noArvore10 = new NoArvoreBinaria<Integer>(10, null , null);
        NoArvoreBinaria<Integer> noArvore9 = new NoArvoreBinaria<Integer>(9, noArvore10 , null);

        arvore.setRaiz(noArvore9);

        assertEquals(arvore.isDegenerada() , true);

    }


    @Test
    public void isDegeneraddasdda22a() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> noArvore4 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> noArvore77 = new NoArvoreBinaria<Integer>(4);

        NoArvoreBinaria<Integer> noArvore5 = new NoArvoreBinaria<Integer>(5 , null , noArvore4);

        NoArvoreBinaria<Integer> noArvore6 = new NoArvoreBinaria<Integer>(6 , null , noArvore5);

        NoArvoreBinaria<Integer> noArvore7 = new NoArvoreBinaria<Integer>(7 , null , noArvore6);

        NoArvoreBinaria<Integer> noArvore8 = new NoArvoreBinaria<Integer>(8, null , noArvore7);

        NoArvoreBinaria<Integer> noArvore9 = new NoArvoreBinaria<Integer>(9, null , noArvore8);

        NoArvoreBinaria<Integer> noArvore10 = new NoArvoreBinaria<Integer>(10, null , noArvore9);

        arvore.setRaiz(noArvore10);

        assertEquals(arvore.isDegenerada() , true);

    }

}