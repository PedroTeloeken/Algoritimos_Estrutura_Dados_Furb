package ListaEstaticaAndEncadeada.lista_03_testando_encadeada_lista;

import ListaEstaticaAndEncadeada.lista_estatica_generica.ListaEstatica;

import java.time.LocalDate;

public class DiarioClasse {

    public static void main(String[] args) {

        long memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        ListaEstatica<Aluno> listaEstatica = new ListaEstatica<>();

        long startTime = System.nanoTime();

        for (int i = 0; i <= 150000; i++) {
            LocalDate data = LocalDate.now().plusDays(i);
            String nome = "pedro " + i * 3;
            listaEstatica.inserir(new Aluno(data, nome));
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para inserir lista ESTATICA: " + duration + "ms");

        long memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;
        System.out.println("Memória usada para inserir lista ESTATICA: " + memoryUsed + " bytes");

        System.out.println("--------------------------------------------");

        memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        startTime = System.nanoTime();

        listaEstatica.buscar(new Aluno(LocalDate.now().plusDays(200), "pedro"));

        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para buscar lista Estatica: " + duration + "ms");
        memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        memoryUsed = memoryAfter - memoryBefore;
        System.out.println("Memória usada para buscar lista Estatica: " + memoryUsed + " bytes");


        System.out.println("--------------------------------------------");

        memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        startTime = System.nanoTime();
        listaEstatica.retirar(new Aluno(LocalDate.now().plusDays(200), "pedro"));

        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para remover lista estatica: " + duration + "ms");
        memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        memoryUsed = memoryAfter - memoryBefore;
        System.out.println("Memória usada para remover lista estatica: " + memoryUsed + " bytes");

        System.out.println("--------------------------------------------");

        memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        startTime = System.nanoTime();
        
        listaEstatica.buscarElemento(77000);

        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para obter indice lista estatica: " + duration + "ms");
        memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        memoryUsed = memoryAfter - memoryBefore;
        System.out.println("Memória usada para  obter indice lista estatica: " + memoryUsed + " bytes");

        System.out.println("--------------------------------------------");

        memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        startTime = System.nanoTime();

        listaEstatica.buscar(new Aluno(LocalDate.now().plusDays(375) , "pedro1.125"));

        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para obter indice lista estatica: " + duration + "ms");
        memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        memoryUsed = memoryAfter - memoryBefore;
        System.out.println("Memória usada para elemento lista estatica: " + memoryUsed + " bytes");

        System.out.println("--------------------------------------------");

        memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        startTime = System.nanoTime();
        listaEstatica.getTamanho();

        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
        System.out.println("Tempo total para obter tamanho lista estatica: " + duration + "ms");
        memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        memoryUsed = memoryAfter - memoryBefore;
        System.out.println("Memória usada para  obter tamanho lista estatica: " + memoryUsed + " bytes");

    }
}
