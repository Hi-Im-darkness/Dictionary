package graphic;

import core.Dictionary;
import java.util.ArrayList;

public class MainMenu extends javax.swing.JFrame {
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        SwingUtil.setUIFont(SwingUtil.defaultFont);
        initComponents();
        additionInit();
    }
    
    private void additionInit() {
        listButton = new ArrayList<>();
        listButton.add(reviseButton);
        listButton.add(managerButton);
        listButton.add(statisticButton);
        listButton.add(translateButton);
        this.setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                Dictionary.getInstance().exit();
                System.exit(0);
            }
        });
        
        this.setIconImage(new javax.swing.ImageIcon("icon/icons8-books-22.png").getImage());
        
        translateButton.setIcon(new javax.swing.ImageIcon("icon/icons8-google-translate-30.png"));
        managerButton.setIcon(new javax.swing.ImageIcon("icon/icons8-list-30.png"));
        reviseButton.setIcon(new javax.swing.ImageIcon("icon/icons8-study-30.png"));
        statisticButton.setIcon(new javax.swing.ImageIcon("icon/icons8-statistics-30.png"));
        
        java.awt.Image rawImg = new javax.swing.ImageIcon("icon/home.jpg").getImage();
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon(rawImg.getScaledInstance(600, 500, java.awt.Image.SCALE_SMOOTH));
        homeLabel.setIcon(icon);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        translateButton = new javax.swing.JButton();
        managerButton = new javax.swing.JButton();
        reviseButton = new javax.swing.JButton();
        statisticButton = new javax.swing.JButton();
        parentPanel = new javax.swing.JPanel();
        startPanel = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        translatePanel = new graphic.TranslatePanel();
        managerPanel = new graphic.ManagerPanel();
        revisePanel = new graphic.RevisePanel();
        statisticPanel = new graphic.StatisticPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Learn English");
        setAutoRequestFocus(false);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(56, 60, 75));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        translateButton.setBackground(new java.awt.Color(56, 60, 75));
        translateButton.setForeground(java.awt.Color.white);
        translateButton.setText("   Translate");
        translateButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        translateButton.setContentAreaFilled(false);
        translateButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        translateButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        translateButton.setOpaque(true);
        translateButton.setPreferredSize(new java.awt.Dimension(72, 30));
        translateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                highlightButton(evt);
            }
        });
        translateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                translateButtonActionPerformed(evt);
            }
        });

        managerButton.setBackground(new java.awt.Color(56, 60, 75));
        managerButton.setForeground(java.awt.Color.white);
        managerButton.setText("   Vocabulary Manager");
        managerButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        managerButton.setContentAreaFilled(false);
        managerButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        managerButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        managerButton.setOpaque(true);
        managerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                highlightButton(evt);
            }
        });
        managerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerButtonActionPerformed(evt);
            }
        });

        reviseButton.setBackground(new java.awt.Color(56, 60, 75));
        reviseButton.setForeground(java.awt.Color.white);
        reviseButton.setText("   Revise");
        reviseButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        reviseButton.setContentAreaFilled(false);
        reviseButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reviseButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        reviseButton.setOpaque(true);
        reviseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                highlightButton(evt);
            }
        });
        reviseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviseButtonActionPerformed(evt);
            }
        });

        statisticButton.setBackground(new java.awt.Color(56, 60, 75));
        statisticButton.setForeground(java.awt.Color.white);
        statisticButton.setText("   Statistic");
        statisticButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        statisticButton.setContentAreaFilled(false);
        statisticButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        statisticButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        statisticButton.setOpaque(true);
        statisticButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                highlightButton(evt);
            }
        });
        statisticButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statisticButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reviseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(managerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
            .addComponent(translateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(translateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(managerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(reviseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(statisticButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        parentPanel.setLayout(new java.awt.CardLayout());

        startPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        homeLabel.setBackground(new java.awt.Color(56, 60, 75));

        javax.swing.GroupLayout startPanelLayout = new javax.swing.GroupLayout(startPanel);
        startPanel.setLayout(startPanelLayout);
        startPanelLayout.setHorizontalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );
        startPanelLayout.setVerticalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        parentPanel.add(startPanel, "card4");

        translatePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        parentPanel.add(translatePanel, "card2");
        parentPanel.add(managerPanel, "card3");
        parentPanel.add(revisePanel, "card5");
        parentPanel.add(statisticPanel, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reviseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviseButtonActionPerformed
        parentPanel.removeAll();
        parentPanel.add(revisePanel);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_reviseButtonActionPerformed

    private void statisticButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticButtonActionPerformed
        parentPanel.removeAll();
        parentPanel.add(statisticPanel);
        statisticPanel.updateHistory();
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_statisticButtonActionPerformed

    private void highlightButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_highlightButton
        javax.swing.JButton source = (javax.swing.JButton)evt.getSource();
        for (javax.swing.JButton b: listButton) {
            if (source == b)
                b.setBackground(SwingUtil.highlight);
            else
                b.setBackground(SwingUtil.nonHighlight);
        }
    }//GEN-LAST:event_highlightButton

    private void translateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_translateButtonActionPerformed
        translatePanel.updateSearchBox();
        translatePanel.updateSearchHistory();
        parentPanel.removeAll();
        parentPanel.add(translatePanel);
        parentPanel.repaint();
        parentPanel.revalidate();
        
    }//GEN-LAST:event_translateButtonActionPerformed

    private void managerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerButtonActionPerformed
        parentPanel.removeAll();
        parentPanel.add(managerPanel);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_managerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton managerButton;
    private graphic.ManagerPanel managerPanel;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JButton reviseButton;
    private graphic.RevisePanel revisePanel;
    private javax.swing.JPanel startPanel;
    private javax.swing.JButton statisticButton;
    private graphic.StatisticPanel statisticPanel;
    private javax.swing.JButton translateButton;
    private graphic.TranslatePanel translatePanel;
    // End of variables declaration//GEN-END:variables
    
    private ArrayList<javax.swing.JButton> listButton;
}
