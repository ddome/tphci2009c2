package mainPackage;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

import javax.swing.*;

import utils.LenguajeSelector;

public class TabbedPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TabbedPanel() {
        //super(new GridLayout(1, 1));
        int i;
        JTabbedPane tabbedPane = new JTabbedPane();
        ImageIcon icon = null;
        ArrayList<String> listaCat = new ArrayList(4);
        listaCat.add("Libros");
        listaCat.add("Peliculas");
        listaCat.add("Revista");
        listaCat.add("Electronica");
        for(i=0;i<4;i++){
        	JComponent panel = makeTextPanel(listaCat.get(i));
        	panel.setPreferredSize(new Dimension(410, 50));
            tabbedPane.addTab(listaCat.get(i), icon, panel,
                    "Does nothing");
            tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
            
        }
                
        add(tabbedPane);
        
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
    
    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }

}
