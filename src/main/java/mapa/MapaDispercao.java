package mapa;

import ListaEstaticaAndEncadeada.lista_encadeada_atividade.ListaEncadeada;
import ListaEstaticaAndEncadeada.lista_encadeada_atividade.NoListaGenerica;
import fé.busca.ListaEstatica;

public class MapaDispercao<T> {

    public ListaEncadeada<NoMapa<T>>[] getInfo() {
        return info;
    }

    public void setInfo(ListaEncadeada<NoMapa<T>>[] info) {
        this.info = info;
    }

    private ListaEncadeada[] info;

    public MapaDispercao(int tamanho) {
        this.info = new ListaEncadeada[tamanho];
    }

    public int calculaHash(int chave) {
        return chave % info.length;
    }

    public void realocarMapa(int novoTamanho) throws Exception {

        if(novoTamanho < info.length){
            throw new Exception("Novo tamanho menor do que o atual");
        }

        ListaEncadeada<NoMapa<T>>[] novo = new ListaEncadeada[novoTamanho];

        for (int i = 0; i < info.length; i++) {
            novo[i] = info[i];
        }

        this.info = new ListaEncadeada[novoTamanho];

        for (int i = 0; i < novo.length; i++) {
            if (novo[i] != null) {
                inserir(novo[i].getPrimeiro().getInfo().getChave(), novo[i].getPrimeiro().getInfo().getInfo());
            }
        }
    }

    public void inserir(int chave, T dado) {
        int indice = calculaHash(chave);

        System.out.println(indice);

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



    /*public boolean verificarColisao(int chave) {
        // Calcula o hash a partir da chave de busca
        int indice = calculaHash(chave);

        if (info[indice] != null) {
            // Cria um objeto de mapeamento, estabelecendo apenas a chave de busca
            NoMapa<Integer> noTemp = new NoMapa<Integer>();
            noTemp.setChave(chave);

            // Procura o objeto na lista encadeada
            NoListaGenerica<NoMapa<Integer>> no = info[indice].buscar(noTemp);
            if (no != null) {
                // A chave já está presente, indicando uma colisão
                return true;
            }
        }

        // Nenhuma colisão encontrada
        return false;
    }*/

    public boolean verificarColisao1(int chave) {
        // Calcula o hash a partir da chave de busca
        int indice = calculaHash(chave);

        if (info[indice] != null && !info[indice].estaVazia()) {
            // A chave já está presente, indicando uma colisão
            return true;
        }

        // Nenhuma colisão encontrada
        return false;
    }

    private void calculateStages() {
        int n = info.length;
        int stages = (int) (Math.log(n) / Math.log(2));
        System.out.println("Número de etapas: " + stages);
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
