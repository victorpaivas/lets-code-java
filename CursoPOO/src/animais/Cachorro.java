package animais;

public class Cachorro {

    //Atributos
    static int numeroDeCachorros;
    private String nome;
    private String cor;
    private String porte;
    private int altura;
    private double peso;
    private String estadodeEspirito;

    //Construtor default
    public Cachorro(){}

    //Construtor adicionado
    public Cachorro(String nome, String cor, String porte, int altura, double peso, String estadodeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.porte = porte;
        this.altura = altura;
        this.peso = peso;
        this.estadodeEspirito = estadodeEspirito;

        numeroDeCachorros ++;
    }

    //Métodos
    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadodeEspirito() {
        return estadodeEspirito;
    }

    public void setEstadodeEspirito(String estadodeEspirito) {
        this.estadodeEspirito = estadodeEspirito;
    }

    public void comer() {
        System.out.println("CACHORRO COMENDO...");
    }

    public void latir() {
        System.out.println("AUAUAU");
    }

    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {

        switch (acao) {
            case "carinho":
                this.estadodeEspirito = "Feliz";
                break;
            case "vai dormir!":
                this.estadodeEspirito = "Bravo";
                break;
            case "pisar na patinha":
                this.estadodeEspirito = "Triste";
                break;
            default:
                this.estadodeEspirito = "neutro";
        }
        return estadodeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

