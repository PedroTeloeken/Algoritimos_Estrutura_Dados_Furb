package fé.busca;

public abstract class EstudoListaAbstract<T> {

    private T[] info;

    private int tamanho;

    public EstudoListaAbstract() {
        this.info = (T[]) new Object[10];
        this.tamanho = 0;
    }

    public T[] getInfo() {
        return info;
    }

    public void setInfo(T[] info) {
        this.info = info;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    protected void rediremensionar() {
        T[] novo = (T[]) new Object[tamanho + 10];
        for (int i = 0; i < tamanho; i++) {
            novo[i] = info[i];
        }

        info = novo;

    }

    public abstract void inserir(T dado);

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(info[i]);
        }
    }

    /**
     * @param dado
     * @return posicao do intem encontrado caso não retorna -1
     */
    public abstract int buscar(T dado);

    public void liberar() {
        info = (T[]) new Object[10];
        tamanho = 0;
    }

    public T obterElemnto(int posicao) {
        if (posicao >= 0 && (posicao < tamanho)) {
            return info[posicao];
        } else {
            throw new IndexOutOfBoundsException("Posicao Inválida");
        }
    }

    @Override
    public String toString() {
        String resultado = "";

        for (int i = 0; i < tamanho; i++) {
            if (i > 0)
                resultado += ",";
            resultado += info[i];
        }

        return resultado;
    }

}
