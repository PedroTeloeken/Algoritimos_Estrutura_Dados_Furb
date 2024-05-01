package Pilhas.Atividades;

public class PilhaVetor<T> implements PilhaAtividade<T> {

    private T[] info;

    private int limite;

    private int tamanho;

    public PilhaVetor(int tamanho) {
        info = (T[]) new Object[tamanho];
        this.limite = tamanho;
        this.tamanho = 0;
    }


    @Override
    public void push(T valor) {
        if (tamanho == limite) {
            throw new RuntimeException("Valor da pilha exedido");
        }
        info[tamanho] = valor;
        tamanho++;
    }

    @Override
    public T pop() {
        T valor = peek();

        tamanho--;

        return valor;
    }

    @Override
    public T peek() {
        if(estaVazia()){
            throw new RuntimeException("Pilha está vazia");
        }
        return info[tamanho - 1];
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public void liberar() {
        info = (T[]) new Object[limite];
        tamanho = 0;
    }

    @Override
    public String toString(){
        String valor = "";

        int tamanhoPercorrer = tamanho;

        while (tamanhoPercorrer != 0){
            valor += info[tamanhoPercorrer - 1] + ", ";
            tamanhoPercorrer--;
        }

        return valor;
    }

    public void concatenar(PilhaVetor<T> p){

        PilhaVetor<T> valorInvertido = new PilhaVetor<T>(tamanho);

        while (!p.estaVazia()){
            if (valorInvertido.tamanho == valorInvertido.limite){
                throw new RuntimeException("Valor da pilha exedido");
            }
            valorInvertido.push(p.pop());
        }

        while (!valorInvertido.estaVazia()){
            push(valorInvertido.pop());
        }

    }

}
