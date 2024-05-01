package ListaEstaticaAndEncadeada.lista_04;

public class MainLista04 {
    public static void main(String[] args) {

        ListaDupla lista = new ListaDupla();

        lista.inserir("A");
        lista.inserir("B");
        lista.inserir("C");

        lista.clonar(lista.getPrimeiro());

    }
}
