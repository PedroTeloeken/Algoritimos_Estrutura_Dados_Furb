package arvores;

import arvores.enaria.atividade.ArvoreEnaria;
import arvores.enaria.atividade.NoArvoreEnaria;
import arvores.enaria.exemplos.ArvoreEnariaInteiros;
import arvores.enaria.exemplos.NoArvoreEnariaInteiros;

public class MainArvore {
    public static void main(String[] args) {

        /*NoArvoreBinariaInteiro no4 = new NoArvoreBinariaInteiro(4);
        NoArvoreBinariaInteiro no5 = new NoArvoreBinariaInteiro(5);
        NoArvoreBinariaInteiro no2 = new NoArvoreBinariaInteiro(2 , no4 , no5);

        NoArvoreBinariaInteiro no7 = new NoArvoreBinariaInteiro(7);
        NoArvoreBinariaInteiro no6 = new NoArvoreBinariaInteiro(6 , no7 , null);

        NoArvoreBinariaInteiro no3 = new NoArvoreBinariaInteiro(3 , null, no6);

        NoArvoreBinariaInteiro no1 = new NoArvoreBinariaInteiro(1 , no2 , no3 );

        ArvoreBinariaInteiros arvore = new ArvoreBinariaInteiros();

        arvore.setRaiz(no1);

        System.out.println(arvore.toString());*/

        NoArvoreEnaria no4 = new NoArvoreEnaria(4);
        NoArvoreEnaria no3 = new NoArvoreEnaria(3);
        no3.inserirFilho(no4);

        NoArvoreEnaria no5 = new NoArvoreEnaria(5);

        NoArvoreEnaria no2 = new NoArvoreEnaria(2);
        no2.inserirFilho(no5);
        no2.inserirFilho(no3);

        NoArvoreEnaria no10 = new NoArvoreEnaria(10);
        NoArvoreEnaria no9 = new NoArvoreEnaria(9);
        no9.inserirFilho(no10);

        NoArvoreEnaria no8 = new NoArvoreEnaria(8);

        NoArvoreEnaria no7 = new NoArvoreEnaria(7);
        no7.inserirFilho(no9);
        no7.inserirFilho(no8);

        NoArvoreEnaria no6 = new NoArvoreEnaria(6);

        NoArvoreEnaria no1 = new NoArvoreEnaria(1);

        no1.inserirFilho(no7);
        no1.inserirFilho(no6);
        no1.inserirFilho(no2);

        ArvoreEnaria arvore = new ArvoreEnaria();
        arvore.setRaiz(no1);

        System.out.println("Total nos = " + arvore.contarNos() );

        System.out.println(arvore.toString());

    }
}
