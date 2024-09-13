package fé.arvore;

import arvores.binaria.atividade.NoArvoreBinaria;
import fé.busca.EstudoListaAbstract;

public class EstudoArvoreBinariaBusca<T extends Comparable<T>> extends EstudoArvoreBinariaAbstract<T> {

    public void inserir(T info) {
        EstudoNoArvoreBinaria<T> novo = new EstudoNoArvoreBinaria<T>(info);

        if (estaVazia()) {
            setRaiz(novo);
        } else {
            EstudoNoArvoreBinaria<T> p = getRaiz();
            EstudoNoArvoreBinaria<T> pai;

            while (true) {
                pai = p;
                if (info.compareTo(p.getInfo()) < 0) {
                    p = p.getEsquerda();
                    if (p == null) {
                        pai.setEsquerda(novo);
                        return;
                    }
                } else {
                    p = p.getDireita();
                    if (p == null) {
                        pai.setDireita(novo);
                        return;
                    }
                }
            }
        }

    }

    @Override
    public EstudoNoArvoreBinaria<T> buscar(T info) {
        EstudoNoArvoreBinaria<T> p;

        p = getRaiz();

        while (p != null && !p.getInfo().equals(info)) {
            if (info.compareTo(p.getInfo()) < 0) {
                p = p.getEsquerda();
            } else {
                p = p.getDireita();
            }
        }
        return p;
    }

    private EstudoNoArvoreBinaria<T> extrairSucessor(EstudoNoArvoreBinaria<T> p) {
        EstudoNoArvoreBinaria<T> atual = p.getDireita();
        EstudoNoArvoreBinaria<T> paiSucessor = p;
        EstudoNoArvoreBinaria<T> sucessor = p;

        while (atual != null) {
            paiSucessor = sucessor;
            sucessor = atual;
            atual = atual.getEsquerda();
        }

        if (sucessor != p.getDireita()) {
            paiSucessor.setEsquerda(sucessor.getDireita());
            sucessor.setDireita(p.getDireita());
        }

        return sucessor;
    }


    public void retirar(T info) {
        EstudoNoArvoreBinaria<T> p = getRaiz();
        EstudoNoArvoreBinaria<T> pai = null;
        boolean filhoEsquerda = false;

        // localiza o n� a ser removido:
        while ((p!=null) && (!p.getInfo().equals(info))) {
            pai = p;

            if (info.compareTo(p.getInfo()) < 0) { // se (info < p.info) ent�o
                filhoEsquerda = true;
                p = p.getEsquerda();
            } else {
                filhoEsquerda = false;
                p = p.getDireita();
            }
        }

        if (p != null) { // achou dado a ser removido?
            // avalia se � n� folha:
            if ((p.getEsquerda()==null) && (p.getDireita()==null)) {
                // 1o. Caso
                if (p == getRaiz())
                    setRaiz(null);
                else {
                    if (filhoEsquerda)
                        pai.setEsquerda(null);
                    else
                        pai.setDireita(null);
                }
            } else {
                if (p.getDireita()==null) {
                    // n� com apenas um filho � esquerda
                    // 2o. Caso
                    if (p == getRaiz())
                        setRaiz (p.getEsquerda());
                    else {
                        if (filhoEsquerda)
                            pai.setEsquerda(p.getEsquerda());
                        else
                            pai.setDireita(p.getEsquerda());
                    }
                } else {
                    if (p.getEsquerda()==null) {
                        // n� com um apenas um filho � direita
                        // 2o. Caso
                        if (p == getRaiz())
                            setRaiz(p.getDireita());
                        else {
                            if (filhoEsquerda)
                                pai.setEsquerda(p.getDireita());
                            else
                                pai.setDireita(p.getDireita());
                        }
                    } else {
                        // n� com filho a esquerda e � direita
                        // 3o. caso
                        EstudoNoArvoreBinaria<T> sucessor = extrairSucessor(p);
                        if (p == getRaiz())
                            setRaiz(sucessor);
                        else {
                            if (filhoEsquerda)
                                pai.setEsquerda(sucessor);
                            else
                                pai.setDireita(sucessor);
                        }
                        sucessor.setEsquerda(p.getEsquerda());
                    }
                }
            }
        }
    }

    public boolean isDegenerada() {
        EstudoNoArvoreBinaria<T> p = getRaiz();

        while (p!=null) {
            if (p.getEsquerda()!=null && p.getDireita()!=null) {
                return false;
            } else {
                if (p.getEsquerda()!=null) {
                    p = p.getEsquerda();
                } else {
                    p = p.getDireita();
                }
            }
        }

        return true;
    }


    /**
     * Retorna a altura da �rvore
     * @return altura da �rvore

    public int altura(){
    return altura(raiz);
    }

    private int altura(NoArvoreBinaria<T> no){
    if (no == null)
    return -1;
    else
    return 1 + Math.max(altura(no.getEsquerda()), altura(no.getDireita()));
    }


    public boolean isBalanceada() {
    return isBalanceada(getRaiz());
    }


    private boolean isBalanceada(NoArvoreBinaria<T> p) {
    if (p == null) {
    return true;
    } else {
    int qtdeNosEsquerda = altura(p.getEsquerda());
    int qtdeNosDireita  = altura(p.getDireita());
    int difAlturas = qtdeNosEsquerda - qtdeNosDireita;
    if (difAlturas < 0)
    difAlturas = difAlturas * -1;
    if (difAlturas > 1) {
    return false;
    } else {
    if (!isBalanceada(p.getEsquerda()))
    return false;
    else if (!isBalanceada(p.getDireita())) {
    return false;
    }

    return true;
    }
    }
    }
     */

}
