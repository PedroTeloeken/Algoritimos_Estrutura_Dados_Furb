package ListaEstaticaAndEncadeada.lista_03_testando_encadeada_lista;

import ListaEstaticaAndEncadeada.lista_encadeada_atividade.ListaEncadeada;

public class RedeSocial {
    public static void main(String[] args) {

        long memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        ListaEncadeada<Integer> listaEncadeda = new ListaEncadeada<>();

        listaEncadeda.inserir(50);
        listaEncadeda.inserir(40);
        listaEncadeda.inserir(30);
        listaEncadeda.inserir(20);
        listaEncadeda.inserir(10);
        listaEncadeda.retirar(40);
        listaEncadeda.inserir(40);
        listaEncadeda.inserir(10);

        System.out.println(listaEncadeda.toString());

        /*long startTime = System.nanoTime();

        for (int i = 0; i <= 150000; i++) {
            LocalDate data = LocalDate.now().plusDays(i);
            String nome = "pedro " + i * 3;
            listaEncadeda.inserir(new Publicacao(data, nome));
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para inserir lista ENCADEADA: " + duration + "ms");

        long memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;
        System.out.println("Memória usada para inserir lista ENCADEADA: " + memoryUsed + " bytes");

        System.out.println("--------------------------------------------");

        memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        startTime = System.nanoTime();

        listaEncadeda.buscar(new Publicacao(LocalDate.now().plusDays(200), "pedro"));

        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para buscar lista ENCADEADA: " + duration + "ms");
        memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        memoryUsed = memoryAfter - memoryBefore;
        System.out.println("Memória usada para buscar lista ENCADEADA: " + memoryUsed + " bytes");

        System.out.println("--------------------------------------------");

        memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        startTime = System.nanoTime();
        listaEncadeda.retirar(new Publicacao(LocalDate.now().plusDays(200), "pedro"));

        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para remover lista ENCADEADA: " + duration + "ms");
        memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        memoryUsed = memoryAfter - memoryBefore;
        System.out.println("Memória usada para remover lista ENCADEADA: " + memoryUsed + " bytes");

        System.out.println("--------------------------------------------");

        memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        startTime = System.nanoTime();
        listaEncadeda.obterNo(1);

        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para obter indice lista ENCADEADA: " + duration + "ms");
        memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        memoryUsed = memoryAfter - memoryBefore;
        System.out.println("Memória usada para  obter indice lista ENCADEADA: " + memoryUsed + " bytes");

        System.out.println("--------------------------------------------");

        memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        startTime = System.nanoTime();
        listaEncadeda.obterTamanhoElemento();

        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para obter tamanho lista ENCADEADA: " + duration + "ms");
        memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        memoryUsed = memoryAfter - memoryBefore;
        System.out.println("Memória usada para  obter tamanho lista ENCADEADA: " + memoryUsed + " bytes");*/

    }
}
