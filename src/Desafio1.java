import java.util.Scanner;
import java.util.regex.Pattern;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Digite a senha para verificar a força:");
        String senha = "030609Saturno*";
        // scanner.close();

        String resultado = verificarForcaSenha(senha);
        System.out.println(resultado);
    }

    public static String verificarForcaSenha(String senha) {
        int comprimentoMinimo = 8;

        // Critérios de validação usando expressões regulares
        boolean temLetraMaiuscula = Pattern.compile("[A-Z]").matcher(senha).find();
        boolean temLetraMinuscula = Pattern.compile("[a-z]").matcher(senha).find();
        boolean temNumero = Pattern.compile("\\d").matcher(senha).find();
        boolean temCaractereEspecial = Pattern.compile("\\W").matcher(senha).find();
        boolean temSequenciaComum = senha.matches(".*(?i)123456.*|.*(?i)abcdef.*");
        boolean temPalavraComum = senha.equalsIgnoreCase("password") || senha.equalsIgnoreCase("123456") || senha.equalsIgnoreCase("qwerty");

        if (senha.length() < comprimentoMinimo) {
            return "Sua senha é muito curta. Recomenda-se no mínimo 8 caracteres.";
        } else if (temLetraMaiuscula && temLetraMinuscula && temNumero && temCaractereEspecial && !temSequenciaComum && !temPalavraComum) {
            return "Sua senha atende aos requisitos de segurança. Parabéns!";
        } else {
            return "Sua senha não atende aos requisitos de segurança.";
        }
    }
}





/* resposta EXATA NA DIO
 * 
 * 
        if (senha.length() < comprimentoMinimo) {
            return "Sua senha e muito curta. Recomenda-se no minimo 8 caracteres.";
        } else if (!temLetraMaiuscula || !temLetraMinuscula || !temNumero || !temCaractereEspecial) {
            return "Sua senha nao atende aos requisitos de seguranca.";
        } else if (temSequenciaComum || temPalavraComum) {
            return "Sua senha contém sequencias ou palavras comuns. Escolha uma senha mais segura.";
        } else {
            return "Sua senha atende aos requisitos de seguranca. Parabens!";
        }
        
        */
