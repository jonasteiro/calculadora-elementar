# Calculadora POO - Fundamentos de Encapsulamento

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-success?style=for-the-badge)

## 📌 Descrição do Projeto
Este projeto é uma aplicação de console em Java que simula uma calculadora elementar. O objetivo principal deste repositório não é a complexidade matemática, mas sim a aplicação estrita dos fundamentos de **Programação Orientada a Objetos (POO)**, com foco em encapsulamento, gerenciamento de estado interno e separação de responsabilidades.

## ⚙️ Tecnologias Utilizadas
* **Java (JDK 17+)**
* **Scanner (java.util.Scanner)** para manipulação de I/O.

## 🏗️ Conceitos de Engenharia de Software Aplicados
* **Encapsulamento:** Os atributos da classe `Calculadora` são privados (`private`), impedindo o acesso e a modificação direta por agentes externos. O estado do objeto é blindado.
* **Injeção de Estado via Construtor:** Os dados necessários para as operações são injetados no momento da instanciação do objeto, garantindo que ele nasça com um estado válido e pronto para uso.
* **Autonomia de Objeto:** Os métodos de operação (`somar`, `subtrair`) não dependem de parâmetros externos repetitivos; eles operam de forma autônoma sobre a própria memória/estado do objeto (`this`).
* **Separação de Responsabilidades:** A classe `Main` lida exclusivamente com a entrada e saída de dados (I/O) e com a delegação de tarefas. A classe `Calculadora` detém toda a regra de negócio.

## 📂 Estrutura do Repositório
* `Main.java`: Ponto de entrada do programa. Responsável por instanciar a classe controladora, capturar a entrada do usuário e invocar os comportamentos do objeto.
* `Calculadora.java`: Classe de modelo que define o estado (variáveis de instância) e o comportamento (métodos operacionais) da calculadora.
