/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stumanage;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import stumanage.jingjing.dao.Dao;
import stumanage.jingjing.dao.DaoImpl;
import stumanage.jingjing.util.Center;

/**
 *
 * @author Administrator
 */
public class Register extends javax.swing.JFrame {
    Dao dao=new DaoImpl();
    
    public Register() {
        initComponents();
        this.getContentPane().setBackground(new Color(95,158,160));  
        this.getContentPane().setVisible(true);//如果改为true那么就变成了红色。  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Center.setCenter(this);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tabusername = new javax.swing.JLabel();
        tabpassword1 = new javax.swing.JLabel();
        tabpassword2 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        quit = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        userNameExecption = new javax.swing.JLabel();
        password1 = new javax.swing.JLabel();
        password2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordText1 = new javax.swing.JPasswordField();
        passwordText2 = new javax.swing.JPasswordField();

        jLabel4.setText("联系方式：");

        jLabel5.setText("邮箱：");

        jLabel6.setText("地址：");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("惊天科技--->注册...");

        tabusername.setForeground(new java.awt.Color(62, 56, 56));
        tabusername.setText("用户名：");

        tabpassword1.setForeground(new java.awt.Color(62, 56, 56));
        tabpassword1.setText("密码：");

        tabpassword2.setForeground(new java.awt.Color(62, 56, 56));
        tabpassword2.setText("再次确认密码：");

        usernameText.setForeground(new java.awt.Color(62, 56, 56));
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });
        usernameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTextFocusLost(evt);
            }
        });

        quit.setForeground(new java.awt.Color(62, 56, 56));
        quit.setText("提交");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        submit.setForeground(new java.awt.Color(62, 56, 56));
        submit.setText("退出");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        reset.setForeground(new java.awt.Color(62, 56, 56));
        reset.setText("重置");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("-----惊天科技---------------------------");

        passwordText1.setForeground(new java.awt.Color(62, 56, 56));
        passwordText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordText1ActionPerformed(evt);
            }
        });
        passwordText1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordText1FocusLost(evt);
            }
        });

        passwordText2.setForeground(new java.awt.Color(62, 56, 56));
        passwordText2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordText2FocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(quit)
                                .addGap(148, 148, 148)
                                .addComponent(reset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submit))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tabpassword1)
                                    .addComponent(tabpassword2)
                                    .addComponent(tabusername))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(userNameExecption, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(passwordText2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(password2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(passwordText1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tabusername)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameExecption))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tabpassword1)
                    .addComponent(password1)
                    .addComponent(passwordText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tabpassword2)
                    .addComponent(password2)
                    .addComponent(passwordText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quit)
                    .addComponent(reset)
                    .addComponent(submit))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
       register();
    }//GEN-LAST:event_quitActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_submitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       usernameText.setText("");
       passwordText1.setText("");
       passwordText2.setText("");
        userNameExecption.setText("");
        password1.setText("");
        password2.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextActionPerformed

    private void passwordText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordText1ActionPerformed

    private void usernameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFocusLost
        DaoImpl dil=new DaoImpl(); 
        String str=usernameText.getText();
        if(!str.matches("[0-9]{11}")){
                 userNameExecption.setText("用户名为11位纯数字");
                 usernameText.setText("");
            }else if(dil.selectOneU(str)){
                JOptionPane.showMessageDialog(usernameText,"用户名已经被注册！");
                 usernameText.setText("");
         }else{
           userNameExecption.setText("");
         }
    }//GEN-LAST:event_usernameTextFocusLost

    private void passwordText1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordText1FocusLost
       char[] ch1=passwordText1.getPassword();
        String passWord1=""; 
        for(int i=0;i<ch1.length;i++){
            passWord1=passWord1+ch1[i];
        }
        if(!passWord1.matches("^([a-z]|[A-Z]|[0-9]){5,16}$")){
            password1.setText("密码长度超限或密码不能为空");
        }else{
             password1.setText("");
        }
    }//GEN-LAST:event_passwordText1FocusLost

    private void passwordText2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordText2FocusLost
        char[] ch2=passwordText2.getPassword();
        String passWord2="";
        for(int i=0;i<ch2.length;i++){
            passWord2=passWord2+ch2[i];
        }
         if(!passWord2.matches("([a-z]|[A-Z]|[0-9]){5,16}")){
            password2.setText("密码长度超限或密码不能为空");
         }else{
             password2.setText("");
         }
    }//GEN-LAST:event_passwordText2FocusLost

    private void register(){
       
        char[] ch1=passwordText1.getPassword();
        char[] ch2=passwordText2.getPassword();
        String passWord1="";
        String passWord2="";
        for(int i=0;i<ch1.length;i++){
            passWord1=passWord1+ch1[i];
        }
        for(int i=0;i<ch2.length;i++){
            passWord2=passWord2+ch2[i];
        }
        if(passWord1.equals(passWord2)){
            if(userNameExecption.getText()!=""||password1.getText()!=""||password2.getText()!=""){
                JOptionPane.showMessageDialog(rootPane, "输入信息有误！");
            }else{
                int num=dao.insertOne(usernameText.getText(), passWord1);
                if(num>0){
                    Basic basic=new Basic(usernameText.getText());
                    this.dispose();
                }else{
                    this.dispose();
                    ShiBai1 sb=new ShiBai1();
                }
            }  
        }else{
            password1.setText("密码两次输入不匹配");
            password2.setText("密码两次输入不匹配");
        }
   
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel password1;
    private javax.swing.JLabel password2;
    private javax.swing.JPasswordField passwordText1;
    private javax.swing.JPasswordField passwordText2;
    private javax.swing.JButton quit;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    private javax.swing.JLabel tabpassword1;
    private javax.swing.JLabel tabpassword2;
    private javax.swing.JLabel tabusername;
    private javax.swing.JLabel userNameExecption;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
