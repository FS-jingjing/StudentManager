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


public class SuperLogin extends javax.swing.JFrame {

    Dao dao=new DaoImpl();
    String num="";
    public SuperLogin(String username) {
        initComponents();
        this.num=username;
        this.getContentPane().setBackground(new Color(95,158,160));  
        this.getContentPane().setVisible(true);//如果改为true那么就变成了红色。  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Center.setCenter(this);
        this.setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password1 = new javax.swing.JPasswordField();
        password2 = new javax.swing.JPasswordField();
        jTextFieldClass = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldSex = new javax.swing.JTextField();
        jTextFieldAge = new javax.swing.JTextField();
        jTextFieldCall = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        E1 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        E3 = new javax.swing.JLabel();
        E4 = new javax.swing.JLabel();
        E5 = new javax.swing.JLabel();
        E6 = new javax.swing.JLabel();
        E7 = new javax.swing.JLabel();
        E8 = new javax.swing.JLabel();
        E9 = new javax.swing.JLabel();
        E10 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("惊天科技--->注册中心...");
        setPreferredSize(new java.awt.Dimension(500, 600));

        jLabel1.setForeground(new java.awt.Color(62, 56, 56));
        jLabel1.setText("                              -----超级管理--新建用户---------------------------------");

        jLabel2.setForeground(new java.awt.Color(62, 56, 56));
        jLabel2.setText("学号：");

        jLabel3.setForeground(new java.awt.Color(62, 56, 56));
        jLabel3.setText("密码：");

        jLabel4.setForeground(new java.awt.Color(62, 56, 56));
        jLabel4.setText("确认密码：");

        jLabel5.setForeground(new java.awt.Color(62, 56, 56));
        jLabel5.setText("姓名：");

        jLabel6.setForeground(new java.awt.Color(62, 56, 56));
        jLabel6.setText("性别：");

        jLabel7.setForeground(new java.awt.Color(62, 56, 56));
        jLabel7.setText("年龄：");

        jLabel8.setForeground(new java.awt.Color(62, 56, 56));
        jLabel8.setText("手机号：");

        jLabel9.setForeground(new java.awt.Color(62, 56, 56));
        jLabel9.setText("邮箱：");

        jLabel10.setForeground(new java.awt.Color(62, 56, 56));
        jLabel10.setText("籍贯：");

        jLabel11.setForeground(new java.awt.Color(62, 56, 56));
        jLabel11.setText("班号：");

        username.setForeground(new java.awt.Color(62, 56, 56));
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });

        password1.setForeground(new java.awt.Color(62, 56, 56));
        password1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                password1FocusLost(evt);
            }
        });

        password2.setForeground(new java.awt.Color(62, 56, 56));
        password2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                password2FocusLost(evt);
            }
        });

        jTextFieldClass.setForeground(new java.awt.Color(62, 56, 56));
        jTextFieldClass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldClassFocusLost(evt);
            }
        });

        jTextFieldName.setForeground(new java.awt.Color(62, 56, 56));
        jTextFieldName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNameFocusLost(evt);
            }
        });

        jTextFieldSex.setForeground(new java.awt.Color(62, 56, 56));
        jTextFieldSex.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldSexFocusLost(evt);
            }
        });

        jTextFieldAge.setForeground(new java.awt.Color(62, 56, 56));
        jTextFieldAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldAgeFocusLost(evt);
            }
        });

        jTextFieldCall.setForeground(new java.awt.Color(62, 56, 56));
        jTextFieldCall.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCallFocusLost(evt);
            }
        });

        jTextFieldEmail.setForeground(new java.awt.Color(62, 56, 56));
        jTextFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusLost(evt);
            }
        });

        jTextFieldAddress.setForeground(new java.awt.Color(62, 56, 56));
        jTextFieldAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldAddressFocusLost(evt);
            }
        });

        btn1.setForeground(new java.awt.Color(62, 56, 56));
        btn1.setText("注册");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setForeground(new java.awt.Color(62, 56, 56));
        btn2.setText("重置");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setForeground(new java.awt.Color(62, 56, 56));
        btn3.setText("返回");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        quit.setForeground(new java.awt.Color(62, 56, 56));
        quit.setText("直接退出");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("-----惊天科技----------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(password1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(password2)
                                        .addComponent(jTextFieldClass)
                                        .addComponent(jTextFieldName)
                                        .addComponent(jTextFieldSex)
                                        .addComponent(jTextFieldAge)
                                        .addComponent(jTextFieldCall)
                                        .addComponent(jTextFieldEmail)
                                        .addComponent(jTextFieldAddress))
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(btn1)
                                .addGap(77, 77, 77)
                                .addComponent(btn2)
                                .addGap(51, 51, 51)
                                .addComponent(quit)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(password2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldCall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(quit)
                    .addComponent(btn3))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       this.dispose();
       SuperUser su=new SuperUser(num);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        insert();
    }//GEN-LAST:event_btn1ActionPerformed
    
    private void insert(){
        if( E1.getText()!=""||E10.getText()!=""||E2.getText()!=""||E3.getText()!=""||E4.getText()!=""||E5.getText()!=""||E6.getText()!=""||E7.getText()!=""||E8.getText()!=""||E9.getText()!=""){
             JOptionPane.showMessageDialog(btn1,"内容格式不正确！");
        }else{
            try{
                char[] ch1=password1.getPassword();
                char[] ch2=password2.getPassword();
                String passWord1="";
                String passWord2="";
                for(int i=0;i<ch1.length;i++){
                    passWord1=passWord1+ch1[i];
                }
                for(int i=0;i<ch2.length;i++){
                    passWord2=passWord2+ch2[i];
                }
                    int num=Integer.parseInt(jTextFieldClass.getText());
                    int age=Integer.parseInt(jTextFieldAge.getText());
                    int sex=0;
                    if(jTextFieldSex.getText().equals("男")){
                        sex=1;
                    }
                if(passWord1.equals(passWord2)){     
                    if(dao.superInsert(username.getText(),passWord1,num,jTextFieldName.getText(),sex,age,jTextFieldCall.getText(),jTextFieldEmail.getText(),jTextFieldAddress.getText())){
                        JOptionPane.showMessageDialog(btn1,"插入成功！");
                        this.dispose();
                        SuperUser su=new SuperUser(this.num);
                    }else{
                        JOptionPane.showMessageDialog(btn1,"插入失败！");
                    }
                 }else{  
                       password1.setText("密码两次输入不匹配");
                       password2.setText("密码两次输入不匹配");
                  }
            }catch(NullPointerException npe){
                JOptionPane.showMessageDialog(btn1,"内容不能为空！");
            }catch(Exception e){
                JOptionPane.showMessageDialog(btn1,"注册失败请您检查后重新输入！");
            }
        }
        
    } 
    
    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        DaoImpl dil=new DaoImpl(); 
        String str=username.getText();
        if(!str.matches("[0-9]{11}")){
                 E1.setText("用户名为11位纯数字");
                 username.setText("");
            }else if(dil.selectOneU(str)){
                JOptionPane.showMessageDialog(username,"用户名已经被注册！");
                 username.setText("");
         }else{
            E1.setText("");
            }
    }//GEN-LAST:event_usernameFocusLost

    private void password1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password1FocusLost
        char[] ch1=password1.getPassword();
        String passWord1=""; 
        for(int i=0;i<ch1.length;i++){
            passWord1=passWord1+ch1[i];
        }
        if(!passWord1.matches("^([a-z]|[A-Z]|[0-9]){5,16}$")){
            E2.setText("密码长度超限或密码不能为空");
        }else{
             E2.setText("");
        }
    }//GEN-LAST:event_password1FocusLost

    private void password2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password2FocusLost
        char[] ch2=password2.getPassword();
        String passWord2="";
        for(int i=0;i<ch2.length;i++){
            passWord2=passWord2+ch2[i];
        }
         if(!passWord2.matches("([a-z]|[A-Z]|[0-9]){5,16}")){
            E3.setText("密码长度超限或密码不能为空");
         }else{
             E3.setText("");
         }
    }//GEN-LAST:event_password2FocusLost

    private void jTextFieldClassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldClassFocusLost
        if(!jTextFieldClass.getText().matches("[1-6]{1}")){
            E4.setText("班号输入有误");
            jTextFieldClass.setText("");
        }else{
            E4.setText("");
        }
    }//GEN-LAST:event_jTextFieldClassFocusLost

    private void jTextFieldNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNameFocusLost
        if(!jTextFieldName.getText().matches("[\\u4E00-\\u9FA5]{2,5}")){
            E5.setText("输入2-5个汉字");
            jTextFieldName.setText("");
        }else{
            E5.setText("");
        }
    }//GEN-LAST:event_jTextFieldNameFocusLost

    private void jTextFieldSexFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSexFocusLost
        if(!jTextFieldSex.getText().matches("男||女")){
            E6.setText("性别只能为男女");
            jTextFieldSex.setText("");
        }else{
            E6.setText("");
        }
    }//GEN-LAST:event_jTextFieldSexFocusLost

    private void jTextFieldAgeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldAgeFocusLost
        if(!jTextFieldAge.getText().matches("[1-9]{1}[0-9]{1}")){
            E7.setText("年龄在10-99之间");
            jTextFieldAge.setText("");
        }else{
            E7.setText("");
        }
    }//GEN-LAST:event_jTextFieldAgeFocusLost

    private void jTextFieldCallFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCallFocusLost
        if(!jTextFieldCall.getText().matches("1[3,4,5,7,8]{1}[0-9]{9}")){
            E8.setText("手机号不正确");
            jTextFieldCall.setText("");
        }else{
            E8.setText("");
        }
    }//GEN-LAST:event_jTextFieldCallFocusLost

    private void jTextFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailFocusLost
        if(!jTextFieldEmail.getText().matches("[1-9][0-9]{6,11}@[q,Q][q,Q].com")){
            E9.setText("qq邮箱格式不正确");
            jTextFieldEmail.setText("");
        }else{
            E9.setText("");
        }
    }//GEN-LAST:event_jTextFieldEmailFocusLost

    private void jTextFieldAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldAddressFocusLost
         if(!jTextFieldAddress.getText().matches("[\\u4E00-\\u9FA5]{6,20}")){
            E10.setText("请输入正确地址");
            jTextFieldAddress.setText("");
        }else{
            E10.setText("");
        }
    }//GEN-LAST:event_jTextFieldAddressFocusLost

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        reset();
    }//GEN-LAST:event_btn2ActionPerformed
    private void reset(){
        jTextFieldAddress.setText("");
        jTextFieldAge.setText("");
        jTextFieldCall.setText("");
        jTextFieldClass.setText("");
        jTextFieldEmail.setText("");
        jTextFieldName.setText("");
        jTextFieldSex.setText("");
        password1.setText("");
        password2.setText("");
        username.setText("");
        E1.setText("");
        E10.setText("");
        E2.setText("");
        E3.setText("");
        E4.setText("");
        E5.setText("");
        E6.setText("");
        E7.setText("");
        E8.setText("");
        E9.setText("");
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
//            java.util.logging.Logger.getLogger(SuperLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SuperLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SuperLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SuperLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SuperLogin().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E10;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel E3;
    private javax.swing.JLabel E4;
    private javax.swing.JLabel E5;
    private javax.swing.JLabel E6;
    private javax.swing.JLabel E7;
    private javax.swing.JLabel E8;
    private javax.swing.JLabel E9;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldCall;
    private javax.swing.JTextField jTextFieldClass;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldSex;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    private javax.swing.JButton quit;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
