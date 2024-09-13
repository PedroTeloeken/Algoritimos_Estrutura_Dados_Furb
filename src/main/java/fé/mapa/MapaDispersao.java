package fé.mapa;

import ListaEstaticaAndEncadeada.lista_encadeada_atividade.ListaEncadeada;
import ListaEstaticaAndEncadeada.lista_encadeada_atividade.NoListaGenerica;
import mapa.NoMapa;

public class MapaDispersao<T> {

    private int tamanho;

    private ListaEncadeada<EstudoNoMapa<T>>[] info;

    public MapaDispersao(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    private int calculaHash(int chave) {
        return chave % info.length;
    }

    public void inserir(int chave, T dado) {
        int indice = calculaHash(chave);

        if (info[indice] == null) {
            info[indice] = new ListaEncadeada<EstudoNoMapa<T>>();
        }

        EstudoNoMapa noMapa = new EstudoNoMapa();

        noMapa.setChave(chave);
        noMapa.setInfo(dado);

        info[indice].inserir(noMapa);
    }

    public T buscar(int chave) {
        int indice = calculaHash(chave);

        if (info[indice] != null) {
            EstudoNoMapa noMapa = new EstudoNoMapa();
            noMapa.setChave(chave);

            NoListaGenerica<NoMapa<T>> no;

            no = info[indice].buscar(noMapa);

            if (no != null) {
                return no.getInfo().getInfo();
            }

        }

        return null;
    }

    public void remover(int chave) {
        int indice = calculaHash(chave);
        if (info[indice] != null) {
            EstudoNoMapa<T> noTemp = new EstudoNoMapa();
            noTemp.setChave(chave);
            info[indice].retirar(noTemp);
        }
    }

    public double calcularFatorCarga() {
        int quantidadeTotal = 0;
        for (int i = 0; i < info.length; i++) {
            if (info[i] != null) {
                quantidadeTotal += info[i].obterTamanhoElemento();
            }
        }

        return (1.0 * quantidadeTotal) / info.length;
    }

}
