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
## Estrutura do Código

### Classe `gerenciadorProcessoSeletivo`

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

- `static void analisarCandidato(double salarioPretendido)`
  - Analisa se o salário pretendido pelo candidato está dentro do valor base estipulado.
  - **Parâmetros**: `salarioPretendido` - Salário pretendido pelo candidato.
  - **Lógica**:
    - Compara o salário pretendido com o salário base e imprime a decisão de ligar, fazer uma contra proposta, ou aguardar.

