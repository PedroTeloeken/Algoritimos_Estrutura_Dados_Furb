package fé.busca;

import lista10_11.lista.ListaAbstract;

public class EstudoListaOrdenada<T extends Comparable<T>> extends EstudoListaAbstract<T> {
    @Override
    public void inserir(T dado) {
        Object[] info = getInfo();

        if (getTamanho() == info.length) {
            rediremensionar();
        }

        int posicao = procuraPosicaoInclusao(dado);

        if (posicao < getTamanho()) {
            deslocarDados(posicao);
        }

        //armazena dado na posicao localizada
        info = getInfo();
        info[posicao] = dado;

        setTamanho(getTamanho() + 1);

    }

    /*@Override
    public int buscar(T dado) {
        Object[] info = getInfo();

        int inicio = 0;
        int fim = getTamanho() - 1;
        int meio;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            int comparacao = dado.compareTo((T) info[meio]);

            if (comparacao < 0) {
                fim = meio - 1;
            } else {
                if (comparacao > 0) {
                    inicio = meio + 1;
                } else {
                    return meio;
                }
            }
        }

        return -1;

    }*/

    /**
     * Busca um dado na estrutura de dados utilizando
     * o algoritmo de busca bin ria
     * @param valor a ser pesquisa
     * @return Posi  o em que o dado foi localizado
     */
    @Override
    public int buscar(T valor) {
        Object[] info = getInfo();

        int inicio = 0;
        int fim = getTamanho()-1;
        int meio;

        while (inicio <= fim) {
            meio = (inicio+fim)/2;

            int comparacao = valor.compareTo((T)info[meio]);
            if (comparacao < 0) { // se (valor < info[meio])
                fim = meio-1;
            } else {
                if (comparacao > 0) // se (valor > info[meio]
                    inicio = meio+1;
                else
                    return meio;
            }
        }

        return -1;
    }

    /**
     * Procura em que posi  o deve ser adicionado um dado
     * @param itemAdicionar Dado a ser adicionado
     * @return Posi  o do vetor onde ser  adicionadoo elemento
     */
    private int procuraPosicaoInclusao(T itemAdicionar) {
        Object[] info = getInfo();
        int i;

        for (i = 0; i < getTamanho(); i++) {
            if (((Comparable) info[i]).compareTo(itemAdicionar) > 0) {
                break;
            }
        }

        return i;
    }

    /**
     * Desloca os elementos do vetor para a direita
     * Desloca os elementos a partir da posi  o indicada
     *
     * @param posicao Posi  o inicial para efetuar o deslocamento
     */
    private void deslocarDados(int posicao) {
        Object[] info = getInfo();
        for (int i = getTamanho() - 1; i >= posicao; i--) {
            info[i + 1] = info[i];
        }
    }

}
