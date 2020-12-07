package securityz;

import encrypt.AESencrypt;
import encrypt.AESdecrypt;
import encrypt.Decryptor;
import encrypt.Encryptor;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.openide.util.Exceptions;
import static securityz.Login.uUserName;
import static securityz.Signin.isValidIndianMobile;



public class NewJFrame extends javax.swing.JFrame {

    
    public NewJFrame() {
        initComponents();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        HomeL = new javax.swing.JLabel();
        AboutUsL = new javax.swing.JLabel();
        ContactUsL = new javax.swing.JLabel();
        LearnApp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        HomeP = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        EncryptionWithAES = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        path2 = new javax.swing.JFormattedTextField();
        jLabel87 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        DecryptionWithAES = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        path1 = new javax.swing.JFormattedTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        password1 = new javax.swing.JPasswordField();
        EncryptionWithDESP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        path = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        AboutUsP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        rushabhImage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        ContactUsP = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LearnAppP = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        CryptographyP = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        AboutEncryptionP = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        AboutDecryptionP = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        AboutAlgorithmsP = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        DESP = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        Des3P = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        AesP = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        AboutAppP1 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        SettingsP = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        AnalyticsP = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        name = new javax.swing.JFormattedTextField();
        userName = new javax.swing.JFormattedTextField();
        email = new javax.swing.JFormattedTextField();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        mobileno = new javax.swing.JFormattedTextField();
        EncryptionP = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        DecryptionWithDES = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel97 = new javax.swing.JLabel();
        pathD2 = new javax.swing.JFormattedTextField();
        ResetAccountP = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        confirmPass = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        oldPass = new javax.swing.JPasswordField();
        newPass = new javax.swing.JPasswordField();
        cp = new javax.swing.JPasswordField();
        ChangeProfile = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        ujh = new javax.swing.JLabel();
        jk = new javax.swing.JLabel();
        fjk = new javax.swing.JLabel();
        pUserName = new javax.swing.JFormattedTextField();
        pName = new javax.swing.JFormattedTextField();
        pEmail = new javax.swing.JFormattedTextField();
        rest = new javax.swing.JLabel();
        fjk1 = new javax.swing.JLabel();
        pMobile = new javax.swing.JFormattedTextField();
        DecryptionP = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(841, 680));

        jPanel1.setBackground(new java.awt.Color(186, 165, 224));
        jPanel1.setPreferredSize(new java.awt.Dimension(639, 50));

