package mainPackage;
import org.jdesktop.application.*;

import java.awt.event.ActionListener;
import java.util.Locale;


import javax.swing.*;
import utils.*;
public class Main extends SingleFrameApplication{

	
	protected void startup()
	{
		JFrame myFrame = getMainFrame();
		myFrame.setName("mainFrame");
		
		
		JMenuBar mbar= new JMenuBar();
		JMenu menuD = new JMenu();
		menuD.setName("menuConfig"); // for injection
		JMenuItem menuItemAbout= new JMenuItem();
		menuItemAbout.setName("menuItemLenguage"); // for injection
		
		menuItemAbout.addActionListener(new ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent e)
			{
				LenguajeSelector answer = new LenguajeSelector(null);
				if(answer.getSelected()==null){
					return;
				}
				if(answer.getSelected().equals("Spanish(AR)")){
					Locale locale = new Locale("es","AR");
					Locale.setDefault(locale);
				}
				
			};
		});
		
		menuD.add(menuItemAbout);
		mbar.add(menuD);
		getMainFrame().setJMenuBar(mbar);
		
		show(getMainFrame());
	}
	public static void main(String[] args)
	{
		launch(Main.class, args);
	}

}
