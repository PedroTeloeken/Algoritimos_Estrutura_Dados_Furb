package arvores.binaria.exemplos;

public class NoArvoreBinariaInteiro {

    private int info;
    private NoArvoreBinariaInteiro esquerda, direita;

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NoArvoreBinariaInteiro(int info) {
        this.info = info;
        esquerda = null;
        direita = null;
    }

    public NoArvoreBinariaInteiro(int info , NoArvoreBinariaInteiro esquerda , NoArvoreBinariaInteiro direita) {
        this.info = info;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public NoArvoreBinariaInteiro getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoArvoreBinariaInteiro esquerda) {
        this.esquerda = esquerda;
    }

    public NoArvoreBinariaInteiro getDireita() {
        return direita;
    }

    public void setDireita(NoArvoreBinariaInteiro direita) {
        this.direita = direita;
    }

}