        HomeL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HomeL.setForeground(new java.awt.Color(255, 255, 51));
        HomeL.setText("Home");
        HomeL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeLMouseClicked(evt);
            }
        });

        AboutUsL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AboutUsL.setForeground(new java.awt.Color(255, 255, 51));
        AboutUsL.setText("AboutUs");
        AboutUsL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AboutUsL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutUsLMouseClicked(evt);
            }
        });

        ContactUsL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ContactUsL.setForeground(new java.awt.Color(255, 255, 51));
        ContactUsL.setText("ContactUs");
        ContactUsL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ContactUsL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContactUsLMouseClicked(evt);
            }
        });

        LearnApp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LearnApp.setForeground(new java.awt.Color(255, 255, 51));
        LearnApp.setText("Learn App");
        LearnApp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LearnApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LearnAppMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 204, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Logout");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HomeL, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(AboutUsL)
                .addGap(36, 36, 36)
                .addComponent(ContactUsL)
                .addGap(45, 45, 45)
                .addComponent(LearnApp)
                .addGap(121, 121, 121)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HomeL)
                    .addComponent(AboutUsL)
                    .addComponent(ContactUsL)
                    .addComponent(LearnApp)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setMaximumSize(new java.awt.Dimension(841, 680));
        jPanel2.setPreferredSize(new java.awt.Dimension(841, 680));
        jPanel2.setLayout(new java.awt.CardLayout());

        HomeP.setBackground(new java.awt.Color(204, 102, 255));
        HomeP.setToolTipText("");
        HomeP.setMaximumSize(new java.awt.Dimension(571, 570));

        jLabel3.setFont(new java.awt.Font("Jokerman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 204));
        jLabel3.setText("Welcome To Security-Z");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securityz/Images/encryption.PNG"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securityz/Images/decryption.PNG"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securityz/Images/setting.PNG"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securityz/Images/Book.PNG"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securityz/Images/profile (2).png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securityz/Images/mobilecontactUs.PNG"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Encryption");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Decryption");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Settings");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Learning");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Profile");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Contact Us");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securityz/Images/zip-logo.png"))); // NOI18N
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Zip");
        jLabel53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel53MouseClicked(evt);
            }
        });

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securityz/Images/images.jpeg"))); // NOI18N
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Unzip");
        jLabel55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55MouseClicked(evt);
            }
        });

        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securityz/Images/send (1).jpg"))); // NOI18N
        jLabel76.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel76MouseClicked(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("Send Email");
        jLabel77.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel77MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HomePLayout = new javax.swing.GroupLayout(HomeP);
        HomeP.setLayout(HomePLayout);
        HomePLayout.setHorizontalGroup(
            HomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(HomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HomePLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(HomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47)
                            .addGroup(HomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(HomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HomePLayout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jLabel16))
                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93)
                .addGroup(HomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(74, 74, 74)
                .addGroup(HomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePLayout.createSequentialGroup()
                        .addGroup(HomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePLayout.createSequentialGroup()
                        .addGroup(HomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(HomePLayout.createSequentialGroup()
                        .addGroup(HomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(HomePLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HomePLayout.setVerticalGroup(
            HomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(HomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomePLayout.createSequentialGroup()
                        .addGroup(HomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)))
                        .addGap(40, 40, 40)
                        .addGroup(HomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(HomePLayout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel53)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel25)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePLayout.createSequentialGroup()
                                .addGroup(HomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel54))
                                .addGroup(HomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(HomePLayout.createSequentialGroup()
                                        .addGroup(HomePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel55)
                                            .addComponent(jLabel77))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel26))
                                    .addGroup(HomePLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel27)))
                                .addGap(33, 33, 33))))
                    .addGroup(HomePLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24))))
        );

        jPanel2.add(HomeP, "card5");

        EncryptionWithAES.setBackground(new java.awt.Color(153, 153, 255));
        EncryptionWithAES.setMaximumSize(new java.awt.Dimension(841, 680));
        EncryptionWithAES.setPreferredSize(new java.awt.Dimension(841, 680));

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 204, 102));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("Encryption with AES");

        jButton4.setBackground(new java.awt.Color(0, 204, 204));
        jButton4.setText("Enter Folder Path here");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        path2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel87.setBackground(new java.awt.Color(204, 204, 204));
        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("Encrypt File ");
        jLabel87.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel87.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel87.setOpaque(true);
        jLabel87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel87MouseClicked(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 204, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("<Back");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("Password");
        jLabel75.setOpaque(true);

        password.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                passwordAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout EncryptionWithAESLayout = new javax.swing.GroupLayout(EncryptionWithAES);
        EncryptionWithAES.setLayout(EncryptionWithAESLayout);
        EncryptionWithAESLayout.setHorizontalGroup(
            EncryptionWithAESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptionWithAESLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncryptionWithAESLayout.createSequentialGroup()
                .addGap(0, 222, Short.MAX_VALUE)
                .addGroup(EncryptionWithAESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncryptionWithAESLayout.createSequentialGroup()
                        .addGroup(EncryptionWithAESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(EncryptionWithAESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(path2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncryptionWithAESLayout.createSequentialGroup()
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncryptionWithAESLayout.createSequentialGroup()
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)))
                .addGap(126, 126, 126))
        );
        EncryptionWithAESLayout.setVerticalGroup(
            EncryptionWithAESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptionWithAESLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(EncryptionWithAESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(path2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(EncryptionWithAESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );

        jPanel2.add(EncryptionWithAES, "card15");

        DecryptionWithAES.setBackground(new java.awt.Color(153, 153, 255));
        DecryptionWithAES.setMaximumSize(new java.awt.Dimension(841, 680));
        DecryptionWithAES.setPreferredSize(new java.awt.Dimension(841, 680));
        DecryptionWithAES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DecryptionWithAESMouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setText("Enter Folder Path here");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        path1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        path1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                path1ActionPerformed(evt);
            }
        });

        jLabel49.setBackground(new java.awt.Color(204, 204, 204));
        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Decrypt File ");
        jLabel49.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel49.setOpaque(true);
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 204, 102));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("Decryption with AES");

        jLabel89.setBackground(new java.awt.Color(255, 204, 0));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("<Back");
        jLabel89.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel89.setOpaque(true);
        jLabel89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel89MouseClicked(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("Password");
        jLabel71.setOpaque(true);

        password1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                password1AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout DecryptionWithAESLayout = new javax.swing.GroupLayout(DecryptionWithAES);
        DecryptionWithAES.setLayout(DecryptionWithAESLayout);
        DecryptionWithAESLayout.setHorizontalGroup(
            DecryptionWithAESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DecryptionWithAESLayout.createSequentialGroup()
                .addGroup(DecryptionWithAESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DecryptionWithAESLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(DecryptionWithAESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DecryptionWithAESLayout.createSequentialGroup()
                                .addGroup(DecryptionWithAESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(DecryptionWithAESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(path1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DecryptionWithAESLayout.createSequentialGroup()
                                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DecryptionWithAESLayout.createSequentialGroup()
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)))))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        DecryptionWithAESLayout.setVerticalGroup(
            DecryptionWithAESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DecryptionWithAESLayout.createSequentialGroup()
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(DecryptionWithAESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(path1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(DecryptionWithAESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305))
        );

        jPanel2.add(DecryptionWithAES, "card16");

        EncryptionWithDESP.setBackground(new java.awt.Color(153, 153, 255));
        EncryptionWithDESP.setMaximumSize(new java.awt.Dimension(841, 680));
        EncryptionWithDESP.setPreferredSize(new java.awt.Dimension(841, 680));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Encryption with DES");

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setText("Enter Folder Path here");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        path.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Encrypt File ");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel88.setBackground(new java.awt.Color(255, 204, 0));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("<Back");
        jLabel88.setOpaque(true);
        jLabel88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel88MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EncryptionWithDESPLayout = new javax.swing.GroupLayout(EncryptionWithDESP);
        EncryptionWithDESP.setLayout(EncryptionWithDESPLayout);
        EncryptionWithDESPLayout.setHorizontalGroup(
            EncryptionWithDESPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptionWithDESPLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(EncryptionWithDESPLayout.createSequentialGroup()
                .addGroup(EncryptionWithDESPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EncryptionWithDESPLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EncryptionWithDESPLayout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EncryptionWithDESPLayout.setVerticalGroup(
            EncryptionWithDESPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptionWithDESPLayout.createSequentialGroup()
                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(116, 116, 116)
                .addGroup(EncryptionWithDESPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(458, 458, 458))
        );

        jPanel2.add(EncryptionWithDESP, "card14");

        AboutUsP.setBackground(new java.awt.Color(51, 51, 51));
        AboutUsP.setMaximumSize(new java.awt.Dimension(571, 570));
        AboutUsP.setPreferredSize(new java.awt.Dimension(571, 570));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("I am Persuing BCA Last Year ,\nAnd I Made this Project for our Final year project Submission.\n\nA big Thanks To all Our respected Teachers who Guided me to Make this Project.");
        jScrollPane1.setViewportView(jTextArea1);

        rushabhImage.setBackground(new java.awt.Color(204, 0, 204));
        rushabhImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rushabhImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securityz/Images/rushabh.jpg"))); // NOI18N
        rushabhImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(3);
        jTextArea2.setTabSize(7);
        jTextArea2.setText("Rushbh D. Patil\n\nT.Y.BBA(CA)\n\nMMCC.Pune");
        jTextArea2.setAutoscrolls(false);
        jTextArea2.setBorder(null);
        jTextArea2.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout AboutUsPLayout = new javax.swing.GroupLayout(AboutUsP);
        AboutUsP.setLayout(AboutUsPLayout);
        AboutUsPLayout.setHorizontalGroup(
            AboutUsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutUsPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(AboutUsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(AboutUsPLayout.createSequentialGroup()
                        .addComponent(rushabhImage)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        AboutUsPLayout.setVerticalGroup(
            AboutUsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutUsPLayout.createSequentialGroup()
                .addGroup(AboutUsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AboutUsPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rushabhImage))
                    .addGroup(AboutUsPLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(438, Short.MAX_VALUE))
        );

        jPanel2.add(AboutUsP, "card5");

        ContactUsP.setBackground(new java.awt.Color(51, 51, 51));
        ContactUsP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        ContactUsP.setForeground(new java.awt.Color(51, 51, 51));
        ContactUsP.setMaximumSize(new java.awt.Dimension(841, 680));
        ContactUsP.setPreferredSize(new java.awt.Dimension(841, 680));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Mobile No-   (+91) 9096339183");
        jLabel4.setIconTextGap(5);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("WhatsApp-  (+91) 9096339183");
        jLabel5.setIconTextGap(5);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("FaceBook -  https://www.facebook.com/rushabh.patil1");
        jLabel7.setIconTextGap(5);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Instagram -  https://www.instagram.com/rushabhpatil_rp/");
        jLabel8.setIconTextGap(5);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securityz/Images/Instagram-512.png"))); // NOI18N

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securityz/Images/faceBook.PNG"))); // NOI18N

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securityz/Images/whatsapp1.jpg"))); // NOI18N

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securityz/Images/mobile-phone-logo-png-1.png"))); // NOI18N

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 51));
        jLabel50.setText("If You want to Support Us for This Types of Services.");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("You can Contact Us By Following Contact Informations, Thank you.");

        javax.swing.GroupLayout ContactUsPLayout = new javax.swing.GroupLayout(ContactUsP);
        ContactUsP.setLayout(ContactUsPLayout);
        ContactUsPLayout.setHorizontalGroup(
            ContactUsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactUsPLayout.createSequentialGroup()
                .addGroup(ContactUsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContactUsPLayout.createSequentialGroup()
                        .addGroup(ContactUsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContactUsPLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel14))
                            .addGroup(ContactUsPLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(ContactUsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addGroup(ContactUsPLayout.createSequentialGroup()
                                .addGroup(ContactUsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(70, 70, 70)
                                .addGroup(ContactUsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ContactUsPLayout.createSequentialGroup()
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ContactUsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel50)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContactUsPLayout.setVerticalGroup(
            ContactUsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactUsPLayout.createSequentialGroup()
                .addGroup(ContactUsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContactUsPLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContactUsPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addGap(75, 75, 75)
                        .addGroup(ContactUsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addGroup(ContactUsPLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(ContactUsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContactUsPLayout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContactUsPLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)))
                        .addGroup(ContactUsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContactUsPLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContactUsPLayout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel34)))))
                .addGap(235, 235, 235))
        );

        jPanel2.add(ContactUsP, "card2");

        LearnAppP.setMaximumSize(new java.awt.Dimension(841, 680));
        LearnAppP.setPreferredSize(new java.awt.Dimension(841, 680));

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        jLabel6.setBackground(new java.awt.Color(0, 102, 255));
        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Index");

        jLabel37.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });

        jLabel38.setBackground(new java.awt.Color(204, 51, 255));
        jLabel38.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Cryptography");
        jLabel38.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 0), 2, true));
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel38.setOpaque(true);
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });

        jLabel39.setBackground(new java.awt.Color(204, 51, 255));
        jLabel39.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Encryption");
        jLabel39.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 0), 2, true));
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel39.setOpaque(true);
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });

        jLabel40.setBackground(new java.awt.Color(204, 51, 255));
        jLabel40.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Decryption");
        jLabel40.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 0), 2, true));
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel40.setOpaque(true);
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });

        jLabel41.setBackground(new java.awt.Color(204, 51, 255));
        jLabel41.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Algorithms");
        jLabel41.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 0), 2, true));
        jLabel41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel41.setOpaque(true);
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });

        jLabel42.setBackground(new java.awt.Color(204, 51, 255));
        jLabel42.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("DES");
        jLabel42.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 0), 2, true));
        jLabel42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel42.setOpaque(true);
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });

        jLabel43.setBackground(new java.awt.Color(204, 51, 255));
        jLabel43.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Triple DES");
        jLabel43.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 0), 2, true));
        jLabel43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel43.setOpaque(true);
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });

        jLabel44.setBackground(new java.awt.Color(204, 51, 255));
        jLabel44.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("AES");
        jLabel44.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 0), 2, true));
        jLabel44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel44.setOpaque(true);
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 153));
        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("<Back");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel37))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275))
        );

        jPanel4.setLayout(new java.awt.CardLayout());

        CryptographyP.setBackground(new java.awt.Color(255, 255, 255));
        CryptographyP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane6.setViewportView(null);

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.setText("Cryptography — the science of secret writing — is an ancient art; \nthe first documented use of cryptography in writing dates back to circa 1900 B.C. \nwhen an Egyptian scribe used non-standard hieroglyphs in an inscription. Some experts\n argue that cryptography appeared spontaneously sometime after writing was invented,\n with applications ranging from diplomatic missives to war-time battle plans. It is \nno surprise, then, that new forms of cryptography came soon after the widespread \ndevelopment of computer communications. In data and telecommunications, cryptography \nis necessary when communicating over any untrusted medium, which includes just about \nany network, particularly the Internet.\n\nThere are five primary functions of cryptography today:\n\nPrivacy/confidentiality:\n     Ensuring that no one can read the message except the intended receiver.\nAuthentication:\n     The process of proving one's identity.\nIntegrity:\n     Assuring the receiver that the received message has not been altered in any \n    way from the original.\nNon-repudiation:\n     A mechanism to prove that the sender really sent this message.\nKey exchange:\n     The method by which crypto keys are shared between sender and receiver.\n\nIn cryptography, we start with the unencrypted data, referred to as plaintext. \nPlaintext is encrypted into ciphertext, which will in turn (usually) be decrypted\n back into usable plaintext. The encryption and decryption is based upon the type\n of cryptography scheme being employed and some form of key. For those who like \nformulas, this process is sometimes written as:\n\nC = Ek(P)\nP = Dk(C)\n\n      where P = plaintext, C = ciphertext, E = the encryption method, \nD = the decryption method, and k = the key.");
        jScrollPane6.setViewportView(jTextArea6);

        CryptographyP.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 600, 490));

        jPanel4.add(CryptographyP, "card5");

        AboutEncryptionP.setBackground(new java.awt.Color(255, 255, 255));

        jLabel48.setForeground(java.awt.Color.white);
        jLabel48.setText("<Previous");

        jLabel83.setForeground(new java.awt.Color(240, 240, 240));
        jLabel83.setText("Next>");

        jTextArea7.setEditable(false);
        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jTextArea7.setText("In cryptography, encryption is the process of encoding a message or information in \nsuch a way that only authorized parties can access it and those who are not \nauthorized cannot. Encryption does not itself prevent interference, but denies the \nintelligible content to a would-be interceptor. In an encryption scheme, the \nintended information or message, referred to as plaintext, is encrypted using an \nencryption algorithm – a cipher – generating ciphertext that can be read only if \ndecrypted. For technical reasons, an encryption scheme usually uses a pseudo-random \nencryption key generated by an algorithm. It is in principle possible to decrypt the\nmessage without possessing the key, but, for a well-designed encryption scheme, \nconsiderable computational resources and skills are required. An authorized recipient\ncan easily decrypt the message with the key provided by the originator to recipients\nbut not to unauthorized users.\n\nSymmetric key\nIn symmetric-key schemes,\n{1}The encryption and decryption keys are the same. Communicating parties must \nhave the same key in order to achieve secure communication. \nAn example of a symmetric key is the German military's Enigma Machine. \nThere were key settings for each day. When the Allies figured out how the machine\nworked, they were able to decipher the information encoded within the messages as \nsoon as they could discover the encryption key for a given day's transmissions.\n\nPublic key\n\nIllustration of how encryption is used within servers Public key encryption.\nIn public-key encryption schemes, the encryption key is published for anyone to \nuse and encrypt messages. However, only the receiving party has access to the \ndecryption key that enables messages to be read.\n[2] Public-key encryption was first described in a secret document in 1973;\n[3] before then all encryption schemeswere symmetric-key (also called private-key).\n[4]:478. Although published subsequently, the work of Diffie and Hellman, was \npublished in a journal with a large readership, and the value of the methodology \nwas explicitly described.\n[5] and the method became known as the Diffie Hellman key exchange.\n");
        jScrollPane7.setViewportView(jTextArea7);

        javax.swing.GroupLayout AboutEncryptionPLayout = new javax.swing.GroupLayout(AboutEncryptionP);
        AboutEncryptionP.setLayout(AboutEncryptionPLayout);
        AboutEncryptionPLayout.setHorizontalGroup(
            AboutEncryptionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutEncryptionPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AboutEncryptionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AboutEncryptionPLayout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel83)
                        .addContainerGap(604, Short.MAX_VALUE))
                    .addGroup(AboutEncryptionPLayout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                        .addGap(139, 139, 139))))
        );
        AboutEncryptionPLayout.setVerticalGroup(
            AboutEncryptionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutEncryptionPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                .addGroup(AboutEncryptionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(jLabel48))
                .addGap(15, 15, 15))
        );

        jPanel4.add(AboutEncryptionP, "card6");

        AboutDecryptionP.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea9.setEditable(false);
        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jTextArea9.setText("Definition - What does Decryption mean?\n\nDecryption is the process of transforming data that has been rendered unreadable \nthrough encryption back to its unencrypted form. In decryption, the system \nextracts and converts the garbled data and transforms it to texts and images \nthat are easily understandable not only by the reader but also by the system. \nDecryption may be accomplished manually or automatically.It may also be performed \nwith a set of keys or passwords.\n\n\nExplains Decryption:-\nOne of the foremost reasons for implementing an encryption-decryption \nsystem is privacy. As information travels over the World Wide Web, it becomes \nsubject to scrutiny and access from unauthorized individuals or organizations. \nAs a result, data is encrypted to reduce data loss and theft. Some of the common \nitems that are encrypted include email messages, text files, images, user data \nand directories. \nThe person in charge of decryption receives a prompt or window \nin which a password may be entered to access encrypted information");
        jScrollPane9.setViewportView(jTextArea9);

        javax.swing.GroupLayout AboutDecryptionPLayout = new javax.swing.GroupLayout(AboutDecryptionP);
        AboutDecryptionP.setLayout(AboutDecryptionPLayout);
        AboutDecryptionPLayout.setHorizontalGroup(
            AboutDecryptionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutDecryptionPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        AboutDecryptionPLayout.setVerticalGroup(
            AboutDecryptionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutDecryptionPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(373, Short.MAX_VALUE))
        );

        jPanel4.add(AboutDecryptionP, "card7");

        AboutAlgorithmsP.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea10.setEditable(false);
        jTextArea10.setColumns(20);
        jTextArea10.setRows(5);
        jTextArea10.setText("1. Triple DES\nTriple DES was designed to replace the original Data Encryption Standard (DES) \nalgorithm, which hackers eventually learned to defeat with relative ease. \nAt one time, Triple DES was the recommended standard and the most widely used \nsymmetric algorithm in the industry.\n\nTriple DES uses three individual keys with 56 bits each. The total key length adds \nup to 168 bits, but experts would argue that 112-bits in key strength is more like\n it.\n\nDespite slowly being phased out, Triple DES still manages to make a dependable \nhardware encryption solution for financial services and other industries.\n\n2. RSA\nRSA is a public-key encryption algorithm and the standard for encrypting data sent\n over the internet. It also happens to be one of the methods used in our PGP and \nGPG programs.\n\nUnlike Triple DES, RSA is considered an asymmetric algorithm due to its use of a \npair of keys. You’ve got your public key, which is what we use to encrypt our \nmessage, and a private key to decrypt it. The result of RSA encryption is a \nhuge batch of mumbo jumbo that takes attackers quite a bit of time and \nprocessing power to break.");
        jScrollPane10.setViewportView(jTextArea10);

        javax.swing.GroupLayout AboutAlgorithmsPLayout = new javax.swing.GroupLayout(AboutAlgorithmsP);
        AboutAlgorithmsP.setLayout(AboutAlgorithmsPLayout);
        AboutAlgorithmsPLayout.setHorizontalGroup(
            AboutAlgorithmsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutAlgorithmsPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
        );
        AboutAlgorithmsPLayout.setVerticalGroup(
            AboutAlgorithmsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutAlgorithmsPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                .addGap(135, 135, 135))
        );

        jPanel4.add(AboutAlgorithmsP, "card8");

        DESP.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea11.setEditable(false);
        jTextArea11.setColumns(20);
        jTextArea11.setRows(5);
        jTextArea11.setText("The Data Encryption Standard (DES) is a symmetric-key block cipher published\n by the National Institute of Standards and Technology (NIST).\n\nDES is an implementation of a Feistel Cipher. It uses 16 round Feistel \nstructure. The block size is 64-bit. Though, key length is 64-bit, DES has an\n effective key length of 56 bits, since 8 of the 64 bits of the key are not used\n by the encryption algorithm (function as check bits only).\n\nDES Analysis\nThe DES satisfies both the desired properties of block cipher. These two \nproperties make cipher very strong.\n\nAvalanche effect − A small change in plaintext results in the very great chang\ne in the ciphertext.\n\nCompleteness − Each bit of ciphertext depends on many bits of plaintext.\n\nDuring the last few years, cryptanalysis have found some weaknesses in DES when \nkey selected are weak keys. These keys shall be avoided.\n\nDES has proved to be a very well designed block cipher. There have been no\n significant cryptanalytic attacks on DES other than exhaustive key search.");
        jScrollPane11.setViewportView(jTextArea11);

        javax.swing.GroupLayout DESPLayout = new javax.swing.GroupLayout(DESP);
        DESP.setLayout(DESPLayout);
        DESPLayout.setHorizontalGroup(
            DESPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DESPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        DESPLayout.setVerticalGroup(
            DESPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DESPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                .addGap(128, 128, 128))
        );

        jPanel4.add(DESP, "card9");

        Des3P.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea12.setEditable(false);
        jTextArea12.setColumns(20);
        jTextArea12.setRows(5);
        jTextArea12.setText("The speed of exhaustive key searches against DES after 1990 began to cause \ndiscomfort amongst users of DES. However, users did not want to replace DES as it\n takes an enormous amount of time and money to change encryption algorithms that \nare widely adopted and embedded in large security architectures.\n\nThe pragmatic approach was not to abandon the DES completely, but to change the \nmanner in which DES is used. This led to the modified schemes of Triple DES \n(sometimes known as 3DES).\n\nIncidentally, there are two variants of Triple DES known as 3-key Triple DES \n(3TDES) and 2-key Triple DES (2TDES).\n\n3-KEY Triple DES\nBefore using 3TDES, user first generate and distribute a 3TDES key K, which \nconsists of three different DES keys K1, K2 and K3. This means that the actual \n3TDES key has length 3×56 = 168 bits.");
        jScrollPane12.setViewportView(jTextArea12);

        javax.swing.GroupLayout Des3PLayout = new javax.swing.GroupLayout(Des3P);
        Des3P.setLayout(Des3PLayout);
        Des3PLayout.setHorizontalGroup(
            Des3PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Des3PLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        Des3PLayout.setVerticalGroup(
            Des3PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Des3PLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                .addGap(123, 123, 123))
        );

        jPanel4.add(Des3P, "card10");

        AesP.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea13.setEditable(false);
        jTextArea13.setColumns(20);
        jTextArea13.setRows(5);
        jTextArea13.setText("The more popular and widely adopted symmetric encryption algorithm likely to be \nencountered nowadays is the Advanced Encryption Standard (AES). It is found at\n least six time faster than triple DES.\n\nA replacement for DES was needed as its key size was too small. With increasing \ncomputing power, it was considered vulnerable against exhaustive key search attack.\n Triple DES was designed to overcome this drawback but it was found slow.\n\nThe features of AES are as follows −\n\nSymmetric key symmetric block cipher\n128-bit data, 128/192/256-bit keys\nStronger and faster than Triple-DES\nProvide full specification and design details\nSoftware implementable in C and Java\nOperation of AES\nAES is an iterative rather than Feistel cipher. It is based on \n‘substitution–permutation network’. It comprises of a series of linked operations\n, some of which involve replacing inputs by specific outputs (substitutions) \nand others involve shuffling bits around (permutations).\n\nInterestingly, AES performs all its computations on bytes rather than bits. \nHence, AES treats the 128 bits of a plaintext block as 16 bytes. These 16 bytes \nare arranged in four columns and four rows for processing as a matrix −\n\n\nUnlike DES, the number of rounds in AES is variable and depends on the length\n of the key. AES uses 10 rounds for 128-bit keys, 12 rounds for 192-bit keys \nand 14 rounds for 256-bit keys. Each of these rounds uses a different 128-bit\n round key, which is calculated from the original AES key.");
        jScrollPane13.setViewportView(jTextArea13);

        javax.swing.GroupLayout AesPLayout = new javax.swing.GroupLayout(AesP);
        AesP.setLayout(AesPLayout);
        AesPLayout.setHorizontalGroup(
            AesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AesPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
        );
        AesPLayout.setVerticalGroup(
            AesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AesPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(AesP, "card2");

        AboutAppP1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securityz/Images/Cryptography12.jpg"))); // NOI18N

        javax.swing.GroupLayout AboutAppP1Layout = new javax.swing.GroupLayout(AboutAppP1);
        AboutAppP1.setLayout(AboutAppP1Layout);
        AboutAppP1Layout.setHorizontalGroup(
            AboutAppP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutAppP1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel51))
        );
        AboutAppP1Layout.setVerticalGroup(
            AboutAppP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(AboutAppP1, "card3");

        javax.swing.GroupLayout LearnAppPLayout = new javax.swing.GroupLayout(LearnAppP);
        LearnAppP.setLayout(LearnAppPLayout);
        LearnAppPLayout.setHorizontalGroup(
            LearnAppPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LearnAppPLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LearnAppPLayout.setVerticalGroup(
            LearnAppPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(LearnAppPLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(LearnAppP, "card5");

        SettingsP.setBackground(new java.awt.Color(0, 51, 51));
        SettingsP.setMaximumSize(new java.awt.Dimension(571, 570));
        SettingsP.setPreferredSize(new java.awt.Dimension(571, 570));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("<Back");
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel32.setOpaque(true);
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 204, 0));
        jLabel28.setText("Profile Setting");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 204, 0));
        jLabel33.setText("Password Setting");
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 204, 0));
        jLabel35.setText("Reset Account");
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SettingsPLayout = new javax.swing.GroupLayout(SettingsP);
        SettingsP.setLayout(SettingsPLayout);
        SettingsPLayout.setHorizontalGroup(
            SettingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsPLayout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 523, Short.MAX_VALUE))
            .addGroup(SettingsPLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(SettingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SettingsPLayout.setVerticalGroup(
            SettingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsPLayout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel35)
                .addGap(279, 279, 279))
        );

        jPanel2.add(SettingsP, "card6");

        AnalyticsP.setBackground(new java.awt.Color(153, 153, 255));
        AnalyticsP.setMaximumSize(new java.awt.Dimension(841, 680));
        AnalyticsP.setPreferredSize(new java.awt.Dimension(841, 680));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 51));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Name");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 51));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("User Name");

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 51));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("Email-ID");

        jLabel94.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(153, 0, 153));
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("Your Information");

        name.setEditable(false);
        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        userName.setEditable(false);
        userName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        email.setEditable(false);
        email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel95.setBackground(new java.awt.Color(204, 204, 204));
        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("<Back");
        jLabel95.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel95.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel95.setOpaque(true);
        jLabel95.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel95MouseClicked(evt);
            }
        });

        jLabel96.setBackground(new java.awt.Color(204, 204, 204));
        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("Edit Information?");
        jLabel96.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel96.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel96.setOpaque(true);
        jLabel96.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel96MouseClicked(evt);
            }
        });

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 51));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("Mobile Number");

        mobileno.setEditable(false);
        mobileno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout AnalyticsPLayout = new javax.swing.GroupLayout(AnalyticsP);
        AnalyticsP.setLayout(AnalyticsPLayout);
        AnalyticsPLayout.setHorizontalGroup(
            AnalyticsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnalyticsPLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 352, Short.MAX_VALUE))
            .addGroup(AnalyticsPLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(AnalyticsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AnalyticsPLayout.createSequentialGroup()
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))
                    .addGroup(AnalyticsPLayout.createSequentialGroup()
                        .addGroup(AnalyticsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel29)
                            .addComponent(jLabel91))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                        .addGroup(AnalyticsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(email)
                            .addComponent(name))
                        .addGap(117, 117, 117))
                    .addGroup(AnalyticsPLayout.createSequentialGroup()
                        .addComponent(jLabel99)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))))
        );
        AnalyticsPLayout.setVerticalGroup(
            AnalyticsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnalyticsPLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(AnalyticsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(AnalyticsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AnalyticsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AnalyticsPLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel91))
                    .addGroup(AnalyticsPLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(AnalyticsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99))
                .addGap(57, 57, 57)
                .addGroup(AnalyticsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(176, 176, 176))
        );

        jPanel2.add(AnalyticsP, "card7");

        EncryptionP.setBackground(new java.awt.Color(204, 204, 0));
        EncryptionP.setMaximumSize(new java.awt.Dimension(841, 680));
        EncryptionP.setPreferredSize(new java.awt.Dimension(841, 680));

        jLabel30.setBackground(new java.awt.Color(204, 204, 0));
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 0, 153));
        jLabel30.setText("Click on Following button to encrypt ");
        jLabel30.setOpaque(true);

        jLabel52.setBackground(new java.awt.Color(204, 255, 102));
        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Encryption With AES");
        jLabel52.setToolTipText("One Key Required");
        jLabel52.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel52.setFocusTraversalPolicyProvider(true);
        jLabel52.setOpaque(true);
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });

        jLabel92.setBackground(new java.awt.Color(255, 204, 0));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("<Back");
        jLabel92.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel92.setOpaque(true);
        jLabel92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel92MouseClicked(evt);
            }
        });

        jLabel56.setBackground(new java.awt.Color(204, 255, 102));
        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Encryption With DES");
        jLabel56.setToolTipText("One Key Required");
        jLabel56.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel56.setFocusTraversalPolicyProvider(true);
        jLabel56.setOpaque(true);
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EncryptionPLayout = new javax.swing.GroupLayout(EncryptionP);
        EncryptionP.setLayout(EncryptionPLayout);
        EncryptionPLayout.setHorizontalGroup(
            EncryptionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptionPLayout.createSequentialGroup()
                .addGroup(EncryptionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EncryptionPLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(EncryptionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(EncryptionPLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        EncryptionPLayout.setVerticalGroup(
            EncryptionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptionPLayout.createSequentialGroup()
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );

        jPanel2.add(EncryptionP, "card8");

        DecryptionWithDES.setBackground(new java.awt.Color(0, 51, 51));
        DecryptionWithDES.setForeground(new java.awt.Color(0, 153, 153));
        DecryptionWithDES.setMaximumSize(new java.awt.Dimension(841, 680));
        DecryptionWithDES.setPreferredSize(new java.awt.Dimension(841, 680));

        jLabel74.setBackground(new java.awt.Color(255, 204, 0));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("<Back");
        jLabel74.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel74.setOpaque(true);
        jLabel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel74MouseClicked(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 204, 102));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("Decryption With DES");

        jButton5.setBackground(new java.awt.Color(0, 204, 204));
        jButton5.setText("Enter Folder Path here");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel97.setBackground(new java.awt.Color(204, 204, 204));
        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("Decrypt");
        jLabel97.setToolTipText("");
        jLabel97.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel97.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel97.setOpaque(true);
        jLabel97.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel97MouseClicked(evt);
            }
        });

        pathD2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout DecryptionWithDESLayout = new javax.swing.GroupLayout(DecryptionWithDES);
        DecryptionWithDES.setLayout(DecryptionWithDESLayout);
        DecryptionWithDESLayout.setHorizontalGroup(
            DecryptionWithDESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DecryptionWithDESLayout.createSequentialGroup()
                .addGroup(DecryptionWithDESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DecryptionWithDESLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DecryptionWithDESLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(DecryptionWithDESLayout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(pathD2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        DecryptionWithDESLayout.setVerticalGroup(
            DecryptionWithDESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DecryptionWithDESLayout.createSequentialGroup()
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(DecryptionWithDESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DecryptionWithDESLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227)
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DecryptionWithDESLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(DecryptionWithDESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pathD2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(335, 335, 335))
        );

        jPanel2.add(DecryptionWithDES, "card9");

        ResetAccountP.setBackground(new java.awt.Color(51, 51, 51));
        ResetAccountP.setForeground(new java.awt.Color(255, 255, 255));
        ResetAccountP.setMaximumSize(new java.awt.Dimension(841, 680));
        ResetAccountP.setPreferredSize(new java.awt.Dimension(841, 680));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("All Data Of Your Account Will be Lost Including Keys and Your Profile Image");

        jLabel59.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Reset Account Setting");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("To Proceed Click \"Reset Account\" Button Below");

        jLabel61.setBackground(new java.awt.Color(255, 204, 0));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("<Back");
        jLabel61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel61.setOpaque(true);
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel61MouseClicked(evt);
            }
        });

        jLabel62.setBackground(new java.awt.Color(255, 255, 204));
        jLabel62.setFont(new java.awt.Font("Adams", 1, 36)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 51, 51));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Reset Account");
        jLabel62.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel62.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel62.setOpaque(true);
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel62MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ResetAccountPLayout = new javax.swing.GroupLayout(ResetAccountP);
        ResetAccountP.setLayout(ResetAccountPLayout);
        ResetAccountPLayout.setHorizontalGroup(
            ResetAccountPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResetAccountPLayout.createSequentialGroup()
                .addGroup(ResetAccountPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResetAccountPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ResetAccountPLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ResetAccountPLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ResetAccountPLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ResetAccountPLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        ResetAccountPLayout.setVerticalGroup(
            ResetAccountPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResetAccountPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(ResetAccountP, "card11");

        confirmPass.setBackground(new java.awt.Color(102, 0, 102));
        confirmPass.setMaximumSize(new java.awt.Dimension(841, 680));
        confirmPass.setPreferredSize(new java.awt.Dimension(841, 680));

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 204, 204));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Change Password");

        jLabel64.setBackground(new java.awt.Color(255, 204, 0));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("<Back");
        jLabel64.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel64.setOpaque(true);
        jLabel64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel64MouseClicked(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(240, 240, 240));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("Old Password");

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(240, 240, 240));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("New Password");

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(240, 240, 240));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Confirm Password");

        jLabel68.setBackground(new java.awt.Color(204, 204, 204));
        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(51, 0, 51));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("Change Password ");
        jLabel68.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel68.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel68.setOpaque(true);
        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel68MouseClicked(evt);
            }
        });

        oldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldPassActionPerformed(evt);
            }
        });

        cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout confirmPassLayout = new javax.swing.GroupLayout(confirmPass);
        confirmPass.setLayout(confirmPassLayout);
        confirmPassLayout.setHorizontalGroup(
            confirmPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmPassLayout.createSequentialGroup()
                .addGroup(confirmPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(confirmPassLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(confirmPassLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(confirmPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(confirmPassLayout.createSequentialGroup()
                                .addComponent(jLabel67)
                                .addGap(128, 128, 128)
                                .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(confirmPassLayout.createSequentialGroup()
                                .addGroup(confirmPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                                .addGap(128, 128, 128)
                                .addGroup(confirmPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(oldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newPass, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(confirmPassLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        confirmPassLayout.setVerticalGroup(
            confirmPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmPassLayout.createSequentialGroup()
                .addGroup(confirmPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(confirmPassLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(confirmPassLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(confirmPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(oldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(confirmPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(newPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(confirmPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        jPanel2.add(confirmPass, "card12");

        ChangeProfile.setBackground(new java.awt.Color(0, 102, 51));
        ChangeProfile.setMaximumSize(new java.awt.Dimension(841, 680));
        ChangeProfile.setPreferredSize(new java.awt.Dimension(841, 680));

        jLabel72.setBackground(new java.awt.Color(255, 204, 0));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("<Back");
        jLabel72.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel72.setOpaque(true);
        jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel72MouseClicked(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("Set Your Profile");

        ujh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ujh.setForeground(new java.awt.Color(255, 255, 51));
        ujh.setText("User Name");

        jk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jk.setForeground(new java.awt.Color(255, 255, 51));
        jk.setText("Name");

        fjk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fjk.setForeground(new java.awt.Color(255, 255, 51));
        fjk.setText("Email Id");

        pUserName.setEditable(false);
        pUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pUserNameActionPerformed(evt);
            }
        });

        pEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pEmailActionPerformed(evt);
            }
        });

        rest.setBackground(new java.awt.Color(204, 204, 204));
        rest.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rest.setText("Change");
        rest.setToolTipText("");
        rest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rest.setOpaque(true);
        rest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restMouseClicked(evt);
            }
        });

        fjk1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fjk1.setForeground(new java.awt.Color(255, 255, 51));
        fjk1.setText("Mobile Number");

        pMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pMobileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChangeProfileLayout = new javax.swing.GroupLayout(ChangeProfile);
        ChangeProfile.setLayout(ChangeProfileLayout);
        ChangeProfileLayout.setHorizontalGroup(
            ChangeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangeProfileLayout.createSequentialGroup()
                .addGroup(ChangeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChangeProfileLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ChangeProfileLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(ChangeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChangeProfileLayout.createSequentialGroup()
                                .addGroup(ChangeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ujh)
                                    .addComponent(jk)
                                    .addComponent(fjk))
                                .addGap(97, 97, 97))
                            .addGroup(ChangeProfileLayout.createSequentialGroup()
                                .addComponent(fjk1)
                                .addGap(68, 68, 68)))
                        .addGroup(ChangeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pMobile, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(pName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pUserName, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(ChangeProfileLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ChangeProfileLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(rest, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        ChangeProfileLayout.setVerticalGroup(
            ChangeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangeProfileLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel73)
                .addGap(70, 70, 70)
                .addGroup(ChangeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ujh))
                .addGap(40, 40, 40)
                .addGroup(ChangeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jk))
                .addGap(40, 40, 40)
                .addGroup(ChangeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fjk))
                .addGap(41, 41, 41)
                .addGroup(ChangeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fjk1))
                .addGap(64, 64, 64)
                .addComponent(rest, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        jPanel2.add(ChangeProfile, "card13");

        DecryptionP.setBackground(new java.awt.Color(153, 255, 153));
        DecryptionP.setMaximumSize(new java.awt.Dimension(841, 680));
        DecryptionP.setPreferredSize(new java.awt.Dimension(841, 680));

        jLabel57.setBackground(new java.awt.Color(204, 204, 0));
        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(153, 0, 153));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Click on Following button to Decrypt ");

        jLabel69.setBackground(new java.awt.Color(204, 255, 102));
        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("Decryption With AES");
        jLabel69.setToolTipText("One Key Required");
        jLabel69.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel69.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel69.setFocusTraversalPolicyProvider(true);
        jLabel69.setOpaque(true);
        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel69MouseClicked(evt);
            }
        });

        jLabel98.setBackground(new java.awt.Color(255, 204, 0));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setText("<Back");
        jLabel98.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel98.setOpaque(true);
        jLabel98.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel98MouseClicked(evt);
            }
        });

        jLabel70.setBackground(new java.awt.Color(204, 255, 102));
        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("Decryption With DES");
        jLabel70.setToolTipText("One Key Required");
        jLabel70.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel70.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel70.setFocusTraversalPolicyProvider(true);
        jLabel70.setOpaque(true);
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel70MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DecryptionPLayout = new javax.swing.GroupLayout(DecryptionP);
        DecryptionP.setLayout(DecryptionPLayout);
        DecryptionPLayout.setHorizontalGroup(
            DecryptionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DecryptionPLayout.createSequentialGroup()
                .addGroup(DecryptionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DecryptionPLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DecryptionPLayout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addGroup(DecryptionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(218, 218, 218))
        );
        DecryptionPLayout.setVerticalGroup(
            DecryptionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DecryptionPLayout.createSequentialGroup()
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(446, 446, 446))
        );

        jPanel2.add(DecryptionP, "card8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 574, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLMouseClicked
          jPanel2.removeAll();
      
       jPanel2.add(HomeP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_HomeLMouseClicked

    private void AboutUsLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsLMouseClicked
       jPanel2.removeAll();
      
       jPanel2.add(AboutUsP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_AboutUsLMouseClicked

    private void ContactUsLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactUsLMouseClicked
        jPanel2.removeAll();
      
       jPanel2.add(ContactUsP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_ContactUsLMouseClicked

    private void LearnAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LearnAppMouseClicked
       jPanel2.removeAll();
      
       jPanel2.add(LearnAppP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_LearnAppMouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        jPanel2.removeAll();
           jPanel2.add(LearnAppP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
       jPanel2.removeAll();
           jPanel2.add(LearnAppP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
         jPanel2.removeAll();
           jPanel2.add(ContactUsP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
          jPanel2.removeAll();
           jPanel2.add(ContactUsP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
          jPanel2.removeAll();
           jPanel2.add(EncryptionP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
       jPanel2.removeAll();
           jPanel2.add(EncryptionP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
       jPanel2.removeAll();
           jPanel2.add(DecryptionP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
         jPanel2.removeAll();
           jPanel2.add(DecryptionP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        jPanel2.removeAll();
 jPanel2.add(SettingsP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
       jPanel2.removeAll();
           jPanel2.add(SettingsP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
       jPanel2.removeAll();
           jPanel2.add(AnalyticsP);
        jPanel2.repaint();
        jPanel2.revalidate();
        
         jLabel96.setVisible(false);
         try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://D://Java Project//SecurityZ//Database//Security-Z.accdb");
             
             Statement stmt=con.createStatement();
             ResultSet rs =stmt.executeQuery("select * from SLogin");
             
        while(rs.next()){
            if(rs.getString(1).equals(uUserName))
                    {
                    name.setText(rs.getString("Name"));
                     userName.setText(rs.getString("UserName"));
                     email.setText(rs.getString("Email"));
                     mobileno.setText(rs.getString("MobileNo"));
        
                    }
        }
        }catch(Exception e){
           System.out.println(e.getMessage()+""+e.getStackTrace()+""+e);
            
         }
                
             
      
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
       jPanel2.removeAll();
           jPanel2.add(AnalyticsP);
        jPanel2.repaint();
        jPanel2.revalidate();
        
         jLabel96.setVisible(false);
         try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://D://Java Project//SecurityZ//Database//Security-Z.accdb");
             
             Statement stmt=con.createStatement();
             ResultSet rs =stmt.executeQuery("select * from SLogin");
             
        while(rs.next()){
            if(rs.getString(1).equals(uUserName))
                    {
                    name.setText(rs.getString("Name"));
                     userName.setText(rs.getString("UserName"));
                     email.setText(rs.getString("Email"));
                     mobileno.setText(rs.getString("MobileNo"));
        
                    }
        }
        }catch(Exception e){
           System.out.println(e.getMessage()+""+e.getStackTrace()+""+e);
            
         }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
     
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
      jPanel4.removeAll();
           jPanel4.add(CryptographyP);
        jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        jPanel4.removeAll();
           jPanel4.add(AboutEncryptionP);
        jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        jPanel4.removeAll();
           jPanel4.add(AboutDecryptionP);
        jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
      jPanel4.removeAll();
      jPanel4.add(AboutAlgorithmsP);
        jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
       jPanel4.removeAll();
           jPanel4.add(DESP);
        jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
       jPanel4.removeAll();
           jPanel4.add(Des3P);
        jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jLabel43MouseClicked

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
         jPanel4.removeAll();
           jPanel4.add(AesP);
        jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        jPanel2.removeAll();
        jPanel2.add(HomeP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked
jPanel2.removeAll();
        jPanel2.add(SettingsP);
        jPanel2.repaint();
        jPanel2.revalidate();    }//GEN-LAST:event_jLabel61MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        jPanel2.removeAll();
        jPanel2.add(ResetAccountP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel64MouseClicked
        jPanel2.removeAll();
        jPanel2.add(SettingsP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel64MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
 jPanel2.removeAll();
        jPanel2.add(confirmPass);
        jPanel2.repaint();
        jPanel2.revalidate();    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseClicked
         jPanel2.removeAll();
        jPanel2.add(SettingsP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel72MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
       jPanel2.removeAll();
        jPanel2.add(AnalyticsP);
        jPanel2.repaint();
        jPanel2.revalidate();
        jLabel96.setVisible(true);
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://D://Java Project//SecurityZ//Database//Security-Z.accdb");
             
             Statement stmt=con.createStatement();
             ResultSet rs =stmt.executeQuery("select * from SLogin");
             
        while(rs.next()){
            if(rs.getString("UserName").equals(uUserName))
                    {
                    name.setText(rs.getString("Name"));
                     userName.setText(rs.getString("UserName"));
                     email.setText(rs.getString("Email"));
                     mobileno.setText(rs.getString("MobileNo"));
        
                    }
        }
        }catch(Exception e){
           System.out.println(e.getMessage()+""+e.getStackTrace()+""+e);
            
         }
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
       jPanel2.removeAll();
        jPanel2.add(EncryptionWithAES);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel52MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void disableWarning() {
    System.err.close();
    System.setErr(System.out);
}
    private void jLabel89MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel89MouseClicked
         jPanel2.removeAll();
        jPanel2.add(DecryptionP);
        jPanel2.repaint();
        jPanel2.revalidate();
        
    }//GEN-LAST:event_jLabel89MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        jPanel2.removeAll();
        jPanel2.add(EncryptionP);
        jPanel2.repaint();
        jPanel2.revalidate();
        fileName="";
        path2.setText(fileName);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel88MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel88MouseClicked
         jPanel2.removeAll();
        jPanel2.add(EncryptionP);
        jPanel2.repaint();
        jPanel2.revalidate();
        fileName="";
        path.setText(fileName);
    }//GEN-LAST:event_jLabel88MouseClicked

    

    private void jLabel92MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel92MouseClicked
        jPanel2.removeAll();
        jPanel2.add(HomeP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel92MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
         jPanel2.removeAll();
        jPanel2.add(HomeP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       this.dispose();
       new Login().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel87MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel87MouseClicked
        
          if (path2.getText().length()==0)
       {
           JOptionPane.showMessageDialog(null, "Please Select File Path");
           path2.requestFocus();
           
       }
        if (password.getText().length()==0)
       {
           JOptionPane.showMessageDialog(null, "Please Password");
           password.requestFocus();
           
       }
        else
        {
        fileName=path2.getText(); 
        String pass = password.getText();
        AESencrypt aes = new AESencrypt();
		File src = new File(fileName);
		int j;
        try {
            aes.AESencr(src,src,pass);
            j = 1;
        } catch (Exception ex) {
            j = 0;
            Exceptions.printStackTrace(ex);
        }
        
        if (j==1)
        {
             src.delete();
             JOptionPane.showMessageDialog(null, "Your File is Encrypted using AES");
             path2.setText("");
             password.setText("");
             path2.requestFocus();
        }
        }
	
    }//GEN-LAST:event_jLabel87MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked

    try{
        if (path.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "Please Choose Source Path");
        }
        
        
           fileName=path.getText();
        Encryptor en = Encryptor.getEncrypter(true);
		Decryptor de = Decryptor.getDecrypter(true);
		
		File src = new File(fileName);
		
		en.encrypt(src,src);
                JOptionPane.showMessageDialog(null, "Your File is Encrypted Using DES");
                path.setText("");
                
    }catch (Exception ex) {
             JOptionPane.showMessageDialog(null,ex);
            Exceptions.printStackTrace(ex);
        }
           
           
          
          
	
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked

        if (path1.getText().length()==0)
       {
           JOptionPane.showMessageDialog(null, "Please Select File Path");
           path1.requestFocus();
           
       }
        if (password1.getText().length()==0)
       {
           JOptionPane.showMessageDialog(null, "Please Password");
           password1.requestFocus();
           
       }
        else
        {
        fileName=path1.getText();         
       
		String pass1 = password1.getText();
        AESdecrypt aes = new AESdecrypt();
		File src = new File(fileName);
		int i;
        try {
            aes.AESdecr(src, src,pass1);
            i = 1;
        } catch (Exception ex) {
            i=0;
            Exceptions.printStackTrace(ex);
        }
        
        if (i==1)
        {
             src.delete();
             JOptionPane.showMessageDialog(null, "Your File is Decrypted Using AES");
             path1.setText("");
             password1.setText("");
             path1.requestFocus();
        }
        }
	
    }//GEN-LAST:event_jLabel49MouseClicked

    
    private void jLabel74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseClicked
        jPanel2.removeAll();
        jPanel2.add(DecryptionP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel74MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void changep()
    {
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://D://Java Project//SecurityZ//Database//Security-Z.accdb");
             
             Statement stmt=con.createStatement();
             ResultSet rs =stmt.executeQuery("select * from SLogin");
            while(rs.next()){
            if(rs.getString(1).equals(uUserName))
                    {
                    pName.setText(rs.getString(0));
                    pUserName.setText(rs.getString(1));
                    pEmail.setText(rs.getString(3));
                    pMobile.setText(rs.getString(4));
        
                    }
        }
             
        }catch(Exception e){
           System.out.println(e.getMessage()+""+e.getStackTrace()+""+e);
            
         }
    }
    
    
    private void jLabel96MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel96MouseClicked
     
       jPanel2.removeAll();
        jPanel2.add(ChangeProfile);
        changep();
        jPanel2.repaint();
        jPanel2.revalidate();
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://D://Java Project//SecurityZ//Database//Security-Z.accdb");
             
             Statement stmt=con.createStatement();
             ResultSet rs =stmt.executeQuery("select * from SLogin");
             
        while(rs.next()){
            if(rs.getString(1).equals(uUserName))
                    {
                    pName.setText(rs.getString("Name"));
                     pUserName.setText(rs.getString("UserName"));
                     pEmail.setText(rs.getString("Email"));
                     pMobile.setText(rs.getString("MobileNo"));
        
                    }
        }
        }catch(Exception e){
           System.out.println(e.getMessage()+""+e.getStackTrace()+""+e);
            
         }
    
        
        
       
       
       
    }//GEN-LAST:event_jLabel96MouseClicked

    private void jLabel95MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel95MouseClicked
        jPanel2.removeAll();
        jPanel2.add(HomeP);
        jPanel2.repaint();  
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel95MouseClicked

    private void oldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldPassActionPerformed
        
    }//GEN-LAST:event_oldPassActionPerformed

    private void jLabel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseClicked
        if(oldPass.getPassword().length==0)  // Checking for empty field
                 {
                     JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
                     
                 }
                 else if(newPass.getPassword().length==0)  // Checking for empty field
                 {
                     JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
                    
                 }
                 else if(cp.getPassword().length==0)  // Checking for empty field
                 {
                     JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
                     
                 }
                 else if(oldPass.getText().equals(newPass.getText()))  // Checking for empty field
                 {
                     JOptionPane.showMessageDialog(null, "New Password must be different than old password");
                     newPass.setText("");
                    cp.setText("");
                    newPass.requestFocus();
                 }
                 else if (newPass.getPassword().length < 7 || newPass.getPassword().length > 16 ||cp.getPassword().length<7||cp.getPassword().length>15)
                {
                        JOptionPane.showMessageDialog(this,"Password should be more than 7 and less than 16 characters in length.");
                        newPass.setText("");
                        cp.setText("");
                        newPass.requestFocus();
                }
            
                 else if(oldPass.getText().equals(Login.uPassword)&& newPass.getText().equals(cp.getText()))
        {
            try{ 
           //String sql= "update signin_info set password="+Login.uPassword+" where username="+ Login.uUserName;
                   Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://D://Java Project//SecurityZ//Database//Security-Z.accdb");
             
             PreparedStatement stmt = con.prepareStatement("update SLogin set password=? where userName=?"); {
      stmt.setString(1, newPass.getText());
      stmt.setString(2, Login.uUserName);
      stmt.executeUpdate();
       
     
      JOptionPane.showMessageDialog(this, "old  password changed Successfully");
                
            }  
         jPanel2.removeAll();
        jPanel2.add(SettingsP);
        jPanel2.repaint();
        jPanel2.revalidate();
        }  catch(Exception e){
           System.out.println(e.getMessage()+""+e.getStackTrace()+""+e);
            
         }
             
        }
        else
                  JOptionPane.showMessageDialog(this, "old  password is wrong or may be confirm Password is not matched");
        
            
          
        
    }//GEN-LAST:event_jLabel68MouseClicked

    private void cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpActionPerformed

    private void restMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restMouseClicked
     
      
        if(pUserName.getText().length()==0){
           
            JOptionPane.showMessageDialog(this, "Please Enter User Name");
        }else
            if(pName.getText().length()==0){
          
            JOptionPane.showMessageDialog(this, "Please Enter the Name");
           }else
             if(pEmail.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Please Enter the Email-ID ");
            }
             
             else if (!securityz.Signin.isValid(pEmail.getText())) 
            {
            JOptionPane.showMessageDialog(this,"Invalid Email-ID"); 
            pEmail.setText("");
            pEmail.requestFocus();
            }
             else
             if(pMobile.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Please Enter the Mobile Number ");
            }
             else if (!securityz.Signin.isValidIndianMobile(pMobile.getText()))
            {
            JOptionPane.showMessageDialog(this,"Invalid Mobile Number"); 
            pMobile.setText("");
            pMobile.requestFocus();
            }
             
             else{
                try{
               
                        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                        Connection con = DriverManager.getConnection("jdbc:ucanaccess://D://Java Project//SecurityZ//Database//Security-Z.accdb");
             
                        PreparedStatement stmt = con.prepareStatement("update SLogin set Name=? , Email=? , MobileNo=? where UserName=?");
                        
                        stmt.setString(1,pName.getText());
                        
                        stmt.setString(2,pEmail.getText());
                        stmt.setString(3,pMobile.getText());
                        stmt.setString(4,pUserName.getText());

                        stmt.executeUpdate();
                         JOptionPane.showMessageDialog(this, "Changes Saved successfully"); 

                             Thread.sleep(1000);
                         this.dispose();
                         new NewJFrame().setVisible(true);


                           }     

                  catch (ClassNotFoundException ex) {
                          JOptionPane.showMessageDialog(this, "Database Drivers are not found ");
                   } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, "not Valid command "+ex.getMessage());
                   } catch (InterruptedException ex) {
                       Exceptions.printStackTrace(ex);
                   }

            
            
         
            
        }
        
    }//GEN-LAST:event_restMouseClicked

    private void pEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pEmailActionPerformed

    private void jLabel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseClicked
        
        this.dispose();
        new Login_1().setVisible(true);
        

    }//GEN-LAST:event_jLabel62MouseClicked

    private void pUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pUserNameActionPerformed

    private void path1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_path1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_path1ActionPerformed

    private void jLabel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseClicked
        this.dispose();
        new filezip().setVisible(true);
    }//GEN-LAST:event_jLabel53MouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
        this.dispose();
        new filezip().setVisible(true);
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked
        this.dispose();
        new unzip().setVisible(true);
    }//GEN-LAST:event_jLabel55MouseClicked

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked
        this.dispose();
        new unzip().setVisible(true);
    }//GEN-LAST:event_jLabel54MouseClicked

    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked
        jPanel2.removeAll();
        jPanel2.add(EncryptionWithDESP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel56MouseClicked

    private void jLabel97MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel97MouseClicked

       try
       {
           if (pathD2.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "Please Choose Source Path");
        }
        
        fileName=pathD2.getText();
        Encryptor en = Encryptor.getEncrypter(true);
		Decryptor de = Decryptor.getDecrypter(true);
		
		File src = new File(fileName);
		
		de.decrypt(src,src);
                JOptionPane.showMessageDialog(null, "Your File is Decrypted Using DES");
             pathD2.setText("");
       }
       catch (Exception ex) {
             JOptionPane.showMessageDialog(null,ex);
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_jLabel97MouseClicked

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
        jPanel2.removeAll();
        jPanel2.add(DecryptionWithAES);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel69MouseClicked

    private void jLabel98MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel98MouseClicked
        jPanel2.removeAll();
        jPanel2.add(HomeP);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jLabel98MouseClicked

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked
       jPanel2.removeAll();
        jPanel2.add(DecryptionWithDES);
        jPanel2.repaint();
        jPanel2.revalidate();
        
    }//GEN-LAST:event_jLabel70MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String fname ="";
        JFileChooser chooser = new JFileChooser();
        
        
           
           chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
       int option = chooser.showOpenDialog(null);
       chooser.setAcceptAllFileFilterUsed(false);
        if(option == JFileChooser.APPROVE_OPTION){
               File file = chooser.getSelectedFile();
               path.setText(file.getAbsolutePath());
            }else{
               path.setText("Open command canceled");
            }
       
       
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        
        JFileChooser chooser = new JFileChooser();
        
        
           
          chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
       int option = chooser.showOpenDialog(null);
       chooser.setAcceptAllFileFilterUsed(false);
        if(option == JFileChooser.APPROVE_OPTION){
               File file = chooser.getSelectedFile();
               pathD2.setText(file.getAbsolutePath());
            }else{
               pathD2.setText("Open command canceled");
            }
       
      
    }//GEN-LAST:event_jButton5MouseClicked

    private void DecryptionWithAESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DecryptionWithAESMouseClicked
    String fname ="";
        JFileChooser chooser = new JFileChooser();
        
       
       
           chooser.showOpenDialog(null);
           File f = chooser.getSelectedFile();
           fname = f.getAbsolutePath();
           pathD2.setText(fname);
           
       
    }//GEN-LAST:event_DecryptionWithAESMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String fname ="";
        JFileChooser chooser = new JFileChooser();
        
        
        
           chooser.showOpenDialog(null);
           File f = chooser.getSelectedFile();
           fname = f.getAbsolutePath();
           path1.setText(fname);
           
       
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        String fname ="";
        JFileChooser chooser = new JFileChooser();
           chooser.showOpenDialog(null);
           File f = chooser.getSelectedFile();
           fname = f.getAbsolutePath();
           path2.setText(fname);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jLabel76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseClicked
        this.dispose();
        new GMail_Login().setVisible(true);
    }//GEN-LAST:event_jLabel76MouseClicked

    private void jLabel77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel77MouseClicked
        this.dispose();
        new GMail_Login().setVisible(true);
    }//GEN-LAST:event_jLabel77MouseClicked

    private void pMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pMobileActionPerformed

    private void password1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_password1AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_password1AncestorMoved

    private void passwordAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_passwordAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordAncestorMoved

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
String fileName;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AboutAlgorithmsP;
    private javax.swing.JPanel AboutAppP1;
    private javax.swing.JPanel AboutDecryptionP;
    private javax.swing.JPanel AboutEncryptionP;
    private javax.swing.JLabel AboutUsL;
    private javax.swing.JPanel AboutUsP;
    private javax.swing.JPanel AesP;
    private javax.swing.JPanel AnalyticsP;
    public static javax.swing.JPanel ChangeProfile;
    private javax.swing.JLabel ContactUsL;
    private javax.swing.JPanel ContactUsP;
    private javax.swing.JPanel CryptographyP;
    private javax.swing.JPanel DESP;
    private javax.swing.JPanel DecryptionP;
    private javax.swing.JPanel DecryptionWithAES;
    private javax.swing.JPanel DecryptionWithDES;
    private javax.swing.JPanel Des3P;
    private javax.swing.JPanel EncryptionP;
    private javax.swing.JPanel EncryptionWithAES;
    private javax.swing.JPanel EncryptionWithDESP;
    private javax.swing.JLabel HomeL;
    private javax.swing.JPanel HomeP;
    private javax.swing.JLabel LearnApp;
    private javax.swing.JPanel LearnAppP;
    private javax.swing.JPanel ResetAccountP;
    private javax.swing.JPanel SettingsP;
    private javax.swing.JPanel confirmPass;
    private javax.swing.JPasswordField cp;
    private javax.swing.JFormattedTextField email;
    private javax.swing.JLabel fjk;
    private javax.swing.JLabel fjk1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JLabel jk;
    private javax.swing.JFormattedTextField mobileno;
    private javax.swing.JFormattedTextField name;
    private javax.swing.JPasswordField newPass;
    private javax.swing.JPasswordField oldPass;
    public static javax.swing.JFormattedTextField pEmail;
    public static javax.swing.JFormattedTextField pMobile;
    public static javax.swing.JFormattedTextField pName;
    public static javax.swing.JFormattedTextField pUserName;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password1;
    private javax.swing.JFormattedTextField path;
    private javax.swing.JFormattedTextField path1;
    private javax.swing.JFormattedTextField path2;
    private javax.swing.JFormattedTextField pathD2;
    private javax.swing.JLabel rest;
    private javax.swing.JLabel rushabhImage;
    private javax.swing.JLabel ujh;
    private javax.swing.JFormattedTextField userName;
    // End of variables declaration//GEN-END:variables
}
