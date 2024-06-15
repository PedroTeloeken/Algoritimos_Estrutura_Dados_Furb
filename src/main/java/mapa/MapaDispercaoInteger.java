package mapa;

import ListaEstaticaAndEncadeada.lista_encadeada_atividade.ListaEncadeada;
import ListaEstaticaAndEncadeada.lista_encadeada_atividade.NoListaGenerica;

public class MapaDispercaoInteger {

    private ListaEncadeada<NoMapaInteger<Integer>>[] info;

    public MapaDispercaoInteger(int tamanho) {
        this.info = new ListaEncadeada[tamanho];
    }

    public int calculaHash(int chave) {
        int tamanho = info.length;
        return chave % tamanho;
    }

    public void inserir(int chave, int dado) {
        int indice = calculaHash(chave);

        if (info[indice] == null) {
            info[indice] = new ListaEncadeada<NoMapaInteger<Integer>>();
        }

        NoMapaInteger<Integer> noMapaInteger = new NoMapaInteger<Integer>();
        noMapaInteger.setInfo(dado);
        noMapaInteger.setChave(chave);

        info[indice].inserir(noMapaInteger);
    }

    public Integer buscar(int chave) {
        int indice = calculaHash(chave);

        if (info[indice] != null) {
            NoMapaInteger noMapaInteger = new NoMapaInteger<Integer>();
            noMapaInteger.setChave(chave);

            NoListaGenerica<NoMapaInteger<Integer>> no = info[indice].buscar(noMapaInteger);

            if (no != null) {
                return no.getInfo().getInfo();
            }
        }
        return null;
    }

    public void remover(int chave) {
        int indice = calculaHash(chave);
        if (info[indice] != null) {
            NoMapaInteger<Integer> noTemp = new NoMapaInteger();
            noTemp.setChave(chave);
            info[indice].retirar(noTemp);
        }
    }

}
