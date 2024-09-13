package fé.mapa;

import java.util.Objects;

public class EstudoNoMapa <T> {

    private int chave;

    private T info;

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstudoNoMapa<?> noMapa = (EstudoNoMapa<?>) o;
        return chave == noMapa.chave;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chave);
    }
}
