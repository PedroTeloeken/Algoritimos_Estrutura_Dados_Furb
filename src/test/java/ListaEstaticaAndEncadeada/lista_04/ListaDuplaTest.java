package ListaEstaticaAndEncadeada.lista_04;

import ListaEstaticaAndEncadeada.lista_04.ListaDupla;
import ListaEstaticaAndEncadeada.lista_04.NoListaDupla;
import org.junit.Assert;
import org.junit.Test;

public class ListaDuplaTest {


    @Test
    public void TestarInserir() {
        ListaDupla<Integer> nodo = new ListaDupla<Integer>();

        nodo.inserir(20);
        nodo.inserir(15);
        nodo.inserir(10);
        nodo.inserir(5);

        Assert.assertEquals(nodo.toString(), "5 , 10 , 15 , 20 , ");

    }

    @Test
    public void TestarBuscar() {
        ListaDupla<Integer> nodo = new ListaDupla<Integer>();

        nodo.inserir(20);
        nodo.inserir(15);
        nodo.inserir(10);
        nodo.inserir(5);

        NoListaDupla test = nodo.buscar(20);

        Assert.assertEquals(20, test.getInfo());

    }

    @Test
    public void TestarBuscarMeioLista() {
        ListaDupla<Integer> nodo = new ListaDupla<Integer>();

        nodo.inserir(20);
        nodo.inserir(15);
        nodo.inserir(10);
        nodo.inserir(5);

        NoListaDupla test = nodo.buscar(10);

        Assert.assertEquals(10, test.getInfo());

    }

    @Test
    public void RemoverInicioLista(){
        ListaDupla<Integer> nodo = new ListaDupla<Integer>();

        nodo.inserir(20);
        nodo.inserir(15);
        nodo.inserir(10);
        nodo.inserir(5);

        nodo.retirar(20);

        Assert.assertEquals(nodo.toString(), "5 , 10 , 15 , ");

    }

    @Test
    public void testarRetirarMeioLista() {
        ListaDupla<Integer> nodo = new ListaDupla<Integer>();

        nodo.inserir(20);
        nodo.inserir(15);
        nodo.inserir(10);
        nodo.inserir(5);

        nodo.retirar(10);

        Assert.assertEquals(nodo.toString(), "5 , 15 , 20 , ");

    }

    public void testarRetirarFimLista() {
        ListaDupla<Integer> nodo = new ListaDupla<Integer>();

        nodo.inserir(5);
        nodo.inserir(10);
        nodo.inserir(15);
        nodo.inserir(20);

        nodo.retirar(5);

        Assert.assertEquals(nodo.toString(), "20 , 15 , 10 , ");

    }

    @Test
    public void testeLiberar() {
        ListaDupla<Integer> nodo = new ListaDupla<Integer>();

        nodo.inserir(5);
        nodo.inserir(10);
        nodo.inserir(15);

        NoListaDupla<Integer> cinco = nodo.buscar(5);
        NoListaDupla<Integer> dez = nodo.buscar(5);
        NoListaDupla<Integer> quinze = nodo.buscar(5);

        nodo.liberar();

        Assert.assertEquals(cinco.getProximo() , null);
        //Assert.assertEquals(cinco.getAnterior().getInfo() , null 5640);

    }

}