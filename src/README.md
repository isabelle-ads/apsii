# Atividade — Padrão Strategy (Use a Cabeça! Padrões de Projeto, p. 37–40)

Projeto Java simples, sem bibliotecas externas e sem `package`, para importar no Eclipse.

## Arquivos
- `Duck` é a classe abstrata dos patos.
- `FlyBehavior` e `QuackBehavior` são interfaces de comportamento.
- `FlyWithWings`, `FlyNoWay` e `FlyRocketPowered` implementam formas de voar.
- `Quack`, `MuteQuack` e `Squeak` implementam formas de grasnar.
- `MallardDuck` e `ModelDuck` são tipos concretos de pato.
- `MiniDuckSimulator` contém o `main` para executar e testar.

## Saída esperada (pode variar na pontuação)
Sou um pato-real!
Quack!
Estou voando!
Todos os patos flutuam, até os de borracha!

--- Mudando o comportamento em tempo de execução ---
Sou um pato de modelo!
Não consigo voar.
Estou voando com um foguete!
Squeak!

## Conceito
O padrão Strategy encapsula comportamentos em interfaces e permite trocar a implementação em tempo de execução, sem precisar alterar a classe `Duck`.
