package mapa;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class MapaDispercaoTest {
    MapaDispercao<Aluno> mapa = new MapaDispercao<>(53);

    @Test
    public void testeLacalizar() {
//

        Aluno aluno = new Aluno(12000, "Walter", LocalDate.of(2000, 1, 1));

        mapa.inserir(1200, aluno);

        Assert.assertEquals(aluno , mapa.buscar(1200));

    }

    @Test
    public void test1_AdicionarAluno() {
        Aluno aluno = new Aluno(12000, "Jean",
                LocalDate.of(2000, 1, 1));

        mapa.inserir(12000, aluno);

        Aluno a = mapa.buscar(12000);

        assertEquals(aluno , a);
    }

}