/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhom1;

/**
 *
 * @author 7218834
 */
public class Stats extends javax.swing.JFrame {

    /**
     * Creates new form Stats
     * @param campeao
     */
    public Stats(String campeao) {
        initComponents();
        CampeaoMetodos met = new CampeaoMetodos();
        CampeaoStats champ = met.pesquisaCampeao(campeao);
 
        vida_valor.setText(Double.toString(champ.getHp()));
        pontosDeMana_valor.setText(Double.toString(champ.getMp()));
        velocidadeDeMovimento_valor.setText(Double.toString(champ.getMovespeed()));
        armadura_valor.setText(Double.toString(champ.getArmor()));
        resistenciaMagica_valor.setText(Double.toString(champ.getSpellblock()));
        alcance_valor.setText(Double.toString(champ.getAttackrange()));
        regeneracaoDeVida_valor.setText(Double.toString(champ.getHpregen()));
        regeneracaoDeMana_valor.setText(Double.toString(champ.getMpregen()));
        chanceDeAcertoCritico_valor.setText(Double.toString(champ.getCrit()));
        danoDeAtaque_valor.setText(Double.toString(champ.getAttackdamage()));
        velocidadeDeAtaque_valor.setText(Double.toString(champ.getAttackspeed()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        velocidadeDeMovimento = new javax.swing.JLabel();
        pontosDeMana = new javax.swing.JLabel();
        resistenciaMagica = new javax.swing.JLabel();
        armadura = new javax.swing.JLabel();
        regeneracaoDeVida = new javax.swing.JLabel();
        regeneracaoDeMana = new javax.swing.JLabel();
        chanceDeAcertoCritico = new javax.swing.JLabel();
        danoDeAataque = new javax.swing.JLabel();
        velocidadeDeAtaque = new javax.swing.JLabel();
        vida = new javax.swing.JLabel();
        pontosDeMana_valor = new javax.swing.JLabel();
        velocidadeDeMovimento_valor = new javax.swing.JLabel();
        vida_valor = new javax.swing.JLabel();
        resistenciaMagica_valor = new javax.swing.JLabel();
        armadura_valor = new javax.swing.JLabel();
        regeneracaoDeMana_valor = new javax.swing.JLabel();
        regeneracaoDeVida_valor = new javax.swing.JLabel();
        chanceDeAcertoCritico_valor = new javax.swing.JLabel();
        danoDeAtaque_valor = new javax.swing.JLabel();
        velocidadeDeAtaque_valor = new javax.swing.JLabel();
        alcance1 = new javax.swing.JLabel();
        alcance_valor = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel6.setText("Pontos de Mana:");

        jLabel17.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        velocidadeDeMovimento.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        velocidadeDeMovimento.setText("Velocidade de movimento:");

        pontosDeMana.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        pontosDeMana.setText("Pontos de mana:");

        resistenciaMagica.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        resistenciaMagica.setText("Resistência mágica:");

        armadura.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        armadura.setText("Armadura:");

        regeneracaoDeVida.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        regeneracaoDeVida.setText("Regeneração de vida:");

        regeneracaoDeMana.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        regeneracaoDeMana.setText("Regeneração de mana:");

        chanceDeAcertoCritico.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        chanceDeAcertoCritico.setText("Chance de acerto crítico:");

        danoDeAataque.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        danoDeAataque.setText("Dano de ataque:");

        velocidadeDeAtaque.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        velocidadeDeAtaque.setText("Velocidade de ataque:");

        vida.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        vida.setText("Vida:");

        pontosDeMana_valor.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        pontosDeMana_valor.setText("jLabel");

        velocidadeDeMovimento_valor.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        velocidadeDeMovimento_valor.setText("jLabel");

        vida_valor.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        vida_valor.setText("jLabel");

        resistenciaMagica_valor.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        resistenciaMagica_valor.setText("jLabel");

        armadura_valor.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        armadura_valor.setText("jLabel");

        regeneracaoDeMana_valor.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        regeneracaoDeMana_valor.setText("jLabel");

        regeneracaoDeVida_valor.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        regeneracaoDeVida_valor.setText("jLabel");

        chanceDeAcertoCritico_valor.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        chanceDeAcertoCritico_valor.setText("jLabel");

        danoDeAtaque_valor.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        danoDeAtaque_valor.setText("jLabel");

        velocidadeDeAtaque_valor.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        velocidadeDeAtaque_valor.setText("jLabel");

        alcance1.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        alcance1.setText("Alcance:");

        alcance_valor.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        alcance_valor.setText("jLabel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(alcance1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alcance_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vida_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regeneracaoDeMana)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(regeneracaoDeMana_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regeneracaoDeVida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(regeneracaoDeVida_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(armadura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(armadura_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(velocidadeDeMovimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(velocidadeDeMovimento_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pontosDeMana)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pontosDeMana_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(danoDeAataque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(danoDeAtaque_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chanceDeAcertoCritico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chanceDeAcertoCritico_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resistenciaMagica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resistenciaMagica_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(velocidadeDeAtaque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(velocidadeDeAtaque_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vida_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pontosDeMana, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pontosDeMana_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(velocidadeDeMovimento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(velocidadeDeMovimento_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(armadura, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(armadura_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resistenciaMagica, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resistenciaMagica_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alcance1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alcance_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regeneracaoDeVida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regeneracaoDeVida_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regeneracaoDeMana, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regeneracaoDeMana_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chanceDeAcertoCritico, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chanceDeAcertoCritico_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(danoDeAataque, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(danoDeAtaque_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(velocidadeDeAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(velocidadeDeAtaque_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Stats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alcance1;
    private javax.swing.JLabel alcance_valor;
    private javax.swing.JLabel armadura;
    private javax.swing.JLabel armadura_valor;
    private javax.swing.JLabel chanceDeAcertoCritico;
    private javax.swing.JLabel chanceDeAcertoCritico_valor;
    private javax.swing.JLabel danoDeAataque;
    private javax.swing.JLabel danoDeAtaque_valor;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel pontosDeMana;
    private javax.swing.JLabel pontosDeMana_valor;
    private javax.swing.JLabel regeneracaoDeMana;
    private javax.swing.JLabel regeneracaoDeMana_valor;
    private javax.swing.JLabel regeneracaoDeVida;
    private javax.swing.JLabel regeneracaoDeVida_valor;
    private javax.swing.JLabel resistenciaMagica;
    private javax.swing.JLabel resistenciaMagica_valor;
    private javax.swing.JLabel velocidadeDeAtaque;
    private javax.swing.JLabel velocidadeDeAtaque_valor;
    private javax.swing.JLabel velocidadeDeMovimento;
    private javax.swing.JLabel velocidadeDeMovimento_valor;
    private javax.swing.JLabel vida;
    private javax.swing.JLabel vida_valor;
    // End of variables declaration//GEN-END:variables
}