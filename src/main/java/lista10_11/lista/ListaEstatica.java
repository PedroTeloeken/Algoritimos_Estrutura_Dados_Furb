package lista10_11.lista;

public class ListaEstatica<T> extends ListaAbstract<T> {

    /**
     * Adiciona um dado na lista
     * @param dado dado a ser adicionado
     */
    public void inserir(T dado) {
        if (getTamanho() == getInfo().length) {
            redimensionar();
        }

        getInfo()[getTamanho()] = dado;
        setTamanho( getTamanho() + 1);
    }


    /**
     * Procura na lista um determinado dado
     * @param dado dado a ser pesquisado
     * @return posi��o do dado na lista. Caso n�o seja encontrado
     * retorna -1.
     */
    public int buscar(T dado) {
        for (int i=0; i<getTamanho(); i++) {
            if (getInfo()[i].equals(dado)) {
                return i;
            }
        }

        return -1;
    }


}
