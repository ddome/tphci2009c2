package mainPackage;

import java.util.*;
import javax.swing.*;


public class TabbedPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private JTabbedPane tabbedPane;
	
	public TabbedPanel() {
        //super(new GridLayout(1, 1));
        int i;
        tabbedPane = new JTabbedPane();
        ImageIcon icon = null;
        
        ArrayList<String> listaCat = new ArrayList<String>(4);
        listaCat.add("Libros");
        listaCat.add("Peliculas");
        listaCat.add("Revista");
        listaCat.add("Electronica");
        
        tabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
    			int selectedIndex = tabbedPane.getSelectedIndex();
    			tabbedPane.setComponentAt(selectedIndex, new SplitPanelBuilder(selectedIndex));
    		}
		});
        
        for(i=0;i<4;i++){
        	tabbedPane.addTab(listaCat.get(i), icon, null,
            "Does nothing");
        	if(i==0){
        		tabbedPane.setComponentAt(0, new SplitPanelBuilder(0));
        	}
        }
                
        add(tabbedPane);
    }
}
