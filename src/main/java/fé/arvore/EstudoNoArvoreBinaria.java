package fé.arvore;

public class EstudoNoArvoreBinaria <T> {

    private T info;
    private EstudoNoArvoreBinaria<T> esquerda;
    private EstudoNoArvoreBinaria<T> direita;

    public EstudoNoArvoreBinaria(T info) {
        this.info = info;
        esquerda = null;
        direita = null;
    }

    public EstudoNoArvoreBinaria(T info, EstudoNoArvoreBinaria<T> esq, EstudoNoArvoreBinaria<T> dir) {
        this.info = info;
        this.esquerda = esq;
        this.direita = dir;
    }

    public void setInfo (T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public EstudoNoArvoreBinaria<T> getEsquerda () {
        return esquerda;
    }

    public EstudoNoArvoreBinaria<T> getDireita () {
        return direita;
    }

    public void setEsquerda(EstudoNoArvoreBinaria<T> esquerda) {
        this.esquerda = esquerda;

    }

    public void setDireita(EstudoNoArvoreBinaria<T> direita) {
        this.direita = direita;

    }

}
