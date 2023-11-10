import animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        //Construtor padrão instânciado
        Cachorro cachorro0 = new Cachorro();

        //Construtor adicionado instânciado
        Cachorro cachorro1 = new Cachorro("Dory", "Marrom", "Grande", 60, 45.5, "neutro");
        System.out.println(cachorro1.getNumeroDeCachorros());
        Cachorro cachorro2 = new Cachorro("Dory", "Marrom", "Grande", 60, 45.5, "neutro");

        System.out.println(cachorro2.getNumeroDeCachorros());

        System.out.println(cachorro1.getNumeroDeCachorros());

        cachorro2.latir();
        cachorro2.comer();
        System.out.println("O " + cachorro2.getNome() + " pegou a " + cachorro2.pegar());
        System.out.println("Cachorro está " + cachorro2.interagir("carinho"));
    }
}