# Desafio Java - Sistema de Gestão de Pedidos para Distribuidora

Sistema de console, em Java puro (sem frameworks), que simula a gestão de pedidos de uma distribuidora: cadastro de produtos, cadastro de clientes (Varejo/Atacado, cada um com sua regra de desconto) e criação de pedidos com controle de estoque.

Projeto autoral, inspirado no formato do "Desafio Itaú Backend", feito para consolidar conceitos de Orientação a Objetos vistos na Maratona Java (DevDojo): classes abstratas, herança, polimorfismo, interfaces e tratamento de exceções.

## Funcionalidades

- Cadastro de produtos (nome, preço, quantidade em estoque)
- Cadastro de clientes, com dois tipos:
  - **Cliente Varejo** — sem desconto
  - **Cliente Atacado** — 10% de desconto em pedidos acima de R$ 100
- Criação de pedidos, com:
  - Validação de estoque disponível
  - Baixa automática do estoque ao confirmar o pedido
  - Cálculo do valor total já com o desconto do cliente aplicado
- Listagem de pedidos, produtos e clientes
- Tratamento de exceções customizadas em todos os fluxos (nada "estoura" sem mensagem tratada)

## Tecnologias

- Java (sem frameworks, sem banco de dados)
- Armazenamento em memória (`ArrayList`)
- Entrada via `Scanner` (console)

## Conceitos de POO aplicados

| Conceito | Onde |
|---|---|
| Classe abstrata | `Cliente` |
| Herança | `ClienteAtacado` e `ClienteVarejo` estendendo `Cliente` |
| Polimorfismo | `Cliente implements TemDesconto` — cada subclasse calcula seu próprio desconto, sem `Pedido` precisar saber qual tipo de cliente está usando |
| Interface | `TemDesconto` |
| Exceções customizadas | `ValorInvalidoException`, `EstoqueInsuficienteException`, `ClienteNaoEnconstradoException` |
| Encapsulamento | Atributos privados/protegidos, acesso via getters, sem setters expostos onde não faz sentido |

## Estrutura do projeto

```
src/
├── application/
│   └── Main.java                  # menu do console
├── domain/
│   ├── cliente/
│   │   ├── Cliente.java           # classe abstrata
│   │   ├── ClienteAtacado.java
│   │   ├── ClienteVarejo.java
│   │   ├── ClientesList.java
│   │   └── TipoCliente.java       # enum
│   ├── interfaces/
│   │   └── TemDesconto.java
│   ├── item/
│   │   └── ItemPedido.java
│   ├── pedido/
│   │   ├── Pedido.java
│   │   └── PedidosList.java
│   └── produto/
│       ├── Produto.java
│       └── ProdutoList.java
└── util/
    ├── Comandos.java               # regras de negócio / orquestração
    ├── Console.java                 # textos do menu
    └── exceptions/
        ├── ValorInvalidoException.java
        ├── EstoqueInsuficienteException.java
        └── ClienteNaoEnconstradoException.java
```

## Como rodar

Pré-requisito: JDK instalado (17+).

```bash
# clonar o repositório
git clone https://github.com/vinniciusnascimento/desafio-java-distribuidora.git
cd desafio-java-distribuidora

# compilar
find src -name "*.java" > sources.txt
javac -d out @sources.txt

# executar
java -cp out application.Main
```

## Exemplo de uso

```
--------Console--------
1 - Criar Cliente
2 - Criar Produto
3 - Criar Pedido

4 - Listar Pedidos
5 - Listar Produtos
6 - Listar Clientes

7 - Sair
Escolha: 1
1 - Cliente Atacado
2 - Cliente Varejo
Escolha: 1
Nome do Cliente: Loja do João
Cpf/Cnpj do Cliente: 00.000.000/0001-00
Cliente criado com sucesso!
```

## Regras de negócio

- Nome de produto/cliente não pode ser vazio
- Preço e quantidade em estoque não podem ser negativos
- Pedido não pode ser criado com quantidade maior que o estoque disponível
- Desconto do Cliente Atacado só se aplica acima de R$ 100 no pedido
- Ao confirmar um pedido, o estoque do produto é baixado automaticamente

## Próximos passos

- Suportar múltiplos itens por pedido (`List<ItemPedido>`)
- Tratamento de entradas inválidas no menu (números/índices)
- Enum de categoria de produto
- Testes unitários (JUnit) para as regras de desconto e estoque
