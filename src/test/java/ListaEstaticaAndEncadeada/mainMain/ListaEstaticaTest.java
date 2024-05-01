package ListaEstaticaAndEncadeada.mainMain;

import ListaEstaticaAndEncadeada.lista_estatica_generica.ListaEstatica;
import org.junit.Assert;
import org.junit.Test;

public class ListaEstaticaTest {

    @Test
    public void testeCaso10(){
        ListaEstatica<Object> lista = new ListaEstatica<>();

        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserir(4);

        lista.inverter();

        Assert.assertEquals("4,3,2,1," , lista.toString());

    }

    @Test
    public void testeCaso11(){
        ListaEstatica<Object> lista = new ListaEstatica<>();

        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserir(4);

        lista.inverter();

        Assert.assertEquals("4,3,2,1," , lista.toString());

    }

}