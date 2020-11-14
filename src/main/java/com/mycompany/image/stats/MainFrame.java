package com.mycompany.image.stats;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JViewport;
import javax.swing.ScrollPaneConstants;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;

public class MainFrame extends javax.swing.JFrame {

    private JFileChooser fc;
    private Mat currentImage;
    private EstadisticasImagen stats;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        nu.pattern.OpenCV.loadShared();
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        
        initEstadisticasImagen();
        initFileChooser();
        initComponents();
        initScrollBars();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statsPane = new javax.swing.JPanel();
        redStatsPane = new javax.swing.JPanel();
        redMinLabel = new javax.swing.JLabel();
        redMinTextField = new javax.swing.JTextField();
        redMaxLabel = new javax.swing.JLabel();
        redMaxTextField = new javax.swing.JTextField();
        redMeanLabel = new javax.swing.JLabel();
        redMeanTextField = new javax.swing.JTextField();
        greenStatsPane = new javax.swing.JPanel();
        greenMinLabel = new javax.swing.JLabel();
        greenMinTextField = new javax.swing.JTextField();
        greenMaxLabel = new javax.swing.JLabel();
        greenMaxTextField = new javax.swing.JTextField();
        greenMeanLabel = new javax.swing.JLabel();
        greenMeanTextField = new javax.swing.JTextField();
        blueStatsPane = new javax.swing.JPanel();
        blueMinLabel = new javax.swing.JLabel();
        blueMinTextField = new javax.swing.JTextField();
        blueMaxLabel = new javax.swing.JLabel();
        blueMaxTextField = new javax.swing.JTextField();
        blueMeanLabel = new javax.swing.JLabel();
        blueMeanTextField = new javax.swing.JTextField();
        jonayLabel = new javax.swing.JLabel();
        samuelLabel = new javax.swing.JLabel();
        lienzoScrollPane = new javax.swing.JScrollPane();
        lienzo = new com.mycompany.image.stats.Lienzo();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estadísticas de Imagen");

        statsPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Estadísticas"));

        redStatsPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Rojo"));

        redMinLabel.setText("Mínimo: ");

        redMinTextField.setEditable(false);
        redMinTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        redMaxLabel.setText("Máximo: ");

        redMaxTextField.setEditable(false);
        redMaxTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        redMeanLabel.setText("Media: ");

