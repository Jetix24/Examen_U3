// Se importa la clase  java.awt.Color para asignar los colores al JFrame
import java.awt.Color;

/*
 Se crea el JFrame llamado Operaciones_JF que hereda de javax.swing.JFrame
 */

public class Operaciones_JF extends javax.swing.JFrame {

    /**
     * Creates new form Operaciones_JF
     */
    public Operaciones_JF() {
        initComponents();
         // Se utliza el método setBackground para cambiar el color del fondo del JFrame
         this.getContentPane().setBackground(Color.black);
         // Se utliza el metodos setTitle para cambiar el título de la calculadora
         this.setTitle("Calculadora");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_Suma = new javax.swing.JButton();
        Btn_Resta = new javax.swing.JButton();
        Btn_Multiplicación = new javax.swing.JButton();
        Btn_División = new javax.swing.JButton();
        Btn_Raíz = new javax.swing.JButton();
        Lab_Calculadora = new javax.swing.JLabel();
        Btn_Salir = new javax.swing.JButton();
        Btn_Potencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Btn_Suma.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Suma.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Btn_Suma.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Suma.setText("Suma");
        Btn_Suma.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 204, 0)));
        Btn_Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SumaActionPerformed(evt);
            }
        });

        Btn_Resta.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Resta.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Btn_Resta.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Resta.setText("Resta");
        Btn_Resta.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 204)));
        Btn_Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RestaActionPerformed(evt);
            }
        });

        Btn_Multiplicación.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Multiplicación.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Btn_Multiplicación.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Multiplicación.setText("Multiplicación");
        Btn_Multiplicación.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 255, 0)));
        Btn_Multiplicación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MultiplicaciónActionPerformed(evt);
            }
        });

        Btn_División.setBackground(new java.awt.Color(0, 0, 0));
        Btn_División.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Btn_División.setForeground(new java.awt.Color(255, 255, 255));
        Btn_División.setText("División");
        Btn_División.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 0, 153)));
        Btn_División.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DivisiónActionPerformed(evt);
            }
        });

        Btn_Raíz.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Raíz.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Btn_Raíz.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Raíz.setText("Raíz");
        Btn_Raíz.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        Btn_Raíz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RaízActionPerformed(evt);
            }
        });

        Lab_Calculadora.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        Lab_Calculadora.setForeground(new java.awt.Color(0, 255, 255));
        Lab_Calculadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lab_Calculadora.setText("Calculadora");

        Btn_Salir.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Salir.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Btn_Salir.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Salir.setText("Salir");
        Btn_Salir.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 0, 0)));
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });

        Btn_Potencia.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Potencia.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Btn_Potencia.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Potencia.setText("Potencia");
        Btn_Potencia.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 0)));
        Btn_Potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PotenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btn_Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Multiplicación, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_División, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(Btn_Raíz, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 35, Short.MAX_VALUE))
            .addComponent(Lab_Calculadora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Lab_Calculadora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Suma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Resta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Multiplicación)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_División)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Potencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Raíz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Salir)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    // Se indica lo que hara el botón Suma
    private void Btn_SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SumaActionPerformed
        // Se crea el objeto S de la clase Suma
        Suma S = new Suma(0,0);
        // Se utiliza el método Get_Suma
        S.Get_Suma();
    }//GEN-LAST:event_Btn_SumaActionPerformed
    // Se indica lo que hara el botón Salir
    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
        // Se utiliza el método System.exit para cerrar el programa
        System.exit(0);
    }//GEN-LAST:event_Btn_SalirActionPerformed
    // Se indica lo que hara el botón Multiplicación
    private void Btn_MultiplicaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MultiplicaciónActionPerformed
         Multiplicación M = new Multiplicación (0,0);
         // Se utiliza el método Get_Mutiplicación
         M.Get_Multiplicación();
    }//GEN-LAST:event_Btn_MultiplicaciónActionPerformed
    // Se indica lo que hara el botón Resta
    private void Btn_RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RestaActionPerformed
         // Se crea el objeto R de la clase Resta 
         Resta R = new Resta(0,0);
         // Se utiliza el método Get_Resta
         R.Get_Resta();
    }//GEN-LAST:event_Btn_RestaActionPerformed
    // Se indica lo que hara el botón diviaisión
    private void Btn_DivisiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DivisiónActionPerformed
         // Se crea el objeto D de la clase División
         División D = new División(0,0);
         // Se utiliza el método Get_División
         D.Get_División();
    }//GEN-LAST:event_Btn_DivisiónActionPerformed
    // Se indica lo que hara el botón Potencia
    private void Btn_PotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PotenciaActionPerformed
        // Se crea el objeto PC de la clase Potencia_cuadrado
        Potencia_cuadrado PC = new Potencia_cuadrado(0,0);
        // Se utiliza el método Get_Potencia_cuadrado
        PC.Get_Potencia_cuadrado();
    }//GEN-LAST:event_Btn_PotenciaActionPerformed
    // Se indica lo que hara el botón Raíz
    private void Btn_RaízActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RaízActionPerformed
         // Se crea el objeto RC de la clase Raíz_cuadrada 
         Raíz_cuadrada RC = new Raíz_cuadrada(0,0);
        // Se utiliza el método Get_Raíz_Cuadrada
         RC.Get_Raíz_Cuadrada();
    }//GEN-LAST:event_Btn_RaízActionPerformed

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
            java.util.logging.Logger.getLogger(Operaciones_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operaciones_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operaciones_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operaciones_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operaciones_JF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_División;
    private javax.swing.JButton Btn_Multiplicación;
    private javax.swing.JButton Btn_Potencia;
    private javax.swing.JButton Btn_Raíz;
    private javax.swing.JButton Btn_Resta;
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JButton Btn_Suma;
    private javax.swing.JLabel Lab_Calculadora;
    // End of variables declaration//GEN-END:variables
}
