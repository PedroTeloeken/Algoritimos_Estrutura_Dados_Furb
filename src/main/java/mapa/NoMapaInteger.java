package mapa;

import java.util.Objects;

public class NoMapaInteger<Integer> {

    private int chave;
    private int info;

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoMapaInteger<Integer> noMapaInteger = (NoMapaInteger<Integer>) o;
        return chave == noMapaInteger.chave && info == noMapaInteger.info;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chave, info);
    }
}
