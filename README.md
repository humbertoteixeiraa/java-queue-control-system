# Sobre o Sistema de Controle de Filas de Banco Java
 * Criado durante a Atividade MAPA (Disciplina: Programação II) do curso de graduação em Análise e Desenvolvimento de Sistemas da UNICESUMAR.

# Requisitos de desenvolvimento
 * Utilização da IDE NetBeans;
 * Linguagem de programação JAVA;
 * Implementação de interface gráfica com a ***GUI Builder*** do NetBeans;
 * Utilização dos conceitos de orientação a objetos;
 * O Banco fictício possuirá apenas uma agência;
 * A agência possuirá 4 caixas de atendimento;
 * Os atendimento deverão ser divididos em três categorias:
   * **Preferencial;**
   * **Rápido;**
   * **Comum.**
 * Semelhante às máquinas de geração de senhas, deverá haver três botões para os clientes: **Preferencial**, **Rápido** e **Comum**;
 * O cliente, ao apertar o botão de acordo com o seu atendimento, terá a sua senha gerada e colocada em uma fila;
 * A senha deverá ter a letra do tipo do atendimento (**P**, **R** ou **C**), seguida de um número sequencial. A sequência será a mesma para os diferentes tipos;
 * Deverá haver uma única fila que deverá ser implementada com ArrayList, contendo todas as senhas geradas, que serão objetos da classe Senha, que você irá criar;
 * A classe senha precisará apenas de dois atributos: o **tipo** e o **número**.

 # Requisitos de funcionamento
  * Deverá haver 4 caixas para atendimentos, que atenderão da seguinte forma:
    * **Caixa 1**: realizará os atendimentos preferenciais. Se não houver atendimentos preferenciais na fila, atenderá o próximo (rápido ou comum);
    * **Caixas 2 e 3**: atenderão primeiro as senhas de atendimento rápido. Se não houver atendimento rápido, atenderão o próximo da fila (prioritário ou comum);
    * **Caixa 4**: realizarão os atendimentos comum. Se não houver atendimentos comuns na fila, atenderão o próximo (rápido ou prioritário);
    * Cada caixa, terá o seu botão. Ao clicar no seu respectivo botão, este, deverá buscar a próxima senha a ser atendida. Na sequência, deverá exibir no painel a senha e o caixa. Por fim, o caixa deverá retirar a senha da fila. Se não houver nenhuma senha na fila, não fará nada.
