public interface InterAvaliacao<T> {
    void cadastrar(T atividade);
    T consultar(int posicao);
    void limparLista();
}
