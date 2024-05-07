package arvores.binaria.exemplos;

public class ArvoreBinariaInteiros {

    private NoArvoreBinariaInteiro raiz;

    public NoArvoreBinariaInteiro getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvoreBinariaInteiro raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia() {
        return raiz == null;
    }

    public boolean pertence(int info) {
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvoreBinariaInteiro no, int info) {
        if (no == null) {
            return false;
        } else {
            return (no.getInfo() == info)
                    || pertence(no.getEsquerda(), info)
                    || pertence(no.getDireita(), info);
        }
    }

    private String arvorePre(NoArvoreBinariaInteiro no) {
        if (no == null) {
            return "<>";
        } else {
            return "<" +
                    no.getInfo() + arvorePre(no.getEsquerda()) + arvorePre(no.getDireita()) + ">";
        }
    }

    @Override
    public String toString() {
        return arvorePre(raiz);
    }


}
