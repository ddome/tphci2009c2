package mainPackage;

import java.awt.event.ActionListener;
import java.util.Locale;
import org.jdesktop.application.*;
import javax.swing.*;

import utils.LanguageSession;
import utils.Session;
import servicesHandler.LogoutHandler;

public class Main extends SingleFrameApplication{

	static JMenuBar mbar= new JMenuBar();
	static JMenu searchD = new JMenu();
	static JMenu userD = new JMenu();
	static JMenuItem menuItemLanguaje= new JMenuItem();
	static JMenuItem login = new JMenuItem();
	static JMenuItem register = new JMenuItem();
	static JMenuItem password = new JMenuItem();
	static JMenuItem account = new JMenuItem();
	static JMenuItem logout = new JMenuItem();
	static JMenuItem search = new JMenuItem();
	static String confirmExitTitle;
	static String confirmExitMsg;
	static JFrame main;
	public static JFrame myFrame;
	private static String fatalErrorTitle;
	private static String falalErrorMsg;
	
	@SuppressWarnings("deprecation")
	protected void startup()
	{
		myFrame = getMainFrame();
		myFrame.setName("mainFrame");
		org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(Password.class);
		confirmExitTitle=resourceMap.getString("confirmExitTitle.text");
		confirmExitMsg=resourceMap.getString("confirmExitMsg.text");
		fatalErrorTitle=resourceMap.getString("fatalErrorTitle.text");
		falalErrorMsg=resourceMap.getString("falalErrorMsg.text");
		new Session();

		searchD.setName("searchMenu");
		userD.setName("userMenu");
		
		login.setName("loginDialog");
		password.setName("passwordDialog");
		account.setName("accountDialog");
		register.setName("registerDialog");
		logout.setName("logoutAction");
		search.setName("searchDialog");
		
		login.addActionListener(new ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent e)
			{
				JFrame mainFrame = getMainFrame();
				mainFrame.setEnabled(false);
				Login login = new Login();
				login.setLocationRelativeTo(mainFrame);
	            login.setVisible(true);
	            login.setResizable(false);
			};
			
		});
		
		search.addActionListener(new ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent e)
			{
				JFrame mainFrame = getMainFrame();
				Search login = new Search();
				login.setLocationRelativeTo(mainFrame);
	            login.setVisible(true);
	            login.setResizable(false);
			};
			
		});
		

		register.addActionListener(new ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent e)
			{
				JFrame mainFrame = getMainFrame();
				mainFrame.setEnabled(false);
				Register register = new Register();
				register.setLocationRelativeTo(mainFrame);
				register.setVisible(true);
				register.setResizable(false);
			};
		});
		
		password.addActionListener(new ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent e)
			{
				JFrame mainFrame = getMainFrame();
				mainFrame.setEnabled(false);
				Password password = new Password();
				password.setLocationRelativeTo(mainFrame);
				password.setVisible(true);
				password.setResizable(false);
			};
		});
		
		account.addActionListener(new ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent e)
			{
				JFrame mainFrame = getMainFrame();
				mainFrame.setEnabled(false);
				UpdateAccount account = new UpdateAccount();
				account.setLocationRelativeTo(mainFrame);
				account.setVisible(true);
				account.setResizable(false);
			};
		});
		
		logout.addActionListener(new ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent e)
			{
				int option = JOptionPane.showConfirmDialog(null,confirmExitMsg,confirmExitTitle, JOptionPane.YES_NO_OPTION);
				if(JOptionPane.NO_OPTION==option){
					return;
				}
				new LogoutHandler(Session.getSession().username,Session.getSession().token);
				toggleLoginOff();
				Session.getSession().CloseSession();
			};
		});
		
		userD.add(register);
		userD.add(login);
		searchD.add(search);
		
		userD.add(password).hide();
		userD.add(account).hide();
		userD.add(logout).hide();
		
		mbar.add(searchD);
		mbar.add(userD);
		main = getMainFrame();
		getMainFrame().setJMenuBar(mbar);
		TabbedPanel pane = new TabbedPanel();
		
		getMainFrame().add((new JScrollPane(pane)).add(pane));
		show(getMainFrame());
		pane.tabbedPane.setSelectedIndex(0);
	}
	public static void main(String[] args)
	{
		org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(Password.class);
		fatalErrorTitle=resourceMap.getString("fatalErrorTitle.text");
		falalErrorMsg=resourceMap.getString("falalErrorMsg.text");
		try {
			new LenguajeSelector(null);
		} catch (Exception e) {
        	JOptionPane.showMessageDialog(null,fatalErrorTitle,falalErrorMsg,JOptionPane.ERROR_MESSAGE);
    		System.exit(1);
		}
		if(LanguageSession.getActualLangugeName().compareToIgnoreCase("English")==0){
			Locale.setDefault(new Locale("en","US"));
		}
		else{
			Locale.setDefault(new Locale("es","AR"));
		}
		launch(Main.class, args);
	}

	@SuppressWarnings("deprecation")
	public static void toggleLoginOn(){
		userD.getMenuComponent(1).hide();
		userD.getMenuComponent(0).hide();
		userD.getMenuComponent(2).show();
		userD.getMenuComponent(3).show();
		userD.getMenuComponent(4).show();
	}
	
	@SuppressWarnings("deprecation")
	public static void toggleLoginOff(){
		userD.getMenuComponent(1).show();
		userD.getMenuComponent(0).show();
		userD.getMenuComponent(2).hide();
		userD.getMenuComponent(3).hide();
		userD.getMenuComponent(4).hide();
	}
	
}
