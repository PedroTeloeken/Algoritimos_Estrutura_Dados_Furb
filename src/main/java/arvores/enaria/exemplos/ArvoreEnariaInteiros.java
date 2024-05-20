package arvores.enaria.exemplos;

public class ArvoreEnariaInteiros {

    private NoArvoreEnariaInteiros raiz;

    public NoArvoreEnariaInteiros getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvoreEnariaInteiros raiz) {
        this.raiz = raiz;
    }

    public boolean pertence(int info) {
        if (raiz == null) {
            return false;
        } else {
            return pertence(raiz, info);
        }
    }

    private boolean pertence(NoArvoreEnariaInteiros no, int info) {
        if (no.getInfo() == info) {
            return true;
        } else {
            NoArvoreEnariaInteiros atual = no.getPrimeiro();
            while (atual != null) {
                if (pertence(info)) {
                    atual = atual.getProximo();
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

    private String obterRepresentacaoVisual(NoArvoreEnariaInteiros no){
        String representacaoTextual = "<" + no.getInfo();

        NoArvoreEnariaInteiros atual = no.getPrimeiro();

        while (atual != null){
            representacaoTextual += obterRepresentacaoVisual(atual);
            atual = atual.getProximo();
        }

        representacaoTextual += ">";

        return representacaoTextual;
    }

}
