public class ProgramaBoneco {
    public static void main(String[] args) {
        Boneco b1 = new Boneco("Guerreiro", "vermelho", 80);
        Funko f1 = new Funko("Batman", "preto", 50, "tenho a cabeça gigante");

        b1.falar();
        b1.atacar();

        System.out.println();

        f1.falar();
        f1.atacar();
    }
}