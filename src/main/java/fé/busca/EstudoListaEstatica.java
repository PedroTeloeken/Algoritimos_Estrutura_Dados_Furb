package fé.busca;

import lista10_11.lista.ListaAbstract;

public class EstudoListaEstatica<T> extends EstudoListaAbstract<T> {
    @Override
    public void inserir(T dado) {
        if (getTamanho() == getInfo().length) {
            rediremensionar();
        }

        getInfo()[getTamanho()] = dado;
        setTamanho(getTamanho() + 1);

    }

    @Override
    public int buscar(T dado) {
        for (int i = 0; i < getTamanho(); i++) {
            if (getInfo()[i].equals(dado)) {
                return i;
            }
        }

        return -1;
    }

}
