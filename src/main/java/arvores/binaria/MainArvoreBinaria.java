package arvores.binaria;

import arvores.binaria.atividade.ArvoreBinaria;
import arvores.binaria.atividade.NoArvoreBinaria;

public class MainArvoreBinaria {
    public static void main(String[] args) {

        NoArvoreBinaria<Integer> noArvore80 = new NoArvoreBinaria<Integer>(80);
        NoArvoreBinaria<Integer> noArvore30 = new NoArvoreBinaria<Integer>(30 , noArvore80 , null);

        NoArvoreBinaria<Integer> noArvore10 = new NoArvoreBinaria<Integer>(10);
        NoArvoreBinaria<Integer> noArvore25 = new NoArvoreBinaria<Integer>(25);

        NoArvoreBinaria<Integer> noArvore20 = new NoArvoreBinaria<Integer>(20 , noArvore10 , noArvore25);

        NoArvoreBinaria<Integer> noArvore70 = new NoArvoreBinaria<Integer>(70 , noArvore30 , noArvore20);

        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();

        arvoreBinaria.setRaiz(noArvore70);

        System.out.println(arvoreBinaria.toString());

        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> noArvore4 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> noArvore2 = new NoArvoreBinaria<Integer>(2 , null , noArvore4);

        NoArvoreBinaria<Integer> noArvore5 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> noArvore6 = new NoArvoreBinaria<Integer>(6);

        NoArvoreBinaria<Integer> noArvore3 = new NoArvoreBinaria<Integer>(3 , noArvore5 , noArvore6);

        NoArvoreBinaria<Integer> noArvore1 = new NoArvoreBinaria<Integer>(1 , noArvore2 , noArvore3);

        arvore.setRaiz(noArvore1);

        System.out.println(arvore.pertence(10));

    }
}
