/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afvink6;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.*;
public class JFrame extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    public JFrame() {
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

        jPanel3 = new javax.swing.JPanel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jFileChooser1 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("afvink6");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("sequentie");

        jLabel2.setText("percentage");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );

        jButton1.setText("analyseer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setText("bestand");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("bestand");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("textveld");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(77, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jLabel1))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jRadioButton1.isSelected()) {
            int reply;
            File selectedFile;
            fileChooser = new JFileChooser();
            reply = fileChooser.showOpenDialog(this);
            if (reply == JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();
                jTextField2.setText(selectedFile.getAbsolutePath());
                readFile();
            }
        }
        else if (jRadioButton2.isSelected()){
            String seq = jTextArea1.getText();
            teken(seq);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    public void readFile() {

        try {
            String seq = "";
            inFile = new BufferedReader(new FileReader(jTextField2.getText()));
            jTextArea1.setText("");
            String line;
            while ((line = inFile.readLine()) != null) {
                seq += line;
                teken(seq);
                jTextArea1.append(line + "\n");
            }
            inFile.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "File Error: " + e.toString());
        }
    }

    private void teken(String seq) {
        // input = jTextArea1.getText();
        input = seq.toUpperCase();
        int[] getallen = bereken(input);
        Graphics paper = jPanel1.getGraphics();
        paper.setColor(new java.awt.Color(0, 255, 255));
        paper.fillRect(0, 0, 255, 255);
        paper.setColor(Color.MAGENTA);
        paper.fillRect(0, 10, getallen[0] * 2, 25);
        paper.setColor(Color.YELLOW);
        paper.fillRect(0, 50, getallen[1] * 2, 25);
        paper.setColor(Color.black);
        paper.drawString("apolair: " + getallen[0] + "%", 3, 27);
        paper.drawString("polair: " + getallen[1] + "%", 3, 68);
    }

    private int[] bereken(String inp) {
        double hyfoob = 0;
        double hyfiel = 0;
        int hyfoob2 = 0;
        int hyfiel2 = 0;
        int niet = 0;
        for (int i = 0; i < inp.length(); i++) {
            inp2 = inp.substring(i, i + 1);
            if (foob(inp2)) {
                hyfoob++;
            } else if (fiel(inp2)) {
                hyfiel++;
            } else {
                JOptionPane.showMessageDialog(null, "dit is geen aminozuur:" + inp2+"\n mogelijk zijn er meer fouten in de sequentie");
                int [] getallen = {0, 0};
                return getallen;

            }
        }
        try {
            hyfoob = (hyfoob / inp.length()) * 100;
            hyfiel = (hyfiel / inp.length()) * 100;
            hyfoob2 = (int) Math.round(hyfoob);
            hyfiel2 = (int) Math.round(hyfiel);

        } catch (ArithmeticException ae) {
            JOptionPane.showMessageDialog(null, "je hebt niets ingevult");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "er is iets mis gegaan tijdens het berekennen");
        }
        int[] getallen = {hyfoob2, hyfiel2};

        return getallen;

    }

    private boolean foob(String letter) {
        boolean a = false;
        for (String hydrofoob1 : hydrofoob) {
            if (hydrofoob1.equals(letter)) {
                a = true;
            }
        }
        return a;
    }

    private boolean fiel(String letter) {
        boolean a = false;
        for (String hydrofiel1 : hydrofiel) {
            if (hydrofiel1.equals(letter)) {
                a = true;
            }
        }
        return a;
    }

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    static final String[] hydrofoob = {"A", "F", "I", "L", "M", "P", "W", "V"};
    static final String[] hydrofiel = {"R", "N", "D", "C", "Q", "E", "G", "H", "K", "S", "T", "Y"};

    private BufferedReader inFile;
    private JFileChooser fileChooser;
    String input, inp2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
