
package widefend;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author wishihab
 */
public class CheckPorts extends javax.swing.JFrame {

    
    public CheckPorts() {
        
        initComponents();
        
      
        this.setLocationRelativeTo(null);
        
        setVisible(true);
        setSize(350, 720);
        setResizable(false);
        setLayout(new BorderLayout());
	
        
        jTextArea1.setEditable(false);
        
         try {
            Process p = Runtime.getRuntime().exec("cmd /C netstat -an");
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            while ((line = in.readLine()) != null) {
                jTextArea1.append(line+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lucikker\\Desktop\\Health-care-data-security-icon.png")); // NOI18N

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setText("<= back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(118, 118, 118))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Main().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckPorts();
                 
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
