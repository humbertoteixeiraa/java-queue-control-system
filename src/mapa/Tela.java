//ALUNO: João Humberto Pereira Teixeira
//R.A.: 1881171-5
//PÓLO: Itapipica-CE
//CURSO: Análise e Desenvolvimento de Sistemas
//ATIVIDADE: MAPA
//DISCIPLINA: Programação II

package mapa;


import java.util.ArrayList;
import java.util.List;



public class Tela extends javax.swing.JFrame {

    List<Senhas> listaSenhas;
    
    int n = 1;
    
    
    public Tela() {
        initComponents();
        
        listaSenhas = new ArrayList<>();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        painelClientes = new javax.swing.JPanel();
        botaoComum = new javax.swing.JButton();
        botaoRapido = new javax.swing.JButton();
        botaoPrioritario = new javax.swing.JButton();
        labelTipoAtendimento = new javax.swing.JLabel();
        labelSenhaGerada = new javax.swing.JLabel();
        labelSuaSenhaE = new javax.swing.JLabel();
        painelCaixas = new javax.swing.JPanel();
        botaoCaixa1 = new javax.swing.JButton();
        botaoCaixa2 = new javax.swing.JButton();
        botaoCaixa3 = new javax.swing.JButton();
        botaoCaixa4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelSenhaChamada = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelCaixaAtendimento = new javax.swing.JLabel();
        labelParaClientes = new javax.swing.JLabel();
        labelParaCaixas = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painelClientes.setBackground(java.awt.Color.lightGray);
        painelClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botaoComum.setText("Comum");
        botaoComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComumActionPerformed(evt);
            }
        });

        botaoRapido.setText("Rápido");
        botaoRapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRapidoActionPerformed(evt);
            }
        });

        botaoPrioritario.setText("Prioritário");
        botaoPrioritario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPrioritarioActionPerformed(evt);
            }
        });

        labelTipoAtendimento.setText("Escolha seu tipo de atendimento:");

        labelSenhaGerada.setBackground(new java.awt.Color(255, 255, 255));
        labelSenhaGerada.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        labelSenhaGerada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSenhaGerada.setText("Senha Gerada");
        labelSenhaGerada.setOpaque(true);

        labelSuaSenhaE.setText("Sua senha é:");

        javax.swing.GroupLayout painelClientesLayout = new javax.swing.GroupLayout(painelClientes);
        painelClientes.setLayout(painelClientesLayout);
        painelClientesLayout.setHorizontalGroup(
            painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClientesLayout.createSequentialGroup()
                .addGroup(painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelSenhaGerada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelClientesLayout.createSequentialGroup()
                        .addGroup(painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelClientesLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTipoAtendimento)
                                    .addGroup(painelClientesLayout.createSequentialGroup()
                                        .addComponent(botaoComum)
                                        .addGap(41, 41, 41)
                                        .addComponent(botaoRapido)
                                        .addGap(29, 29, 29)
                                        .addComponent(botaoPrioritario))))
                            .addGroup(painelClientesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelSuaSenhaE)))
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelClientesLayout.setVerticalGroup(
            painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTipoAtendimento)
                .addGap(18, 18, 18)
                .addGroup(painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoComum)
                    .addComponent(botaoRapido)
                    .addComponent(botaoPrioritario))
                .addGap(52, 52, 52)
                .addComponent(labelSuaSenhaE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSenhaGerada)
                .addContainerGap())
        );

        painelCaixas.setBackground(java.awt.Color.lightGray);
        painelCaixas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botaoCaixa1.setText("Caixa 1");
        botaoCaixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCaixa1ActionPerformed(evt);
            }
        });

        botaoCaixa2.setText("Caixa 2");
        botaoCaixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCaixa2ActionPerformed(evt);
            }
        });

        botaoCaixa3.setText("Caixa 3");
        botaoCaixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCaixa3ActionPerformed(evt);
            }
        });

        botaoCaixa4.setText("Caixa 4");
        botaoCaixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCaixa4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCaixasLayout = new javax.swing.GroupLayout(painelCaixas);
        painelCaixas.setLayout(painelCaixasLayout);
        painelCaixasLayout.setHorizontalGroup(
            painelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCaixasLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(painelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCaixa1)
                    .addComponent(botaoCaixa3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(painelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCaixa2)
                    .addComponent(botaoCaixa4))
                .addGap(30, 30, 30))
        );
        painelCaixasLayout.setVerticalGroup(
            painelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCaixasLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(painelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCaixa1)
                    .addComponent(botaoCaixa2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(painelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCaixa3)
                    .addComponent(botaoCaixa4))
                .addGap(53, 53, 53))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelSenhaChamada.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        labelSenhaChamada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSenhaChamada.setText("Senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelSenhaChamada, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelSenhaChamada, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelCaixaAtendimento.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        labelCaixaAtendimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCaixaAtendimento.setText("Caixa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(labelCaixaAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCaixaAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelParaClientes.setText("Para Clientes");

        labelParaCaixas.setText("Para Caixas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelParaClientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelParaCaixas)
                    .addComponent(painelCaixas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelParaClientes)
                    .addComponent(labelParaCaixas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelCaixas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComumActionPerformed
        
        Senhas s = new Senhas();
        
        s.setTipo("C");
        s.setNumero(n);
        n++;
        
        listaSenhas.add(s);
        
        labelSenhaGerada.setText(s.getTipo() + " - " + s.getNumero());
        
    }//GEN-LAST:event_botaoComumActionPerformed

    private void botaoRapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRapidoActionPerformed
        
        Senhas s = new Senhas();
        
        s.setTipo("R");
        s.setNumero(n);
        n++;
        
        listaSenhas.add(s);
        
        labelSenhaGerada.setText(s.getTipo() + " - " + s.getNumero());
        
    }//GEN-LAST:event_botaoRapidoActionPerformed

    private void botaoPrioritarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPrioritarioActionPerformed
        
      Senhas s = new Senhas();
        
        s.setTipo("P");
        s.setNumero(n);
        n++;
        
        listaSenhas.add(s);
        
        labelSenhaGerada.setText(s.getTipo() + " - " + s.getNumero());
        
    }//GEN-LAST:event_botaoPrioritarioActionPerformed

    private void botaoCaixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCaixa1ActionPerformed
        
        if (listaSenhas.isEmpty()) {
            labelSenhaChamada.setText("Fila vazia!");
            labelCaixaAtendimento.setText("Fila vazia!");
        }
        
        Senhas p = listaSenhas.stream().filter(x -> x.getTipo().charAt(0) == 'P').findFirst().orElse(null);
        if (p != null) {
            labelSenhaChamada.setText(p.getTipo() + " - " + p.getNumero());
            labelCaixaAtendimento.setText("Caixa 1");
            listaSenhas.remove(p);
            
            System.out.println("-> " + p + " chamada"); //Mostra a senha chamada no modo texto.
            
        } else {
            for(int i = 0; i < listaSenhas.size(); i++) {
                Senhas q = listaSenhas.get(i);

                if(q.getTipo().equals("C") || q.getTipo().equals("R")) {
                    labelSenhaChamada.setText(q.getTipo() + " - " + q.getNumero());
                    labelCaixaAtendimento.setText("Caixa 1");
                    listaSenhas.remove(q);
                    
                    System.out.println("-> " + q + " chamada"); //Mostra a senha chamada no modo texto.
                    
                    break;
                }
            }
        }
              
        mostrarFila();
        
    }//GEN-LAST:event_botaoCaixa1ActionPerformed

    private void botaoCaixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCaixa2ActionPerformed
            
        if (listaSenhas.isEmpty()) {
            labelSenhaChamada.setText("Fila vazia!");
            labelCaixaAtendimento.setText("Fila vazia!");
        }
        
        Senhas p = listaSenhas.stream().filter(x -> x.getTipo().charAt(0) == 'R').findFirst().orElse(null);
        if (p != null) {
            labelSenhaChamada.setText(p.getTipo() + " - " + p.getNumero());
            labelCaixaAtendimento.setText("Caixa 2");
            listaSenhas.remove(p);
            
            System.out.println("-> " + p + " chamada"); //Mostra a senha chamada no modo texto.
            
        } else {
            for(int i = 0; i < listaSenhas.size(); i++) {
                Senhas q = listaSenhas.get(i);

                if(q.getTipo().equals("C") || q.getTipo().equals("P")) {
                    labelSenhaChamada.setText(q.getTipo() + " - " + q.getNumero());
                    labelCaixaAtendimento.setText("Caixa 2");
                    listaSenhas.remove(q);
                    
                    System.out.println("-> " + q + " chamada"); //Mostra a senha chamada no modo texto.
                    
                    break;
                }
            }
        }
        
        mostrarFila();
        
    }//GEN-LAST:event_botaoCaixa2ActionPerformed

    private void botaoCaixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCaixa3ActionPerformed
              
        if (listaSenhas.isEmpty()) {
            labelSenhaChamada.setText("Fila vazia!");
            labelCaixaAtendimento.setText("Fila vazia!");
        }
        
        Senhas p = listaSenhas.stream().filter(x -> x.getTipo().charAt(0) == 'R').findFirst().orElse(null);
        if (p != null) {
            labelSenhaChamada.setText(p.getTipo() + " - " + p.getNumero());
            labelCaixaAtendimento.setText("Caixa 3");
            listaSenhas.remove(p);
            
            System.out.println("-> " + p + " chamada"); //Mostra a senha chamada no modo texto.
            
        } else {
            for(int i = 0; i < listaSenhas.size(); i++) {
                Senhas q = listaSenhas.get(i);

                if(q.getTipo().equals("C") || q.getTipo().equals("P")) {
                    labelSenhaChamada.setText(q.getTipo() + " - " + q.getNumero());
                    labelCaixaAtendimento.setText("Caixa 3");
                    listaSenhas.remove(q);
                    
                    System.out.println("-> " + q + " chamada"); //Mostra a senha chamada no modo texto.
                    
                    break;
                }
            }
        }
        
        mostrarFila();
        
    }//GEN-LAST:event_botaoCaixa3ActionPerformed

    private void botaoCaixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCaixa4ActionPerformed

        if (listaSenhas.isEmpty()) {
            labelSenhaChamada.setText("Fila vazia!");
            labelCaixaAtendimento.setText("Fila vazia!");
        }
        
        Senhas p = listaSenhas.stream().filter(x -> x.getTipo().charAt(0) == 'C').findFirst().orElse(null);
        if (p != null) {
            labelSenhaChamada.setText(p.getTipo() + " - " + p.getNumero());
            labelCaixaAtendimento.setText("Caixa 4");
            listaSenhas.remove(p);
            
            System.out.println("-> " + p + " chamada"); //Mostra a senha chamada no modo texto.
            
        } else {
            for(int i = 0; i < listaSenhas.size(); i++) {
                Senhas q = listaSenhas.get(i);

                if(q.getTipo().equals("C") || q.getTipo().equals("P")) {
                    labelSenhaChamada.setText(q.getTipo() + " - " + q.getNumero());
                    labelCaixaAtendimento.setText("Caixa 4");
                    listaSenhas.remove(q);
                    
                    System.out.println("-> " + q + " chamada"); //Mostra a senha chamada no modo texto.
                    
                    break;
                }
            }
        }

        mostrarFila();
        
    }//GEN-LAST:event_botaoCaixa4ActionPerformed

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });   
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCaixa1;
    private javax.swing.JButton botaoCaixa2;
    private javax.swing.JButton botaoCaixa3;
    private javax.swing.JButton botaoCaixa4;
    private javax.swing.JButton botaoComum;
    private javax.swing.JButton botaoPrioritario;
    private javax.swing.JButton botaoRapido;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelCaixaAtendimento;
    private javax.swing.JLabel labelParaCaixas;
    private javax.swing.JLabel labelParaClientes;
    private javax.swing.JLabel labelSenhaChamada;
    private javax.swing.JLabel labelSenhaGerada;
    private javax.swing.JLabel labelSuaSenhaE;
    private javax.swing.JLabel labelTipoAtendimento;
    private javax.swing.JPanel painelCaixas;
    private javax.swing.JPanel painelClientes;
    // End of variables declaration//GEN-END:variables

    
    //MÉTODO PERSONALIZADO
    public void mostrarFila() { //Esse MÉTODO mostra as senhas da fila em modo texto.    
        
        System.out.println("");
        System.out.println("=== SENHAS NA FILA ===");
        if (listaSenhas.isEmpty()) {
            System.out.println("Fila vazia!");    
        }
        int i = 0;
        for (Senhas x : listaSenhas) {

            System.out.printf("Posição [%d] -> ", i);
            System.out.println(x);
            i++;
        }
    }  
}

