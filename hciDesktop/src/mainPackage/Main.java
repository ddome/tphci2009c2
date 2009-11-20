package mainPackage;

import org.jdesktop.application.*;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;

import javax.swing.*;
import utils.LenguajeSelector;
import utils.Login;
import utils.Register;
import utils.Session;
import servicesHandler.LogoutHandler;

public class Main extends SingleFrameApplication{

	static JMenuBar mbar= new JMenuBar();
	static JMenu menuD = new JMenu();
	static JMenu userD = new JMenu();
	static JMenuItem menuItemLanguaje= new JMenuItem();
	static JMenuItem login = new JMenuItem();
	static JMenuItem register = new JMenuItem();
	static JMenuItem password = new JMenuItem();
	static JMenuItem account = new JMenuItem();
	static JMenuItem logout = new JMenuItem();
	static String confirmExitTitle;
	static String confirmExitMsg;
	static JFrame main;
	protected void startup()
	{
		JFrame myFrame = getMainFrame();
		myFrame.setName("mainFrame");
		org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(Password.class);
		confirmExitTitle=resourceMap.getString("confirmExitTitle.text");
		confirmExitMsg=resourceMap.getString("confirmExitMsg.text");
		new Session();
		
		menuD.setName("menuConfig");
		userD.setName("userMenu");
		
		
		menuItemLanguaje.setName("menuItemLenguage");
		
		
		login.setName("loginDialog");
		password.setName("passwordDialog");
		account.setName("accountDialog");
		register.setName("registerDialog");
		logout.setName("logoutAction");
		
		/*menuItemLanguaje.addActionListener(new ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent e)
			{
				LenguajeSelector answer = new LenguajeSelector(null);		
			};
		});*/
		
		login.addActionListener(new ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent e)
			{
				JFrame mainFrame = getMainFrame();
				Login login = new Login();
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
		menuD.add(menuItemLanguaje);
		
		userD.add(password).hide();
		userD.add(account).hide();
		userD.add(logout).hide();
		
		mbar.add(menuD);
		mbar.add(userD);
		main = getMainFrame();
		getMainFrame().setJMenuBar(mbar);
		getMainFrame().add((new JScrollPane()).add(new TabbedPanel()));
		//getMainFrame().add(new TabbedPanel());
		show(getMainFrame());
	}
	public static void main(String[] args)
	{
		LenguajeSelector answer = new LenguajeSelector(null);
		launch(Main.class, args);
	}

	public static void toggleLoginOn(){
		userD.getMenuComponent(1).hide();
		userD.getMenuComponent(0).hide();
		userD.getMenuComponent(2).show();
		userD.getMenuComponent(3).show();
		userD.getMenuComponent(4).show();
	}
	
	public static void toggleLoginOff(){
		userD.getMenuComponent(1).show();
		userD.getMenuComponent(0).show();
		userD.getMenuComponent(2).hide();
		userD.getMenuComponent(3).hide();
		userD.getMenuComponent(4).hide();
	}
	
}
