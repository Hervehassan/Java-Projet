package abscence_ecole.form;

import abscence_ecole.classe.Absence;
import abscence_ecole.classe.Cours;
import abscence_ecole.classe.Eleve;
import abscence_ecole.classe.Prof;
import abscence_ecole.connexion.Constant;
import abscence_ecole.gestion.gestionAbsent;
import abscence_ecole.gestion.gestionCours;
import abscence_ecole.gestion.gestionEleve;
import abscence_ecole.gestion.gestionProf;
import java.awt.*;
import java.sql.*;
import java.text.MessageFormat;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public final class Main extends javax.swing.JFrame {

    Connection cnx;
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rmd;
    DefaultTableModel dtm = new DefaultTableModel();
    
    ArrayList<String> listNumMatr = new ArrayList<>();

    public Main() {
        initComponents();
        Combo();
        comboAnne();
        comboClasseAbs();
        cours();
        comboDate();
        //comboMatricule();
        comboMatiere();
        kbtnModif.setEnabled(false);
        kbtnSupp.setEnabled(false);
        Table();
        TableProf();
        btnModifAbs.setVisible(false);
        btnSuppAbs.setVisible(false);
        btnModifProf.setEnabled(false);
        btnSuppProf.setEnabled(false);
        label();
        eleve();
        matiere();
        prof();
        tableCours();
        tableClasse();
        tableMatiere();
        lbAbs.setText("Absence");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFreeChartResources1 = new org.jfree.chart.resources.JFreeChartResources();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JLabel();
        kGradientPanel5 = new com.k33ptoo.components.KGradientPanel();
        kbtnMenu = new com.k33ptoo.components.KButton();
        jSeparator1 = new javax.swing.JSeparator();
        kbtnEleve = new com.k33ptoo.components.KButton();
        kbtnProf = new com.k33ptoo.components.KButton();
        kbtnCour = new com.k33ptoo.components.KButton();
        kbtnAbs = new com.k33ptoo.components.KButton();
        kbntDeco = new com.k33ptoo.components.KButton();
        jPanel3 = new javax.swing.JPanel();
        MenuForm = new javax.swing.JTabbedPane();
        menuForm = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClasse = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMatiere = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        btnAnnul = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        labelEleve = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelClasse = new javax.swing.JLabel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        labelProf = new javax.swing.JLabel();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        jLabel11 = new javax.swing.JLabel();
        labelMatiere = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        eleveForm = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        Élèves = new javax.swing.JLabel();
        btnAnnul1 = new javax.swing.JButton();
        kbtnInscri = new com.k33ptoo.components.KButton();
        kbtnListe = new com.k33ptoo.components.KButton();
        jTableEleve = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        labelInscri = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtMat = new javax.swing.JTextField();
        comboClasse = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtPrenom = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtLieu = new javax.swing.JTextField();
        lbPere = new javax.swing.JLabel();
        txtPere = new javax.swing.JTextField();
        lbMere = new javax.swing.JLabel();
        txtMere = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtAdresse = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtAnne = new javax.swing.JTextField();
        kGradientPanel6 = new com.k33ptoo.components.KGradientPanel();
        kbtnAjout = new com.k33ptoo.components.KButton();
        kbtnModif = new com.k33ptoo.components.KButton();
        kbtnSupp = new com.k33ptoo.components.KButton();
        kbtnEffacer = new com.k33ptoo.components.KButton();
        txtdate = new javax.swing.JFormattedTextField();
        jLabel57 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        comboRechClass = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        comboRechAnne = new javax.swing.JComboBox<>();
        recherche = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableEleve = new javax.swing.JTable();
        btnDetails = new javax.swing.JButton();
        btnImprim = new javax.swing.JButton();
        lbEleve = new javax.swing.JLabel();
        btnImprim2 = new javax.swing.JButton();
        ClasseForm = new javax.swing.JPanel();
        matiereForm = new javax.swing.JPanel();
        coursForm = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        comboClasseCour = new javax.swing.JComboBox<>();
        ComboJour = new javax.swing.JComboBox<>();
        ComboMatiereCours = new javax.swing.JComboBox<>();
        txtDateCour = new javax.swing.JFormattedTextField();
        jLabel71 = new javax.swing.JLabel();
        btnAnnul5 = new javax.swing.JButton();
        kbntEnregistre = new com.k33ptoo.components.KButton();
        jLabel75 = new javax.swing.JLabel();
        kGradientPanel9 = new com.k33ptoo.components.KGradientPanel();
        ComboCourClasse = new javax.swing.JComboBox<>();
        recherche1 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableCour = new javax.swing.JTable();
        jLabel74 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        absenceForm = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        btnAjoutAbsent = new javax.swing.JButton();
        btnListeAbsent = new javax.swing.JButton();
        btnAnnul4 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        lbAbs = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel22 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        lbJour = new javax.swing.JLabel();
        lbClassCour = new javax.swing.JLabel();
        lbMatiere = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        lbNumMat = new javax.swing.JLabel();
        lbNom = new javax.swing.JLabel();
        lbPrenom = new javax.swing.JLabel();
        lbClass = new javax.swing.JLabel();
        lbAnne = new javax.swing.JLabel();
        lbPas = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        comboCours = new javax.swing.JComboBox<>();
        comboMatricule = new javax.swing.JComboBox<>();
        btnAjoutAbs = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtaMotif = new javax.swing.JTextArea();
        lbActu = new javax.swing.JLabel();
        btnModifAbs = new javax.swing.JButton();
        btnSuppAbs = new javax.swing.JButton();
        txtDate = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtFin = new javax.swing.JFormattedTextField();
        jLabel55 = new javax.swing.JLabel();
        idtxt = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        comboClass = new javax.swing.JComboBox<>();
        jLabel61 = new javax.swing.JLabel();
        ComboDate = new javax.swing.JComboBox<>();
        btnRecherche = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableAbsent = new javax.swing.JTable();
        btnDetails1 = new javax.swing.JButton();
        lbPresent = new javax.swing.JLabel();
        lbNoAbs = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        kGradientPanel7 = new com.k33ptoo.components.KGradientPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablePresent = new javax.swing.JTable();
        jLabel77 = new javax.swing.JLabel();
        comboClassPresent = new javax.swing.JComboBox<>();
        jLabel78 = new javax.swing.JLabel();
        ComboDatePresent = new javax.swing.JComboBox<>();
        btnRecherchePresent = new javax.swing.JButton();
        btnImprim1 = new javax.swing.JButton();
        profForm = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtNomProf = new javax.swing.JTextField();
        txtPrenomProf = new javax.swing.JTextField();
        txtAdresseProf = new javax.swing.JTextField();
        txtCin = new javax.swing.JTextField();
        txtTelProf = new javax.swing.JTextField();
        btnModifProf = new javax.swing.JButton();
        btnAjoutProf = new javax.swing.JButton();
        btnSuppProf = new javax.swing.JButton();
        btnAnnulProf = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableProf = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        btnAnnul2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAnnul3 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/logo.jpg"))); // NOI18N

        txtUser.setFont(new java.awt.Font("Linux Biolinum Keyboard O", 1, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        txtUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/Contacts icon.png"))); // NOI18N
        txtUser.setText("HELLO");

        kGradientPanel5.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel5.setkStartColor(new java.awt.Color(51, 0, 204));

        kbtnMenu.setBackground(new java.awt.Color(204, 0, 204));
        kbtnMenu.setForeground(new java.awt.Color(0, 0, 0));
        kbtnMenu.setText("MENU");
        kbtnMenu.setFont(new java.awt.Font("Linux Biolinum Keyboard O", 1, 36)); // NOI18N
        kbtnMenu.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnMenu.setkEndColor(new java.awt.Color(0, 0, 0));
        kbtnMenu.setkHoverEndColor(new java.awt.Color(0, 0, 204));
        kbtnMenu.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kbtnMenu.setkHoverStartColor(new java.awt.Color(51, 51, 255));
        kbtnMenu.setkSelectedColor(new java.awt.Color(102, 255, 255));
        kbtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnMenuActionPerformed(evt);
            }
        });

        kbtnEleve.setBackground(new java.awt.Color(255, 255, 255));
        kbtnEleve.setText("Éleve");
        kbtnEleve.setFont(new java.awt.Font("C059", 1, 18)); // NOI18N
        kbtnEleve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kbtnEleve.setkBackGroundColor(new java.awt.Color(51, 51, 255));
        kbtnEleve.setkBorderRadius(20);
        kbtnEleve.setkEndColor(new java.awt.Color(0, 0, 102));
        kbtnEleve.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kbtnEleve.setkHoverStartColor(new java.awt.Color(51, 51, 51));
        kbtnEleve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnEleveActionPerformed(evt);
            }
        });

        kbtnProf.setBackground(new java.awt.Color(255, 255, 255));
        kbtnProf.setText("Professeur");
        kbtnProf.setFont(new java.awt.Font("C059", 1, 18)); // NOI18N
        kbtnProf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kbtnProf.setkBackGroundColor(new java.awt.Color(51, 51, 255));
        kbtnProf.setkBorderRadius(20);
        kbtnProf.setkEndColor(new java.awt.Color(0, 0, 102));
        kbtnProf.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kbtnProf.setkHoverStartColor(new java.awt.Color(51, 51, 51));
        kbtnProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnProfActionPerformed(evt);
            }
        });

        kbtnCour.setBackground(new java.awt.Color(255, 255, 255));
        kbtnCour.setText("Cours");
        kbtnCour.setFont(new java.awt.Font("C059", 1, 18)); // NOI18N
        kbtnCour.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kbtnCour.setkBackGroundColor(new java.awt.Color(51, 51, 255));
        kbtnCour.setkBorderRadius(20);
        kbtnCour.setkEndColor(new java.awt.Color(0, 0, 102));
        kbtnCour.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kbtnCour.setkHoverStartColor(new java.awt.Color(51, 51, 51));
        kbtnCour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnCourActionPerformed(evt);
            }
        });

        kbtnAbs.setBackground(new java.awt.Color(255, 255, 255));
        kbtnAbs.setText("Absence");
        kbtnAbs.setFont(new java.awt.Font("C059", 1, 18)); // NOI18N
        kbtnAbs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kbtnAbs.setkBackGroundColor(new java.awt.Color(51, 51, 255));
        kbtnAbs.setkBorderRadius(20);
        kbtnAbs.setkEndColor(new java.awt.Color(0, 0, 102));
        kbtnAbs.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kbtnAbs.setkHoverStartColor(new java.awt.Color(51, 51, 51));
        kbtnAbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnAbsActionPerformed(evt);
            }
        });

        kbntDeco.setForeground(new java.awt.Color(255, 0, 0));
        kbntDeco.setText("Deconnect");
        kbntDeco.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        kbntDeco.setkBorderRadius(25);
        kbntDeco.setkEndColor(new java.awt.Color(204, 204, 204));
        kbntDeco.setkForeGround(new java.awt.Color(255, 0, 0));
        kbntDeco.setkHoverForeGround(new java.awt.Color(255, 0, 0));
        kbntDeco.setkStartColor(new java.awt.Color(255, 255, 255));
        kbntDeco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbntDecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kbntDeco, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kbtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kbtnEleve, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(kbtnProf, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(kbtnCour, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(kbtnAbs, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kbtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(kbtnEleve, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kbtnProf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kbtnCour, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kbtnAbs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(kbntDeco, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(txtUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1081, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MenuForm.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        menuForm.setBackground(new java.awt.Color(255, 255, 255));

        jTableClasse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Libelle", "Nom"
            }
        ));
        jScrollPane1.setViewportView(jTableClasse);

        jLabel16.setFont(new java.awt.Font("Nimbus Roman", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 51));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Listes des classes");

        jTableMatiere.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Libelle", "Nom", "Prof"
            }
        ));
        jScrollPane2.setViewportView(jTableMatiere);

        jLabel17.setFont(new java.awt.Font("Nimbus Roman", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 51, 51));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Listes des matières");

        btnAnnul.setBackground(new java.awt.Color(255, 255, 255));
        btnAnnul.setForeground(new java.awt.Color(255, 0, 0));
        btnAnnul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/Cancel icon.jpg"))); // NOI18N
        btnAnnul.setBorder(null);
        btnAnnul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/ecole.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/facebook_48px.png"))); // NOI18N

        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/twitter_48px.png"))); // NOI18N

        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/facebook_messenger_24px.png"))); // NOI18N

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkBorderRadius(25);
        kGradientPanel1.setkEndColor(new java.awt.Color(204, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 0, 153));
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseClicked(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/Student Male_100px.png"))); // NOI18N

        labelEleve.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        labelEleve.setForeground(new java.awt.Color(255, 255, 255));
        labelEleve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Élèves");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(labelEleve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelEleve, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kGradientPanel2.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkBorderRadius(25);
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 102, 0));
        kGradientPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel2MouseClicked(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/School_80px.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Classes");

        labelClasse.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        labelClasse.setForeground(new java.awt.Color(255, 255, 255));
        labelClasse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelClasse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kGradientPanel3.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel3.setkBorderRadius(25);
        kGradientPanel3.setkEndColor(new java.awt.Color(153, 255, 204));
        kGradientPanel3.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel3MouseClicked(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/Singing Teacher_50px.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Profs");

        labelProf.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        labelProf.setForeground(new java.awt.Color(255, 255, 255));
        labelProf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(labelProf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelProf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kGradientPanel4.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel4.setkBorderRadius(25);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/Book_96px.png"))); // NOI18N

        labelMatiere.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        labelMatiere.setForeground(new java.awt.Color(255, 255, 255));
        labelMatiere.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Matières");

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMatiere, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMatiere, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout menuFormLayout = new javax.swing.GroupLayout(menuForm);
        menuForm.setLayout(menuFormLayout);
        menuFormLayout.setHorizontalGroup(
            menuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuFormLayout.createSequentialGroup()
                .addGroup(menuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuFormLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(menuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(menuFormLayout.createSequentialGroup()
                            .addGap(105, 105, 105)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menuFormLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuFormLayout.createSequentialGroup()
                        .addGap(0, 45, Short.MAX_VALUE)
                        .addGroup(menuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuFormLayout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel64)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(184, 184, 184))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuFormLayout.createSequentialGroup()
                                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(menuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuFormLayout.createSequentialGroup()
                                        .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuFormLayout.createSequentialGroup()
                                        .addComponent(btnAnnul, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21))))))))
            .addGroup(menuFormLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuFormLayout.setVerticalGroup(
            menuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuFormLayout.createSequentialGroup()
                .addComponent(btnAnnul)
                .addGap(36, 36, 36)
                .addGroup(menuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuFormLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuFormLayout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(menuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );

        MenuForm.addTab("tab7", menuForm);

        eleveForm.setBackground(new java.awt.Color(255, 255, 255));
        eleveForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(255, 255, 204));

        Élèves.setFont(new java.awt.Font("Linux Biolinum Keyboard O", 1, 48)); // NOI18N
        Élèves.setForeground(new java.awt.Color(0, 0, 204));
        Élèves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Élèves.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/Student Male_100px.png"))); // NOI18N
        Élèves.setText("Élèves");

        btnAnnul1.setBackground(new java.awt.Color(255, 255, 255));
        btnAnnul1.setForeground(new java.awt.Color(255, 0, 0));
        btnAnnul1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/Cancel icon.jpg"))); // NOI18N
        btnAnnul1.setBorder(null);
        btnAnnul1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnul1ActionPerformed(evt);
            }
        });

        kbtnInscri.setBackground(new java.awt.Color(255, 255, 255));
        kbtnInscri.setText("Inscription");
        kbtnInscri.setFont(new java.awt.Font("Carlito", 1, 18)); // NOI18N
        kbtnInscri.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnInscri.setkEndColor(new java.awt.Color(51, 51, 255));
        kbtnInscri.setkForeGround(new java.awt.Color(0, 0, 0));
        kbtnInscri.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kbtnInscri.setkHoverStartColor(new java.awt.Color(0, 51, 255));
        kbtnInscri.setkPressedColor(new java.awt.Color(255, 255, 255));
        kbtnInscri.setkSelectedColor(new java.awt.Color(0, 0, 255));
        kbtnInscri.setkStartColor(new java.awt.Color(255, 255, 255));
        kbtnInscri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnInscriActionPerformed(evt);
            }
        });

        kbtnListe.setBackground(new java.awt.Color(255, 255, 255));
        kbtnListe.setText("Listes");
        kbtnListe.setFont(new java.awt.Font("Carlito", 1, 18)); // NOI18N
        kbtnListe.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kbtnListe.setkEndColor(new java.awt.Color(51, 51, 255));
        kbtnListe.setkForeGround(new java.awt.Color(0, 0, 0));
        kbtnListe.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kbtnListe.setkHoverStartColor(new java.awt.Color(0, 51, 255));
        kbtnListe.setkPressedColor(new java.awt.Color(255, 255, 255));
        kbtnListe.setkSelectedColor(new java.awt.Color(0, 0, 255));
        kbtnListe.setkStartColor(new java.awt.Color(255, 255, 255));
        kbtnListe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnListeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(273, Short.MAX_VALUE)
                .addComponent(Élèves, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(kbtnInscri, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kbtnListe, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAnnul1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(btnAnnul1)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kbtnInscri, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kbtnListe, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Élèves))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        eleveForm.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 100));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        labelInscri.setFont(new java.awt.Font("Linux Libertine Mono O", 1, 48)); // NOI18N
        labelInscri.setForeground(new java.awt.Color(51, 51, 255));
        labelInscri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInscri.setText("INSCRIPTION");

        jPanel18.setBackground(new java.awt.Color(0, 33, 154));
        jPanel18.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 2, 1, new java.awt.Color(102, 102, 102)));

        jLabel18.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("N°Matricule");

        txtMat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMatFocusLost(evt);
            }
        });
        txtMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMatKeyReleased(evt);
            }
        });

        comboClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClasseActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Classe");

        jLabel20.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nom");

        txtNom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomFocusLost(evt);
            }
        });
        txtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomKeyReleased(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Prenom");

        txtPrenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrenomKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrenomKeyReleased(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Date  de naissance");

        jLabel23.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Lieu de naissance");

        lbPere.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lbPere.setForeground(new java.awt.Color(255, 255, 255));
        lbPere.setText("Nom du père");

        lbMere.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lbMere.setForeground(new java.awt.Color(255, 255, 255));
        lbMere.setText("Nom du mère");

        jLabel24.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Adresse");

        jLabel25.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("N°téléphone");

        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelKeyReleased(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Année scolaire");

        txtAnne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnneActionPerformed(evt);
            }
        });
        txtAnne.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAnneKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnneKeyReleased(evt);
            }
        });

        kGradientPanel6.setBackground(new java.awt.Color(0, 33, 154));
        kGradientPanel6.setkBorderRadius(30);
        kGradientPanel6.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel6.setkStartColor(new java.awt.Color(255, 255, 255));

        kbtnAjout.setBackground(new java.awt.Color(255, 255, 255));
        kbtnAjout.setText("Ajouter");
        kbtnAjout.setFont(new java.awt.Font("Linux Libertine O", 1, 18)); // NOI18N
        kbtnAjout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kbtnAjout.setkBackGroundColor(new java.awt.Color(0, 0, 204));
        kbtnAjout.setkEndColor(new java.awt.Color(51, 0, 255));
        kbtnAjout.setkStartColor(new java.awt.Color(0, 0, 204));
        kbtnAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnAjoutActionPerformed(evt);
            }
        });

        kbtnModif.setBackground(new java.awt.Color(255, 255, 255));
        kbtnModif.setText("Modifier");
        kbtnModif.setFont(new java.awt.Font("Linux Libertine O", 1, 18)); // NOI18N
        kbtnModif.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kbtnModif.setkBackGroundColor(new java.awt.Color(51, 51, 255));
        kbtnModif.setkEndColor(new java.awt.Color(51, 51, 255));
        kbtnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnModifActionPerformed(evt);
            }
        });

        kbtnSupp.setBackground(new java.awt.Color(255, 255, 255));
        kbtnSupp.setText("Supprimer");
        kbtnSupp.setFont(new java.awt.Font("Linux Libertine O", 1, 18)); // NOI18N
        kbtnSupp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kbtnSupp.setkBackGroundColor(new java.awt.Color(255, 0, 0));
        kbtnSupp.setkEndColor(new java.awt.Color(255, 51, 51));
        kbtnSupp.setkStartColor(new java.awt.Color(255, 0, 51));
        kbtnSupp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnSuppActionPerformed(evt);
            }
        });

        kbtnEffacer.setText("Effacer");
        kbtnEffacer.setFont(new java.awt.Font("Linux Libertine O", 1, 18)); // NOI18N
        kbtnEffacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnEffacerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kbtnEffacer, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnSupp, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnModif, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kbtnAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kbtnModif, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(kbtnSupp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(kbtnEffacer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        try {
            txtdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel57.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("(année-mois-jour)");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbPere, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMere)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPere, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMere, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel18Layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel18Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(txtLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                        .addComponent(kGradientPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(52, 52, 52)
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtMat, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel19)
                        .addGap(12, 12, 12)
                        .addComponent(comboClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtAnne, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnne, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(lbPere, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbMere, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addComponent(txtLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPere, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(txtMere, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(kGradientPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(labelInscri, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(labelInscri, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jTableEleve.addTab("tab1", jPanel8);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setFont(new java.awt.Font("Liberation Sans", 3, 48)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 102, 102));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Listes des élèves dans cette école");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Classe");

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Année");

        recherche.setBackground(new java.awt.Color(0, 0, 0));
        recherche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/Search.png"))); // NOI18N
        recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheActionPerformed(evt);
            }
        });

        tableEleve.setForeground(new java.awt.Color(0, 0, 0));
        tableEleve.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°Matricule", "Nom", "Prenom", "Date Naissance", "Lieu", "Adresse", "Téléphone", "Classe", "Année"
            }
        ));
        tableEleve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableEleveMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tableEleve);

        btnDetails.setFont(new java.awt.Font("Liberation Sans", 3, 14)); // NOI18N
        btnDetails.setText("Details");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });

        btnImprim.setText("Imprimer");
        btnImprim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimActionPerformed(evt);
            }
        });

        lbEleve.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbEleve.setForeground(new java.awt.Color(255, 0, 0));

        btnImprim2.setText("Imprimer");
        btnImprim2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprim2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboRechClass, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboRechAnne, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnImprim, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addGap(873, 873, 873)
                                        .addComponent(btnImprim2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbEleve, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboRechAnne, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recherche)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboRechClass, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEleve, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetails)
                    .addComponent(btnImprim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprim2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jTableEleve.addTab("tab2", jPanel17);

        eleveForm.add(jTableEleve, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, 1050, 620));

        MenuForm.addTab("tab1", eleveForm);

        javax.swing.GroupLayout ClasseFormLayout = new javax.swing.GroupLayout(ClasseForm);
        ClasseForm.setLayout(ClasseFormLayout);
        ClasseFormLayout.setHorizontalGroup(
            ClasseFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1052, Short.MAX_VALUE)
        );
        ClasseFormLayout.setVerticalGroup(
            ClasseFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );

        MenuForm.addTab("tab3", ClasseForm);

        javax.swing.GroupLayout matiereFormLayout = new javax.swing.GroupLayout(matiereForm);
        matiereForm.setLayout(matiereFormLayout);
        matiereFormLayout.setHorizontalGroup(
            matiereFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1052, Short.MAX_VALUE)
        );
        matiereFormLayout.setVerticalGroup(
            matiereFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );

        MenuForm.addTab("tab4", matiereForm);

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setFont(new java.awt.Font("Linux Biolinum Keyboard O", 3, 48)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 51, 51));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("COURS");
        jPanel33.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 12, 884, 84));

        jLabel67.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Classe");
        jPanel33.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 155, 73, 25));

        jLabel68.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 0));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("Matière");
        jPanel33.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 208, 73, 25));

        jLabel69.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 0, 0));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("Date");
        jPanel33.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 208, 73, 25));

        jLabel70.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 0));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("Jour");
        jPanel33.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 155, 73, 25));

        comboClasseCour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClasseCourActionPerformed(evt);
            }
        });
        jPanel33.add(comboClasseCour, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 157, 130, 25));

        ComboJour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choisir le jour", "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche", "" }));
        jPanel33.add(ComboJour, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 157, -1, 25));

        jPanel33.add(ComboMatiereCours, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 210, 130, 25));

        txtDateCour.setBackground(new java.awt.Color(255, 255, 255));
        txtDateCour.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtDateCour.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDateCour.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel33.add(txtDateCour, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 209, 129, 27));

        jLabel71.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 51, 51));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("(AAAA-MM-JJ)");
        jPanel33.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 242, 129, -1));

        btnAnnul5.setBackground(new java.awt.Color(255, 255, 255));
        btnAnnul5.setForeground(new java.awt.Color(255, 0, 0));
        btnAnnul5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/Cancel icon.jpg"))); // NOI18N
        btnAnnul5.setBorder(null);
        btnAnnul5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnul5ActionPerformed(evt);
            }
        });
        jPanel33.add(btnAnnul5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 40, -1));

        kbntEnregistre.setBackground(new java.awt.Color(255, 255, 255));
        kbntEnregistre.setText("Enregistrer");
        kbntEnregistre.setFont(new java.awt.Font("Liberation Mono", 1, 14)); // NOI18N
        kbntEnregistre.setkBackGroundColor(new java.awt.Color(0, 51, 255));
        kbntEnregistre.setkBorderRadius(25);
        kbntEnregistre.setkEndColor(new java.awt.Color(102, 0, 204));
        kbntEnregistre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbntEnregistreActionPerformed(evt);
            }
        });
        jPanel33.add(kbntEnregistre, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 270, 130, -1));

        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/logo2.jpg"))); // NOI18N
        jPanel33.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 810, 200));

        kGradientPanel9.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel9.setkBorderRadius(30);
        kGradientPanel9.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel9.setkStartColor(new java.awt.Color(204, 255, 255));

        recherche1.setBackground(new java.awt.Color(0, 0, 0));
        recherche1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/Search.png"))); // NOI18N
        recherche1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recherche1ActionPerformed(evt);
            }
        });

        tableCour.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", ""
            }
        ));
        tableCour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane7.setViewportView(tableCour);

        jLabel74.setFont(new java.awt.Font("Dyuthi", 1, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 51, 51));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("Matière");

        jLabel72.setFont(new java.awt.Font("Dyuthi", 1, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 51, 51));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("Date");

        jLabel73.setFont(new java.awt.Font("Dyuthi", 1, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 51, 51));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("Jour");

        javax.swing.GroupLayout kGradientPanel9Layout = new javax.swing.GroupLayout(kGradientPanel9);
        kGradientPanel9.setLayout(kGradientPanel9Layout);
        kGradientPanel9Layout.setHorizontalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel9Layout.createSequentialGroup()
                .addGroup(kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel9Layout.createSequentialGroup()
                        .addContainerGap(54, Short.MAX_VALUE)
                        .addGroup(kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboCourClasse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel9Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recherche1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel9Layout.setVerticalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel9Layout.createSequentialGroup()
                .addGroup(kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboCourClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recherche1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel33.add(kGradientPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 780, 290));

        javax.swing.GroupLayout coursFormLayout = new javax.swing.GroupLayout(coursForm);
        coursForm.setLayout(coursFormLayout);
        coursFormLayout.setHorizontalGroup(
            coursFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursFormLayout.createSequentialGroup()
                .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        coursFormLayout.setVerticalGroup(
            coursFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );

        MenuForm.addTab("tab5", coursForm);

        absenceForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAjoutAbsent.setText("Ajout des absents");
        btnAjoutAbsent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutAbsentActionPerformed(evt);
            }
        });
        jPanel28.add(btnAjoutAbsent, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 79, -1, -1));

        btnListeAbsent.setText("Listes");
        btnListeAbsent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListeAbsentActionPerformed(evt);
            }
        });
        jPanel28.add(btnListeAbsent, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 79, 101, -1));

        btnAnnul4.setBackground(new java.awt.Color(255, 255, 255));
        btnAnnul4.setForeground(new java.awt.Color(255, 0, 0));
        btnAnnul4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/Cancel icon.jpg"))); // NOI18N
        btnAnnul4.setBorder(null);
        btnAnnul4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnul4ActionPerformed(evt);
            }
        });
        jPanel28.add(btnAnnul4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/logo2.jpg"))); // NOI18N
        jPanel28.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 230, 130));

        lbAbs.setFont(new java.awt.Font("Linux Biolinum Keyboard O", 1, 48)); // NOI18N
        lbAbs.setForeground(new java.awt.Color(255, 0, 0));
        lbAbs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel28.add(lbAbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 0, 490, 61));

        absenceForm.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 130));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jPanel25.setBackground(new java.awt.Color(255, 0, 0));
        jPanel25.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 0)));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Jour:");
        jPanel25.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 68, 80, 23));

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Classe:");
        jPanel25.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 109, 71, 23));

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Matière:");
        jPanel25.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 150, 71, 23));

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("Date:");
        jPanel25.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 71, 23));

        lbJour.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbJour.setForeground(new java.awt.Color(0, 0, 0));
        lbJour.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel25.add(lbJour, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 147, 23));

        lbClassCour.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbClassCour.setForeground(new java.awt.Color(0, 0, 0));
        lbClassCour.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel25.add(lbClassCour, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 109, 147, 23));

        lbMatiere.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbMatiere.setForeground(new java.awt.Color(0, 0, 0));
        lbMatiere.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel25.add(lbMatiere, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 150, 147, 23));

        lbDate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbDate.setForeground(new java.awt.Color(0, 0, 0));
        lbDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel25.add(lbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 190, 23));

        lbPass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbPass.setForeground(new java.awt.Color(255, 0, 0));
        lbPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel25.add(lbPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 284, 23));

        jLabel36.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Cours");
        jPanel25.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 308, 50));

        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/school.jpg"))); // NOI18N
        jPanel25.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 310, 230));

        jPanel26.setBackground(new java.awt.Color(255, 0, 0));
        jPanel26.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Élèves");
        jPanel26.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 18, 308, 40));

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("N°Matricule:");
        jPanel26.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 99, 24));

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Nom:");
        jPanel26.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 72, 24));

        jLabel44.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("Prénom:");
        jPanel26.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 76, 24));

        jLabel45.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Classe:");
        jPanel26.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 66, 24));

        jLabel46.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("Année");
        jPanel26.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 857, 99, 24));

        lbNumMat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbNumMat.setForeground(new java.awt.Color(255, 255, 255));
        jPanel26.add(lbNumMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 167, 30));

        lbNom.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbNom.setForeground(new java.awt.Color(255, 255, 255));
        jPanel26.add(lbNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 214, 30));

        lbPrenom.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbPrenom.setForeground(new java.awt.Color(255, 255, 255));
        jPanel26.add(lbPrenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 200, 28));

        lbClass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbClass.setForeground(new java.awt.Color(255, 255, 255));
        jPanel26.add(lbClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 157, 28));

        lbAnne.setForeground(new java.awt.Color(0, 0, 0));
        jPanel26.add(lbAnne, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 853, 122, 28));

        lbPas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbPas.setForeground(new java.awt.Color(255, 0, 0));
        lbPas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel26.add(lbPas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 189, 28));

        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/school.jpg"))); // NOI18N
        jPanel26.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 310, 240));

        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 0, 0));
        jLabel47.setText("Ajout des élèves en absence");
        jPanel27.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 330, 40));

        jLabel48.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel48.setText("N°Matricule");
        jPanel27.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 110, 30));

        jLabel49.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel49.setText("Cours");
        jPanel27.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 80, 30));

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel50.setText("Date d'absence");
        jPanel27.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 120, 30));

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel51.setText("Fin d'absence");
        jPanel27.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, 30));

        jLabel52.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel52.setText("Motif");
        jPanel27.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 90, 30));

        comboCours.setForeground(new java.awt.Color(0, 0, 0));
        comboCours.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboCoursFocusLost(evt);
            }
        });
        comboCours.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                comboCoursPropertyChange(evt);
            }
        });
        jPanel27.add(comboCours, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 140, 30));

        comboMatricule.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboMatriculeFocusLost(evt);
            }
        });
        comboMatricule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMatriculeActionPerformed(evt);
            }
        });
        jPanel27.add(comboMatricule, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 140, 30));

        btnAjoutAbs.setText("Ajouter");
        btnAjoutAbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutAbsActionPerformed(evt);
            }
        });
        jPanel27.add(btnAjoutAbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 110, 30));

        txtaMotif.setColumns(20);
        txtaMotif.setForeground(new java.awt.Color(0, 0, 0));
        txtaMotif.setRows(5);
        jScrollPane5.setViewportView(txtaMotif);

        jPanel27.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 320, 120));

        lbActu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbActu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/Synchronize icon.png"))); // NOI18N
        lbActu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbActuMouseClicked(evt);
            }
        });
        jPanel27.add(lbActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 50, 40));

        btnModifAbs.setText("Modifier");
        btnModifAbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifAbsActionPerformed(evt);
            }
        });
        jPanel27.add(btnModifAbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 100, 30));

        btnSuppAbs.setText("Supprimer");
        btnSuppAbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppAbsActionPerformed(evt);
            }
        });
        jPanel27.add(btnSuppAbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 110, 30));

        txtDate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtDate.setForeground(new java.awt.Color(255, 255, 255));
        txtDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel27.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 240, 30));

        jLabel54.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("(année-mois-jour)");
        jPanel27.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 150, 20));

        try {
            txtFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel27.add(txtFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 210, 30));

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/school2.jpg"))); // NOI18N
        jPanel27.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 450));
        jPanel27.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab1", jPanel22);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        jLabel60.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setText("Classe");

        jLabel61.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 0));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Date ");

        btnRecherche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/Search.png"))); // NOI18N
        btnRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercheActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Neonderthaw", 1, 48)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 153));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Les élèves absents dans cette école");

        tableAbsent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°Matricule", "Nom", "Date_Absence", "Fin_Absence", "Motif", "N°Cours", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAbsent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableAbsentMouseReleased(evt);
            }
        });
        jScrollPane6.setViewportView(tableAbsent);
        if (tableAbsent.getColumnModel().getColumnCount() > 0) {
            tableAbsent.getColumnModel().getColumn(6).setResizable(false);
        }

        btnDetails1.setText("Details");
        btnDetails1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetails1ActionPerformed(evt);
            }
        });

        lbPresent.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbPresent.setForeground(new java.awt.Color(0, 0, 204));
        lbPresent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPresent.setText("Listes des élèves présents");
        lbPresent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPresentMouseClicked(evt);
            }
        });

        lbNoAbs.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbNoAbs.setForeground(new java.awt.Color(255, 0, 51));
        lbNoAbs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboClass, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboDate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRecherche)
                .addGap(117, 117, 117))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel23Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(568, 568, 568)
                            .addComponent(lbPresent, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(lbNoAbs, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(comboClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61)
                            .addComponent(ComboDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnRecherche))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNoAbs, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPresent, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(btnDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab2", jPanel23);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        jLabel76.setFont(new java.awt.Font("Liberation Sans", 3, 36)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 102, 102));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("Listes des élèves présents");

        kGradientPanel7.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel7.setkBorderRadius(30);

        tablePresent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NumMat", "Nom", "Prenom", "Classe"
            }
        ));
        tablePresent.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jScrollPane8.setViewportView(tablePresent);

        jLabel77.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(0, 0, 0));
        jLabel77.setText("Classe");

        jLabel78.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(0, 0, 0));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("Date ");

        btnRecherchePresent.setBackground(new java.awt.Color(0, 0, 153));
        btnRecherchePresent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/Search.png"))); // NOI18N
        btnRecherchePresent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecherchePresentActionPerformed(evt);
            }
        });

        btnImprim1.setText("Imprimer");
        btnImprim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprim1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboClassPresent, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboDatePresent, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRecherchePresent)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImprim1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel7Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel77)
                            .addComponent(comboClassPresent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78)
                            .addComponent(ComboDatePresent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnRecherchePresent))
                .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel7Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(btnImprim1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324))
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 71, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", jPanel24);

        absenceForm.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 1060, -1));

        MenuForm.addTab("tab6", absenceForm);

        profForm.setBackground(new java.awt.Color(255, 255, 255));

        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nom");
        jPanel20.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 50, 36));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Prénom");
        jPanel20.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 91, 36));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Adresse");
        jPanel20.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 91, 36));

        jLabel30.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("C.I.N");
        jPanel20.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 91, 36));

        jLabel31.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Tel");
        jPanel20.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 91, 36));

        txtNomProf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomProfFocusLost(evt);
            }
        });
        jPanel20.add(txtNomProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 16, 328, 40));
        jPanel20.add(txtPrenomProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 328, 36));
        jPanel20.add(txtAdresseProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 328, 36));

        txtCin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCinFocusLost(evt);
            }
        });
        txtCin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCinKeyPressed(evt);
            }
        });
        jPanel20.add(txtCin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 328, 36));

        txtTelProf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelProfFocusLost(evt);
            }
        });
        txtTelProf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelProfKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelProfKeyReleased(evt);
            }
        });
        jPanel20.add(txtTelProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 328, 36));

        btnModifProf.setText("Modifier");
        btnModifProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifProfActionPerformed(evt);
            }
        });
        jPanel20.add(btnModifProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 141, 32));

        btnAjoutProf.setText("Ajouter");
        btnAjoutProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutProfActionPerformed(evt);
            }
        });
        jPanel20.add(btnAjoutProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 141, 32));

        btnSuppProf.setText("Supprimer");
        btnSuppProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppProfActionPerformed(evt);
            }
        });
        jPanel20.add(btnSuppProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 141, 32));

        btnAnnulProf.setText("Annuler");
        btnAnnulProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulProfActionPerformed(evt);
            }
        });
        jPanel20.add(btnAnnulProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 140, 30));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/school2.jpg"))); // NOI18N
        jPanel20.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 420));

        txtId.setText("jTextField1");
        jPanel20.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, 10));

        jLabel2.setFont(new java.awt.Font("Liberation Serif", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Listes");

        tableProf.setBackground(new java.awt.Color(255, 255, 255));
        tableProf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°Prof", "Nom", "Prénom", "Adresse", "CIN", "Téléphone"
            }
        ));
        tableProf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableProfMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tableProf);

        jPanel21.setBackground(new java.awt.Color(0, 51, 51));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAnnul2.setBackground(new java.awt.Color(153, 255, 204));
        btnAnnul2.setForeground(new java.awt.Color(255, 0, 0));
        btnAnnul2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/Cancel icon.jpg"))); // NOI18N
        btnAnnul2.setBorder(null);
        btnAnnul2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnul2ActionPerformed(evt);
            }
        });
        jPanel21.add(btnAnnul2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel21.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1057, 0, 220, 146));

        btnAnnul3.setBackground(new java.awt.Color(255, 255, 255));
        btnAnnul3.setForeground(new java.awt.Color(255, 0, 0));
        btnAnnul3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/Cancel icon.jpg"))); // NOI18N
        btnAnnul3.setBorder(null);
        btnAnnul3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnul3ActionPerformed(evt);
            }
        });
        jPanel21.add(btnAnnul3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, -1, -1));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/logo2.jpg"))); // NOI18N
        jPanel21.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 220, 146));

        jLabel34.setBackground(new java.awt.Color(0, 153, 153));
        jLabel34.setFont(new java.awt.Font("Linux Biolinum Keyboard O", 3, 48)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/Singing Teacher_50px.png"))); // NOI18N
        jLabel34.setText("Les Profs");
        jPanel21.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 550, 146));

        javax.swing.GroupLayout profFormLayout = new javax.swing.GroupLayout(profForm);
        profForm.setLayout(profFormLayout);
        profFormLayout.setHorizontalGroup(
            profFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profFormLayout.createSequentialGroup()
                .addGroup(profFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(profFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(profFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                            .addGroup(profFormLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)))))
                .addContainerGap())
        );
        profFormLayout.setVerticalGroup(
            profFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profFormLayout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(profFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profFormLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(profFormLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        MenuForm.addTab("tab2", profForm);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MenuForm, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenuForm, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1271, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1271, 696));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void cours() {
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT* FROM Cours");
            rs = ps.executeQuery();
            comboCours.addItem("Cliquer ici");

            while (rs.next()) {
                String valeur = rs.getString("numCours");
                comboCours.addItem(valeur);
            }

        } catch (Exception e) {
        }

    }

    private void comboClasseAbs() {
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT libClass FROM Classe");
            rs = ps.executeQuery();
            comboClass.addItem("cliquer ici");
            comboClasseCour.addItem("Cliquer ici");
            ComboCourClasse.addItem("Cliquer ici");
            comboClassPresent.addItem("Cliquer ici");
            while (rs.next()) {
                String valeur = rs.getString("libClass");
                comboClass.addItem(valeur);
                comboClasseCour.addItem(valeur);
                ComboCourClasse.addItem(valeur);
                comboClassPresent.addItem(valeur);

            }

        } catch (Exception e) {
        }
    }

    private void comboDate() {
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT distinct(date) FROM Cours");
            rs = ps.executeQuery();
            ComboDate.addItem("Cliquer ici");
            ComboDatePresent.addItem("Cliquer ici");
            while (rs.next()) {
                String valeur = rs.getString("date");
                ComboDate.addItem(valeur);
                ComboDatePresent.addItem(valeur);
            }

        } catch (Exception e) {
        }
    }

    private void comboMatricule() {
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT numMat FROM Eleve");
            rs = ps.executeQuery();
            comboMatricule.addItem("Cliquer ici");
            while (rs.next()) {
                String val = rs.getString("numMat");
                comboMatricule.addItem(val);

            }
        } catch (Exception e) {
        }
    }

    private void comboMatiere() {
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT libMat FROM Matiere");
            rs = ps.executeQuery();
            while (rs.next()) {
                String val = rs.getString("libMat");
                ComboMatiereCours.addItem(val);

            }
        } catch (Exception e) {
        }
    }

    public void EffacerProf() {
        txtNomProf.setText("");
        txtPrenomProf.setText("");
        txtAdresseProf.setText("");
        txtCin.setText("");
        txtTelProf.setText("");
        txtNomProf.requestFocus();
        btnAjoutProf.setEnabled(true);
        btnModifProf.setEnabled(false);
        btnSuppProf.setEnabled(false);
    }

    public void TableProf() {
        int x;
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("select* from Prof");
            rs = ps.executeQuery();
            rmd = rs.getMetaData();
            x = rmd.getColumnCount();
            dtm = (DefaultTableModel) tableProf.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector ve = new Vector();
                for (int i = 1; i <= x; i++) {
                    ve.add(rs.getString("numProf"));
                    ve.add(rs.getString("nomProf"));
                    ve.add(rs.getString("prenomProf"));
                    ve.add(rs.getString("adresseProf"));
                    ve.add(rs.getString("Cin"));
                    ve.add(rs.getString("telProf"));
                }
                dtm.addRow(ve);
            }

        } catch (Exception e) {
        }
    }

    public void Table() {
        int x;
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT* FROM Eleve");
            rs = ps.executeQuery();
            rmd = rs.getMetaData();
            x = rmd.getColumnCount();
            dtm = (DefaultTableModel) tableEleve.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector ve = new Vector();
                for (int i = 1; i <= x; i++) {
                    ve.add(rs.getString("numMat"));
                    ve.add(rs.getString("nomE"));
                    ve.add(rs.getString("prenomE"));
                    ve.add(rs.getString("dateNais"));
                    ve.add(rs.getString("lieuNais"));
                    ve.add(rs.getString("adresse"));
                    ve.add(rs.getString("tel"));
                    ve.add(rs.getString("libClass"));
                    ve.add(rs.getString("anneeSco"));
                }
                dtm.addRow(ve);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void btnAnnulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnAnnulActionPerformed

    private void btnAnnul1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnul1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAnnul1ActionPerformed

    private void rechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheActionPerformed
        int x;
        String classe = comboRechClass.getSelectedItem().toString();
        String anne = comboRechAnne.getSelectedItem().toString();
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT* FROM Eleve where libClass=? and anneeSco=?");
            ps.setString(1, classe);
            ps.setString(2, anne);
            rs = ps.executeQuery();
            rmd = rs.getMetaData();
            x = rmd.getColumnCount();
            dtm = (DefaultTableModel) tableEleve.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {

                Vector ve = new Vector();
                for (int i = 1; i <= x; i++) {
                    ve.add(rs.getString("numMat"));
                    ve.add(rs.getString("nomE"));
                    ve.add(rs.getString("prenomE"));
                    ve.add(rs.getString("dateNais"));
                    ve.add(rs.getString("lieuNais"));
                    ve.add(rs.getString("adresse"));
                    ve.add(rs.getString("tel"));
                    ve.add(rs.getString("libClass"));
                    ve.add(rs.getString("anneeSco"));
                }
                dtm.addRow(ve);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_rechercheActionPerformed

    private void tableEleveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEleveMouseReleased
        // TODO add your handling code here:
        int select = tableEleve.getSelectedRow();
        dtm = (DefaultTableModel) tableEleve.getModel();
        txtMat.setText(dtm.getValueAt(select, 0).toString());
        txtNom.setText(dtm.getValueAt(select, 1).toString());
        txtPrenom.setText(dtm.getValueAt(select, 2).toString());
        txtdate.setText(dtm.getValueAt(select, 3).toString());
        txtLieu.setText(dtm.getValueAt(select, 4).toString());
        txtAdresse.setText(dtm.getValueAt(select, 5).toString());
        txtTel.setText(dtm.getValueAt(select, 6).toString());
        comboClasse.setSelectedItem(dtm.getValueAt(select, 7).toString());
        txtAnne.setText(dtm.getValueAt(select, 8).toString());
    }//GEN-LAST:event_tableEleveMouseReleased

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed

        jTableEleve.setSelectedIndex(0);
        labelInscri.setText("DÉTAILS");
        txtMat.setEnabled(false);
        txtPere.setEnabled(false);
        txtMere.setEnabled(false);
        lbPere.setEnabled(false);
        lbMere.setEnabled(false);
        kbtnAjout.setEnabled(false);

        kbtnModif.setEnabled(true);
        kbtnSupp.setEnabled(true);
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void btnImprimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimActionPerformed
        MessageFormat head = new MessageFormat("Listes des élèves");
        MessageFormat pied = new MessageFormat("Page {0,number,integer}");
        try {
            tableEleve.print(JTable.PrintMode.NORMAL, head, pied);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Erreur d'impression", e.getMessage());
        }
    }//GEN-LAST:event_btnImprimActionPerformed

    private void txtNomProfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomProfFocusLost

        txtNomProf.setText(txtNomProf.getText().toString().toUpperCase());
    }//GEN-LAST:event_txtNomProfFocusLost

    private void btnModifProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifProfActionPerformed
        dtm = (DefaultTableModel) tableProf.getModel();
        int select = tableProf.getSelectedRow();
        try {
            int num = Integer.parseInt(dtm.getValueAt(select, 0).toString());
            String nom = txtNomProf.getText();
            String prenom = txtPrenomProf.getText();
            String adresse = txtAdresseProf.getText();
            String cin = txtCin.getText();
            String tel = txtTelProf.getText();
            Prof pro = new Prof(num, nom, prenom, cin, adresse, tel);
            gestionProf gePro = new gestionProf();
            gePro.update(num, pro);
            Table();
            JOptionPane.showMessageDialog(null, "Prof Modifié");
            EffacerProf();

        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnModifProfActionPerformed

    private void btnAjoutProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutProfActionPerformed
        String nom = txtNomProf.getText();
        String prenom = txtPrenomProf.getText();
        String adresse = txtAdresseProf.getText();
        String cin = txtCin.getText();
        String tel = txtTelProf.getText();
        if (nom.equals("") || prenom.equals("") || adresse.equals("") || cin.equals("") || tel.equals("")) {
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
            txtNomProf.requestFocus();
        } else {
            try {
                Prof pro = new Prof(nom, prenom, cin, adresse, tel);
                gestionProf gePro = new gestionProf();
                gePro.insert(pro);
                Table();
                JOptionPane.showMessageDialog(null, "Prof ajouté");
                EffacerProf();

            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_btnAjoutProfActionPerformed

    private void btnSuppProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppProfActionPerformed
        dtm = (DefaultTableModel) tableProf.getModel();
        int select = tableProf.getSelectedRow();
        try {
            int num = Integer.parseInt(dtm.getValueAt(select, 0).toString());
            int result = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment supprimer?", "Warning", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                gestionProf gePro = new gestionProf();
                gePro.delete(num);
                TableProf();
                JOptionPane.showMessageDialog(null, "Prof supprimé");
                EffacerProf();

            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnSuppProfActionPerformed

    private void label() {
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT count(*) as total FROM Classe");
            rs = ps.executeQuery();
            while (rs.next()) {
                labelClasse.setText(rs.getString("total"));
            }
        } catch (Exception e) {
        }
    }

    private void eleve() {
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT count(*) as total FROM Eleve");
            rs = ps.executeQuery();
            while (rs.next()) {
                labelEleve.setText(rs.getString("total"));
            }
        } catch (Exception e) {
        }
    }

    private void prof() {
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT count(*) as total FROM Prof");
            rs = ps.executeQuery();
            while (rs.next()) {
                labelProf.setText(rs.getString("total"));
            }
        } catch (Exception e) {
        }
    }

    private void matiere() {
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT count(*) as total FROM Matiere");
            rs = ps.executeQuery();
            while (rs.next()) {
                labelMatiere.setText(rs.getString("total"));

            }
        } catch (Exception e) {
        }
    }
    private void btnAnnulProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulProfActionPerformed
        EffacerProf();
    }//GEN-LAST:event_btnAnnulProfActionPerformed

    private void tableProfMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProfMouseReleased
        int select = tableProf.getSelectedRow();
        dtm = (DefaultTableModel) tableProf.getModel();
        txtId.setText(dtm.getValueAt(select, 0).toString());
        txtNomProf.setText(dtm.getValueAt(select, 1).toString());
        txtPrenomProf.setText(dtm.getValueAt(select, 2).toString());
        txtAdresseProf.setText(dtm.getValueAt(select, 3).toString());
        txtCin.setText(dtm.getValueAt(select, 4).toString());
        txtTelProf.setText(dtm.getValueAt(select, 5).toString());
        btnAjoutProf.setEnabled(false);
        btnModifProf.setEnabled(true);
        btnSuppProf.setEnabled(true);
    }//GEN-LAST:event_tableProfMouseReleased

    private void btnAnnul2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnul2ActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnAnnul2ActionPerformed

    private void comboCoursFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboCoursFocusLost

        int num = Integer.parseInt(comboCours.getSelectedItem().toString());
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("select* from Cours where numCours=?");
            ps.setInt(1, num);
            rs = ps.executeQuery();
            if (rs.next()) {
                lbJour.setText(rs.getString("jour"));
                lbClassCour.setText(rs.getString("libClass"));
                lbDate.setText(rs.getString("date"));
                lbMatiere.setText(rs.getString("libMat"));
                txtDate.setText(rs.getString("date"));
                lbClass.setText(rs.getString("libClass"));
                lbPass.setText("");

            } else {
                Annul();
                lbPass.setText("N°Cours non existe");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
                
                
        int code_cours = Integer.parseInt(comboCours.getSelectedItem().toString());        
        try {
            
            String request = "SELECT numMat FROM Eleve INNER JOIN Cours ON Cours.libClass=Eleve.libClass WHERE Cours.numCours=?";
        
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement(request);
            ps.setInt(1, code_cours);
            rs = ps.executeQuery();
           
            comboMatricule.removeAllItems();
            while (rs.next()) {            
                
                comboMatricule.addItem(rs.getString(1));
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
      
    }//GEN-LAST:event_comboCoursFocusLost

    private void clearComboMatricule(){
        for (int a = 0; a < comboMatricule.getItemCount(); a++) {
            comboMatricule.remove(a);
        }
    }
    
    private void comboMatriculeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboMatriculeFocusLost
        
        
        int num = Integer.parseInt(comboMatricule.getSelectedItem().toString());
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("select* from Eleve where numMat=?");
            ps.setInt(1, num);
            rs = ps.executeQuery();
            if (rs.next()) {
                lbNumMat.setText(rs.getString("numMat"));
                lbNom.setText(rs.getString("nomE"));
                lbPrenom.setText(rs.getString("prenomE"));
                lbClass.setText(rs.getString("libClass"));
                lbAnne.setText(rs.getString("anneeSco"));
                lbPas.setText("");

            } else {
                Effacer();
                lbPas.setText("N°matricule non existe");

            }

        } catch (Exception e) {

        }
        
    }//GEN-LAST:event_comboMatriculeFocusLost

    private void comboMatriculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMatriculeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMatriculeActionPerformed

    public void Annul() {
        lbJour.setText("");
        lbClassCour.setText("");
        lbDate.setText("");
        lbMatiere.setText("");
        lbPass.setText("");

    }

    public void EffacerAbsent() {
        lbNumMat.setText("");
        lbNom.setText("");
        lbPrenom.setText("");
        lbClass.setText("");
        lbAnne.setText("");
        lbPas.setText("");
        txtDate.setText("");
        txtFin.setText("");
        txtaMotif.setText("");

    }
    private void btnAjoutAbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutAbsActionPerformed

        String num = comboMatricule.getSelectedItem().toString();
        String cour = comboCours.getSelectedItem().toString();
        String date = txtDate.getText();
        String dateFin = txtFin.getText();
        String Motif = txtaMotif.getText();
        if (num.equals("Son n° matricule") || cour.equals("En quelle classe") || date.equals("") || dateFin.equals("") || Motif.equals("")) {
            JOptionPane.showMessageDialog(null, "Veuillez remplir les champs");

        } else {

            try {
                Absence abs = new Absence(num, cour, date, dateFin, Motif);
                gestionAbsent geAbs = new gestionAbsent();
                geAbs.insert(abs);
                JOptionPane.showMessageDialog(null, " Absent ajouté");
                EffacerAbsent();
                Annul();

            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_btnAjoutAbsActionPerformed

    private void lbActuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbActuMouseClicked
        EffacerAbsent();
        Annul();
        jTabbedPane1.setSelectedIndex(0);
        btnAjoutAbs.setEnabled(true);
        btnModifAbs.setVisible(false);
        btnSuppAbs.setVisible(false);

    }//GEN-LAST:event_lbActuMouseClicked

    private void btnModifAbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifAbsActionPerformed
        dtm = (DefaultTableModel) tableAbsent.getModel();
        int select = tableAbsent.getSelectedRow();
        try {
            int id = Integer.parseInt(dtm.getValueAt(select, 6).toString());
            String num = comboMatricule.getSelectedItem().toString();
            String cour = comboCours.getSelectedItem().toString();
            String date = txtDate.getText();
            String dateFin = txtFin.getText();
            String Motif = txtaMotif.getText();
            Absence Abs = new Absence(cour, num, date, dateFin, Motif, id);
            gestionAbsent geEl = new gestionAbsent();
            geEl.update(id, Abs);
            JOptionPane.showMessageDialog(null, "Absents Modifié");
            EffacerAbsent();
            tableAbs();

        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnModifAbsActionPerformed

    private void btnSuppAbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppAbsActionPerformed
        dtm = (DefaultTableModel) tableAbsent.getModel();
        int select = tableAbsent.getSelectedRow();
        try {
            int id = Integer.parseInt(dtm.getValueAt(select, 6).toString());
            int result = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment supprimer?", "Warning", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                gestionAbsent geAbs = new gestionAbsent();
                geAbs.delete(id);
                JOptionPane.showMessageDialog(null, "Absent supprimé");
                EffacerAbsent();
                tableAbs();

            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnSuppAbsActionPerformed

    private void btnAjoutAbsentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutAbsentActionPerformed
        lbAbs.setText("Absence");
        jTabbedPane1.setSelectedIndex(0);


    }//GEN-LAST:event_btnAjoutAbsentActionPerformed

    private void btnListeAbsentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListeAbsentActionPerformed
        lbAbs.setText("Absence");
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnListeAbsentActionPerformed

    private void tableAbs() {
        int x;
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT Eleve.numMat,Eleve.nomE,Absence.dateAbs,Absence.dateRetour,Absence.Motif,Absence.numCours,Absence.id FROM Eleve,Absence WHERE Eleve.numMat=Absence.numMat");
            rs = ps.executeQuery();
            rmd = rs.getMetaData();
            x = rmd.getColumnCount();
            dtm = (DefaultTableModel) tableAbsent.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector ve = new Vector();
                for (int i = 1; i <= x; i++) {
                    ve.add(rs.getString("numMat"));
                    ve.add(rs.getString("nomE"));
                    ve.add(rs.getString("dateAbs"));
                    ve.add(rs.getString("dateRetour"));
                    ve.add(rs.getString("Motif"));
                    ve.add(rs.getString("numCours"));
                    ve.add(rs.getString("id"));

                }
                dtm.addRow(ve);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void tableCours() {
        int x;
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT libMat,jour,date FROM Cours");
            rs = ps.executeQuery();
            rmd = rs.getMetaData();
            x = rmd.getColumnCount();
            dtm = (DefaultTableModel) tableCour.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector ve = new Vector();
                for (int i = 1; i <= x; i++) {
                    ve.add(rs.getString("jour"));
                    ve.add(rs.getString("date"));
                    ve.add(rs.getString("libMat"));

                }
                dtm.addRow(ve);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void btnAnnul3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnul3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAnnul3ActionPerformed

    private void tableAbsentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAbsentMouseReleased
        int select = tableAbsent.getSelectedRow();
        dtm = (DefaultTableModel) tableAbsent.getModel();
        comboMatricule.setSelectedItem(dtm.getValueAt(select, 0).toString());
        txtDate.setText(dtm.getValueAt(select, 2).toString());
        txtFin.setText(dtm.getValueAt(select, 3).toString());
        txtaMotif.setText(dtm.getValueAt(select, 4).toString());
        comboCours.setSelectedItem(dtm.getValueAt(select, 5).toString());
        idtxt.setText(dtm.getValueAt(select, 6).toString());
    }//GEN-LAST:event_tableAbsentMouseReleased

    private void btnDetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetails1ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
        btnAjoutAbs.setEnabled(false);
        btnModifAbs.setVisible(true);
        btnSuppAbs.setVisible(true);
    }//GEN-LAST:event_btnDetails1ActionPerformed

    private void lbPresentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPresentMouseClicked
        lbAbs.setText("Présence");
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_lbPresentMouseClicked

    private void btnAnnul4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnul4ActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnAnnul4ActionPerformed

    private void btnRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercheActionPerformed
        int x;

        try {
            String classe = comboClasse.getSelectedItem().toString();
            String date = ComboDate.getSelectedItem().toString();
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT* FROM Listes WHERE Classe='" + classe + "' AND date='" + date + "'");

            rs = ps.executeQuery();
            rmd = rs.getMetaData();
            x = rmd.getColumnCount();
            dtm = (DefaultTableModel) tableAbsent.getModel();
            dtm.setRowCount(0);

            //while (rs.next()) {
            if (rs.next()) {
                Vector ve = new Vector();
                for (int i = 1; i <= x; i++) {
                    ve.add(rs.getString("num"));
                    ve.add(rs.getString("nom"));
                    ve.add(rs.getString("date"));
                    ve.add(rs.getString("datefin"));
                    ve.add(rs.getString("motif"));
                    ve.add(rs.getString("numC"));
                    ve.add(rs.getString("id"));

                }
                dtm.addRow(ve);
                lbNoAbs.setText("");

            } else {
                lbNoAbs.setText("Les élèves de cette classe sont présents à ce date!!!");
            }
            comboClass.setSelectedIndex(0);
            ComboDate.setSelectedIndex(0);
            //}
            cnx.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRechercheActionPerformed

    private void comboClasseCourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClasseCourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClasseCourActionPerformed

    private void btnAnnul5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnul5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnAnnul5ActionPerformed

    private void tableClasse() {
        int x;
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT* FROM Classe");
            rs = ps.executeQuery();
            rmd = rs.getMetaData();
            x = rmd.getColumnCount();
            dtm = (DefaultTableModel) jTableClasse.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector ve = new Vector();
                for (int i = 1; i <= x; i++) {
                    ve.add(rs.getString("libClass"));
                    ve.add(rs.getString("nomClass"));
                }
                dtm.addRow(ve);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void tableMatiere() {
        int x;
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT libMat,nomMat,nomProf FROM Matiere,Prof where Prof.numProf=Matiere.numProf");
            rs = ps.executeQuery();
            rmd = rs.getMetaData();
            x = rmd.getColumnCount();
            dtm = (DefaultTableModel) jTableMatiere.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector ve = new Vector();
                for (int i = 1; i <= x; i++) {
                    ve.add(rs.getString("libMat"));
                    ve.add(rs.getString("nomMat"));
                    ve.add(rs.getString("nomProf"));

                }
                dtm.addRow(ve);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        jTableEleve.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void txtTelProfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelProfKeyReleased
        String valeur = txtTelProf.getText().toString();
        int ln = valeur.length();
        if (txtTelProf.getText().matches("[0-9,C]*")) {
            if (ln > 10) {
                valeur = valeur.substring(0, ln - 1);
            }
            txtTelProf.setText(valeur);
        } else {
            valeur = valeur.substring(0, ln - 1);
            txtTelProf.setText(valeur);

        }
    }//GEN-LAST:event_txtTelProfKeyReleased

    private void txtTelProfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelProfKeyPressed
        // TODO add your handling code here:
        String valeur = txtTelProf.getText().toString();
        int ln = valeur.length();
        if (txtTelProf.getText().matches("[0-9,C]*")) {
            if (ln > 10) {
                valeur = valeur.substring(0, ln - 1);
            }
            txtTelProf.setText(valeur);
        } else {
            valeur = valeur.substring(0, ln - 1);
            txtTelProf.setText(valeur);

        }
    }//GEN-LAST:event_txtTelProfKeyPressed

    private void txtCinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCinFocusLost
        // TODO add your handling code here:
        String valeur = txtCin.getText();
        int ln = valeur.length();
        if (ln < 13) {
            JOptionPane.showMessageDialog(null, "Numéro de CIN incorrect, trop court ");
            txtCin.setText("");
            txtCin.requestFocus();
        }
    }//GEN-LAST:event_txtCinFocusLost

    private void txtTelProfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelProfFocusLost
        // TODO add your handling code here:
        String valeur = txtTelProf.getText();
        int ln = valeur.length();
        if (ln < 12) {
            JOptionPane.showMessageDialog(null, "Numéro de CIN incorrect, trop court");
            txtTelProf.setText("");
            txtTelProf.requestFocus();
        }
    }//GEN-LAST:event_txtTelProfFocusLost

    private void txtCinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCinKeyPressed
        // TODO add your handling code here:
        String valeur = txtCin.getText().toString();
        int ln = valeur.length();
        if (txtCin.getText().matches("[0-9,C]*")) {
            if (ln > 12) {
                valeur = valeur.substring(0, ln - 1);
            }
            txtCin.setText(valeur);
        } else {
            valeur = valeur.substring(0, ln - 1);
            txtCin.setText(valeur);

        }
    }//GEN-LAST:event_txtCinKeyPressed

    private void btnRecherchePresentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecherchePresentActionPerformed
        // TODO add your handling code here:
        int x;
        String classe = comboClassPresent.getSelectedItem().toString();
        String date = ComboDatePresent.getSelectedItem().toString();
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT* FROM Eleve WHERE numMat NOT IN(SELECT numMat FROM Absence WHERE dateAbs='" + date + "') AND libClass='" + classe + "'");
            rs = ps.executeQuery();
            rmd = rs.getMetaData();
            x = rmd.getColumnCount();
            dtm = (DefaultTableModel) tablePresent.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector ve = new Vector();
                for (int i = 1; i <= x; i++) {
                    ve.add(rs.getString("numMat"));
                    ve.add(rs.getString("nomE"));
                    ve.add(rs.getString("prenomE"));
                    ve.add(rs.getString("libClass"));
                }
                dtm.addRow(ve);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnRecherchePresentActionPerformed

    private void kbtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnMenuActionPerformed
        MenuForm.setSelectedIndex(0);
    }//GEN-LAST:event_kbtnMenuActionPerformed

    private void kbtnEleveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnEleveActionPerformed
        MenuForm.setSelectedIndex(1);
    }//GEN-LAST:event_kbtnEleveActionPerformed

    private void kbtnProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnProfActionPerformed
        MenuForm.setSelectedIndex(6);
    }//GEN-LAST:event_kbtnProfActionPerformed

    private void kbtnCourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnCourActionPerformed
        MenuForm.setSelectedIndex(4);
    }//GEN-LAST:event_kbtnCourActionPerformed

    private void kbtnAbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnAbsActionPerformed
        MenuForm.setSelectedIndex(5);
    }//GEN-LAST:event_kbtnAbsActionPerformed

    private void kbntDecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbntDecoActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment déconnecter?", "Déconnecter", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            Main.super.dispose();
            login lg = new login();
            lg.setVisible(true);
        }
    }//GEN-LAST:event_kbntDecoActionPerformed

    private void kbtnInscriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnInscriActionPerformed
        jTableEleve.setSelectedIndex(0);
    }//GEN-LAST:event_kbtnInscriActionPerformed

    private void kbtnListeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnListeActionPerformed
        jTableEleve.setSelectedIndex(1);
    }//GEN-LAST:event_kbtnListeActionPerformed

    private void txtAnneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnneActionPerformed

    }//GEN-LAST:event_txtAnneActionPerformed

    private void txtTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyReleased
        // TODO add your handling code here:
        String valeur = txtTel.getText().toString();
        int ln = valeur.length();
        if (txtTel.getText().matches("[0-9,C]*")) {
            if (ln > 10) {
                valeur = valeur.substring(0, ln - 1);
            }
            txtTel.setText(valeur);
        } else {
            valeur = valeur.substring(0, ln - 1);
            txtTel.setText(valeur);

        }
    }//GEN-LAST:event_txtTelKeyReleased

    private void txtTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyPressed
        // TODO add your handling code here:
        String valeur = txtTel.getText().toString();
        int ln = valeur.length();
        if (txtTel.getText().matches("[0-9,C]*")) {
            if (ln > 10) {
                valeur = valeur.substring(0, ln - 1);
            }
            txtTel.setText(valeur);
        } else {
            valeur = valeur.substring(0, ln - 1);
            txtTel.setText(valeur);

        }
    }//GEN-LAST:event_txtTelKeyPressed

    private void txtNomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomFocusLost
        // TODO add your handling code here:
        txtNom.setText(txtNom.getText().toString().toUpperCase());
    }//GEN-LAST:event_txtNomFocusLost

    private void comboClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClasseActionPerformed

    private void txtMatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKeyReleased
        // TODO add your handling code here:
        String valeur = txtMat.getText().toString();
        int ln = valeur.length();
        if (txtMat.getText().matches("[0-9,C]*")) {
            if (ln > 4) {
                valeur = valeur.substring(0, ln - 1);
            }
            txtMat.setText(valeur);
        } else {
            valeur = valeur.substring(0, ln - 1);
            txtMat.setText(valeur);

        }
    }//GEN-LAST:event_txtMatKeyReleased

    private void txtMatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKeyPressed
        // TODO add your handling code here:
        String valeur = txtMat.getText().toString();
        int ln = valeur.length();
        if (txtMat.getText().matches("[0-9,C]*")) {
            if (ln > 4) {
                valeur = valeur.substring(0, ln - 1);
            }
            txtMat.setText(valeur);
        } else {
            valeur = valeur.substring(0, ln - 1);
            txtMat.setText(valeur);

        }

    }//GEN-LAST:event_txtMatKeyPressed

    private void kbtnAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnAjoutActionPerformed
        String num = txtMat.getText();
        String classe = comboClasse.getSelectedItem().toString();
        String anne = txtAnne.getText();
        String nom = txtNom.getText();
        String prenom = txtPrenom.getText();
        String date = txtdate.getText();
        String lieu = txtLieu.getText();
        String pere = txtPere.getText();
        String mere = txtMere.getText();
        String adresse = txtAdresse.getText();
        String tel = txtTel.getText();
        if (num.equals("") || classe.equals("") || anne.equals("") || nom.equals("") || prenom.equals("") || date.equals("") || lieu.equals("") || pere.equals("") || mere.equals("") || adresse.equals("") || tel.equals("")) {
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
            txtMat.requestFocus();
        }
        try {
            Eleve el = new Eleve(num, nom, prenom, date, lieu, pere, mere, adresse, tel, anne, classe);
            gestionEleve ge = new gestionEleve();
            ge.insert(el);
            JOptionPane.showMessageDialog(null, "Élève ajouté");
            Effacer();
            Table();

        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_kbtnAjoutActionPerformed

    private void kbtnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnModifActionPerformed
        String num = txtMat.getText();
        String nom = txtNom.getText();
        String prenom = txtPrenom.getText();
        String date = txtdate.getText();
        String lieu = txtLieu.getText();
        String adresse = txtAdresse.getText();
        String tel = txtTel.getText();
        String classe = comboClasse.getSelectedItem().toString();
        String annee = txtAnne.getText();
        if (num.equals("") || nom.equals("") || prenom.equals("") || date.equals("") || lieu.equals("") || adresse.equals("") || tel.equals("") || classe.equals("") || annee.equals("")) {
            JOptionPane.showMessageDialog(null, "Veuillez remplir les champs");
            txtMat.requestFocus();
        } else {
            dtm = (DefaultTableModel) tableEleve.getModel();
            int select = tableEleve.getSelectedRow();
            try {

                Eleve ele = new Eleve(num, nom, prenom, date, lieu, adresse, tel, annee, classe);
                gestionEleve geEl = new gestionEleve();
                geEl.update(num, ele);
                JOptionPane.showMessageDialog(null, "Élève Modifié");
                Table();
                Effacer();

            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_kbtnModifActionPerformed

    private void kbtnSuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnSuppActionPerformed
        dtm = (DefaultTableModel) tableEleve.getModel();
        int select = tableEleve.getSelectedRow();
        try {
            int num = Integer.parseInt(dtm.getValueAt(select, 0).toString());
            int result = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment supprimer?", "Warning", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                gestionEleve geEL = new gestionEleve();
                geEL.delete(num);
                JOptionPane.showMessageDialog(null, "Prof supprimé");
                Table();
                Effacer();

            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_kbtnSuppActionPerformed

    private void kbtnEffacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnEffacerActionPerformed
        Effacer();
    }//GEN-LAST:event_kbtnEffacerActionPerformed

    private void txtNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomKeyReleased
        String valeur = txtNom.getText().toString();
        int ln = valeur.length();
        if (txtNom.getText().matches("[A-Z,a-z]*")) {
            txtNom.setText(valeur);
        } else {
            valeur = valeur.substring(0, ln - 1);
            txtNom.setText(valeur);

        }


    }//GEN-LAST:event_txtNomKeyReleased

    private void txtAnneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnneKeyPressed
        String valeur = txtAnne.getText().toString();
        int ln = valeur.length();
        if (txtAnne.getText().matches("[0-9,C]*")) {
            if (ln > 4) {
                valeur = valeur.substring(0, ln - 1);
            }
            txtAnne.setText(valeur);
        } else {
            valeur = valeur.substring(0, ln - 1);
            txtAnne.setText(valeur);

        }
    }//GEN-LAST:event_txtAnneKeyPressed

    private void txtAnneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnneKeyReleased
        String valeur = txtAnne.getText().toString();
        int ln = valeur.length();
        if (txtAnne.getText().matches("[0-9,C]*")) {
            if (ln > 4) {
                valeur = valeur.substring(0, ln - 1);
            }
            txtAnne.setText(valeur);
        } else {
            valeur = valeur.substring(0, ln - 1);
            txtAnne.setText(valeur);

        }
    }//GEN-LAST:event_txtAnneKeyReleased

    private void txtPrenomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrenomKeyPressed
        String valeur = txtPrenom.getText().toString();
        int ln = valeur.length();
        if (txtPrenom.getText().matches("[A-Z, ,é , 1,a-z]*")) {

            txtPrenom.setText(valeur);
        } else {
            valeur = valeur.substring(0, ln - 1);
            txtPrenom.setText(valeur);

        }


    }//GEN-LAST:event_txtPrenomKeyPressed

    private void txtPrenomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrenomKeyReleased
        String valeur = txtPrenom.getText().toString();
        int ln = valeur.length();
        if (txtPrenom.getText().matches("[A-Z, ,é , 1,a-z]*")) {

            txtPrenom.setText(valeur);
        } else {
            valeur = valeur.substring(0, ln - 1);
            txtPrenom.setText(valeur);

        }
    }//GEN-LAST:event_txtPrenomKeyReleased

    private void txtMatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatFocusLost
        String num = txtMat.getText();
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT numMat FROM Eleve");
            rs = ps.executeQuery();
            while (rs.next()) {

                String valeur = rs.getString("numMat");
                if (num.equals(valeur)) {
                    JOptionPane.showMessageDialog(null, "On a déjà pri ce numero,Veuillez saisir une autre!!!");
                    txtMat.setText("");
                    txtMat.requestFocus();

                }

            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_txtMatFocusLost

    private void btnImprim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprim1ActionPerformed
        MessageFormat head = new MessageFormat("Listes des élèves présents");
        MessageFormat pied = new MessageFormat("Page {0,number,integer}");
        try {
            tablePresent.print(JTable.PrintMode.NORMAL, head, pied);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Erreur d'impression", e.getMessage());
        }
    }//GEN-LAST:event_btnImprim1ActionPerformed

    private void btnImprim2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprim2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprim2ActionPerformed

    private void recherche1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recherche1ActionPerformed
        int x;
        String classe = ComboCourClasse.getSelectedItem().toString();
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT libMat,jour,date FROM Cours where libClass=?");
            ps.setString(1, classe);
            rs = ps.executeQuery();
            rmd = rs.getMetaData();
            x = rmd.getColumnCount();
            dtm = (DefaultTableModel) tableCour.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector ve = new Vector();
                for (int i = 1; i <= x; i++) {
                    ve.add(rs.getString("jour"));
                    ve.add(rs.getString("date"));
                    ve.add(rs.getString("libMat"));

                }
                dtm.addRow(ve);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_recherche1ActionPerformed

    private void kGradientPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel2MouseClicked
        // TODO add your handling code here:
        MenuForm.setSelectedIndex(2);
    }//GEN-LAST:event_kGradientPanel2MouseClicked

    private void kGradientPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel3MouseClicked
        // TODO add your handling code here:
        MenuForm.setSelectedIndex(6);
    }//GEN-LAST:event_kGradientPanel3MouseClicked

    private void kGradientPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseClicked
        // TODO add your handling code here:
        MenuForm.setSelectedIndex(1);
    }//GEN-LAST:event_kGradientPanel1MouseClicked

    private void kbntEnregistreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbntEnregistreActionPerformed
        // TODO add your handling code here:
        String classe = comboClasseCour.getSelectedItem().toString();
        String matiere = ComboMatiereCours.getSelectedItem().toString();
        String jour = ComboJour.getSelectedItem().toString();
        String date = txtDateCour.getText();
        try {
            Cours cour = new Cours(classe, matiere, jour, date);
            gestionCours geCour = new gestionCours();
            geCour.insert(cour);
            JOptionPane.showMessageDialog(null, " Cours ajouté");
            tableCours();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_kbntEnregistreActionPerformed

    private void comboCoursPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_comboCoursPropertyChange
        
    }//GEN-LAST:event_comboCoursPropertyChange

    private void Combo() {
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT distinct(libClass) FROM Classe");
            rs = ps.executeQuery();
            while (rs.next()) {
                String valeur = rs.getString("libClass");
                comboClasse.addItem(valeur);
                comboRechClass.addItem(valeur);
            }

        } catch (Exception e) {
        }
    }

    private void comboAnne() {
        try {
            cnx = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            ps = cnx.prepareStatement("SELECT distinct(anneeSco) FROM Eleve");
            rs = ps.executeQuery();
            while (rs.next()) {
                String valeur = rs.getString("anneeSco");
                comboRechAnne.addItem(valeur);
            }

        } catch (Exception e) {
        }
    }

    public void Effacer() {
        txtMat.setText("");
        txtNom.setText("");
        txtAnne.setText("");
        txtPrenom.setText("");
        txtdate.setText("");
        txtLieu.setText("");
        txtPere.setText("");
        txtMere.setText("");
        txtAdresse.setText("");
        txtTel.setText("");
        txtMat.requestFocus();
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ClasseForm;
    private javax.swing.JComboBox<String> ComboCourClasse;
    private javax.swing.JComboBox<String> ComboDate;
    private javax.swing.JComboBox<String> ComboDatePresent;
    private javax.swing.JComboBox<String> ComboJour;
    private javax.swing.JComboBox<String> ComboMatiereCours;
    private javax.swing.JTabbedPane MenuForm;
    private javax.swing.JPanel absenceForm;
    private javax.swing.JButton btnAjoutAbs;
    private javax.swing.JButton btnAjoutAbsent;
    private javax.swing.JButton btnAjoutProf;
    private javax.swing.JButton btnAnnul;
    private javax.swing.JButton btnAnnul1;
    private javax.swing.JButton btnAnnul2;
    private javax.swing.JButton btnAnnul3;
    private javax.swing.JButton btnAnnul4;
    private javax.swing.JButton btnAnnul5;
    private javax.swing.JButton btnAnnulProf;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnDetails1;
    private javax.swing.JButton btnImprim;
    private javax.swing.JButton btnImprim1;
    private javax.swing.JButton btnImprim2;
    private javax.swing.JButton btnListeAbsent;
    private javax.swing.JButton btnModifAbs;
    private javax.swing.JButton btnModifProf;
    private javax.swing.JButton btnRecherche;
    private javax.swing.JButton btnRecherchePresent;
    private javax.swing.JButton btnSuppAbs;
    private javax.swing.JButton btnSuppProf;
    private javax.swing.JComboBox<String> comboClass;
    private javax.swing.JComboBox<String> comboClassPresent;
    private javax.swing.JComboBox<String> comboClasse;
    private javax.swing.JComboBox<String> comboClasseCour;
    private javax.swing.JComboBox<String> comboCours;
    private javax.swing.JComboBox<String> comboMatricule;
    private javax.swing.JComboBox<String> comboRechAnne;
    private javax.swing.JComboBox<String> comboRechClass;
    private javax.swing.JPanel coursForm;
    private javax.swing.JPanel eleveForm;
    private javax.swing.JLabel idtxt;
    private org.jfree.chart.resources.JFreeChartResources jFreeChartResources1;
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
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableClasse;
    private javax.swing.JTabbedPane jTableEleve;
    private javax.swing.JTable jTableMatiere;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private com.k33ptoo.components.KGradientPanel kGradientPanel5;
    private com.k33ptoo.components.KGradientPanel kGradientPanel6;
    private com.k33ptoo.components.KGradientPanel kGradientPanel7;
    private com.k33ptoo.components.KGradientPanel kGradientPanel9;
    private com.k33ptoo.components.KButton kbntDeco;
    private com.k33ptoo.components.KButton kbntEnregistre;
    private com.k33ptoo.components.KButton kbtnAbs;
    private com.k33ptoo.components.KButton kbtnAjout;
    private com.k33ptoo.components.KButton kbtnCour;
    private com.k33ptoo.components.KButton kbtnEffacer;
    private com.k33ptoo.components.KButton kbtnEleve;
    private com.k33ptoo.components.KButton kbtnInscri;
    private com.k33ptoo.components.KButton kbtnListe;
    private com.k33ptoo.components.KButton kbtnMenu;
    private com.k33ptoo.components.KButton kbtnModif;
    private com.k33ptoo.components.KButton kbtnProf;
    private com.k33ptoo.components.KButton kbtnSupp;
    private javax.swing.JLabel labelClasse;
    private javax.swing.JLabel labelEleve;
    private javax.swing.JLabel labelInscri;
    private javax.swing.JLabel labelMatiere;
    private javax.swing.JLabel labelProf;
    private javax.swing.JLabel lbAbs;
    private javax.swing.JLabel lbActu;
    private javax.swing.JLabel lbAnne;
    private javax.swing.JLabel lbClass;
    private javax.swing.JLabel lbClassCour;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbEleve;
    private javax.swing.JLabel lbJour;
    private javax.swing.JLabel lbMatiere;
    private javax.swing.JLabel lbMere;
    private javax.swing.JLabel lbNoAbs;
    private javax.swing.JLabel lbNom;
    private javax.swing.JLabel lbNumMat;
    private javax.swing.JLabel lbPas;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbPere;
    private javax.swing.JLabel lbPrenom;
    private javax.swing.JLabel lbPresent;
    private javax.swing.JPanel matiereForm;
    private javax.swing.JPanel menuForm;
    private javax.swing.JPanel profForm;
    private javax.swing.JButton recherche;
    private javax.swing.JButton recherche1;
    private javax.swing.JTable tableAbsent;
    private javax.swing.JTable tableCour;
    private javax.swing.JTable tableEleve;
    private javax.swing.JTable tablePresent;
    private javax.swing.JTable tableProf;
    private javax.swing.JTextField txtAdresse;
    private javax.swing.JTextField txtAdresseProf;
    private javax.swing.JTextField txtAnne;
    private javax.swing.JTextField txtCin;
    private javax.swing.JLabel txtDate;
    private javax.swing.JFormattedTextField txtDateCour;
    private javax.swing.JFormattedTextField txtFin;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLieu;
    private javax.swing.JTextField txtMat;
    private javax.swing.JTextField txtMere;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNomProf;
    private javax.swing.JTextField txtPere;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtPrenomProf;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtTelProf;
    private javax.swing.JLabel txtUser;
    private javax.swing.JTextArea txtaMotif;
    private javax.swing.JFormattedTextField txtdate;
    private javax.swing.JLabel Élèves;
    // End of variables declaration//GEN-END:variables
}
