package mainPackage;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import utils.Constants;
import utils.Session;
import servicesHandler.PasswordHandler;

public class Password extends javax.swing.JFrame{

	private static final long serialVersionUID = 1L;

    public Password() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(Password.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jLabel1.setText(resourceMap.getString("passwordHint.text")); // NOI18N
        jLabel1.setName("passwordHint"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        jPasswordField1.setText(resourceMap.getString("jPasswordField1.text")); // NOI18N
        jPasswordField1.setName("jPasswordField1"); // NOI18N

        jPasswordField2.setText(resourceMap.getString("jPasswordField2.text")); // NOI18N
        jPasswordField2.setName("jPasswordField2"); // NOI18N


        jPasswordField3.setText(resourceMap.getString("jPasswordField3.text")); // NOI18N
        jPasswordField3.setName("jPasswordField3"); // NOI18N

        lengthError = resourceMap.getString("lengthError.text");
        formatError = resourceMap.getString("formatError.text");
        noMatchError = resourceMap.getString("noMatchError.text");
        fatalErrorTitle = resourceMap.getString("fatalErrorTitle.text");
        falalErrorMsg = resourceMap.getString("fatalErrorMsg.text");
        
        jButton1.setText(resourceMap.getString("okButton.text")); // NOI18N
        jButton1.setName("okButton"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
                Main.myFrame.setEnabled(true);
            }
        });

        jButton2.setText(resourceMap.getString("cancelButton.text")); // NOI18N
        jButton2.setName("cancelButton"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
                Main.myFrame.setEnabled(true);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jPasswordField3)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton2))
                    .addComponent(jButton1))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>


    @SuppressWarnings("deprecation")
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    	resetHints();
    	String password=jPasswordField1.getText().trim();
    	String new_password = jPasswordField2.getText().trim();
    	String confirmation = jPasswordField3.getText().trim();
    	String username = Session.getSession().username.trim();
    	boolean valid = validFields(password,new_password,confirmation);
        if(valid){
        	int ret = PasswordHandler.UsePassword(username,password,new_password);
        	if(ret==-1){
        		JOptionPane.showMessageDialog(null,fatalErrorTitle,falalErrorMsg,JOptionPane.ERROR_MESSAGE);
        		return;
        	}
        	dispose();
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private boolean validFields(String password ,String newPassword,String confirmation){
    	Font font = new Font("Serif", Font.BOLD, 15);
    	if(password.length()<Constants.passwordLengthMin || password.length()>Constants.passwordLengthMax){
    		jLabel1.setText(lengthError);
    		jLabel1.setFont(font);
    		jLabel1.setForeground(Color.RED);
    		return false;
    	}
    	if(!password.matches(Constants.passwordRegExp)){
    		jLabel1.setText(formatError);
    		jLabel1.setFont(font);
    		jLabel1.setForeground(Color.RED);
    		return false;
    	}
    	
    	
    	if(newPassword.length()<Constants.passwordLengthMin || password.length()>Constants.passwordLengthMax){
    		jLabel1.setText(lengthError);
    		jLabel1.setFont(font);
    		jLabel1.setForeground(Color.RED);
    		return false;
    	}
    	if(!password.matches(Constants.passwordRegExp)){
    		jLabel1.setText(formatError);
    		jLabel1.setFont(font);
    		jLabel1.setForeground(Color.RED);
    		return false;
    	}
    	
    	
    	if(confirmation.length()<Constants.passwordLengthMin || password.length()>Constants.passwordLengthMax){
    		jLabel1.setText(lengthError);
    		jLabel1.setFont(font);
    		jLabel1.setForeground(Color.RED);
    		return false;
    	}
    	if(!password.matches(Constants.passwordRegExp)){
    		jLabel1.setText(formatError);
    		jLabel1.setFont(font);
    		jLabel1.setForeground(Color.RED);
    		return false;
    	}
    
    	
    	if(!newPassword.equals(confirmation)){
    		jLabel1.setText(noMatchError);
    		jLabel1.setFont(font);
    		jLabel1.setForeground(Color.RED);
    		return false;
    	}
    	return true;
    }

    private void resetHints() {
    	jLabel1.setText(" ");

    }
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private String lengthError;
    private String formatError;
    private String noMatchError;
    private String fatalErrorTitle;
    private String falalErrorMsg;
    // End of variables declaration

}
