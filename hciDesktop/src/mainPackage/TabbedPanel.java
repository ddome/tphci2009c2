package mainPackage;

import java.util.*;

import javax.swing.*;

import servicesHandler.CategoryListHandler;


public class TabbedPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private JTabbedPane tabbedPane;

	static public  HashMap <String,Integer> listaCat = new CategoryListHandler().getCategories();
	
	static public JTabbedPane aux;
	public TabbedPanel() {
		int i=0;
		tabbedPane = new JTabbedPane();
        ImageIcon icon = null;
        aux = tabbedPane;
        tabbedPane.setName("tabbedPanel");
        
        tabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
    			int selectedIndex = tabbedPane.getSelectedIndex();
    			String title = tabbedPane.getTitleAt(selectedIndex);
    			tabbedPane.setComponentAt(selectedIndex, new SplitPanelBuilder(listaCat.get(title)));
    		}
		});
        
        for(String s: listaCat.keySet()){
        	tabbedPane.addTab(s, icon, null,
            "Does nothing");
        	if(i==0){
        		tabbedPane.setComponentAt(0, new SplitPanelBuilder(listaCat.get(s)));
        	}
        	i++;
        }

        add(tabbedPane);
    }
}
