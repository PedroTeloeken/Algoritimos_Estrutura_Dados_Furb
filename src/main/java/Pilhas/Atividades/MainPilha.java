package Pilhas.Atividades;

public class MainPilha {
    public static void main(String[] args) {

        PilhaVetor<Integer> lista1 = new PilhaVetor<>(10);

        lista1.push(1);
        lista1.push(2);
        lista1.push(3);

        System.out.println(lista1.toString());

        PilhaVetor<Integer> lista2 = new PilhaVetor<>(10);

        lista2.push(4);
        lista2.push(5);
        lista2.push(6);

        lista1.concatenar(lista2);

        System.out.println(lista1.toString());


    }
}
