package ordenacao;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class OrdenacaoAbstractTest {

    @Test
    public void testBolha(){

        OrdenacaoBolha<Integer> bolha = new OrdenacaoBolha();

        Integer[] vetor = {12,14,15,40,8,19,35,38};

        bolha.setInfo(vetor);

        bolha.ordenar();

        String comparado = "100000";
        Assert.assertEquals(comparado, bolha.impressao());

    }

    @Test
    public void testBolhaOtmizada(){

        BolhaOtimizada<Integer> bolha = new BolhaOtimizada();

        Integer[] vetor = {70, 2, 88, 15, 90, 30};

        bolha.setInfo(vetor);

        bolha.ordenar();

        String comparado = "2,15,30,70,88,90,";
        Assert.assertEquals(comparado, bolha.impressao());

    }

    @Test
    public void testQuickSort(){
        BolhaQuickSort<Integer> bolha = new BolhaQuickSort();

        Integer[] vetor = {60,36,89,56,90,44,1};

        bolha.setInfo(vetor);

        bolha.ordenar();

        String comparado = "2,15,30,70,88,90,";
        Assert.assertEquals(comparado, bolha.impressao());
    }

    @Test
    public void testMergeShort(){
        MergeSort<Integer> bolha = new MergeSort();

        Integer[] vetor = {12,14,15,40,8,19,35,38};

        bolha.setInfo(vetor);

        bolha.ordenar();

        String comparado = "2,15,30,70,88,90,";
        Assert.assertEquals(comparado, bolha.impressao());
    }

}