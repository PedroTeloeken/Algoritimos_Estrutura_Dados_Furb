package ListaEstaticaAndEncadeada.lista_encadeada;

public class ListaEncadeadaString {

    private NoListaString primeiro;

    private String test;

    public void inserir(int info) {
        NoListaString novo = new NoListaString();
        novo.setInfo(info);
        novo.setProximo(this.primeiro);
        this.primeiro = novo;
    }

    public void exibir() {
        NoListaString nodo = this.primeiro;

        while (nodo != null) {
            System.out.println(nodo.getInfo());
            nodo = nodo.getProximo();
            this.primeiro = nodo;
        }
    }

    public boolean estaVazia() {
        return this.primeiro == null;
    }

    private NoListaString buscar(int valor) {
        NoListaString nodo = primeiro;
        while (nodo != null) {
            if (nodo.getInfo() == valor) {
                return nodo;
            } else {
                nodo = nodo.getProximo();
            }
        }
        return null;
    }

    private void retirar(int valor) {
        NoListaString anterior = null;
        NoListaString atual = this.primeiro;

        while (atual != null && atual.getInfo() != valor) {
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual != null) {
            if (atual.equals(this.primeiro)) {
                this.primeiro = atual.getProximo();
            } else {
                anterior.setProximo(atual.getProximo());
            }
        }

    }
}

