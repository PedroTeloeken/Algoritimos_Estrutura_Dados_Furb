package arvores;

import arvores.binaria.exemplos.ArvoreBinariaInteiros;
import arvores.binaria.exemplos.NoArvoreBinariaInteiro;

public class MainArvore {
    public static void main(String[] args) {

        NoArvoreBinariaInteiro no4 = new NoArvoreBinariaInteiro(4);
        NoArvoreBinariaInteiro no5 = new NoArvoreBinariaInteiro(5);
        NoArvoreBinariaInteiro no2 = new NoArvoreBinariaInteiro(2 , no4 , no5);

        NoArvoreBinariaInteiro no7 = new NoArvoreBinariaInteiro(7);
        NoArvoreBinariaInteiro no6 = new NoArvoreBinariaInteiro(6 , no7 , null);

        NoArvoreBinariaInteiro no3 = new NoArvoreBinariaInteiro(3 , null, no6);

        NoArvoreBinariaInteiro no1 = new NoArvoreBinariaInteiro(1 , no2 , no3 );

        ArvoreBinariaInteiros arvore = new ArvoreBinariaInteiros();

        arvore.setRaiz(no1);

        System.out.println(arvore.toString());

    }
}
