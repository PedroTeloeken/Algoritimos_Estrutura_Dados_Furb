package ListaEstaticaAndEncadeada.lista_encadeada_atividade;

public class ListaEncadeada<T> {

    private T info;

    private NoListaGenerica<T> primeiro , ultimo;

    public ListaEncadeada() {
        this.primeiro = null;
    }

    public NoListaGenerica<T> getPrimeiro() {
        return this.primeiro;
    }

    public NoListaGenerica<T> getUltimo() {
        return ultimo;
    }

    public void inserir(T info) {
        NoListaGenerica<T> novo = new NoListaGenerica<>();
        novo.setInfo(info);
        novo.setProximo(getPrimeiro());

        if(estaVazia()){
            ultimo = novo;
        }

        this.primeiro = novo;
    }

    public void inserirNoFinal(T info){
        NoListaGenerica<T> novo = new NoListaGenerica<>();
        novo.setInfo(info);
        novo.setProximo(null);

        if(estaVazia()){
            primeiro = novo;
        } else {
            ultimo.setProximo(novo);
        }

        ultimo = novo;

    }

    public boolean estaVazia() {
        return this.primeiro == null;
    }

    public NoListaGenerica<T> buscar(T info) {
        NoListaGenerica<T> atual = getPrimeiro();
        while (atual != null) {
            if (atual.getInfo().equals(info)) {
                return atual;
            }
            atual = atual.getProximo();
        }

        return null;
    }

    public void retirar(T valor) {
        NoListaGenerica<T> anterior = null;
        NoListaGenerica<T> atual = getPrimeiro();

        while ((atual != null) && !atual.getInfo().equals(valor)) {
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual != null) {
            if (atual.equals(primeiro)) {
                primeiro = atual.getProximo();
            } else {
                anterior.setProximo(atual.getProximo());
            }
        }
    }

    public NoListaGenerica<T> obterNo(int posicao) {
        if ((posicao < 0) || (posicao > obterTamanhoElemento() - 1)) {
            throw new IllegalArgumentException("Indice não existe");
        }

        NoListaGenerica<T> p = getPrimeiro();
        for (int i = 0; i < posicao; i++) {
            p = p.getProximo();
        }

        return p;
    }

    public int obterTamanhoElemento() {

        int qtdeNos = 0;

        NoListaGenerica<T> p = getPrimeiro();

        while (p != null) {
            qtdeNos++;
            p = p.getProximo();
        }

        return qtdeNos;
    }

    @Override
    public String toString() {
        String resultado = "";

        NoListaGenerica<T> atual = getPrimeiro();

        while (atual != null) {
            if (atual != getPrimeiro()) {
                resultado += ",";
            }

            resultado += atual.getInfo().toString();
            atual = atual.getProximo();
        }

        return resultado;
    }

    public void liberar() {
        NoListaGenerica<T> atual = primeiro;

        while (atual != null) {
            NoListaGenerica<T> proximo = atual.getProximo();
            atual.setProximo(null);
            atual = proximo;
        }
        primeiro = null;

    }
}
