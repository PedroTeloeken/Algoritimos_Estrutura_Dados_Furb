package arvores.enaria.exemplos;

public class NoArvoreEnariaInteiros {

    private int info;

    private NoArvoreEnariaInteiros primeiro;

    private NoArvoreEnariaInteiros proximo;

    public NoArvoreEnariaInteiros(int info) {
        this.info = info;
        this.primeiro = null;
        this.proximo = null;
    }

    public void inserirFilho(NoArvoreEnariaInteiros no) {
        no.setProximo(getPrimeiro());
        this.setPrimeiro(no);
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NoArvoreEnariaInteiros getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoArvoreEnariaInteiros primeiro) {
        this.primeiro = primeiro;
    }

    public NoArvoreEnariaInteiros getProximo() {
        return proximo;
    }

    public void setProximo(NoArvoreEnariaInteiros proximo) {
        this.proximo = proximo;
    }

}
