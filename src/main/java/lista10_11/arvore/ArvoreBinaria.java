package lista10_11.arvore;

public class ArvoreBinaria<T> extends ArvoreBinariaAbstract<T> {

    /**
     * Define a raiz da �rvore
     * @param raiz Nova raiz da �rvore
     */
    public void setRaiz(NoArvoreBinaria<T> raiz) {
        super.setRaiz(raiz);
    }


    /**
     * Localiza um n� que armazena um determinado dado, retornando este n�
     * @param info Dado a ser localizado
     * @return N� que armazena o dado ou null caso n�o encontrar
     */
    public NoArvoreBinaria<T> buscar(T info) {
        return buscar(getRaiz(), info);
    }

    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info) {
        if (no == null)
            return null;
        else {
            if (no.getInfo().equals(info))
                return no;
            else {
                NoArvoreBinaria<T> aux;

                aux = buscar(no.getEsquerda(), info);
                if (aux == null)
                    aux = buscar(no.getDireita(), info);

                return aux;
            }
        }
    }

}
