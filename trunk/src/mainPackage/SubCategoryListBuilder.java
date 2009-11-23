package mainPackage;

import java.util.HashMap;
import javax.swing.JList;
import javax.swing.JScrollPane;

import servicesHandler.ProductListBySubCatHandler;
import servicesHandler.SubcategoryListHandler;
import utils.LanguageSession;

public class SubCategoryListBuilder extends JList{

	private static final long serialVersionUID = 1L;

	private HashMap <String,Integer> subCategories;
	
	public SubCategoryListBuilder(int selectedCathegory) {
		super();
		SubcategoryListHandler subcategories = new SubcategoryListHandler(selectedCathegory,LanguageSession.getActualLangugeId());
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
    			//((JSplitPane)((JScrollPane)getParent()).getParent()).setRightComponent(new ListProductBuilder((new ProductListBySubCatHandler(subCat)).list));
    			SplitPanelBuilder.splitPanelAux.setRightComponent(new JScrollPane(new ListProductBuilder((new ProductListBySubCatHandler(cat,subCat,LanguageSession.getActualLangugeId())).list)));
    		}
		});
	}

}
