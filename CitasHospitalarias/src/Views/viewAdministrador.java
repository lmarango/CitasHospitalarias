/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author Usuario
 */
public class viewAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form viewAdministrador
     */
    public viewAdministrador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        btnRegMedico = new javax.swing.JButton();
        btnAsigHorarios = new javax.swing.JButton();
        btnIngUsuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 52, -1, -1));

        btnRegMedico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRegMedico.setText("Registrar médico");
        btnRegMedico.setToolTipText("");
        btnRegMedico.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 153)));
        btnRegMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegMedico.setName("btnRegMedico"); // NOI18N
        btnRegMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 96, 152, 39));

        btnAsigHorarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAsigHorarios.setText("Asignar Horarios");
        btnAsigHorarios.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 153)));
        btnAsigHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsigHorariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAsigHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 231, 170, 39));

        btnIngUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnIngUsuario.setText("Ingresar como usuario");
        btnIngUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 0)));
        btnIngUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 338, 156, 38));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MENÚ ADMINISTRADOR");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 153)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, -1, 28));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Doctor_Male_icon-icons.com_75051.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 52, 102, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/organizer_calendar_clock_pencil_10047.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 186, 137, 113));

        btnCerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCerrarSesion.setText("Cerrar sesión");
        btnCerrarSesion.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(167, 0, 0)));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 337, -1, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/admin.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegMedicoActionPerformed
        viewRegMedico jMedico = new viewRegMedico();
        this.setVisible(false);
        jMedico.setVisible(true);
    }//GEN-LAST:event_btnRegMedicoActionPerformed

    private void btnAsigHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsigHorariosActionPerformed
         viewAsignarHorario jMedico = new viewAsignarHorario();
         this.setVisible(false);
         jMedico.setVisible(true);
    }//GEN-LAST:event_btnAsigHorariosActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.setVisible(false);
        viewSesion jSesion = new viewSesion();
        jSesion.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnIngUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngUsuarioActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsigHorarios;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnIngUsuario;
    private javax.swing.JButton btnRegMedico;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}