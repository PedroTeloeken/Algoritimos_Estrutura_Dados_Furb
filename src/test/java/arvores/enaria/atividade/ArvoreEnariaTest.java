package arvores.enaria.atividade;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArvoreEnariaTest <T> {

    @Test
    public void validarRepresentacaoTextual() {

        NoArvoreEnaria<T> no10 = new NoArvoreEnaria(10);
        NoArvoreEnaria<T> no9 = new NoArvoreEnaria(9);

        NoArvoreEnaria<T> no4 = new NoArvoreEnaria(4);

        no4.inserirFilho(no10);
        no4.inserirFilho(no9);


        NoArvoreEnaria<T> no8 = new NoArvoreEnaria(8);

        NoArvoreEnaria no3 = new NoArvoreEnaria(3);

        no3.inserirFilho(no8);

        NoArvoreEnaria no7 = new NoArvoreEnaria(7);
        NoArvoreEnaria no6 = new NoArvoreEnaria(6);
        NoArvoreEnaria no5 = new NoArvoreEnaria(5);

        NoArvoreEnaria no2 = new NoArvoreEnaria(2);

        no2.inserirFilho(no7);
        no2.inserirFilho(no6);
        no2.inserirFilho(no5);

        NoArvoreEnaria no1 = new NoArvoreEnaria(1);

        no1.inserirFilho(no4);
        no1.inserirFilho(no3);
        no1.inserirFilho(no2);

        ArvoreEnaria arvore = new ArvoreEnaria();
        arvore.setRaiz(no1);

        assertEquals("<1<2<5><6><7>><3<8>><4<9><10>>>", arvore.toString());

    }

    @Test
    public void pertence(){
        NoArvoreEnaria<Integer> no7 = new NoArvoreEnaria(7);
        NoArvoreEnaria<Integer> no6 = new NoArvoreEnaria(6);
        NoArvoreEnaria<Integer> no5 = new NoArvoreEnaria(5);

        NoArvoreEnaria<Integer> no2 = new NoArvoreEnaria(2);

        no2.inserirFilho(no5);
        no2.inserirFilho(no6);
        no2.inserirFilho(no7);

        NoArvoreEnaria<Integer> no8 = new NoArvoreEnaria(8);
        NoArvoreEnaria<Integer> no3 = new NoArvoreEnaria(3);

        no3.inserirFilho(no8);

        NoArvoreEnaria<Integer> no9 = new NoArvoreEnaria(9);
        NoArvoreEnaria<Integer> no10 = new NoArvoreEnaria(10);

        NoArvoreEnaria<Integer> no4 = new NoArvoreEnaria(4);

        no4.inserirFilho(no9);
        no4.inserirFilho(no10);

        NoArvoreEnaria<Integer> no1 = new NoArvoreEnaria(1);

        no1.inserirFilho(no2);
        no1.inserirFilho(no3);
        no1.inserirFilho(no4);

        ArvoreEnaria<Integer> arvore = new ArvoreEnaria();

        arvore.setRaiz(no1);

        assertEquals(true , arvore.pertence(7));

    }


    @Test
    public void naoPertence(){
        NoArvoreEnaria<Integer> no7 = new NoArvoreEnaria(7);
        NoArvoreEnaria<Integer> no6 = new NoArvoreEnaria(6);
        NoArvoreEnaria<Integer> no5 = new NoArvoreEnaria(5);

        NoArvoreEnaria<Integer> no2 = new NoArvoreEnaria(2);

        no2.inserirFilho(no5);
        no2.inserirFilho(no6);
        no2.inserirFilho(no7);

        NoArvoreEnaria<Integer> no8 = new NoArvoreEnaria(8);
        NoArvoreEnaria<Integer> no3 = new NoArvoreEnaria(3);

        no3.inserirFilho(no8);

        NoArvoreEnaria<Integer> no9 = new NoArvoreEnaria(9);
        NoArvoreEnaria<Integer> no10 = new NoArvoreEnaria(10);

        NoArvoreEnaria<Integer> no4 = new NoArvoreEnaria(4);

        no4.inserirFilho(no9);
        no4.inserirFilho(no10);

        NoArvoreEnaria<Integer> no1 = new NoArvoreEnaria(1);

        no1.inserirFilho(no2);
        no1.inserirFilho(no3);
        no1.inserirFilho(no4);

        ArvoreEnaria<Integer> arvore = new ArvoreEnaria();

        arvore.setRaiz(no1);

        assertEquals(false , arvore.pertence(55));

    }

    @Test
    public void contar(){
        NoArvoreEnaria<Integer> no7 = new NoArvoreEnaria(7);
        NoArvoreEnaria<Integer> no6 = new NoArvoreEnaria(6);
        NoArvoreEnaria<Integer> no5 = new NoArvoreEnaria(5);

        NoArvoreEnaria<Integer> no2 = new NoArvoreEnaria(2);

        no2.inserirFilho(no5);
        no2.inserirFilho(no6);
        no2.inserirFilho(no7);

        NoArvoreEnaria<Integer> no8 = new NoArvoreEnaria(8);
        NoArvoreEnaria<Integer> no3 = new NoArvoreEnaria(3);

        no3.inserirFilho(no8);

        NoArvoreEnaria<Integer> no9 = new NoArvoreEnaria(9);
        NoArvoreEnaria<Integer> no10 = new NoArvoreEnaria(10);

        NoArvoreEnaria<Integer> no4 = new NoArvoreEnaria(4);

        no4.inserirFilho(no9);
        no4.inserirFilho(no10);

        NoArvoreEnaria<Integer> no1 = new NoArvoreEnaria(1);

        no1.inserirFilho(no2);
        no1.inserirFilho(no3);
        no1.inserirFilho(no4);

        ArvoreEnaria<Integer> arvore = new ArvoreEnaria();

        arvore.setRaiz(no1);

        assertEquals(10 , arvore.contarNos());

    }

}