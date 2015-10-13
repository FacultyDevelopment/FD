package fd.v1;

import Clases.*;
import com.sun.awt.AWTUtilities;
import java.util.ArrayList;

/**
 *
 * @author wcarrasco
 */
public class gui extends javax.swing.JFrame {
    /*Objetos para Thread Cargar!*/
    double iThread=50, jThread = 1;
    Cargar hilo;
    /*Objetos para Thread Cargar!*/

    
    public gui() {
        initComponents();
        iniciar();
    }
    
    public void iniciar(){
        setLocationRelativeTo(null);
        getProgreso().setVisible(false);
        hilo = new Cargar(getProgreso());
        hilo.start();
        hilo = null;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Progreso = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Progreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ProgresoStateChanged(evt);
            }
        });
        getContentPane().add(Progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fd/v1/Faculty Development Logo-04.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 810, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProgresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ProgresoStateChanged
        if (Progreso.getValue() == iThread) {
            if (jThread != 101) {
                AWTUtilities.setWindowOpacity(this, Float.valueOf((100-jThread)/100+"f"));
                iThread++;
                jThread+=2;
            }
        }
        
        if (Progreso.getValue() == 99) {
            gui2 g = new gui2();
            g.setTitle("                                                                                                        ---FACULTY DEVELOPMENT---");
            g.setLocationRelativeTo(null);
            g.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_ProgresoStateChanged

    
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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Progreso;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    

    /**
     * @return the Progreso
     */
    public javax.swing.JProgressBar getProgreso() {
        return Progreso;
    }

    /**
     * @param Progreso the Progreso to set
     */
    public void setProgreso(javax.swing.JProgressBar Progreso) {
        this.Progreso = Progreso;
    }
}
