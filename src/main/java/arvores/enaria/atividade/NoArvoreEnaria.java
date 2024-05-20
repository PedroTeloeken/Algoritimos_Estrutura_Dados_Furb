package arvores.enaria.atividade;

import arvores.enaria.exemplos.NoArvoreEnariaInteiros;

public class NoArvoreEnaria<T> {

    private T info;

    private NoArvoreEnaria<T> primeiro;

    public T getInfo() {
        return info;
    }

    public NoArvoreEnaria(T info) {
        this.info = info;
        this.primeiro = null;
        this.proximo = null;
    }

    public void inserirFilho(NoArvoreEnaria<T> no) {
        no.setProximo(getPrimeiro());
        this.setPrimeiro(no);
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoArvoreEnaria<T> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoArvoreEnaria<T> primeiro) {
        this.primeiro = primeiro;
    }

    public NoArvoreEnaria<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoArvoreEnaria<T> proximo) {
        this.proximo = proximo;
    }

    private NoArvoreEnaria<T> proximo;

}
