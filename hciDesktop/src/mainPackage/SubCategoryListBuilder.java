package mainPackage;

import java.util.HashMap;

import javax.swing.JList;
import javax.swing.JSplitPane;

import servicesHandler.SubcategoryListHandler;

public class SubCategoryListBuilder extends JList{

	private static final long serialVersionUID = 1L;

	private HashMap <String,Integer> subCategories;
	
	public SubCategoryListBuilder(int selectedCathegory) {
		super();
		SubcategoryListHandler subcategories = new SubcategoryListHandler(selectedCathegory);
		subCategories = subcategories.getSubCategories();
		setListData(subCategories.keySet().toArray());
		this.setSelectionMode(VERTICAL);
		addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
        		System.out.println(getSelectedValue());
    			((JSplitPane)getParent()).setRightComponent(null);
    		}
		});
	}

}
