/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klijent;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author raka
 */
public class RadSaOsobamaGUI extends javax.swing.JFrame {

    /**
     * Creates new form RadSaOsobamaGUI
     */
    private String formatiranDatum;
    private PocetnaGUI pocetnaGUI;
    
    public RadSaOsobamaGUI(PocetnaGUI pocetnaGUI) {
        initComponents();
        dodatnaLabel1.setText("Telefon:");
        dodatnaLabel2.setText("Email:");
        dodatnaLabel3.setText("Datum:");
        dodatnaLabel4.setText("Teks:");
        dodatnaLabel1.setVisible(true);
        dodatnaLabel2.setVisible(true);
        dodatnaLabel3.setVisible(true);
        dodatnaLabel4.setVisible(true);
        dodatniTextField1.setVisible(true);
        dodatniTextField2.setVisible(true);
        dodatniTextField3.setVisible(true);
        dodatniTextField4.setVisible(true);
        textAreaScrollPane.setVisible(true);
        dodatniTextField3.setText(getDatum());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.pocetnaGUI = pocetnaGUI;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        izborOsobeComboBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        dodatniTextField1 = new javax.swing.JTextField();
        dodatnaLabel1 = new javax.swing.JLabel();
        prezimeUnosOsobeTextField = new javax.swing.JTextField();
        dodatnaLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dodatnaLabel3 = new javax.swing.JLabel();
        dodatnaLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dodatniTextField3 = new javax.swing.JTextField();
        imeUnosOsobeTextField = new javax.swing.JTextField();
        dodatniTextField2 = new javax.swing.JTextField();
        textAreaScrollPane = new javax.swing.JScrollPane();
        dodatniTextField4 = new javax.swing.JTextArea();
        zavrsiUnosOsobeDugme = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RAD SA OSOBAMA");

        jLabel2.setText("Osoba:");

        izborOsobeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Organizator", "Predavac", "Ucesnik" }));
        izborOsobeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izborOsobeComboBoxActionPerformed(evt);
            }
        });

        dodatnaLabel1.setText("dodatna1");

        dodatnaLabel4.setText("dodatna4");

        jLabel3.setText("Ime:");

        dodatnaLabel3.setText("dodatna3");

        dodatnaLabel2.setText("dodatna2");

        jLabel4.setText("Prezime:");

        dodatniTextField4.setColumns(20);
        dodatniTextField4.setRows(5);
        textAreaScrollPane.setViewportView(dodatniTextField4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(dodatnaLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dodatnaLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dodatnaLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dodatnaLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imeUnosOsobeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prezimeUnosOsobeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dodatniTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dodatniTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dodatniTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAreaScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(dodatnaLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imeUnosOsobeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prezimeUnosOsobeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dodatniTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dodatnaLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dodatniTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dodatnaLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dodatniTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dodatnaLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textAreaScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        zavrsiUnosOsobeDugme.setText("Dodaj");

        jButton1.setText("Izmjeni");

        jButton3.setText("Izbrisi");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(izborOsobeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zavrsiUnosOsobeDugme, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(izborOsobeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zavrsiUnosOsobeDugme)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void izborOsobeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izborOsobeComboBoxActionPerformed

        String osoba = (String) izborOsobeComboBox.getSelectedItem();
        if (osoba.equals("Organizator")) {
            dodatnaLabel1.setText("Telefon:");
            dodatnaLabel2.setText("Email:");
            dodatnaLabel3.setText("Datum:");
            dodatnaLabel4.setText("Teks:");
            dodatnaLabel1.setVisible(true);
            dodatnaLabel2.setVisible(true);
            dodatnaLabel3.setVisible(true);
            dodatnaLabel4.setVisible(true);
            dodatniTextField3.setText(getDatum());
            dodatniTextField1.setVisible(true);
            dodatniTextField2.setVisible(true);
            dodatniTextField3.setVisible(true);
            dodatniTextField4.setVisible(true);
            textAreaScrollPane.setVisible(true);
            
        }
        else if(osoba.equals("Predavac")) {
            dodatnaLabel1.setVisible(false);
            dodatnaLabel2.setVisible(false);
            dodatnaLabel3.setVisible(false);
            dodatnaLabel4.setVisible(false);
            dodatniTextField1.setVisible(false);
            dodatniTextField2.setVisible(false);
            dodatniTextField3.setVisible(false);
            dodatniTextField4.setVisible(false);
            textAreaScrollPane.setVisible(false);
        } 
        else if(osoba.equals("Ucesnik")) {
            dodatnaLabel1.setText("Organizacija:");
            dodatnaLabel1.setVisible(true);
            dodatnaLabel2.setVisible(false);
            dodatnaLabel3.setVisible(false);
            dodatnaLabel4.setVisible(false);
            dodatniTextField1.setVisible(true);
            dodatniTextField2.setVisible(false);
            dodatniTextField3.setVisible(false);
            dodatniTextField4.setVisible(false);//textArea
            textAreaScrollPane.setVisible(false);//panel u kome se nalazi textArea
        }
    }//GEN-LAST:event_izborOsobeComboBoxActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        pocetnaGUI.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dodatnaLabel1;
    private javax.swing.JLabel dodatnaLabel2;
    private javax.swing.JLabel dodatnaLabel3;
    private javax.swing.JLabel dodatnaLabel4;
    private javax.swing.JTextField dodatniTextField1;
    private javax.swing.JTextField dodatniTextField2;
    private javax.swing.JTextField dodatniTextField3;
    private javax.swing.JTextArea dodatniTextField4;
    private javax.swing.JTextField imeUnosOsobeTextField;
    private javax.swing.JComboBox<String> izborOsobeComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField prezimeUnosOsobeTextField;
    private javax.swing.JScrollPane textAreaScrollPane;
    private javax.swing.JButton zavrsiUnosOsobeDugme;
    // End of variables declaration//GEN-END:variables

    public static String getDatum() {
        Calendar datum = Calendar.getInstance();
        datum.add(Calendar.DATE, 0);
        SimpleDateFormat formatDatum = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(datum.getTime());
// Output "Wed Sep 26 14:23:28 EST 2012"
        String formatiranDatum = formatDatum.format(datum.getTime());
        System.out.println(formatiranDatum);
        
        return formatiranDatum;
// Output "2012-09-26"
    }
}
