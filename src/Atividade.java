import java.util.ArrayList;
import java.util.List;

public class Atividade implements InterAvaliacao<String>{
    private List<String> atividades = new ArrayList<>();

    @Override
    public void cadastrar(String atividade) {
        atividades.add(atividade);
    }

    @Override
    public String consultar(int posicao) {
        return atividades.get(posicao);
    }

    @Override
    public void limparLista() {
        atividades.clear();
    }
}