<div align="justify">
  
# Sistema de Agendamento de Entregas de uma Floricultura 

Projeto de Pesquisa Extensionista referente à disciplina de POO em Java para o curso de ADS.
<br>
#
Este projeto é um sistema simples para o agendamento de entregas em uma floricultura, implementado em Java. O objetivo é permitir o agendamento de entregas com uma interface gráfica bem simples e intuitiva para o usuário (no caso, proprietário e funcionários da empresa) e tratar possíveis conflitos de agendamentos para os mesmos horários utilizando o tratamento de exceções (try... catch) personalizadas.

<b>Estrutura do Projeto:</b>
<br>

O projeto é composto pelas seguintes classes e interfaces:
<br>

<i>Agendamento</i>: Gerencia os agendamentos de entregas e verifica conflitos de horário.
<br>
<i>AgendamentoException</i>: Exceção personalizada para tratar conflitos de agendamento.
<br>
<i>AgendamentoInterface</i>: Interface que define o método para agendar entregas.
<br>
<i>Entrega</i>: Representa uma entrega com endereço, bairro, taxa e data/hora.
<br>
<i>Loja</i>: Representa uma loja e armazena entregas associadas a ela.
<br>
<i>Main</i>: Classe principal que demonstra o funcionamento do sistema com exemplos de agendamentos.
<br>
<i>SistemaDeAgendamento</i>: Interface gráfica para agendamento de entregas.

<b>Como utilizar esse sistema:</b>
* Selecionar Loja: Escolha uma loja no menu suspenso.
* Endereço de Entrega: Insira o endereço onde a entrega será realizada.
* Bairro: Informe o bairro da entrega. A taxa é calculada com base no bairro.
* Data e Hora: Insira a data e hora no formato dd/MM/yyyy HH:mm.
* Agendar Entrega: Clique no botão para agendar a entrega. Se houver um conflito de horário, uma mensagem de erro será exibida.
<br>

<b>Detalhes das Classes e Interfaces:</b>
<br>

<i>Classe Agendamento</i>:
Gerencia o agendamento de entregas e verifica se já existe uma entrega para o mesmo horário.
<br>
<i>Classe AgendamentoException</i>:
Exceção personalizada para o gerenciamento de erros de agendamento.
<br>
<i>Interface AgendamentoInterface</i>:
Define o método para agendar entregas.
<br>
<i>Classe Entrega</i>:
Representa uma entrega, incluindo o cálculo da taxa com base no bairro.
<br>
<i>Classe Loja</i>:
Armazena o nome da loja e as entregas associadas.
<br>
<i>Classe Main</i>:
Demonstra o funcionamento do sistema com exemplos de agendamentos e tratamento de exceções.
<br>
<i>Classe SistemaDeAgendamento</i>:
Fornece uma interface gráfica simples para agendamento de entregas.
</div>
