package stumanage;

import java.awt.Color;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import stumanage.jingjing.dao.DaoImpl;
import stumanage.jingjing.entity.StudentAll;
import stumanage.jingjing.util.Center;

/**
 *
 * @author Administrator
 */
public class UsualUser extends javax.swing.JFrame {

   private String username;
   DaoImpl dao=new DaoImpl();
    public UsualUser(String username) {
        initComponents();
        this.getContentPane().setBackground(new Color(95,158,160));  
        this.getContentPane().setVisible(true);//如果改为true那么就变成了红色。  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Center.setCenter(this);
        this.setVisible(true);
        this.username=username;
        this.jTextField1.setText(this.username);
    }

    public UsualUser() {
         initComponents();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        toLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("惊天科技--->用户中心...");

        jLabel1.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("-----惊天科技-----------------------------");

        toLogin.setForeground(new java.awt.Color(62, 56, 56));
        toLogin.setText("返回登录");
        toLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toLoginActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(62, 56, 56));
        jLabel3.setText("我的学号：");

        jLabel2.setForeground(new java.awt.Color(62, 56, 56));
        jLabel2.setText("选课信息：");

        jComboBox2.setForeground(new java.awt.Color(62, 56, 56));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "少林", "逍遥", "丐帮", "大理", "姑苏", "星宿", "天山", "天龙" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setForeground(new java.awt.Color(242, 68, 8));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(62, 56, 56));
        jButton1.setText("直接退出");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(62, 56, 56));
        jButton2.setText("查看自己的信息");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(62, 56, 56));
        jButton3.setText("修改密码");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("-----------------------------------用户页面------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(toLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1))))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toLogin)
                    .addComponent(jButton1))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toLoginActionPerformed
        this.dispose();
       Login login=new Login();
    }//GEN-LAST:event_toLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED){  
            String str=(String)jComboBox2.getSelectedItem();
            DaoImpl dao=new DaoImpl();
            if(dao.insertCourse(username, str)){
                JOptionPane.showMessageDialog(jComboBox2,"选课修改成功！");
            }else{
                JOptionPane.showMessageDialog(jComboBox2,"修改操作执行失败！");
            }           
        }     
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
             selectAll();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        updatepas();
    }//GEN-LAST:event_jButton3ActionPerformed
    private void updatepas(){
        String old_pas=JOptionPane.showInputDialog("请输入您原来的密码！");
        try{
            if(dao.selectpas(username, old_pas)){
                    String new_pas1=JOptionPane.showInputDialog("请输入新的密码：");
                    if(new_pas1.matches("[a-zA-Z0-9]{6,16}")){
                        String new_pas2=JOptionPane.showInputDialog("请再次输入新的密码：");
                        if(new_pas2.matches("[a-zA-Z0-9]{6,16}")){
                            if(new_pas1.equals(new_pas2)){
                                if(dao.updatePass(username,new_pas1)){
                                    JOptionPane.showMessageDialog(rootPane,"密码修改成功！");
                                }else{
                                    JOptionPane.showMessageDialog(rootPane,"密码修改失败！");
                                }
                            }else{
                                JOptionPane.showMessageDialog(rootPane,"两次密码输入不正确！");
                            }
                        }else{
                            JOptionPane.showMessageDialog(rootPane,"密码格式错误！");
                        }
                    }else{
                        JOptionPane.showMessageDialog(rootPane,"密码格式错误！");
                    } 
            }else{
                JOptionPane.showMessageDialog(rootPane,"密码输入错误！");
            }
         }catch(NullPointerException npe){
            JOptionPane.showMessageDialog(rootPane,"密码不能为空！");
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"注册失败请您检查后重新输入！");
        } 
    }
    
    
    private void selectAll(){
        if(username.length()==11){
            //调用查询方法
            DaoImpl dao=new DaoImpl();
            StudentAll stuA=dao.selectStudentAll(username);
            this.dispose();
            SelectOne so=new SelectOne(stuA,username);
        }else{
            JOptionPane.showMessageDialog(jButton2,"账号有误请您重新登录！");
            this.dispose();
            Login login=new Login();            
        }
    }
    
//main方法
//   public static void main(String args[]) {
//        UsualUser uu=new UsualUser();
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton toLogin;
    // End of variables declaration//GEN-END:variables
}
