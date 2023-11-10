package br.com.letscode.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class TiposDeDadosPrimitivos {
    public static void main(String[] args) {
    /*
        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a / b;

        boolean fimDeSemana = false;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);

        int nota = 80;
        String graduacao;
        // A 80 B 70 C 60 D0

        if (nota >= 80) {
            graduacao = "A";
        } else if (nota < 80 && nota >= 70) {
            graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "C";
        } else {
            graduacao = " ";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Não aprovado!");
                break;
            default:
                System.out.println("Graduação inválida.");
                break;
        }

     */

        String nome = "Victor";

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale ("pt", "BR");

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();

        if(agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia";
        }else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        }else {
            saudacao = "boa noite";
        }


       // System.out.println("Olá, " + nome + ". " + "Hoje é " + diaSemana + ", " + saudacao.toUpperCase());
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());

    }


}