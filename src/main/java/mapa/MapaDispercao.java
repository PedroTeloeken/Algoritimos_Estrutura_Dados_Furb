package mapa;

import ListaEstaticaAndEncadeada.lista_encadeada_atividade.ListaEncadeada;
import ListaEstaticaAndEncadeada.lista_encadeada_atividade.NoListaGenerica;

public class MapaDispercao<T> {

    private ListaEncadeada[] info;

    public MapaDispercao(int tamanho) {
        this.info = new ListaEncadeada[tamanho];
    }

    public int calculaHash(int chave) {
        return chave % info.length;
    }

    public void inserir(int chave, T dado) {
        int indice = calculaHash(chave);

        if (info[indice] == null) {
            info[indice] = new ListaEncadeada<NoMapa<T>>();
        }

        NoMapa<T> no = new NoMapa<T>();
        no.setChave(chave);
        no.setInfo(dado);

        info[indice].inserir(no);
    }

    public T buscar(int chave) {
        int indice = calculaHash(chave);

        if (info[indice] != null) {
            NoMapa<T> noMapa = new NoMapa<T>();
            noMapa.setChave(chave);

            NoListaGenerica<NoMapa<T>> no = info[indice].buscar(noMapa);

            if (no != null) {
                return no.getInfo().getInfo();
            }
        }
        return null;
    }

    public void remover(int chave) {
        int indice = calculaHash(chave);
        if (info[indice] != null) {
            NoMapa<T> noTemp = new NoMapa();
            noTemp.setChave(chave);
            info[indice].retirar(noTemp);
        }
    }

}
