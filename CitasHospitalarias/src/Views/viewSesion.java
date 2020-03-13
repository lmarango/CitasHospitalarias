/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Control.clsPersonaDAO;
import data.ConectaDb;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class viewSesion extends javax.swing.JFrame {
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private String atrUserAdmin = "admin@example.com";//Inicializacion explicita del user del administrador
    private String atrPasswordAdmin = "postgres";//Inicializacion explícita del password asociado al administrador
    private clsPersonaDAO daoPersona; //Objeto de tipo personaDAO
    public static viewSesion Inicio = new viewSesion(); //Nueva instancia de view sesion
    //</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc="Constructores"> 
    /**
     * Constructor no parametrizado por defecto
     */
    public viewSesion() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
//</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniSesion = new javax.swing.JButton();
        lblPregunta = new javax.swing.JLabel();
        lblRegistro = new javax.swing.JLabel();
        lblErrorSesion = new javax.swing.JLabel();
        lblCertificadoIcon = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Sesion"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniSesion.setText("Iniciar");
        btnIniSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 69, -1));

        lblPregunta.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblPregunta.setText("¿No te has registrado aún?");
        getContentPane().add(lblPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        lblRegistro.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(0, 51, 204));
        lblRegistro.setText("Registrarse ahora.");
        getContentPane().add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        lblErrorSesion.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        lblErrorSesion.setForeground(new java.awt.Color(153, 0, 0));
        lblErrorSesion.setText("Usuario o contraseña incorrectos. Intente nuevamente");
        getContentPane().add(lblErrorSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        lblCertificadoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/iconfinder-sslcertificate-4263529_117858.png"))); // NOI18N
        getContentPane().add(lblCertificadoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 110));

        lblTitulo.setBackground(new java.awt.Color(23, 138, 29));
        lblTitulo.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 204));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("INICIAR SESIÓN");
        lblTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 262, -1));

        txtUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 190, 40));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUsuario.setText("USUARIO:");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 110, 40));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 190, 38));

        lblPassword.setBackground(new java.awt.Color(153, 0, 153));
        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPassword.setText("CONTRASEÑA:");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/gris.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 100, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/gris.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 100, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/85640256-médico-inteligente-con-estetoscopio-de-pie-con-la-imagen-borrosa-de-hospital-interior-y-fondo-azul-pat.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //<editor-fold defaultstate="collapsed" desc="Eventos">
    private void btnIniSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniSesionActionPerformed
        String varUser = Inicio.txtUser.getText();
        char[] arrayC = Inicio.txtPassword.getPassword();
        String varPassword = new String(arrayC);
        Inicio.IniciarSesion(varUser, varPassword);
    }//GEN-LAST:event_btnIniSesionActionPerformed
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    /**
     * Metodo que permite iniciar sesion mediante un user y un password
     * @param prmUser usuario a hacer login
     * @param prmPassword contraseña asociada al password
     * @return Verdadero si el logeo fue exitoso, falso de lo contrario
     */
    private boolean IniciarSesion(String prmUser, String prmPassword){
        try {
            //if(prmUser.matches("\\d*")){
            if((prmUser.equals(atrUserAdmin)) && (prmPassword.equals(atrPasswordAdmin))){
                LimpiarCampos();
                Inicio.setVisible(false);
                viewAdministrador Admin = new viewAdministrador();
                System.out.println("Iniciando Sesion...");
                Admin.setVisible(true);
                return true;
            }
            else{
                Inicio.lblErrorSesion.setVisible(true);
                System.out.println("FALLOOOOOO...");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    /**
     * Limpia los campos del textfield txtUser y txtPassword
     */
    public static void LimpiarCampos(){
        txtUser.setText("");
        txtPassword.setText("");
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Stater principal de ejecucion del software">
    /**
     * Starter principal de la aplicacion
     * @param args
     */
    public static void main(String args[]) {
        
        ConectaDb cc = new ConectaDb();
        
        if(cc.conectar()){
            
            Inicio.setVisible(true);
            LimpiarCampos();
            Inicio.lblErrorSesion.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos. Contacte con el administrador");
        }
    }
//</editor-fold>
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblCertificadoIcon;
    private javax.swing.JLabel lblErrorSesion;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    protected static javax.swing.JPasswordField txtPassword;
    protected static javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
