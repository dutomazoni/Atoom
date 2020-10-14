/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atoom;


import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.border.EmptyBorder;
import java.io.File;
import javafx.scene.web.WebView;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Timer;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.swing.JFrame;






/**
 *
 * @author Dudut
 */
public class atoomUI extends JFrame {

    /**
     * Creates new form atoomUI
     */
    
    String filePath = "";
    ImageIcon img;
    Clip clip = null;
    AudioInputStream audioInputStream = null;
    static int fullDuration = 0 ;
    static int curDuration = 0 ;
    String durLabel = "";
    MediaPlayer player;
    String url = "";
    
    //JFrame myFrame = new JFrame();
    JFXPanel javafxPanel;
    WebView webComponent;
    
    

    public atoomUI() {

        
        initComponents();
        javafxPanel = new JFXPanel();
        webPanel.setLayout(new BorderLayout());
        webPanel.add(javafxPanel, BorderLayout.CENTER);
        fileBrowser.setVisible(false);
        btImg.setVisible(false);
        fullDurationLabel.setVisible(false);
        curDurationLabel.setVisible(false);
        videoPanel.setVisible(false);
        
        
        webPanel.setSize(450,450);
        
        
        
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
        btPlay = new javax.swing.JButton();
        btPause = new javax.swing.JButton();
        btStop = new javax.swing.JButton();
        btMarker = new javax.swing.JButton();
        fileBrowser = new javax.swing.JFileChooser();
        audioProgress = new javax.swing.JProgressBar();
        fullDurationLabel = new javax.swing.JLabel();
        curDurationLabel = new javax.swing.JLabel();
        btImg = new javax.swing.JButton();
        videoPanel = new javax.swing.JPanel();
        btPlayVideo = new javax.swing.JButton();
        btPauseVideo = new javax.swing.JButton();
        btStopVideo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        webPanel = new javax.swing.JPanel();
        urlField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rs/play.png"))); // NOI18N
        btPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPlayActionPerformed(evt);
            }
        });

        btPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rs/pause.png"))); // NOI18N
        btPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPauseActionPerformed(evt);
            }
        });

        btStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rs/stop.png"))); // NOI18N
        btStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStopActionPerformed(evt);
            }
        });

        btMarker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rs/add.png"))); // NOI18N
        btMarker.setText("Add Marker");
        btMarker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMarkerActionPerformed(evt);
            }
        });

        audioProgress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                audioProgressMouseClicked(evt);
            }
        });

        fullDurationLabel.setText("teste");

        curDurationLabel.setText("teste");

        btImg.setAutoscrolls(true);
        btImg.setMaximumSize(null);
        btImg.setMinimumSize(null);

        videoPanel.setAlignmentX(0.0F);
        videoPanel.setAlignmentY(0.0F);

        btPlayVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rs/play.png"))); // NOI18N
        btPlayVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPlayVideoActionPerformed(evt);
            }
        });

        btPauseVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rs/pause.png"))); // NOI18N
        btPauseVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPauseVideoActionPerformed(evt);
            }
        });

        btStopVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rs/stop.png"))); // NOI18N
        btStopVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStopVideoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout videoPanelLayout = new javax.swing.GroupLayout(videoPanel);
        videoPanel.setLayout(videoPanelLayout);
        videoPanelLayout.setHorizontalGroup(
            videoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(videoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btPlayVideo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btPauseVideo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btStopVideo))
        );
        videoPanelLayout.setVerticalGroup(
            videoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, videoPanelLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(videoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btStopVideo)
                    .addComponent(btPauseVideo)
                    .addComponent(btPlayVideo)))
        );

        jButton1.setText("go!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout webPanelLayout = new javax.swing.GroupLayout(webPanel);
        webPanel.setLayout(webPanelLayout);
        webPanelLayout.setHorizontalGroup(
            webPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        webPanelLayout.setVerticalGroup(
            webPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(audioProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(curDurationLabel)
                                .addGap(171, 171, 171)
                                .addComponent(btMarker)
                                .addGap(35, 35, 35)
                                .addComponent(btPlay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btPause)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btStop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fileBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                                .addComponent(fullDurationLabel))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(videoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(webPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(urlField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(webPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(videoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 393, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(urlField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fileBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(audioProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullDurationLabel)
                            .addComponent(curDurationLabel)
                            .addComponent(btPlay)
                            .addComponent(btPause)
                            .addComponent(btStop)
                            .addComponent(btMarker))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void audioProgressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_audioProgressMouseClicked
        // TODO add your handling code here:

        //mouse position relative to the component origin
        int mouseX = evt.getX();

        //Computes how far along the mouse is relative to the component width then multiply it by the progress bar's maximum value
        curDuration = (int)Math.round(((double)mouseX / (double)audioProgress.getWidth()) * audioProgress.getMaximum());

        durLabel = String.format("%d:%02d:%02d",  curDuration / 3600, ( curDuration % 3600) / 60, ( curDuration % 60));
        curDurationLabel.setText(durLabel);
        audioProgress.setValue(curDuration);
        clip.setMicrosecondPosition(curDuration * 1000000);

        audioProgress.revalidate();
        curDurationLabel.revalidate();
    }//GEN-LAST:event_audioProgressMouseClicked

    private void getVideo(String videoPath){
            final JFXPanel VFXPanel = new JFXPanel();

            File video_source = new File(videoPath);
            Media m = new Media(video_source.toURI().toString());
            player = new MediaPlayer(m);
            MediaView viewer = new MediaView(player);

            StackPane root = new StackPane();
            Scene scene = new Scene(root);

            viewer.setFitWidth(500);
            viewer.setFitHeight(500);
            viewer.setPreserveRatio(true);

            // add video to stackpane
            root.getChildren().add(viewer);

            VFXPanel.setScene(scene);
            
            videoPanel.setVisible(true);
            
            videoPanel.setLayout(new BorderLayout());
            videoPanel.add(VFXPanel, BorderLayout.CENTER);
            player.play();
    }
    
    private void loadJavaFXScene(){
      Platform.runLater(new Runnable() {
      @Override
      public void run() {

        BorderPane borderPane = new BorderPane();
        webComponent = new WebView();
        url = urlField.getText();
        webComponent.getEngine().load(url);

        borderPane.setCenter(webComponent);
        Scene scene = new Scene(borderPane,450,450);
        javafxPanel.setScene(scene);

      }
    });
    }
    
    private void btMarkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMarkerActionPerformed
        // TODO add your handling code here:


        fileBrowser.setVisible(true);
        
        File file = null;

        int returnVal = fileBrowser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            file = fileBrowser.getSelectedFile();
            filePath = file.getAbsolutePath();
        }else {
            System.out.println("File access cancelled by user.");
        }

        System.out.println(filePath);

        String type = filePath.substring(filePath.length() - 3);
        System.out.println(type);

        if(type.equals("pdf"))
        {
            
        }
        
        
        if (type.equals("mp4"))
        {
            getVideo(filePath);
        }
        
        
        if (type.equals("jpg") || type.equals("png"))
        {

            try {
                
                BufferedImage bimg;
                bimg = ImageIO.read(file);
                Image scaledImage = bimg.getScaledInstance(460, 460, Image.SCALE_SMOOTH);

                img = new ImageIcon(scaledImage);

                btImg.setBorder (new EmptyBorder(0,0,0,0));
                btImg.setOpaque(false);
                btImg.setIcon(img);
                btImg.setVisible(true);

            } catch (IOException ex) {
                Logger.getLogger(atoomUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (type.equals("wav"))
        {

            try {

                fullDurationLabel.setVisible(true);
                curDurationLabel.setVisible(true);

                audioInputStream = AudioSystem.getAudioInputStream(file);
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();

                fullDuration = (int) (clip.getMicrosecondLength()/1000000);
                fullDurationLabel.setText(String.format("%d:%02d:%02d",  fullDuration / 3600, ( fullDuration % 3600) / 60, ( fullDuration % 60)));

                curDuration = (int) (clip.getMicrosecondPosition()/1000000);
                curDurationLabel.setText(String.format("%d:%02d:%02d",  curDuration / 3600, ( curDuration % 3600) / 60, ( curDuration % 60)));

                audioProgress.setMinimum(0);
                audioProgress.setMaximum(fullDuration);
                //String.format("%d:%02d:%02d", s / 3600, (s % 3600) / 60, (s % 60));

                //curTime = String.format("%d:%02d:%02d",  curDuration / 3600, ( curDuration % 3600) / 60, ( curDuration % 60));

                int delay = 200; //milliseconds
                ActionListener updateProgressBar = new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {

                        curDuration = (int) (clip.getMicrosecondPosition()/1000000);
                        durLabel = String.format("%d:%02d:%02d",  curDuration / 3600, ( curDuration % 3600) / 60, ( curDuration % 60));
                        curDurationLabel.setText(durLabel);
                        audioProgress.setValue(curDuration);

                        audioProgress.revalidate();
                        curDurationLabel.revalidate();
                        System.out.println("executei");
                    }
                };
                new Timer(delay, updateProgressBar).start();

            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                Logger.getLogger(atoomUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btMarkerActionPerformed

    private void btStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStopActionPerformed
        // TODO add your handling code here:
        clip.stop();
        clip.setMicrosecondPosition(0);
    }//GEN-LAST:event_btStopActionPerformed

    private void btPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPauseActionPerformed
        // TODO add your handling code here:
        clip.stop();
    }//GEN-LAST:event_btPauseActionPerformed

    private void btPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlayActionPerformed
        // TODO add your handling code here:
        clip.start();
    }//GEN-LAST:event_btPlayActionPerformed

    private void btStopVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStopVideoActionPerformed
        // TODO add your handling code here:
        player.stop();
        //clip.setMicrosecondPosition(0);
    }//GEN-LAST:event_btStopVideoActionPerformed

    private void btPauseVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPauseVideoActionPerformed
        // TODO add your handling code here:
        player.pause();
    }//GEN-LAST:event_btPauseVideoActionPerformed

    private void btPlayVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlayVideoActionPerformed
        // TODO add your handling code here:
        player.play();
    }//GEN-LAST:event_btPlayVideoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        loadJavaFXScene();
    }//GEN-LAST:event_jButton1ActionPerformed

    

    

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
            java.util.logging.Logger.getLogger(atoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(atoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(atoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(atoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new atoomUI().setVisible(true);
                
                
                
            }
        });
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JProgressBar audioProgress;
    private javax.swing.JButton btImg;
    private javax.swing.JButton btMarker;
    private javax.swing.JButton btPause;
    private javax.swing.JButton btPauseVideo;
    private javax.swing.JButton btPlay;
    private javax.swing.JButton btPlayVideo;
    private javax.swing.JButton btStop;
    private javax.swing.JButton btStopVideo;
    private javax.swing.JLabel curDurationLabel;
    private javax.swing.JFileChooser fileBrowser;
    private javax.swing.JLabel fullDurationLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField urlField;
    private javax.swing.JPanel videoPanel;
    private javax.swing.JPanel webPanel;
    // End of variables declaration//GEN-END:variables



    }

    
