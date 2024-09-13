package ordenacao;

public class OrdenacaoBolha<T extends Comparable<T>> implements OrdenacaoAbstract<T> {

    private T[] info;

    @Override
    public T[] getInfo() {
        return this.info;
    }

    @Override
    public void setInfo(T[] info) {
        this.info = info;
    }

    @Override
    public void trocar(int a, int b) {
        T temp = info[a];
        info[a] = info[b];
        info[b] = temp;
    }

    @Override
    public void ordenar() {
        for(int i = 0; i < info.length; i++){
            for(int j = 0; j < info.length - 1 - i; j++){
                if (info[j].compareTo(info[j+1]) > 0 ) {
                    trocar(j , j + 1);
                }
            }
        }
    }

    public String impressao(){

        String text = "";

        for (T t : info) {
            text += t.toString() + ",";
        }

        return text;
    }

}
