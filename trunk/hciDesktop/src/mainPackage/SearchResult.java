package mainPackage;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

import utils.ProductShort;

public class SearchResult extends javax.swing.JFrame{

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("deprecation")
	public SearchResult(ArrayList<ProductShort> list) {
		setSize(500,500);
		JScrollPane jScrollPane1 = new JScrollPane(new ListProductBuilder(list));
    	jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    	jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    	//jPanel1.add(new ListProductBuilder(search.list));
    	//jPanel1.show(true);
    	org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(SearchResult.class);
    	String closeText = resourceMap.getString("close.text");
    	setTitle(resourceMap.getString("title.text"));
    	JSplitPane spliPanel = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
    	spliPanel.setRightComponent(jScrollPane1);
    	JButton closeButton = new JButton(closeText);
    	closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCloseButtonActionPerformed(evt);
            }
        });
    	spliPanel.setLeftComponent(closeButton);
    	this.add(spliPanel);
    	this.show();
	}
	
    private void jCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	dispose();
    }
}
