package fé.arvore;

import arvores.binaria.atividade.NoArvoreBinaria;

public abstract class EstudoArvoreBinariaAbstract<T> {

    private EstudoNoArvoreBinaria<T> raiz;

    public EstudoArvoreBinariaAbstract() {
        raiz = null;
    }

    public EstudoNoArvoreBinaria<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(EstudoNoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia() {
        return this.raiz == null;
    }

    public boolean pertence(T info) {
        return buscar(info) != null;
    }

    public abstract EstudoNoArvoreBinaria<T> buscar(T info);

    public String toString() {
        return arvorePre(raiz);
    }

    private String arvorePre(EstudoNoArvoreBinaria<T> no) {
        if (no == null)
            return "<>";
        else
            return "<" +
                    no.getInfo() +
                    arvorePre(no.getEsquerda()) +
                    arvorePre(no.getDireita()) +
                    ">";
    }

    public int contarNos() {
        return contarNos(raiz);
    }

    private int contarNos(EstudoNoArvoreBinaria<T> no) {
        if (no == null) {
            return 0;
        } else {
            return 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());
        }
    }


}
