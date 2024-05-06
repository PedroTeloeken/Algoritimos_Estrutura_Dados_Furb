package arvores.binaria;

public class ArvoreBinaria {

    private NoArvoreBinaria raiz;

    public NoArvoreBinaria getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvoreBinaria raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia() {
        return raiz == null;
    }

    public boolean pertence(int info) {
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvoreBinaria no, int info) {
        if (no == null) {
            return false;
        } else {
            return (no.getInfo() == info)
                    || pertence(no.getEsquerda(), info)
                    || pertence(no.getDireita(), info);
        }
    }

    private String arvorePre(NoArvoreBinaria no) {
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
