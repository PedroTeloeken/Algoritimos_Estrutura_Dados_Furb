package arvores.binaria.atividade;

public class ArvoreBinaria<T> {

    private NoArvoreBinaria<T> raiz;

    public NoArvoreBinaria<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    public Boolean estaVazia() {
        return raiz == null;
    }

    public boolean pertence(T info) {
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvoreBinaria<T> no, T info) {
        System.out.println(1);
        if (no == null) {
            return false;
        } else {
            return (no.getInfo() == info)
                    || pertence(no.getEsquerda(), info)
                    || pertence(no.getDireita(), info);
        }
    }

    private String arvorePre(NoArvoreBinaria<T> no) {
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

    public int contarNos() {
        return contarNos(raiz);
    }

    private int contarNos(NoArvoreBinaria<T> no) {
        if (no == null) {
            return 0;
        } else {
            return 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());
        }
    }

    public boolean isDegenerada() {
        if(contarNos() <= 1){
            return false;
        }

        NoArvoreBinaria arvore = raiz;

        Boolean isDegenerada = true;

        while (arvore != null) {
            if (arvore.getEsquerda() != null && arvore.getDireita() != null) {
                return false;
            }
            if (arvore.getDireita() != null) {
                arvore = arvore.getDireita();
            } else {
                arvore = arvore.getEsquerda();
            }
        }

        return isDegenerada;

    }

}
