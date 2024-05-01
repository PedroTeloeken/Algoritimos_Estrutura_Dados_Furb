package ListaEstaticaAndEncadeada.lista_03_testando_encadeada_lista;

import java.time.LocalDate;
import java.util.Objects;

public class Publicacao {

    public Publicacao(LocalDate data, String publicacaoText) {
        this.data = data;
        this.publicacaoText = publicacaoText;
    }

    private LocalDate data;

    private String publicacaoText;

    public String getPublicacaoText() {
        return publicacaoText;
    }

    public void setPublicacaoText(String publicacaoText) {
        this.publicacaoText = publicacaoText;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publicacao that = (Publicacao) o;
        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
