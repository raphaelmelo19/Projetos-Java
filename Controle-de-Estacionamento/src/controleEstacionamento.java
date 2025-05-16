import java.util.HashSet;
import java.util.Scanner;

class Estacionamento {
    private int capacidade;
    private HashSet<String> carros;

    public Estacionamento(int capacidade) {
        this.capacidade = capacidade;
        this.carros = new HashSet<>();
    }

    public boolean entrar(String placa) {
        if (carros.size() < capacidade) {
            if (carros.add(placa)) {
                System.out.println("Carro com placa " + placa + " entrou.");
                return true;
            } else {
                System.out.println("Carro com placa " + placa + " já está no estacionamento.");
            }
        } else {
            System.out.println("Estacionamento lotado.");
        }
        return false;
    }

    public boolean sair(String placa) {
        if (carros.remove(placa)) {
            System.out.println("Carro com placa " + placa + " saiu.");
            return true;
        } else {
            System.out.println("Carro com placa " + placa + " não encontrado no estacionamento.");
        }
        return false;
    }

    public void status() {
        System.out.println("Carros no estacionamento: " + carros);
        System.out.println("Vagas disponíveis: " + (capacidade - carros.size()));
    }
}

public class controleEstacionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a capacidade do estacionamento: ");
        int capacidade = scanner.nextInt();
        scanner.nextLine(); 
        
        Estacionamento estacionamento = new Estacionamento(capacidade);

        while (true) {
            System.out.println("\nOpções: \n1 - Entrada\n2 - Saída\n3 - Status\n4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a placa do carro: ");
                    String placaEntrada = scanner.nextLine();
                    estacionamento.entrar(placaEntrada);
                    break;
                case 2:
                    System.out.print("Digite a placa do carro: ");
                    String placaSaida = scanner.nextLine();
                    estacionamento.sair(placaSaida);
                    break;
                case 3:
                    estacionamento.status();
                    break;
                case 4:
                    System.out.println("Encerrando o sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
