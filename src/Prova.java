import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Prova implements InterAvaliacao<Double>{
    private List<Double> provas = new ArrayList<>();

    @Override
    public void cadastrar(Double prova) {
        Random random = new Random();
        double nota = random.nextDouble() * 10;
        provas.add(nota);
    }

    @Override
    public Double consultar(int posicao) {
        return provas.get(posicao);
    }

    @Override
    public void limparLista() {
        provas.clear();
    }
}