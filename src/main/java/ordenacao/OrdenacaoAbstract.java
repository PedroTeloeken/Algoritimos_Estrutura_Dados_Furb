package ordenacao;

public interface OrdenacaoAbstract<T extends Comparable<T>> {

    T[] getInfo();

    void setInfo(T[] info);

    void trocar(int a , int b);

    void ordenar();

}
