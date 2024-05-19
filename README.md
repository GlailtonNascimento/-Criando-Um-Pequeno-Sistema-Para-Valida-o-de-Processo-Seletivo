# Validação de Processo Seletivo

## Descrição

Sistema simples em Java para validar candidatos em um processo seletivo, simulando tentativas de contato e verificação de pretensões salariais.

## Funcionalidades

- **Selecionar Candidatos**: Seleciona candidatos para a vaga com base no salário pretendido.
- **Contato com Candidatos**: Simula tentativas de contato com os candidatos selecionados, até um máximo de 3 tentativas.
- **Imprimir Lista de Candidatos**: Imprime a lista de candidatos e suas respectivas posições.
- **Analisar Candidato**: Analisa se o salário pretendido pelo candidato está dentro do valor base estipulado.

## Importações

```java
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

## Estrutura do Código

### Classe `ProcessoSeletivo`

#### Métodos

- `public static void main(String[] args)`
  - Método principal que inicializa a simulação de contato com os candidatos.

- `static void entrandoEmContato(String candidato)`
  - Simula tentativas de contato com um candidato, até um máximo de 3 tentativas.
  - **Parâmetros**: `candidato` - Nome do candidato.
  - **Lógica**:
    - Tenta entrar em contato com o candidato até 3 vezes.
    - Imprime o resultado da tentativa de contato.

- `static boolean atender()`
  - Método auxiliar que simula a resposta do candidato ao contato.
  - **Retorno**: `boolean` - `true` se o candidato atender, `false` caso contrário.

- `static void imprimirSelecionados()`
  - Imprime a lista de candidatos e suas posições.
  - **Lógica**:
    - Imprime a lista de candidatos com seus índices.
    - Utiliza um `for` e um `for-each` para a impressão.

- `static void selecaoCandidatos()`
  - Seleciona candidatos para a vaga com base no salário pretendido.
  - **Lógica**:
    - Verifica se o salário pretendido pelo candidato está dentro do valor base estipulado.
    - Seleciona até 5 candidatos.

- `static double valorPretendido()`
  - Gera um valor aleatório para o salário pretendido pelo candidato.
  - **Retorno**: `double` - Valor do salário pretendido.

- `static void analisarCandidato(double salarioPretendido)`
  - Analisa se o salário pretendido pelo candidato está dentro do valor base estipulado.
  - **Parâmetros**: `salarioPretendido` - Salário pretendido pelo candidato.
  - **Lógica**:
    - Compara o salário pretendido com o salário base e imprime a decisão de ligar, fazer uma contra proposta, ou aguardar.

#### Exemplo de Código

```java
package processoSeletivo;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
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

