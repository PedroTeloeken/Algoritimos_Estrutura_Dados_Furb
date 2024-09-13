package mainMain;


import fé.busca.ListaEstatica;
import mapa.Aluno;
import mapa.MapaDispercao;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {

        MapaDispercao<Aluno> mapa = new MapaDispercao<>(521);

        Aluno aluno1 = new Aluno(12500, "Jean", LocalDate.of(2000, 1, 1));
        Aluno aluno2 = new Aluno(14000, "Pedro", LocalDate.of(2000, 1, 1));
        Aluno aluno3 = new Aluno(14226, "Marta", LocalDate.of(2000, 1, 1));
        Aluno aluno4 = new Aluno(17180, "Lucas", LocalDate.of(2000, 1, 1));

        mapa.inserir(12500, aluno1);
        mapa.inserir(14000, aluno2);
        mapa.inserir(14226, aluno3);
        mapa.inserir(17180, aluno4);


        mapa.realocarMapa(521);

        Aluno a = mapa.buscar(12500);
        Aluno b = mapa.buscar(14000);
        Aluno c = mapa.buscar(14226);
        Aluno d = mapa.buscar(17180);




/*
        int[] vetor = {1, 20,
                28,
                30,
                40,
                45,
                55,
                62,
                66,
                75,
                98,
        };


        for (int i = 0; i < vetor.length; i++) {
            if(44 == vetor[i]){
                System.out.println("Sei la");
            }

            System.out.println("Teste " + i);
        }*/



    }
}