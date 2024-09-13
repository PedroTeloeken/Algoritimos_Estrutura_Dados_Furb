package fé.arvore;

import arvores.binaria.atividade.NoArvoreBinaria;

public class EstudoArvoreBinaria<T> extends EstudoArvoreBinariaAbstract<T> {

    @Override
    public void setRaiz(EstudoNoArvoreBinaria raiz) {
        super.setRaiz(raiz);
    }

    @Override
    public EstudoNoArvoreBinaria<T> buscar(T no) {
        return buscar(getRaiz() , no);
    }

    private EstudoNoArvoreBinaria<T> buscar(EstudoNoArvoreBinaria<T> no, T info) {
        if(no == null){
            return null;
        } else {
            if(no.getInfo().equals(info)){
                return no;
            } else {
                EstudoNoArvoreBinaria<T> aux;

                aux = buscar(no.getEsquerda() , info);

                if(aux == null){
                    aux = buscar(no.getDireita() , info);
                }

                return aux;

            }
        }
    }
}
