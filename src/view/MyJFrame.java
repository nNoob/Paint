/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import observer.paintListener;

import javax.swing.*;
import java.awt.*;

/**
 * @author Raffy
 */
public class MyJFrame extends JFrame {

    /**
     * Creates new form MyJFrame
     */
    private String method = null;

    public MyJFrame() {

        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        drawButt.setSelected(true);
        lineButt.setSelected(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        JToggleButton jToggleButton1 = new JToggleButton();
        rectButt = new javax.swing.JToggleButton();
        lineButt = new javax.swing.JToggleButton();
        squareButt = new javax.swing.JToggleButton();
        ellipseButt = new javax.swing.JToggleButton();
        circleButt = new javax.swing.JToggleButton();
        triButt = new javax.swing.JToggleButton();
        changeColor = new javax.swing.JToggleButton();
        fillButt = new javax.swing.JToggleButton();
        drawButt = new javax.swing.JToggleButton();
        moveButt = new javax.swing.JToggleButton();
        deleteButt = new javax.swing.JToggleButton();
        jColorChooser1 = new javax.swing.JColorChooser();
        JButton undoBtn = new JButton();
        JButton redoBtn = new JButton();
        copyButt = new javax.swing.JToggleButton();
        resizeButt = new javax.swing.JToggleButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rectButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download_4_ueK_icon.png"))); // NOI18N
        rectButt.setText("Rect.");
        rectButt.addActionListener(this::rectButtActionPerformed);

        lineButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_EAu_icon.png"))); // NOI18N
        lineButt.setText("Line");
        lineButt.addActionListener(this::lineButtActionPerformed);

        squareButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download_0L1_icon.png"))); // NOI18N
        squareButt.setText("Square");
        squareButt.addActionListener(this::squareButtActionPerformed);

        ellipseButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download_3_KgQ_icon.png"))); // NOI18N
        ellipseButt.setText("Ellipse");
        ellipseButt.addActionListener(this::ellipseButtActionPerformed);

        circleButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_1_q46_icon.png"))); // NOI18N
        circleButt.setText("Circle");
        circleButt.addActionListener(this::circleButtActionPerformed);

        triButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download_2_8bW_icon.png"))); // NOI18N
        triButt.setText("Triangle");
        triButt.addActionListener(this::triButtActionPerformed);

        changeColor.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        changeColor.setText("Change Color");
        changeColor.addActionListener(this::changeColorActionPerformed);

        fillButt.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        fillButt.setText("FILL");
        fillButt.addActionListener(this::fillButtActionPerformed);

        drawButt.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        drawButt.setText("DRAW");
        drawButt.addActionListener(this::drawButtActionPerformed);

        moveButt.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        moveButt.setText("MOVE");
        moveButt.addActionListener(this::moveButtActionPerformed);

        deleteButt.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        deleteButt.setText("DELETE");
        deleteButt.addActionListener(this::deleteButtActionPerformed);

        undoBtn.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        undoBtn.setText("Undo");
        undoBtn.addActionListener(this::undoBtnActionPerformed);

        redoBtn.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        redoBtn.setText("Redo");
        redoBtn.addActionListener(this::redoBtnActionPerformed);

        copyButt.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        copyButt.setText("COPY");
        copyButt.addActionListener(this::copyButtActionPerformed);

        resizeButt.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        resizeButt.setText("Resize");
        resizeButt.addActionListener(this::resizeButtActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(765, 765, 765)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(drawButt, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                                        .addComponent(moveButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(deleteButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(fillButt, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(undoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                                        .addComponent(redoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(copyButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(resizeButt, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(rectButt, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                        .addComponent(squareButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lineButt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(circleButt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ellipseButt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(triButt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(130, 130, 130)
                                                                .addComponent(changeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lineButt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(circleButt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(5, 5, 5)
                                                .addComponent(ellipseButt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(triButt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(squareButt)))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(rectButt)
                                        .addComponent(changeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(drawButt)
                                        .addComponent(deleteButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(undoBtn)
                                        .addComponent(copyButt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(moveButt, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(fillButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(redoBtn)
                                                .addComponent(resizeButt)))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setShapesFalse() {
        circleButt.setSelected(false);
        rectButt.setSelected(false);
        squareButt.setSelected(false);
        ellipseButt.setSelected(false);
        triButt.setSelected(false);
        lineButt.setSelected(false);
    }

    private void setMethodFalse() {
        drawButt.setSelected(false);
        moveButt.setSelected(false);
        fillButt.setSelected(false);
        deleteButt.setSelected(false);
        copyButt.setSelected(false);
        resizeButt.setSelected(false);

    }

    private void rectButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectButtActionPerformed
        setShapesFalse();
        rectButt.setSelected(true);
        paintListener.setType("Rectangle");        // TODO add your handling code here:
    }//GEN-LAST:event_rectButtActionPerformed

    private void lineButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineButtActionPerformed
        setShapesFalse();
        lineButt.setSelected(true);

        paintListener.setType("Line");
        // TODO add your handling code here:
    }//GEN-LAST:event_lineButtActionPerformed

    private void squareButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareButtActionPerformed
        setShapesFalse();
        squareButt.setSelected(true);

        paintListener.setType("Square");        // TODO add your handling code here:
    }//GEN-LAST:event_squareButtActionPerformed

    private void ellipseButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ellipseButtActionPerformed
        setShapesFalse();
        ellipseButt.setSelected(true);
        paintListener.setType("Ellipse");     // TODO add your handling code here:
    }//GEN-LAST:event_ellipseButtActionPerformed

    private void circleButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleButtActionPerformed
        setShapesFalse();
        circleButt.setSelected(true);
        paintListener.setType("Circle");   // TODO add your handling code here:
    }//GEN-LAST:event_circleButtActionPerformed

    private void triButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triButtActionPerformed
        setShapesFalse();
        triButt.setSelected(true);
        paintListener.setType("Triangle");  // TODO add your handling code here:
    }//GEN-LAST:event_triButtActionPerformed

    private void changeColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeColorActionPerformed
        changeColor.setSelected(false);
        Color c = jColorChooser1.getColor();
        paintListener.setFillColor(c);
        paintListener.setColor(c);
        // TODO add your handling code here:
    }//GEN-LAST:event_changeColorActionPerformed

    private void fillButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillButtActionPerformed

        setMethodFalse();
        fillButt.setSelected(true);
        method = "Fill";
        paintListener.setMethod(method);

        // TODO add your handling code here:
    }//GEN-LAST:event_fillButtActionPerformed

    private void drawButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawButtActionPerformed

        setMethodFalse();
        drawButt.setSelected(true);
        method = "Draw";
        paintListener.setMethod(method);

// TODO add your handling code here:
    }//GEN-LAST:event_drawButtActionPerformed

    private void moveButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveButtActionPerformed
        setMethodFalse();
        moveButt.setSelected(true);
        method = "Move";
        paintListener.setMethod(method);
// TODO add your handling code here:
    }//GEN-LAST:event_moveButtActionPerformed

    private void deleteButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtActionPerformed
        setMethodFalse();
        deleteButt.setSelected(true);
        method = "Delete";
        paintListener.setMethod(method);   // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtActionPerformed

    private void undoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoBtnActionPerformed
        // TODO add your handling code here:
        //setMethodFalse();
        MyPaint p = MyPaint.getInstance();
        p.unDo();
        p.repaint();

    }//GEN-LAST:event_undoBtnActionPerformed

    private void redoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoBtnActionPerformed
        MyPaint p = MyPaint.getInstance();
        p.reDo();
        p.repaint();
// TODO add your handling code here:
    }//GEN-LAST:event_redoBtnActionPerformed

    private void copyButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyButtActionPerformed
        setMethodFalse();
        copyButt.setSelected(true);
        method = "Copy";
        paintListener.setMethod(method);    //modified        // TODO add your handling code here:
    }//GEN-LAST:event_copyButtActionPerformed

    private void resizeButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeButtActionPerformed
        setMethodFalse();
        resizeButt.setSelected(true);
        method = "Resize";
        paintListener.setMethod(method);   // TODO add your handling code here:
    }//GEN-LAST:event_resizeButtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton changeColor;
    private javax.swing.JToggleButton circleButt;
    private javax.swing.JToggleButton copyButt;
    private javax.swing.JToggleButton deleteButt;
    private javax.swing.JToggleButton drawButt;
    private javax.swing.JToggleButton ellipseButt;
    private javax.swing.JToggleButton fillButt;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JToggleButton lineButt;
    private javax.swing.JToggleButton moveButt;
    private javax.swing.JToggleButton rectButt;
    private javax.swing.JToggleButton resizeButt;
    private javax.swing.JToggleButton squareButt;
    private javax.swing.JToggleButton triButt;

    // End of variables declaration//GEN-END:variables
}
