<div align="center">

# 🧮 Calculadora POO
### Fundamentos de Encapsulamento e Separação de Responsabilidades em Java

<br/>

![Java](https://img.shields.io/badge/Java-JDK%2017+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/Paradigma-Orient.%20a%20Objetos-5C6BC0?style=for-the-badge)
![Console](https://img.shields.io/badge/Interface-Console%20App-37474F?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen?style=for-the-badge)

</div>

---

## 📋 Índice

- [Sobre o Projeto](#-sobre-o-projeto)
- [Conceitos de Engenharia Aplicados](#️-conceitos-de-engenharia-de-software-aplicados)
- [Tecnologias Utilizadas](#️-tecnologias-utilizadas)
- [Estrutura de Arquivos](#-estrutura-de-arquivos)
- [Pré-requisitos](#-pré-requisitos)
- [Como Executar](#-como-executar)

---

## 💡 Sobre o Projeto

Este projeto é uma **aplicação de console em Java** que implementa uma calculadora elementar. O objetivo central não é a complexidade matemática — é a aplicação estrita dos fundamentos de **Programação Orientada a Objetos (POO)**.

O repositório demonstra, na prática, como um objeto bem modelado **encapsula seu próprio estado**, opera de forma autônoma sobre seus dados internos e delega responsabilidades de forma clara entre camadas.

> *A calculadora é o pretexto. A arquitetura é o ponto.*

---

## ⚙️ Conceitos de Engenharia de Software Aplicados

| Conceito | Implementação no Projeto |
|---|---|
| **Encapsulamento** | Atributos de `Calculadora` são `private`, impedindo acesso ou modificação direta por agentes externos |
| **Injeção de Estado via Construtor** | Os operandos são injetados na instanciação, garantindo que o objeto nasça com estado válido e pronto para uso |
| **Autonomia de Objeto** | Métodos como `somar()` e `subtrair()` operam sobre `this`, sem depender de parâmetros externos repetitivos |
| **Separação de Responsabilidades** | `Main` gerencia exclusivamente o I/O e a delegação; `Calculadora` detém toda a regra de negócio |

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Versão | Função |
|---|---|---|
| **Java** | JDK 17+ | Linguagem principal |
| **java.util.Scanner** | — | Captura de entrada do usuário via console |

> Projeto sem frameworks ou dependências externas — compilação e execução com `javac`/`java` nativos.

---

## 📁 Estrutura de Arquivos

```
calculadora-poo/
│
├── 📄 README.md
│
└── 📂 src/
    ├── Main.java           # Ponto de entrada: I/O, instanciação e delegação
    └── Calculadora.java    # Entidade: estado privado + métodos operacionais
```

### Responsabilidades por Arquivo

```
Main.java
 └── Captura entrada do usuário (Scanner)
 └── Instancia Calculadora com os operandos
 └── Invoca os métodos de operação
 └── Exibe o resultado no console

Calculadora.java
 └── Armazena os operandos como atributos private
 └── Expõe operações: somar(), subtrair(), ...
 └── Opera autonomamente sobre this (sem parâmetros externos)
```

---

## ✅ Pré-requisitos

- **JDK 17 ou superior** — [Baixar OpenJDK](https://adoptium.net/)
- **Git** — [git-scm.com](https://git-scm.com/)

Verifique as instalações no terminal:

```bash
java -version
# Esperado: openjdk version "17.x.x" ou superior

javac -version
# Esperado: javac 17.x.x

git --version
```

---

## ▶️ Como Executar

**Passo 1 — Clonar o repositório**

```bash
git clone https://github.com/jonasteiro/calculadora-poo.git
cd calculadora-poo
```

**Passo 2 — Compilar os arquivos-fonte**

```bash
javac src/*.java -d out/
```

**Passo 3 — Executar o programa**

```bash
java -cp out/ Main
```

**Passo 4 — Interagir via console**

```
Digite o primeiro número: 12
Digite o segundo número: 8

Resultado da soma:      20
Resultado da subtração: 4
```

> A saída exata depende das operações implementadas em `Calculadora.java`.

---

<div align="center">

Desenvolvido com foco em **boas práticas de POO** e **engenharia de software**. <br/>

</div>
