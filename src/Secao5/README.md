## Java Foundations

## Exercício - Seção 5

## Exercício 5-1: Determinando a cor no espectro visível

Crie o programa Java interativo ColorRange.java. Quando determinado comprimento de onda em nanômetros for fornecido, ele retornará a cor correspondente no espectro visível.
Cor	Comprimento de onda (nm)

Violeta	380-450

Azul	450-495

Verde	495-570

Amarelo	570-590

Laranja	590-620

Vermelho 620-750

Tarefa
Você deve implementar o seguinte usando uma instrução de decisão if adequada:

1. Solicite que o usuário insira o comprimento de onda; ele deve ser do tipo double.

2. Para cada intervalo (por exemplo, 380 - 450) o número à esquerda é incluído no intervalo, mas o número à direita não é.

3. Se o valor da entrada não for encontrado no espectro visível, informe que o comprimento de onda não está dentro do espectro visível. 

4. Saída Esperada:

a.	Enter a color code
630
The color is Red

b.	Enter a color code
25.0
The entered wavelength is not a part of the visible spectrum

c.	Enter a color code
750.5
The entered wavelength is not a part of the visible spectrum

O arquivo ColorRange.java está disponível para ajudar você a começar.

## Problema 5-2: Determinando a próxima cor de um sinal de trânsito
Visão Geral

O comportamento normal de um sinal de trânsito é alternar sucessivamente de Vermelho para Verde para Amarelo para Vermelho (e continuar nesse padrão). Crie o programa java TrafficLightChecker.java que determinará a próxima cor de um sinal de trânsito neste padrão: de Vermelho para Verde para Amarelo para Vermelho, com base no sinal de trânsito atual fornecido pelo usuário.

Tarefa

Você deve implementar o seguinte usando uma instrução de decisão if adequada:

1. Faça com que o usuário digite o valor de currentColor. 

2. Calcule a próxima cor do sinal de trânsito com base em currentColor.

3. Avise o usuário sobre qualquer valor de cor inválido.

Saída Esperada:

a. Enter a color code
   1
   Next Traffic Light is green

b. Enter a color code
   3
   Next Traffic Light is red

c. Enter a color code
   0
   Invalid color

d. Enter a color code
   4
   Invalid color

O arquivo TrafficLightChecker.java está disponível para ajudar você a começar.

## Problema 5-3: Determinando a próxima cor de um sinal de trânsito usando switch
Visão Geral

Repita o exercício 5-2 usando a instrução switch.
 
Tarefa

Implemente o exercício 5-2 usando a instrução switch e certifique-se de que o programa alerte os usuários caso eles insiram um valor inválido.