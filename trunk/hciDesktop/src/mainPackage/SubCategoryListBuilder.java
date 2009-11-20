package mainPackage;

import java.util.HashMap;

import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

import servicesHandler.ProductListBySubCatHandler;
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
        		System.out.println();
        		int subCat = subCategories.get(getSelectedValue());
        		int index = TabbedPanel.aux.getSelectedIndex();
        		String title = TabbedPanel.aux.getTitleAt(index);
        		int cat = TabbedPanel.listaCat.get(title);
        		System.out.println(subCat);
    			//((JSplitPane)((JScrollPane)getParent()).getParent()).setRightComponent(new ListProductBuilder((new ProductListBySubCatHandler(subCat)).list));
    			SplitPanelBuilder.splitPanelAux.setRightComponent(new ListProductBuilder((new ProductListBySubCatHandler(cat,subCat)).list));
    		}
		});
	}

}
