package ListaEstaticaAndEncadeada.lista_04;

public class ListaDupla<T> {

    private NoListaDupla<T> primeiro;

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) {

        NoListaDupla<T> nodo = new NoListaDupla<T>();

        nodo.setInfo(valor);

        if (primeiro == null) {
            this.primeiro = nodo;
            return;
        }

        NoListaDupla<T> primeiro = this.primeiro;

        nodo.setProximo(primeiro);

        primeiro.setAnterior(nodo);

        this.primeiro = nodo;

    }

    public NoListaDupla<T> buscar(T valor) {
        NoListaDupla nodo = getPrimeiro();

        while (nodo != null) {
            if (nodo.getInfo() == valor) {
                return nodo;
            }
            nodo = nodo.getProximo();
        }

        return null;
    }

    public void retirar(T valor) {

        NoListaDupla<T> atual = buscar(valor);

        if (atual != null) {
            if (this.primeiro == atual) {
                primeiro = atual.getProximo();
            } else {
                atual.getAnterior().setProximo(atual.getProximo());

                if (atual.getProximo() != null) {
                    atual.getProximo().setAnterior(atual.getAnterior());
                }
            }
        }
    }

    public void clonar(NoListaDupla nodo){

        ListaDupla nova = new ListaDupla();
        NoListaDupla atual = nodo;

        NoListaDupla ultimo = null;

        while (atual != null) {
            ultimo = atual;
            atual = atual.getProximo();
        }

        while (ultimo != null) {
            nova.inserir(ultimo.getInfo());
            ultimo = ultimo.getAnterior();
        }

        System.out.println(nova.toString());

    }


    public void exibirOrdemInversa() {

        NoListaDupla atual = this.primeiro;

        NoListaDupla ultimo = null;

        while (atual != null) {
            ultimo = atual;
            atual = atual.getProximo();
        }

        while (ultimo != null) {
            System.out.println(ultimo.getInfo());
            ultimo = ultimo.getAnterior();
        }

    }

    public void liberar() {

        NoListaDupla nodo = this.primeiro;

        while (nodo != null) {
            NoListaDupla proximo = this.primeiro.getProximo();

            nodo.setProximo(null);
            nodo.setAnterior(null);

            nodo = proximo;
        }

        primeiro = null;

    }


    public String toString() {
        String resultado = "";

        NoListaDupla linha = this.primeiro;

        while (linha != null) {
            resultado += linha.getInfo().toString() + " , ";
            linha = linha.getProximo();
        }

        return resultado;
    }


}
