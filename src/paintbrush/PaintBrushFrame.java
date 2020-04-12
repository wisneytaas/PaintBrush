/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;

import javafx.scene.shape.Circle;

/**
 *
 * @author Disney
 * @author Ernesto
 * @author Raiana
 */
public class PaintBrushFrame extends javax.swing.JFrame{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public static int opcaoAlgoritmo = 0;
    public Reta reta;
    public Retangulo retangulo;
    public Circunferencia circunferencia;

    /**
     * Creates new form PaintBrushFrame
     */
    public PaintBrushFrame() {
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

        retangulo = new Retangulo();
        reta = new Reta(null, null);
        circunferencia = new Circunferencia();

        jMenu5 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAcoes = new javax.swing.JMenu();
        jMenuItemPontos = new javax.swing.JMenuItem();
        jMenuRetas = new javax.swing.JMenu();
        jMenuItemRetaDDA = new javax.swing.JMenuItem();
        jMenuItemRetaBresenham = new javax.swing.JMenuItem();
        jMenuPoligonos = new javax.swing.JMenu();
        jMenuItemPoligonosRetangulo = new javax.swing.JMenuItem();
        jMenuCircunferencia = new javax.swing.JMenu();
        jMenuItemCircunferenciaBresenham = new javax.swing.JMenuItem();
        jMenuTransformacoes = new javax.swing.JMenu();
        jMenuItemTransformacoesTraslacao = new javax.swing.JMenuItem();
        jMenuItemTransformacoesRotacao = new javax.swing.JMenuItem();
        jMenuItemTransformacoesEscala = new javax.swing.JMenuItem();
        jMenuItemTransformacoesReflexaoX = new javax.swing.JMenuItem();
        jMenuItemTransformacoesReflexaoY = new javax.swing.JMenuItem();
        jMenuItemTransformacoesReflexaoXY = new javax.swing.JMenuItem();

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        jMenuAcoes.setText("Ações");

        jMenuItemPontos.setText("Rasterização de Pontos");
        jMenuItemPontos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemPontosMouseClicked(evt);
            }
        });
        jMenuItemPontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPontosActionPerformed(evt);
            }
        });
        jMenuAcoes.add(jMenuItemPontos);

        jMenuBar1.add(jMenuAcoes);

        jMenuRetas.setText("Retas");

        jMenuItemRetaDDA.setText("Algoritmo DDA");
        jMenuItemRetaDDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemRetaDDAMousePressed(evt);
            }
        });
        jMenuRetas.add(jMenuItemRetaDDA);

        jMenuItemRetaBresenham.setText("Algoritmo Bresenham");
        jMenuItemRetaBresenham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retaBresenhamMenuItemMousePressed(evt);
            }
        });
        jMenuRetas.add(jMenuItemRetaBresenham);

        jMenuBar1.add(jMenuRetas);

        jMenuPoligonos.setText("Polígonos");
        jMenuPoligonos.setToolTipText("");

        jMenuItemPoligonosRetangulo.setText("Retângulo");
        jMenuItemPoligonosRetangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retanguloMenuItemMousePressed(evt);
            }
        });

        jMenuPoligonos.add(jMenuItemPoligonosRetangulo);

        jMenuBar1.add(jMenuPoligonos);

        jMenuCircunferencia.setText("Circunferência");

        jMenuItemCircunferenciaBresenham.setText("Algoritmo de Bresenham");
        jMenuItemCircunferenciaBresenham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemCircunferenciaBresenhamMousePressed(evt);
            }
        });
        jMenuCircunferencia.add(jMenuItemCircunferenciaBresenham);

        jMenuBar1.add(jMenuCircunferencia);

        jMenuTransformacoes.setText("Transformações");

        jMenuItemTransformacoesTraslacao.setText("Translação");
        jMenuItemTransformacoesTraslacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTransformacoesTraslacaoActionPerformed(evt);
            }
        });
        jMenuTransformacoes.add(jMenuItemTransformacoesTraslacao);

        jMenuItemTransformacoesRotacao.setText("Rotação");
        jMenuItemTransformacoesRotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTransformacoesRotacaoActionPerformed(evt);
            }
        });
        jMenuTransformacoes.add(jMenuItemTransformacoesRotacao);

        jMenuItemTransformacoesEscala.setText("Escala");
        jMenuTransformacoes.add(jMenuItemTransformacoesEscala);

        jMenuItemTransformacoesReflexaoX.setText("Reflexão X");
        jMenuItemTransformacoesReflexaoX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTransformacoesReflexaoXActionPerformed(evt);
            }
        });
        jMenuTransformacoes.add(jMenuItemTransformacoesReflexaoX);

        jMenuItemTransformacoesReflexaoY.setText("Reflexão Y");
        jMenuTransformacoes.add(jMenuItemTransformacoesReflexaoY);

        jMenuItemTransformacoesReflexaoXY.setText("Reflexão XY");
        jMenuTransformacoes.add(jMenuItemTransformacoesReflexaoXY);

        jMenuBar1.add(jMenuTransformacoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemPontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPontosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemPontosActionPerformed

    private void retaBresenhamMenuItemMousePressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retaBresenhamMenuItemMousePressed
       opcaoAlgoritmo = 3;
       System.out.println("Opção MousePressed: " + opcaoAlgoritmo);
    }//GEN-LAST:event_retaBresenhamMenuItemMousePressed

    private void retanguloMenuItemMousePressed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_retanguloMenuItemMousePressed
        opcaoAlgoritmo = 4;
        System.out.println("Opção MousePressed: " + opcaoAlgoritmo);
    }//GEN-LAST:event_retanguloMenuItemMousePressed

    private void jMenuItemTransformacoesTraslacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTransformacoesTraslacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemTransformacoesTraslacaoActionPerformed

    private void jMenuItemTransformacoesRotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTransformacoesRotacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemTransformacoesRotacaoActionPerformed

    private void jMenuItemTransformacoesReflexaoXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTransformacoesReflexaoXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemTransformacoesReflexaoXActionPerformed

    private void jMenuItemPontosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemPontosMouseClicked
        opcaoAlgoritmo = 1;
    }//GEN-LAST:event_jMenuItemPontosMouseClicked

    private void jMenuItemRetaDDAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemRetaDDAMousePressed
        opcaoAlgoritmo = 2;
        System.out.println("Opção MousePressed: " + opcaoAlgoritmo);
    }//GEN-LAST:event_jMenuItemRetaDDAMousePressed

    private void jMenuItemCircunferenciaBresenhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemCircunferenciaBresenhamMousePressed
        opcaoAlgoritmo = 5;
        System.out.println("Opção MousePressed: " + opcaoAlgoritmo);
    }//GEN-LAST:event_jMenuItemCircunferenciaBresenhamMousePressed

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
            java.util.logging.Logger.getLogger(PaintBrushFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaintBrushFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaintBrushFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaintBrushFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PaintBrushFrame paintBrushFrame = new PaintBrushFrame();
                paintBrushFrame.setVisible(true);
                paintBrushFrame.jPanel1.addMouseListener(new MouseAdapter() {
                    
                @Override
                public void mousePressed(MouseEvent e) {
                    paintBrushFrame.opcoes(new Point(e.getX(), e.getY(), e.getComponent().getGraphics()));
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    //setBackground(background);background
                }
            });
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItemPontos;
    private javax.swing.JMenu jMenuAcoes;
    private javax.swing.JMenu jMenuRetas;
    private javax.swing.JMenu jMenuPoligonos;
    private javax.swing.JMenu jMenuCircunferencia;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenuTransformacoes;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemTransformacoesReflexaoY;
    private javax.swing.JMenuItem jMenuItemTransformacoesReflexaoXY;
    private javax.swing.JMenuItem jMenuItemRetaBresenham;
    private javax.swing.JMenuItem jMenuItemPoligonosRetangulo;
    private javax.swing.JMenuItem jMenuItemCircunferenciaBresenham;
    private javax.swing.JMenuItem jMenuItemTransformacoesTraslacao;
    private javax.swing.JMenuItem jMenuItemTransformacoesRotacao;
    private javax.swing.JMenuItem jMenuItemTransformacoesEscala;
    private javax.swing.JMenuItem jMenuItemTransformacoesReflexaoX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jMenuItemRetaDDA;
    // End of variables declaration//GEN-END:variables

    public static void drawPoint(Graphics2D g2d, int x, int y)
    {
        g2d.setStroke(new BasicStroke(0.1f));
        g2d.setColor(Color.red);

        g2d.draw(new Line2D.Double(x, y, x, y));
    }
    
    public void opcoes(Point p)
    {
        System.out.println("Opção de desenho: " + opcaoAlgoritmo);
        if(opcaoAlgoritmo == 0){
            System.out.println(" NADA ");
        }
        else if(opcaoAlgoritmo == 1){
            System.out.println(" Pontos ");
        }
        else if(opcaoAlgoritmo == 2){
            System.out.println(" Reta DDA ");
            reta.dda(p);
        }
        else if(opcaoAlgoritmo == 3){
            System.out.println(" Reta Bresenham ");
            reta.bresenham(p);
        }
        else if(opcaoAlgoritmo == 4){
            System.out.println(" Poligonos - retângulo ");
            retangulo.inserir(p);
        }
        else if(opcaoAlgoritmo == 5){
            System.out.println(" Circunferencia - Bresenham ");
            circunferencia.bresenhams(p);
        }
        else if(opcaoAlgoritmo == 6){
            System.out.println(" - Transformações Geométricas 2D: translação");
        }
        else if(opcaoAlgoritmo == 7){
            System.out.println(" - Transformações Geométricas 2D: rotação");
        }
        else if(opcaoAlgoritmo == 8){
            System.out.println(" - Transformações Geométricas 2D: escala");
        }
        else if(opcaoAlgoritmo == 9){
            System.out.println(" - Transformações Geométricas 2D: reflexões X");
        }
        else if(opcaoAlgoritmo == 10){
            System.out.println(" - Transformações Geométricas 2D: reflexões Y");
        }
        else if(opcaoAlgoritmo == 11){
            System.out.println(" - Transformações Geométricas 2D: reflexões XY");
        }
        else if(opcaoAlgoritmo == 12){
            System.out.println("Recorte de Regiões: Algoritmo de Cohen-Sutherland");
        }
        else if(opcaoAlgoritmo == 13){
            System.out.println("Recorte de Regiões: Algoritmo de Liang Barsky");
        }
    }
}