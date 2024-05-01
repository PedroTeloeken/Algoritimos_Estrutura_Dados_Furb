package ListaEstaticaAndEncadeada.lista_encadeada_atividade;

public class NoListaGenerica <T> {

    private T info;

    private NoListaGenerica<T> proximo;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoListaGenerica<T> getProximo() {
       return this.proximo;
    }

    public void setProximo(NoListaGenerica<T> primeiro) {
        this.proximo = primeiro;
    }
}
