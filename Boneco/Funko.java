public class Funko extends Boneco {
    private String cabecudo;

    public Funko(String nome, String cor, Integer forca, String cabecudo) {
        super(nome, cor, forca);
        this.cabecudo = cabecudo;
    }

    @Override
    public void falar() {
        System.out.println(nome + " (Funko) diz: Eu sou estiloso e " + cabecudo + "!");
    }
}