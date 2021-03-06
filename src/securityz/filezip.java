/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package securityz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.*;
import java.nio.file.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Rushi Dada
 */
public class filezip extends javax.swing.JFrame {

    /**
     * Creates new form filezip
     */
    public filezip() {
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

        jButton1 = new javax.swing.JButton();
        zPath = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        rbFile = new javax.swing.JRadioButton();
        rbFolder = new javax.swing.JRadioButton();
        jLabel92 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 102));
        jButton1.setText(org.openide.util.NbBundle.getMessage(filezip.class, "filezip.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        zPath.setText(org.openide.util.NbBundle.getMessage(filezip.class, "filezip.zPath.text")); // NOI18N
        zPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zPathActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(org.openide.util.NbBundle.getMessage(filezip.class, "filezip.jLabel2.text")); // NOI18N

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText(org.openide.util.NbBundle.getMessage(filezip.class, "filezip.jButton3.text")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 0)));

        rbFile.setText(org.openide.util.NbBundle.getMessage(filezip.class, "filezip.rbFile.text")); // NOI18N
        rbFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbFileMouseClicked(evt);
            }
        });

        rbFolder.setText(org.openide.util.NbBundle.getMessage(filezip.class, "filezip.rbFolder.text")); // NOI18N
        rbFolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbFolderMouseClicked(evt);
            }
        });

        jLayeredPane1.setLayer(rbFile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(rbFolder, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbFolder)
                    .addComponent(rbFile))
                .addGap(21, 21, 21))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(rbFile)
                .addGap(18, 18, 18)
                .addComponent(rbFolder)
                .addGap(19, 19, 19))
        );

        jLabel92.setBackground(new java.awt.Color(255, 204, 0));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText(org.openide.util.NbBundle.getMessage(filezip.class, "filezip.jLabel92.text")); // NOI18N
        jLabel92.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel92.setOpaque(true);
        jLabel92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel92MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(59, 59, 59)
                .addComponent(zPath, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(zPath, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(2, 2, 2)))
                .addGap(93, 93, 93)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
 public class zipFile {
 
        /**
         *
         * @param filePath
         */
        public void zipFile(String filePath) {
        String zipFileName = "";
            try {
            File file = new File(filePath);
            String nm = file.getName();
            if(nm.contains("."))
            {
                String[] temp;
                String c = nm.split("\\.")[0]; 
                String d = nm.split("\\.")[1];
                nm = c;

            }
            zipFileName = file.getParent();
 
            FileOutputStream fos = new FileOutputStream(zipFileName.concat("\\" + nm + ".zip"));
            ZipOutputStream zos = new ZipOutputStream(fos);
 
            zos.putNextEntry(new ZipEntry(file.getName()));
 
            byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            zos.write(bytes, 0, bytes.length);
            zos.closeEntry();
            zos.close();
 
        } catch (FileNotFoundException ex) {
            System.err.format("The file %s does not exist", filePath);
        } catch (IOException ex) {
            System.err.println("I/O error: " + ex);
        }
    }
    }
    
    
 public class Zipper {

public String zipFiles(String srcDir) {
String zipFile;
    try {
File srcFile = new File(srcDir);
File[] files = srcFile.listFiles();
String name = srcFile.getName();

if(name.contains("."))
{
    
    String a = name.split("\\.")[0]; 
    String b = name.split("\\.")[1];
    name = a;

}
zipFile = srcDir;
System.out.println(zipFile);
FileOutputStream fos = new FileOutputStream(zipFile.concat("\\" + name + ".zip"));

ZipOutputStream zos = new ZipOutputStream(fos);

for (int i = 0; i < files.length; i++) {

// create byte buffer
byte[] buffer = new byte[1024];

FileInputStream fis = new FileInputStream(files[i]);

zos.putNextEntry(new ZipEntry(files[i].getName()));

int length;

while ((length = fis.read(buffer)) > 0) {
zos.write(buffer, 0, length);
}

zos.closeEntry();

// close the InputStream
fis.close();

}
zos.close();
}
//
catch (Exception e)
{return e.getMessage();}
return zipFile;
}

}
    
 
 //To zip Single file
 
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (zPath.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "Please Choose Source Path");
        }
        
        
        if (!rbFile.isSelected() && !rbFolder.isSelected())
       {
           JOptionPane.showMessageDialog(null, "Please Select File//Folder Option");
           
       }
       if (rbFolder.isSelected())
       {
            Zipper zp = new Zipper();
           zp.zipFiles(zPath.getText());
            System.out.println("Done");
            zPath.setText("");
            JOptionPane.showMessageDialog(null, "All files are zipped successfully!");
       }
       
       if (rbFile.isSelected())
       {
           String filePath = zPath.getText();
        
        zipFile zz = new zipFile();
        zz.zipFile(filePath);
        System.out.println("Done");
        zPath.setText("");
        JOptionPane.showMessageDialog(null, "A file is zipped successfully!");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void zPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zPathActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String fname ="";
        JFileChooser chooser = new JFileChooser();
       
       
       if (!rbFile.isSelected() && !rbFolder.isSelected())
       {
           JOptionPane.showMessageDialog(null, "Please Select File/Folder Option");
           
       }
       
       if (rbFolder.isSelected())
       {
           
                  
       chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
       int option = chooser.showOpenDialog(null);
       chooser.setAcceptAllFileFilterUsed(false);
        if(option == JFileChooser.APPROVE_OPTION){
               File file = chooser.getSelectedFile();
               zPath.setText(file.getAbsolutePath());
            }else{
               zPath.setText("Open command canceled");
            }
       }
       if (rbFile.isSelected())
       {
           chooser.showOpenDialog(null);
           File f = chooser.getSelectedFile();
           fname = f.getAbsolutePath();
           zPath.setText(fname);
           
       }
       
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void rbFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbFileMouseClicked
        rbFolder.setSelected(false);
    }//GEN-LAST:event_rbFileMouseClicked

    private void rbFolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbFolderMouseClicked
       rbFile.setSelected(false);
    }//GEN-LAST:event_rbFolderMouseClicked

    private void jLabel92MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel92MouseClicked
        this.dispose();
        new NewJFrame().setVisible(true);
    }//GEN-LAST:event_jLabel92MouseClicked

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
            java.util.logging.Logger.getLogger(filezip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(filezip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(filezip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(filezip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new filezip().setVisible(true);
                
                
            }
        });
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JRadioButton rbFile;
    private javax.swing.JRadioButton rbFolder;
    private javax.swing.JTextField zPath;
    // End of variables declaration//GEN-END:variables
}
