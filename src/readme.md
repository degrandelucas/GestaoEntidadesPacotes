# Projeto Gestão de Entidades

Este projeto em Java demonstra conceitos básicos de Programação Orientada a Objetos (POO) com foco na organização do código em pacotes e na interação entre classes. Ele implementa funcionalidades simples relacionadas a pessoas e produtos, incluindo a verificação de maioridade e a aplicação de descontos em produtos, além de mostrar uma estrutura de pacotes profissional.

---

## Funcionalidades Principais

1. **Classe Pessoa:**
    - Representa uma pessoa com atributos `nome` e `idade`.
    - Verifica se a pessoa é maior de idade através do método `verificaMaiorIdade()`.

2. **Classe Produto:**
    - Representa um produto com atributos `nome` e `preco`.
    - Possui o método `aplicarDesconto()` para calcular um preço reduzido com base em um percentual de desconto.

3. **Classe Principal (App):**
    - Interage com as classes `Pessoa` e `Produto`.
    - Solicita a entrada de idade do usuário e oferece opções de compra caso a pessoa seja maior de idade.

---

## Estrutura de Pacotes

O projeto foi organizado para refletir boas práticas de estruturação de pacotes, com cada responsabilidade colocada em seu local apropriado. A estrutura é a seguinte:

```plaintext
gestao-entidades/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── degrande/
│   │   │   │   │   ├── gestaoentidades/
│   │   │   │   │   │   ├── modelos/       # Contém as classes de domínio (entidades)
│   │   │   │   │   │   │   ├── Pessoa.java
│   │   │   │   │   │   │   ├── Produto.java
│   │   │   │   │   │   ├── principal/     # Contém a classe principal para execução
│   │   │   │   │   │   │   ├── App.java
```
### Detalhes dos Pacotes

#### `modelos`
Contém classes que representam as entidades principais do domínio:
- **`Pessoa.java`**: Define atributos e comportamentos de uma pessoa.
- **`Produto.java`**: Define atributos e métodos relacionados a produtos.

#### `principal`
Contém a classe `App.java`, responsável por iniciar o programa e interagir com o usuário.

---

### Exemplos de Uso

#### Criar uma Pessoa e verificar a maioridade:
```java
Pessoa pessoa = new Pessoa("Lucas");
pessoa.setIdade(20);
pessoa.verificaMaiorIdade();
```

### Criar um Produto e aplicar um desconto:
```java
Produto produto = new Produto();
produto.setNome("Camiseta");
produto.setPreco(39.99);
double precoComDesconto = produto.aplicarDesconto(0.2); // 20% de desconto
System.out.println("Preço com desconto: " + precoComDesconto);
```
### Como Executar o Projeto
1. Clone este repositório em sua máquina.
2. Configure o ambiente Java (versão 8 ou superior).
3. Navegue até a classe principal `App.java` e execute o programa para interagir com o console.

---

### Autor
**Lucas Degrande**  

Este projeto foi desenvolvido com o objetivo de treinar a organização de pacotes e a aplicação de conceitos básicos de POO. A estrutura dos pacotes foi elaborada para simular um projeto modular e escalável.


