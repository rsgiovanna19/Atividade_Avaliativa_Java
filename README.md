## TRABALHO INDIVIDUAL - Desenvolvimento de Software

Engenharia de Software - Noturno - 2º período
Giovanna da Silva Rosa - RGM 35874716

Desenvolva um sistema de gerenciamento de funcionários para uma organização. Este sistema
deve ser capaz de manipular diferentes tipos de funcionários, incluindo gerentes,
desenvolvedores e estagiários. Utilize os conceitos de herança, classes abstratas, interfaces,
polimorfismo e ArrayLists para criar uma solução robusta e flexível que permita fácil expansão
e manutenção.

Descrição do Sistema
1. Base Comum:
• Crie uma classe abstrata Funcionario que atue como a superclasse para todos
os tipos de funcionários. Esta classe deve conter atributos e métodos comuns
a todos os funcionários, como nome e matricula, e método abstrato para
calcular salário. OK


2. Tipos de Funcionários:
• Gerente: Deve incluir atributos adicionais como bônus anual e equipe sob
gerência. -  equipe eh um array OK
• Desenvolvedor: Deve incluir atributos específicos como tecnologias que
domina. - array OK
• Estagiário: Deve ter atributos como horas de trabalho e supervisor. OK



3. Interface Comportamental:
• Defina uma interface Trabalhavel que inclua métodos como trabalhar() e
relatarProgresso(). Cada classe de funcionário deverá implementar essa
interface de maneira adequada ao seu papel. OK



4. Armazenamento e Manipulação de Dados:
• Utilize um ArrayList para armazenar objetos de todos os tipos de funcionários.
Isso permitirá fácil manipulação de dados, como adicionar, remover, e listar
funcionários. ok



5. Polimorfismo e Flexibilidade:
• Demonstre polimorfismo permitindo que métodos como calcularSalario()
tenham implementações diferentes baseadas no tipo de funcionário (por
exemplo, o cálculo do salário pode incluir bônus para gerentes). OK


Requisitos Específicos

• Classes e Métodos:
• A classe Funcionario deve incluir métodos abstratos que serão especificados
nas subclasses. ok
• Implemente pelo menos três subclasses (Gerente, Desenvolvedor, Estagiário)
que herdam de Funcionario e implementam a interface Trabalhavel. ok
• Use coleções do tipo ArrayList para gerenciar a lista de funcionários,
permitindo operações como //adicionar e remover funcionários.//  ok

• Interface do Usuário:
• Desenvolva uma interface de usuário simples no console para interagir com o
sistema, permitindo ao usuário adicionar novos funcionários, remover
funcionários existentes, e exibir todos os funcionários.

• Funcionalidade de Busca:
• Implemente uma funcionalidade para buscar funcionários por nome ou
matricula, demonstrando o uso efetivo de loops e condicionais em ArrayList. ok
