package mainPackage;

import org.jdesktop.application.*;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import utils.*;
import servicesHandler.CategoryListHandler;
import servicesHandler.SubcategoryListHandler;
public class Main extends SingleFrameApplication{

	
	protected void startup()
	{
		JFrame myFrame = getMainFrame();
		myFrame.setName("mainFrame");
		
		
		JMenuBar mbar= new JMenuBar();
		JMenu menuD = new JMenu();
		menuD.setName("menuConfig");
		JMenuItem menuItemLanguaje= new JMenuItem();
		menuItemLanguaje.setName("menuItemLenguage");
		
		menuItemLanguaje.addActionListener(new ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent e)
			{
				LenguajeSelector answer = new LenguajeSelector(null);		
			};
		});
		
		menuD.add(menuItemLanguaje);
		mbar.add(menuD);
		getMainFrame().setJMenuBar(mbar);
		getMainFrame().add((new JScrollPane()).add(new TabbedPanel()));
		//getMainFrame().add(new TabbedPanel());
		show(getMainFrame());
	}
	public static void main(String[] args)
	{
		launch(Main.class, args);
	}

}