        redMeanTextField.setEditable(false);
        redMeanTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout redStatsPaneLayout = new javax.swing.GroupLayout(redStatsPane);
        redStatsPane.setLayout(redStatsPaneLayout);
        redStatsPaneLayout.setHorizontalGroup(
            redStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redStatsPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(redStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redMinLabel)
                    .addComponent(redMaxLabel)
                    .addComponent(redMeanLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(redStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(redMeanTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(redMinTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(redMaxTextField))
                .addContainerGap())
        );
        redStatsPaneLayout.setVerticalGroup(
            redStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redStatsPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(redStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redMinLabel)
                    .addComponent(redMinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(redStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redMaxLabel)
                    .addComponent(redMaxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(redStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redMeanLabel)
                    .addComponent(redMeanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        greenStatsPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Verde"));

        greenMinLabel.setText("Mínimo: ");

        greenMinTextField.setEditable(false);
        greenMinTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        greenMaxLabel.setText("Máximo: ");

        greenMaxTextField.setEditable(false);
        greenMaxTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        greenMeanLabel.setText("Media: ");

        greenMeanTextField.setEditable(false);
        greenMeanTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout greenStatsPaneLayout = new javax.swing.GroupLayout(greenStatsPane);
        greenStatsPane.setLayout(greenStatsPaneLayout);
        greenStatsPaneLayout.setHorizontalGroup(
            greenStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(greenStatsPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(greenStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(greenMinLabel)
                    .addComponent(greenMaxLabel)
                    .addComponent(greenMeanLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(greenStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(greenMeanTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(greenMinTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(greenMaxTextField))
                .addContainerGap())
        );
        greenStatsPaneLayout.setVerticalGroup(
            greenStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(greenStatsPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(greenStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greenMinLabel)
                    .addComponent(greenMinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(greenStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greenMaxLabel)
                    .addComponent(greenMaxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(greenStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greenMeanLabel)
                    .addComponent(greenMeanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        blueStatsPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Azul"));

        blueMinLabel.setText("Mínimo: ");

        blueMinTextField.setEditable(false);
        blueMinTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        blueMaxLabel.setText("Máximo: ");

        blueMaxTextField.setEditable(false);
        blueMaxTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        blueMeanLabel.setText("Media: ");

        blueMeanTextField.setEditable(false);
        blueMeanTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout blueStatsPaneLayout = new javax.swing.GroupLayout(blueStatsPane);
        blueStatsPane.setLayout(blueStatsPaneLayout);
        blueStatsPaneLayout.setHorizontalGroup(
            blueStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blueStatsPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blueStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blueMinLabel)
                    .addComponent(blueMaxLabel)
                    .addComponent(blueMeanLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(blueStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(blueMeanTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(blueMinTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(blueMaxTextField))
                .addContainerGap())
        );
        blueStatsPaneLayout.setVerticalGroup(
            blueStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blueStatsPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blueStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blueMinLabel)
                    .addComponent(blueMinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blueStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blueMaxLabel)
                    .addComponent(blueMaxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blueStatsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blueMeanLabel)
                    .addComponent(blueMeanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jonayLabel.setText("Jonay Suárez Ramírez");

        samuelLabel.setText("Samuel Trujillo Santana");

        javax.swing.GroupLayout statsPaneLayout = new javax.swing.GroupLayout(statsPane);
        statsPane.setLayout(statsPaneLayout);
        statsPaneLayout.setHorizontalGroup(
            statsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(redStatsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greenStatsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blueStatsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(statsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jonayLabel)
                    .addComponent(samuelLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        statsPaneLayout.setVerticalGroup(
            statsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(redStatsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(greenStatsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(blueStatsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statsPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jonayLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(samuelLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );

        lienzoScrollPane.setViewportView(lienzo);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Ficheros");

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openMenuItem.setMnemonic('a');
        openMenuItem.setText("Abrir");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);
        fileMenu.add(jSeparator1);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitMenuItem.setMnemonic('s');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lienzoScrollPane))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(statsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lienzoScrollPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        int result = fc.showOpenDialog(this);
        
        if( result == JFileChooser.APPROVE_OPTION ){
            File file = fc.getSelectedFile();
            try{
                String path = Files.probeContentType(file.toPath());
                if (path == null || !path.startsWith("image/")){
                    JOptionPane.showMessageDialog(this, 
                                         "El archivo seleccionado no es una imagen válida", 
                                         "Archivo no válido", 
                                         JOptionPane.ERROR_MESSAGE);
                    return;
                }

                this.currentImage = Imgcodecs.imread(
                        fc.getSelectedFile().getAbsolutePath());

                this.lienzo.setImage((BufferedImage) HighGui.toBufferedImage(currentImage));
                updateStats();
            }catch(IOException e){
                JOptionPane.showMessageDialog(this, 
                                         "Se produjo un error al intentar abrir el fichero", 
                                         "Error de lectura del fichero", 
                                         JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "¿Desea salir?", "Salir", 
                                                JOptionPane.YES_NO_OPTION);
        
        if( res == JOptionPane.YES_OPTION ){
            System.exit(0);
        }
    }//GEN-LAST:event_exitMenuItemActionPerformed

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
            javax.swing.UIManager.setLookAndFeel(
                    javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blueMaxLabel;
    private javax.swing.JTextField blueMaxTextField;
    private javax.swing.JLabel blueMeanLabel;
    private javax.swing.JTextField blueMeanTextField;
    private javax.swing.JLabel blueMinLabel;
    private javax.swing.JTextField blueMinTextField;
    private javax.swing.JPanel blueStatsPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel greenMaxLabel;
    private javax.swing.JTextField greenMaxTextField;
    private javax.swing.JLabel greenMeanLabel;
    private javax.swing.JTextField greenMeanTextField;
    private javax.swing.JLabel greenMinLabel;
    private javax.swing.JTextField greenMinTextField;
    private javax.swing.JPanel greenStatsPane;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel jonayLabel;
    private com.mycompany.image.stats.Lienzo lienzo;
    private javax.swing.JScrollPane lienzoScrollPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JLabel redMaxLabel;
    private javax.swing.JTextField redMaxTextField;
    private javax.swing.JLabel redMeanLabel;
    private javax.swing.JTextField redMeanTextField;
    private javax.swing.JLabel redMinLabel;
    private javax.swing.JTextField redMinTextField;
    private javax.swing.JPanel redStatsPane;
    private javax.swing.JLabel samuelLabel;
    private javax.swing.JPanel statsPane;
    // End of variables declaration//GEN-END:variables
    private void initFileChooser() {
        FileFilter imgs = new FileNameExtensionFilter(
                "Imagénes (JPEG, PNG, BMP y TIFF)", "jpg", "jpeg", "png", "bmp",
                "dib", "tiff", "tif");
        
        this.fc = new JFileChooser();
        
        this.fc.addChoosableFileFilter(imgs);
        this.fc.setFileFilter(imgs);
    }

    private void initEstadisticasImagen() {
        this.stats = new EstadisticasImagen();
    }

    private void initScrollBars() {
        JScrollBar barraV = this.lienzoScrollPane.getVerticalScrollBar();
        JScrollBar barraH = this.lienzoScrollPane.getHorizontalScrollBar();
        
        lienzoScrollPane.setHorizontalScrollBarPolicy(
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        lienzoScrollPane.setVerticalScrollBarPolicy(
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        barraV.addAdjustmentListener( event -> updateStats());
        barraH.addAdjustmentListener( event -> updateStats());
    }

    private void updateStats() {
        if( currentImage == null ) return;
        
        JViewport viewport = this.lienzoScrollPane.getViewport();
        Point location = viewport.getViewPosition();
        Dimension extentSize = viewport.getExtentSize();
        if( extentSize.width > currentImage.width() - location.x){
            extentSize.width = currentImage.width() - location.x;
        }
        if( extentSize.height > currentImage.height() - location.y){
            extentSize.height = currentImage.height() - location.y;
        }
        this.stats.calculaEstadisticas(currentImage, location,
                extentSize);
        
        // Maximos
        int[] maximos = stats.getMaximo();
        
        this.redMaxTextField.setText(maximos[stats.ROJO] + "");
        this.greenMaxTextField.setText(maximos[stats.VERDE] + "");
        this.blueMaxTextField.setText(maximos[stats.AZUL] + "");
        
        // Minimos
        int[] minimos = stats.getMinimo();
        
        this.redMinTextField.setText(minimos[stats.ROJO] + "");
        this.greenMinTextField.setText(minimos[stats.VERDE] + "");
        this.blueMinTextField.setText(minimos[stats.AZUL] + "");
        
        // Promedios
        int[] medias = stats.getPromedio();
        
        this.redMeanTextField.setText(medias[stats.ROJO] + "");
        this.greenMeanTextField.setText(medias[stats.VERDE] + "");
        this.blueMeanTextField.setText(medias[stats.AZUL] + "");
    }
}
