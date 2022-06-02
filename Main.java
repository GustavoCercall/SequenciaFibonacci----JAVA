import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tamanho;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o numero de termos de fibonacci:");
        tamanho = scanner.nextInt();

        Calcula calcular = new Calcula();
        calcular.exibir_sequencia(tamanho);
    }
}
