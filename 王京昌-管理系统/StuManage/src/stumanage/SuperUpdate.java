/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stumanage;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import stumanage.jingjing.dao.DaoImpl;
import stumanage.jingjing.util.Center;

public class SuperUpdate extends javax.swing.JFrame {
    
    String username="";
    DaoImpl dao=new DaoImpl();
    public SuperUpdate(String username) {
       
        this.setVisible(true); 
        this.username=username;
        this.getContentPane().setBackground(new Color(95,158,160));  
        this.getContentPane().setVisible(true);//如果改为true那么就变成了红色。  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Center.setCenter(this);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("惊天科技--->管理员修改中心...");

        jButton1.setForeground(new java.awt.Color(62, 56, 56));
        jButton1.setText("修改手机号");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(62, 56, 56));
        jButton2.setText("修改邮箱");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(62, 56, 56));
        jButton3.setText("修改住址");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setForeground(new java.awt.Color(62, 56, 56));
        jButton5.setText("班级修改教师");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        //jButton6.setEnabled(false);
        jButton6.setForeground(new java.awt.Color(62, 56, 56));
        jButton6.setText("录入成绩");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setForeground(new java.awt.Color(62, 56, 56));
        jButton7.setText("返回");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setForeground(new java.awt.Color(62, 56, 56));
        jButton8.setText("退出");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(62, 56, 56));
        jLabel1.setText("                     ----------------------------------修改-------");

        jLabel2.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("-----惊天科技----------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton3)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(61, 61, 61)
                .addComponent(jButton6)
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
        SuperUser su=new SuperUser(username);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        updateCall();        
    }//GEN-LAST:event_jButton1ActionPerformed
     private void updateCall(){
        String stu_num = JOptionPane.showInputDialog("请输入要修改学生的学号：");
        if(stu_num!=null){
            if(dao.selectOneU(stu_num)){
                String new_call = JOptionPane.showInputDialog("请输入新手机号："); 
                if(new_call.matches("1[3,4,5,7,8]{1}[0-9]{9}")){
                    if(dao.updateCall(stu_num, new_call)){
                        JOptionPane.showMessageDialog(rootPane,"修改成功！");
                    }else{
                        JOptionPane.showMessageDialog(rootPane,"修改失败！");
                    }
                }else{
                     JOptionPane.showMessageDialog(rootPane,"请输入正确的手机号！");
                }        
            }else{
                JOptionPane.showMessageDialog(rootPane,"这个学生不存在，没必要修改手机号！");
            }
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        updateEmi();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void updateEmi(){
        String stu_num = JOptionPane.showInputDialog("请输入要修改学生的学号：");
        if(stu_num!=null){
            if(dao.selectOneU(stu_num)){
                String new_call = JOptionPane.showInputDialog("请输入新QQ邮箱："); 
                if(new_call.matches("[1-9][0-9]{6,11}@[q,Q][q,Q].com")){
                    if(dao.updateEmi(stu_num, new_call)){
                        JOptionPane.showMessageDialog(rootPane,"邮箱修改成功！");
                    }else{
                        JOptionPane.showMessageDialog(rootPane,"邮箱修改失败！");
                    }
                }else{
                     JOptionPane.showMessageDialog(rootPane,"请输入正确的QQ邮箱！");
                }        
            }else{
                JOptionPane.showMessageDialog(rootPane,"这个学生不存在，没必要修改QQ邮箱！");
            }
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        updateAdd();
    }//GEN-LAST:event_jButton3ActionPerformed
    private void updateAdd(){
        String stu_num = JOptionPane.showInputDialog("请输入要修改学生的学号：");
        if(stu_num!=null){
            if(dao.selectOneU(stu_num)){
                String new_call = JOptionPane.showInputDialog("请输入新住址："); 
                if(new_call.matches("[\\u4E00-\\u9FA5]{6,20}")){
                    if(dao.updateAdd(stu_num, new_call)){
                        JOptionPane.showMessageDialog(rootPane,"住址修改成功！");
                    }else{
                        JOptionPane.showMessageDialog(rootPane,"住址修改失败！");
                    }
                }else{
                     JOptionPane.showMessageDialog(rootPane,"请输入正确的住址！");
                }        
            }else{
                JOptionPane.showMessageDialog(rootPane,"这个学生不存在，没必要修改住址！");
            }  
        }
    }       
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        updateTea();
    }//GEN-LAST:event_jButton5ActionPerformed
    private void updateTea(){
        String stu_num = JOptionPane.showInputDialog("请输入要修改教师的班号：");
        if(stu_num.matches("[1-6]{1}")){
            if(dao.selectClass(Integer.parseInt(stu_num))){
                String new_call = JOptionPane.showInputDialog("请输入新教师编号："); 
                if(new_call.matches("[1-4]{1}")){
                    if(dao.updateTea(Integer.parseInt(stu_num), Integer.parseInt(new_call))){
                        JOptionPane.showMessageDialog(rootPane,"教师修改成功！");
                    }else{
                        JOptionPane.showMessageDialog(rootPane,"教师修改失败！");
                    }
                }else{
                     JOptionPane.showMessageDialog(rootPane,"请输入正确的教师编号！");
                }        
            }else{
                JOptionPane.showMessageDialog(rootPane,"这个班不存在，没必要修改教师！");
            }    
        }
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       luru();
    }//GEN-LAST:event_jButton6ActionPerformed
    private void luru(){
        String str=JOptionPane.showInputDialog("请输入要录入的文件的地址");
        Properties pro=new Properties();
        try {
            pro.load(SuperUpdate.class.getClassLoader().getResourceAsStream(str));
            Set<Object>set=pro.keySet();
            int i=0,a=0;
            for(Object s:set){
                //System.out.println(s);
                if(dao.selectOneU((String)s)){
                    a+=dao.insertGrade((String)s,pro.getProperty((String)s));
                }else{
                   i++; 
                }
            }
            JOptionPane.showMessageDialog(rootPane,"文件中有"+set.size()+"个同学，实际存在"+(set.size()-i)+"位，本次录入"+a+"位");
        } catch (IOException ex) {
           
        }catch(NullPointerException npe){
            JOptionPane.showMessageDialog(rootPane,"请输入正确的文件路径！");
        }
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SuperUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SuperUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SuperUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SuperUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SuperUpdate("").setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
