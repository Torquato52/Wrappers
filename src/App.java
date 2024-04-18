public class App {
    public static void main(String[] args) throws Exception {
        Prova Pr = new Prova();
        Pr.cadastrar(1.0);
        Pr.cadastrar(2.0);

        Atividade At = new Atividade();
        At.cadastrar("Matemática");
        At.cadastrar("História");

        System.out.println(Pr.consultar(0));
        System.out.println(At.consultar(1));

        Pr.limparLista();
        At.limparLista();
    }
}
