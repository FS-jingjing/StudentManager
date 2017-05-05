/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stumanage;

import java.awt.Color;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import stumanage.jingjing.dao.DaoImpl;
import stumanage.jingjing.entity.Student;
import stumanage.jingjing.entity.StudentAll;
import stumanage.jingjing.util.Center;

/**
 *
 * @author Administrator
 */
public class SuperSelect extends javax.swing.JFrame {

    DaoImpl dao=new DaoImpl();
    List<Student>list=null;
    StudentAll stuA=null;
    private int num=0;
    String username="";
    public SuperSelect(String username) {
        this.username=username;
        initComponents();
        this.getContentPane().setBackground(new Color(95,158,160));  
        this.getContentPane().setVisible(true);//如果改为true那么就变成了红色。  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Center.setCenter(this);
        this.setVisible(true);
        showS();
                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        id4 = new javax.swing.JLabel();
        id5 = new javax.swing.JLabel();
        user1 = new javax.swing.JLabel();
        user2 = new javax.swing.JLabel();
        user3 = new javax.swing.JLabel();
        user4 = new javax.swing.JLabel();
        user5 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        name5 = new javax.swing.JLabel();
        show1 = new javax.swing.JButton();
        show2 = new javax.swing.JButton();
        show3 = new javax.swing.JButton();
        show4 = new javax.swing.JButton();
        show5 = new javax.swing.JButton();
        pvre = new javax.swing.JButton();
        next = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        fanhui = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "编号", "学号", "姓名", "操作"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("惊天科技--->查询中心...");

        jLabel1.setForeground(new java.awt.Color(62, 56, 56));
        jLabel1.setText("-------------------------------------------------------------------查询页面-------");

        jLabel2.setForeground(new java.awt.Color(62, 56, 56));
        jLabel2.setText("编号");

        jLabel3.setForeground(new java.awt.Color(62, 56, 56));
        jLabel3.setText("  学号");

        jLabel4.setForeground(new java.awt.Color(62, 56, 56));
        jLabel4.setText("  姓名");

        jLabel5.setForeground(new java.awt.Color(62, 56, 56));
        jLabel5.setText("显示详细");

        id1.setForeground(new java.awt.Color(230, 0, 29));

        id2.setForeground(new java.awt.Color(230, 0, 29));

        id3.setForeground(new java.awt.Color(230, 0, 29));

        id4.setForeground(new java.awt.Color(230, 0, 29));
        id4.setName(""); // NOI18N

        id5.setForeground(new java.awt.Color(230, 0, 29));

        user1.setForeground(new java.awt.Color(223, 0, 230));

        user2.setForeground(new java.awt.Color(223, 0, 230));

        user3.setForeground(new java.awt.Color(223, 0, 230));

        user4.setForeground(new java.awt.Color(223, 0, 230));

        user5.setForeground(new java.awt.Color(223, 0, 230));

        name1.setForeground(new java.awt.Color(24, 0, 230));

        name2.setForeground(new java.awt.Color(24, 0, 230));

        name3.setForeground(new java.awt.Color(24, 0, 230));

        name4.setForeground(new java.awt.Color(24, 0, 230));

        name5.setForeground(new java.awt.Color(24, 0, 230));

        show1.setForeground(new java.awt.Color(62, 56, 56));
        show1.setText("显示");
        show1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show1ActionPerformed(evt);
            }
        });

        show2.setForeground(new java.awt.Color(62, 56, 56));
        show2.setText("显示");
        show2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show2ActionPerformed(evt);
            }
        });

        show3.setForeground(new java.awt.Color(62, 56, 56));
        show3.setText("显示");
        show3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show3ActionPerformed(evt);
            }
        });

        show4.setForeground(new java.awt.Color(62, 56, 56));
        show4.setText("显示");
        show4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show4ActionPerformed(evt);
            }
        });

        show5.setForeground(new java.awt.Color(62, 56, 56));
        show5.setText("显示");
        show5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show5ActionPerformed(evt);
            }
        });

        pvre.setForeground(new java.awt.Color(62, 56, 56));
        pvre.setText("上一页");
        pvre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pvreActionPerformed(evt);
            }
        });

        next.setForeground(new java.awt.Color(62, 56, 56));
        next.setText("下一页");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        quit.setForeground(new java.awt.Color(62, 56, 56));
        quit.setText("退出");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        fanhui.setForeground(new java.awt.Color(62, 56, 56));
        fanhui.setText("返回");
        fanhui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fanhuiActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("-----惊天科技------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(id4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pvre)
                                        .addGap(107, 107, 107)
                                        .addComponent(next)
                                        .addGap(95, 95, 95)
                                        .addComponent(quit))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(user3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(user4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(user5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(48, 48, 48)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(101, 101, 101))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(user1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(198, 198, 198))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(name5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(38, 38, 38)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(user2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(198, 198, 198)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(show1)
                                            .addComponent(jLabel5)
                                            .addComponent(show2)
                                            .addComponent(show3)
                                            .addComponent(show4)
                                            .addComponent(show5)))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(fanhui)))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 88, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(user1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(show1)
                        .addGap(47, 47, 47)
                        .addComponent(show2)
                        .addGap(6, 6, 6)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(show3)
                        .addGap(3, 3, 3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(user3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(show4)
                        .addGap(5, 5, 5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(user4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show5))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fanhui)
                    .addComponent(pvre)
                    .addComponent(next)
                    .addComponent(quit))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void showS(){
        try{
            reset();
            list=dao.selectFive(num,5);
            if(list.get(0)!=null){
                id1.setText((num*5+1)+"");
                user1.setText(list.get(0).getUsername());
                name1.setText(list.get(0).getName());
            }
            if(list.get(1)!=null){
                id2.setText((num*5+2)+"");
                user2.setText(list.get(1).getUsername());
                name2.setText(list.get(1).getName());
            }
            if(list.get(2)!=null){
                id3.setText((num*5+3)+"");
                user3.setText(list.get(2).getUsername());
                name3.setText(list.get(2).getName());
            }
            if(list.get(3)!=null){
                id4.setText((num*5+4)+"");
                user4.setText(list.get(3).getUsername());
                name4.setText(list.get(3).getName());
            }
            if(list.get(4)!=null){
                id5.setText((num*5+5)+"");
                user5.setText(list.get(4).getUsername());
                name5.setText(list.get(4).getName());
            }
        }catch(IndexOutOfBoundsException ioe){
            JOptionPane.showMessageDialog(rootPane,"已经到最后一页了");
        }
        
    }
    
    private void reset(){
        id1.setText("");
        id2.setText("");
        id3.setText("");
        id4.setText("");
        id5.setText("");
        user1.setText("");
        user2.setText("");
        user3.setText("");
        user4.setText("");
        user5.setText("");
        name1.setText("");
        name2.setText("");
        name3.setText("");
        name4.setText("");
        name5.setText("");
    }
    private void pvreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvreActionPerformed
    if(num>0){
            num--;
            showS();
        }else{
            JOptionPane.showMessageDialog(rootPane,"这是第一页！");
            showS();
        }
    }//GEN-LAST:event_pvreActionPerformed

    private void show1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show1ActionPerformed
        if(user1.getText()!=""){
            stuA=dao.selectStudentAll(user1.getText());
            this.dispose();
            SelectOne so=new SelectOne(stuA,username);
        }else{
            JOptionPane.showMessageDialog(rootPane,"没有这个学生的信息");
        }
        
    }//GEN-LAST:event_show1ActionPerformed

    private void show3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show3ActionPerformed
        if(user3.getText()!=""){
            stuA=dao.selectStudentAll(user3.getText());
            this.dispose();
            SelectOne so=new SelectOne(stuA,username);
        }else{
            JOptionPane.showMessageDialog(rootPane,"没有这个学生的信息");
        }
    }//GEN-LAST:event_show3ActionPerformed

    private void show5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show5ActionPerformed
        if(user5.getText()!=""){
            stuA=dao.selectStudentAll(user5.getText());
            this.dispose();
            SelectOne so=new SelectOne(stuA,username);
        }else{
            JOptionPane.showMessageDialog(rootPane,"没有这个学生的信息");
        }
    }//GEN-LAST:event_show5ActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitActionPerformed

    private void fanhuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fanhuiActionPerformed
        SuperUser su=new SuperUser(username);
        this.dispose();
    }//GEN-LAST:event_fanhuiActionPerformed

    private void show4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show4ActionPerformed
        if(user4.getText()!=""){
            stuA=dao.selectStudentAll(user4.getText());
            this.dispose();
            SelectOne so=new SelectOne(stuA,username);
        }else{
            JOptionPane.showMessageDialog(rootPane,"没有这个学生的信息");
        }
    }//GEN-LAST:event_show4ActionPerformed

    private void show2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show2ActionPerformed
        if(user2.getText()!=null){
            stuA=dao.selectStudentAll(user2.getText());
             this.dispose();
            SelectOne so=new SelectOne(stuA,username);
        }else{
            JOptionPane.showMessageDialog(rootPane,"没有这个学生的信息");
        }
    }//GEN-LAST:event_show2ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        int row=dao.selectRownum();
        int page=0;
        if(row%5==0){
            page=row/5;
        }else{
            page=row/5+1;
        }
        if(num<page){
            num++;
            showS();
        }else{
            showS();
        }
    }//GEN-LAST:event_nextActionPerformed

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
//            java.util.logging.Logger.getLogger(SuperSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SuperSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SuperSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SuperSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SuperSelect().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fanhui;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel id4;
    private javax.swing.JLabel id5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JButton next;
    private javax.swing.JButton pvre;
    private javax.swing.JButton quit;
    private javax.swing.JButton show1;
    private javax.swing.JButton show2;
    private javax.swing.JButton show3;
    private javax.swing.JButton show4;
    private javax.swing.JButton show5;
    private javax.swing.JLabel user1;
    private javax.swing.JLabel user2;
    private javax.swing.JLabel user3;
    private javax.swing.JLabel user4;
    private javax.swing.JLabel user5;
    // End of variables declaration//GEN-END:variables
}
