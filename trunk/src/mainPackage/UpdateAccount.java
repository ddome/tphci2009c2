package mainPackage;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import servicesHandler.GetAccountHandler;
import servicesHandler.UpdateAccountHandler;
import utils.Constants;
import utils.Session;
import utils.UserDetails;
public class UpdateAccount extends javax.swing.JFrame{

	private static final long serialVersionUID = 1L;

    public UpdateAccount() {
        initComponents();
    }

    @SuppressWarnings("deprecation")
	private void initComponents() {
    	jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(UpdateAccount.class);
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

        jTextField1.setText(resourceMap.getString("nameF.text")); // NOI18N
        jTextField1.setName("nameF"); // NOI18N

        jTextField2.setText(resourceMap.getString("mailF.text")); // NOI18N
        jTextField2.setName("mailF"); // NOI18N

        jTextField3.setText(resourceMap.getString("dateF.text")); // NOI18N
        jTextField3.setName("dateF"); // NOI18N
        
        lengthErrorName=resourceMap.getString("lengthErrorName.text");
        formatErrorName=resourceMap.getString("formatErrorName.text");
        lengthErrorEmail=resourceMap.getString("lengthErrorEmail.text");
        formatErrorEmail=resourceMap.getString("formatErrorEmail.text");
        
        fatalErrorTitle=resourceMap.getString("fatalErrorTitle.text");
        falalErrorMsg=resourceMap.getString("falalErrorMsg.text");
        
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
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jButton1)
                .addGap(86, 86, 86)
                .addComponent(jButton2)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
            	Main.main.setEnabled(true);
            }
        });
        
        pack();
        UserDetails details = GetAccountHandler.useGetAccount(Session.getSession().username,Session.getSession().token );
        if(details==null){
        	JOptionPane.showMessageDialog(null,fatalErrorTitle,falalErrorMsg,JOptionPane.ERROR_MESSAGE);
    		return;
        }
        else{
	        jTextField1.setText(details.name);
	        jTextField2.setText(details.email);
	        jTextField3.setText(details.birth_date);
        }
        jTextField3.enable(false);
    }// </editor-fold>

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    	resetHints();
    	String name=jTextField1.getText().trim();
    	String email = jTextField2.getText().trim();
    	String date = jTextField3.getText().trim();
    	boolean valid=validateFields(name,email,date);
    	if(!valid){
    		return;
    	}
    	UpdateAccountHandler.useGetAccount(name,email,date,Session.getSession().username,Session.getSession().token);
    	dispose();
    }
    
    private boolean validateFields(String name,String email,String date){
    	Font font = new Font("Serif", Font.BOLD, 10);
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
    	
    	if(email.length()<Constants.emailLengthMin || email.length()>Constants.emailLengthMax){
    		jLabel1.setText(lengthErrorEmail);
    		jLabel1.setFont(font);
    		jLabel1.setForeground(Color.RED);
    		return false;
    	}
    	if(!email.matches(Constants.emailRegExp)){
    		jLabel1.setText(formatErrorEmail);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private String lengthErrorName;
    private String formatErrorName;
    private String lengthErrorEmail;
    private String formatErrorEmail;
    private String fatalErrorTitle;
    private String falalErrorMsg;
    // End of variables declaration
}
