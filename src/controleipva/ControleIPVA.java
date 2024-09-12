package controleipva;

import java.util.Scanner;

public class ControleIPVA {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o número final da placa do veículo
        System.out.print("Digite o número final da placa do veículo (0-9): ");
        // Captura a entrada como uma string
        String entrada = scanner.nextLine();  // Captura a entrada como string

        // Verifica se a entrada contém pelo menos um caractere
        if (entrada.length() > 0) {
            // Obtém o último caractere da entrada
            char ultimoCaractere = entrada.charAt(entrada.length() - 1);

            // Verifica se o último caractere é um dígito
            if (Character.isDigit(ultimoCaractere)) {
                // Converte o último caractere para um número inteiro
                int placaFinal = Character.getNumericValue(ultimoCaractere);

                // Verifica o mês de pagamento com base no número final da placa
                switch (placaFinal) {
                    case 1:
                        // Para placas terminadas em 1, o pagamento deve ser feito até 30/04
                        System.out.println("Pagamento até 30/04.");
                        break;
                    case 2:
                        // Para placas terminadas em 2, o pagamento deve ser feito até 31/05
                        System.out.println("Pagamento até 31/05.");
                        break;
                    case 3:
                        // Para placas terminadas em 3, o pagamento deve ser feito até 30/06
                        System.out.println("Pagamento até 30/06.");
                        break;
                    case 4:
                        // Para placas terminadas em 4, o pagamento deve ser feito até 31/07
                        System.out.println("Pagamento até 31/07.");
                        break;
                    case 5:
                        // Para placas terminadas em 5, o pagamento deve ser feito até 31/08
                        System.out.println("Pagamento até 31/08.");
                        break;
                    case 6:
                        // Para placas terminadas em 6, o pagamento deve ser feito até 30/09
                        System.out.println("Pagamento até 30/09.");
                        break;
                    case 7:
                        // Para placas terminadas em 7, o pagamento deve ser feito até 31/10
                        System.out.println("Pagamento até 31/10.");
                        break;
                    case 8:
                        // Para placas terminadas em 8, o pagamento deve ser feito até 30/11
                        System.out.println("Pagamento até 30/11.");
                        break;
                    case 9:
                    case 0:
                        // Para placas terminadas em 9 ou 0, o pagamento deve ser feito até 31/12
                        System.out.println("Pagamento até 31/12.");
                        break;
                    default:
                        // Esse caso não será atingido porque todos os possíveis dígitos são tratados acima
                        System.out.println("Número de placa inválido. Digite um número entre 0 e 9.");
                }
            } else {
                // Se o último caractere não for um dígito
                System.out.println("Valor digitado está incorreto. Digite um número válido entre 0 e 9.");
            }
        } else {
            // Se a entrada estiver vazia
            System.out.println("Nenhum valor foi digitado.");
        }

        // Fecha o scanner para liberar o recurso
        scanner.close();
    }
}
