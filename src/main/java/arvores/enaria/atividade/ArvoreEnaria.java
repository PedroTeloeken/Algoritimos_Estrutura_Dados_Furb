package arvores.enaria.atividade;

public class ArvoreEnaria <T> {

    private NoArvoreEnaria<T> raiz;

    public NoArvoreEnaria<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvoreEnaria<T> raiz) {
        this.raiz = raiz;
    }

    public boolean
    pertence(T info) {
        if (raiz == null) {
            return false;
        } else {
            return pertence(raiz, info);
        }
    }

    private boolean pertence(NoArvoreEnaria<T> no, T info) {
        if (no.getInfo() == info) {
            return true;
        } else {
            NoArvoreEnaria<T> atual = no.getPrimeiro();
            while (atual != null) {
                if (pertence(atual, info)) {
                    return true;
                }
                atual = atual.getProximo();
            }
        }
        return false;
    }

    public String toString() {
        if(raiz == null) {
            return "";
        }
        return obterRepresentacaoVisual(raiz);
    }

    private String obterRepresentacaoVisual(NoArvoreEnaria<T> no){
        String representacaoTextual = "<" + no.getInfo();

        NoArvoreEnaria<T> atual = no.getPrimeiro();

        while (atual != null){
            representacaoTextual += obterRepresentacaoVisual(atual);
            atual = atual.getProximo();
        }

        representacaoTextual += ">";

        return representacaoTextual;
    }

    public int contarNos() {
        return contarNos(raiz);
    }

    private int contarNos(NoArvoreEnaria<T> no) {
        if (no == null) {
            return 0;
        } else {
            return 1 + contarNos(no.getPrimeiro()) + contarNos(no.getProximo());
        }
    }

}
