package arvores.binaria.atividade;

import arvores.binaria.exemplos.NoArvoreBinariaInteiro;

public class NoArvoreBinaria<T> {

    private T info;

    private NoArvoreBinaria<T> esquerda, direita;

    public NoArvoreBinaria(T info) {
        this.info = info;
    }

    public NoArvoreBinaria(T info, NoArvoreBinaria<T> direita, NoArvoreBinaria<T> esquerda) {
        this.info = info;
        this.direita = direita;
        this.esquerda = esquerda;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoArvoreBinaria getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoArvoreBinaria esquerda) {
        this.esquerda = esquerda;
    }

    public NoArvoreBinaria getDireita() {
        return direita;
    }

    public void setDireita(NoArvoreBinaria direita) {
        this.direita = direita;
    }


}
