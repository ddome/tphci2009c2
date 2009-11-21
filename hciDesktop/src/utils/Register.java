package utils;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;

import servicesHandler.RegisterHandler;

public class Register extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

    public Register() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(Register.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        jTextField1.setText(resourceMap.getString("usernameF.text")); // NOI18N
        jTextField1.setName("usernameF"); // NOI18N

        lengthErrorName = resourceMap.getString("lengthErrorName.text");
        formatErrorName = resourceMap.getString("formatErrorName.text");
        lengthErrorEmail = resourceMap.getString("lengthErrorEmail.text");
        formatErrorEmail = resourceMap.getString("formatErrorEmail.text");
        lengthErrorUsername = resourceMap.getString("lengthErrorUsername.text");
        formatErrorUsername = resourceMap.getString("formatErrorUsername.text");
        noMatchError = resourceMap.getString("noMatchError.text");
        lengthErrorPassword = resourceMap.getString("lengthErrorPassword.text");
        formatErrorPassword = resourceMap.getString("formatErrorPassword.text");
        userExistTitle = resourceMap.getString("userExistTitle.text");
        userExistMsg = resourceMap.getString("userExistMsg.text");
        fatalErrorTitle = resourceMap.getString("fatalErrorTitle.text");
        fatalErrorMsg = resourceMap.getString("fatalErrorMsg.text");
        
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        jTextField2.setText(resourceMap.getString("nameF.text")); // NOI18N
        jTextField2.setName("nameF"); // NOI18N


        jPasswordField1.setText(resourceMap.getString("passwordF.text")); // NOI18N
        jPasswordField1.setName("passwordF"); // NOI18N


        jPasswordField2.setText(resourceMap.getString("confirmationF.text")); // NOI18N
        jPasswordField2.setName("confirmationF"); // NOI18N

        jTextField3.setText(resourceMap.getString("emailF.text")); // NOI18N
        jTextField3.setName("emailF"); // NOI18N

        jTextField4.setText(resourceMap.getString("birthF.text")); // NOI18N
        jTextField4.setName("birthF"); // NOI18N


        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(jTextField2)
                                    .addComponent(jPasswordField1)
                                    .addComponent(jPasswordField2)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButton1)
                        .addGap(78, 78, 78)
                        .addComponent(jButton2)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>


    @SuppressWarnings("deprecation")
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    	resetHints();
    	String username = jTextField1.getText().trim();
    	String name = jTextField2.getText().trim();
    	String mail = jTextField3.getText().trim();
    	String date = jTextField4.getText().trim();
    	String password = jPasswordField1.getText();
    	String confirmation = jPasswordField2.getText();

    	boolean valid=validateFields(username,name,mail,date,password,confirmation);
    	if(!valid){
    		return;
    	}
    	
    	int ret = RegisterHandler.UseRegister(username,name,password,mail,date);
    	if(ret==1){
    		JOptionPane.showMessageDialog(null,userExistTitle,userExistMsg,JOptionPane.INFORMATION_MESSAGE);
    		return;
    	}
    	else if(ret==-1){
    		JOptionPane.showMessageDialog(null,fatalErrorTitle,fatalErrorMsg,JOptionPane.ERROR_MESSAGE);
    		return;
    	}
    	else{
    		dispose();
    	}
    }
    
    private boolean validateFields( String username,String name,String mail,String date,String password,String confirmation){
    	Font font = new Font("Serif", Font.BOLD, 10);
    	if(username.length()<Constants.usernameLengthMin || username.length()>Constants.usernameLengthMax){
    		jLabel1.setText(lengthErrorUsername);
    		jLabel1.setFont(font);
    		jLabel1.setForeground(Color.RED);
    		return false;
    	}
    	if(!username.matches(Constants.usernameRegExp)){
    		jLabel1.setText(formatErrorUsername);
    		jLabel1.setFont(font);
    		jLabel1.setForeground(Color.RED);
    		return false;
    	}
    	
    	
    	
    	if(name.length()<Constants.nameLengthMin || name.length()>Constants.nameLengthMax){
    		jLabel1.setText(lengthErrorName);
    		jLabel1.setFont(font);
    		jLabel1.setForeground(Color.RED);
    		return false;
    	}
    	if(!name.matches(Constants.nameRegExp)){
    		jLabel1.setText(formatErrorName);
    		jLabel1.setFont(font);
    		jLabel1.setForeground(Color.RED);
    		return false;
    	}
    	
    	
    	
    	if(password.length()<Constants.passwordLengthMin||password.length()>Constants.passwordLengthMax){
    		jLabel1.setText(lengthErrorPassword);
    		jLabel1.setFont(font);
    		jLabel1.setForeground(Color.RED);
    		return false;
    	}
    	if(!password.matches(Constants.passwordRegExp)){
    		jLabel1.setText(formatErrorPassword);
    		jLabel1.setFont(font);
    		jLabel1.setForeground(Color.RED);
    		return false;
    	}
    	if(!password.equals(confirmation)){
    		jLabel1.setText(noMatchError);
    		jLabel1.setFont(font);
    		jLabel1.setForeground(Color.RED);
    		return false;
    	}
    	
    	
    	
    	
    	if(mail.length()<Constants.emailLengthMin || mail.length()>Constants.emailLengthMax){
    		jLabel1.setText(lengthErrorEmail);
    		jLabel1.setFont(font);
    		jLabel1.setForeground(Color.RED);
    		return false;
    	}
    	if(!mail.matches(Constants.emailRegExp)){
    		jLabel1.setText(formatErrorEmail);
    		jLabel1.setFont(font);
    		jLabel1.setForeground(Color.RED);
    		return false;
    	}

    	return true;
    	
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }
    private void resetHints() {
    	jLabel1.setText(" ");

    }
    private String lengthErrorName;
    private String formatErrorName;
    private String lengthErrorEmail;
    private String formatErrorEmail;
    private String lengthErrorUsername;
    private String formatErrorUsername;
    private String noMatchError;
    private String lengthErrorPassword;
    private String formatErrorPassword;
    private String userExistTitle;
    private String userExistMsg;
    private String fatalErrorTitle;
    private String fatalErrorMsg;
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration

}
