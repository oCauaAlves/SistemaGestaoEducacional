# Sistema de Gestão Educacional (SGE)

Sistema de Gestão Educacional desenvolvido em Java como projeto acadêmico, com o objetivo de organizar e gerenciar informações de alunos, professores, cursos, turmas e avaliações.

O projeto foi desenvolvido aplicando conceitos fundamentais de Programação Orientada a Objetos e organização de código em camadas.

## Funcionalidades

- Cadastro de alunos.
- Cadastro de professores.
- Cadastro de cursos.
- Listagem de alunos, professores e cursos.
- Criação de turmas vinculadas a professores e cursos.
- Associação de alunos às turmas.
- Registro de avaliações e notas.
- Geração de relatório geral.
- Validação de dados e tratamento de entradas inválidas.

## Tecnologias e conceitos utilizados

- Java 21
- Programação Orientada a Objetos (POO)
- Encapsulamento
- Herança
- Polimorfismo
- Interfaces
- Classes abstratas
- Collections (`ArrayList`)
- Tratamento de exceções
- Arquitetura em camadas

## Organização do projeto

O projeto está organizado em pacotes, separando as responsabilidades de cada parte do sistema:

| Pacote | Responsabilidade |
|---|---|
| `model` | Entidades e modelos do sistema. |
| `repository` | Armazenamento e recuperação dos dados. |
| `service` | Operações e regras de negócio. |
| `ui` | Interface de interação com o usuário. |

O arquivo `Main.java` é responsável por inicializar o sistema e conectar as camadas.

## Como executar

1. Clone este repositório.
2. Abra o projeto em uma IDE, como IntelliJ IDEA.
3. Certifique-se de ter o JDK 21 instalado.
4. Localize o arquivo `Main.java`.
5. Execute o método `main()` para iniciar o sistema.

## Armazenamento de dados

Os dados são armazenados temporariamente em memória utilizando `ArrayList`. Portanto, as informações cadastradas são perdidas quando a aplicação é encerrada.

## Objetivo do projeto

Consolidar conhecimentos em Java e desenvolver um sistema funcional, aplicando conceitos de orientação a objetos, validação de dados e separação de responsabilidades por meio de uma arquitetura em camadas.

## Autor

**Cauã Alves**

[GitHub – oCauaAlves](https://github.com/oCauaAlves)
