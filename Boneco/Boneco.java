public class Boneco {
    protected String nome;
    protected String cor;
    protected Integer forca;

    public Boneco(String nome, String cor, Integer forca) {
        this.nome = nome;
        this.cor = cor;
        this.forca = forca;
    }

    public void falar() {
        System.out.println(nome + " diz: Olá, eu sou um boneco!");
    }

    public void atacar() {
        System.out.println(nome + " ataca com força " + forca + "!");
    }
}