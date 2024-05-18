import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class gerenciadorProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Alice", "Bernardo", "Carolina", "Daniel", "Eduardo"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuaTentando = !atendeu;
            if (continuaTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato Realizado Com Sucesso");
            }

        } while (continuaTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos Contato com " + candidato + " na " + tentativasRealizadas + "° tentativa.");
        } else {
            System.out.println("Não Conseguimos Contato Com " + candidato + ", número máximo de tentativas " + tentativasRealizadas + " realizadas.");
        }
    }

    // método auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"Alice", "Bernardo", "Carolina", "Daniel", "Eduardo"};
        System.out.println("Imprimindo a lista de candidatos, informando o índice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número n° " + (indice + 1) + " é o " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação for each");
        for (String candidato : candidatos) {
            System.out.println("O Candidato Selecionado Foi, " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Alice", "Bernardo", "Carolina", "Daniel", "Eduardo", "Fernanda", "Gustavo", "Helena"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Candidato " + candidato + ", Solicitou Este Valor De Salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O Candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o Candidato com Contra Proposta");
        } else {
            System.out.println("Aguardando o Resultado dos Demais Candidatos");
        }
    }
}
