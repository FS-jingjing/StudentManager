package stumanage;

import java.awt.Color;
import javax.swing.JFrame;
import stumanage.jingjing.dao.Dao;
import stumanage.jingjing.dao.DaoImpl;
import stumanage.jingjing.util.Center;

public class Login extends javax.swing.JFrame {
    Dao dao=new DaoImpl();
    
    public Login() { 
        initComponents();
        Center.setCenter(this);
        this.getContentPane().setBackground(new Color(95,158,160));  
        this.getContentPane().setVisible(true);//如果改为true那么就变成了红色。  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        toRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("惊天科技--->登录...");

        username.setForeground(new java.awt.Color(62, 56, 56));
        username.setText("用户名：");

        password.setForeground(new java.awt.Color(62, 56, 56));
        password.setText("密码：");

        usernameText.setForeground(new java.awt.Color(62, 56, 56));
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });

        login.setForeground(new java.awt.Color(62, 56, 56));
        login.setText("登陆");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        toRegister.setForeground(new java.awt.Color(62, 56, 56));
        toRegister.setText("注册");
        toRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toRegisterActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("-----惊天科技------------");

        passwordText.setForeground(new java.awt.Color(62, 56, 56));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(password)
                    .addComponent(username)
                    .addComponent(login))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toRegister)
                    .addComponent(passwordText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(toRegister))
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed

    }//GEN-LAST:event_usernameTextActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        char[] ch=passwordText.getPassword();
        String password="";
        for(int i=0;i<ch.length;i++){
            password=password+ch[i];
        }
        if(dao.login(usernameText.getText(), password)){
            if(usernameText.getText().equals("10000000001")||usernameText.getText().equals("10000000002")){
                SuperUser sp=new SuperUser(usernameText.getText());
                this.dispose();
            }else{
                this.dispose();
                UsualUser cg=new UsualUser(usernameText.getText());
            }        
        }else{
            this.dispose();
            ShiBai2 sb=new ShiBai2();
        }
        
    }//GEN-LAST:event_loginActionPerformed

    private void toRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toRegisterActionPerformed
       showRegister();
    }//GEN-LAST:event_toRegisterActionPerformed
    private void showRegister(){
        Register reg=new Register();
        this.dispose();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JButton toRegister;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
