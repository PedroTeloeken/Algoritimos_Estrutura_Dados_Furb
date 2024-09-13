package mapa;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class MapaDispercaoTest {
    MapaDispercao<Aluno> mapa = new MapaDispercao<>(521);

    @Test
    public void colisao() throws Exception {
        Aluno aluno1 = new Aluno(12500, "Jean", LocalDate.of(2000, 1, 1));
        Aluno aluno2 = new Aluno(14000, "Pedro", LocalDate.of(2000, 1, 1));
        Aluno aluno3 = new Aluno(14226, "Marta", LocalDate.of(2000, 1, 1));
        Aluno aluno4 = new Aluno(17180, "Lucas", LocalDate.of(2000, 1, 1));

        mapa.inserir(12500, aluno1);
        mapa.inserir(14000, aluno2);
        mapa.inserir(14226, aluno3);
        mapa.inserir(17180, aluno4);


        mapa.realocarMapa(600);
        Assert.assertEquals(mapa.getInfo().length , 600);

        Aluno a = mapa.buscar(12500);
        Aluno b = mapa.buscar(14000);
        Aluno c = mapa.buscar(14226);
        Aluno d = mapa.buscar(17180);

        assertEquals(aluno1 , a);
        assertEquals(aluno2 , b);
        assertEquals(aluno3 , c);
        assertEquals(aluno4 , d);

    }

    @Test
    public void testeLacalizar() {
        Aluno aluno = new Aluno(12000, "Walter", LocalDate.of(2000, 1, 1));
        mapa.inserir(1200, aluno);
        Assert.assertEquals(aluno , mapa.buscar(1200));
    }

    @Test
    public void test1_AdicionarAluno() {
        Aluno aluno1 = new Aluno(12000, "Jean", LocalDate.of(2000, 1, 1));
        Aluno aluno2 = new Aluno(14000, "Pedro", LocalDate.of(2000, 1, 1));
        Aluno aluno3 = new Aluno(12500, "Marta", LocalDate.of(2000, 1, 1));
        Aluno aluno4 = new Aluno(13000, "Lucas", LocalDate.of(2000, 1, 1));

        mapa.inserir(12000, aluno1);
        mapa.inserir(14000, aluno2);
        mapa.inserir(12500, aluno3);
        mapa.inserir(13000, aluno4);


        Aluno a = mapa.buscar(12000);
        Aluno b = mapa.buscar(14000);
        Aluno c = mapa.buscar(12500);
        Aluno d = mapa.buscar(13000);

        assertEquals(aluno1 , a);
        assertEquals(aluno2 , b);
        assertEquals(aluno3 , c);
        assertEquals(aluno4 , d);

    }

    @Test
    public void teste4() {
        Aluno aluno1 = new Aluno(12500, "Jean", LocalDate.of(2000, 1, 1));
        Aluno aluno2 = new Aluno(14000, "Pedro", LocalDate.of(2000, 1, 1));
        Aluno aluno3 = new Aluno(14226, "Marta", LocalDate.of(2000, 1, 1));
        Aluno aluno4 = new Aluno(17180, "Lucas", LocalDate.of(2000, 1, 1));

        mapa.inserir(12500, aluno1);
        mapa.inserir(14000, aluno2);
        mapa.inserir(14226, aluno3);
        mapa.inserir(17180, aluno4);

        Aluno a = mapa.buscar(12500);
        Aluno b = mapa.buscar(14000);
        Aluno c = mapa.buscar(14226);
        Aluno d = mapa.buscar(17180);

        assertEquals(aluno1 , a);
        assertEquals(aluno2 , b);
        assertEquals(aluno3 , c);
        assertEquals(aluno4 , d);

    }

}