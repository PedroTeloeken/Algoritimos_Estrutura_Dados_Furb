package Pilhas.Atividades;

public class MainPilha {
    public static void main(String[] args) {

        PilhaVetor<Integer> lista = new PilhaVetor<>(10);

        lista.push(10);
        lista.push(20);
        lista.push(30);
        lista.push(40);
        lista.pop();
        lista.pop();
        lista.push(lista.peek());
        lista.push(50);

        System.out.println(lista.toString());


    }
}
