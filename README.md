Sistema de Gerenciamento de Marmitas
Descrição

O Sistema de Gerenciamento de Marmitas é uma aplicação desenvolvida em Java com o objetivo de auxiliar no controle de produção, distribuição e gerenciamento de marmitas entre restaurantes e distribuidoras.

O sistema permite o controle de estoque, autenticação de usuários, pedidos de marmitas, acompanhamento de saídas para distribuição e visualização de informações relevantes para a operação.

O projeto foi desenvolvido utilizando os conceitos de Programação Orientada a Objetos (POO), aplicando herança, polimorfismo, encapsulamento e sobrecarga de construtores.

Funcionalidades
Sistema de Login
Autenticação de usuários por e-mail e senha.
Controle de tentativas de acesso.
Bloqueio após exceder o número máximo de tentativas.
Sistema de Marmitas
Consulta de estoque.
Controle de saída de marmitas para distribuidoras.
Visualização do cardápio disponível.
Solicitação de marmitas.
Sistema Restaurante
Gerenciamento de pedidos.
Consulta da disponibilidade de entregadores.
Visualização das marmitas doadas por semana.
Navegação
Menu principal centralizado.
Acesso aos módulos através da classe principal do sistema.
Navegação por menus interativos.
Conceitos de POO Aplicados
Herança

As classes ListaR e ListaD herdam funcionalidades da classe LoginBase, reutilizando atributos e métodos relacionados ao gerenciamento de usuários.

Polimorfismo

O método carregar() foi sobrescrito nas classes filhas através da anotação @Override, permitindo comportamentos específicos para cada lista de usuários.

Encapsulamento

Os atributos das classes foram definidos como privados (private) e acessados por meio de métodos getters e setters, garantindo maior segurança e controle dos dados.

Sobrecarga

A classe Usuario utiliza sobrecarga de construtores, permitindo diferentes formas de criação de objetos.

Estrutura MVC

O projeto foi organizado utilizando o padrão MVC (Model-View-Controller).

Model

Responsável pelos dados e regras de negócio.

Usuario
LoginBase
ListaR
ListaD
Registros
View

Responsável pela interação com o usuário.

SistemaMarmitas
SistemaRestaurante
Controller

Responsável pelo controle do fluxo do sistema.

Main
Login

Tecnologias Utilizadas
Java
Programação Orientada a Objetos (POO)
Estrutura MVC
ArrayList
Controle de Fluxo com Switch Case
Laços de Repetição

Autores
Rafael Soares Vianni e
Arthur Cordeiro Buisa Martinelli

Projeto desenvolvido como atividade acadêmica para a disciplina de Algorítimos e Programação.
