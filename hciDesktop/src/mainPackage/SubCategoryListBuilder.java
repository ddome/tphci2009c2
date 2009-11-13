package mainPackage;

import javax.swing.JList;
import servicesHandler.SubcategoryListHandler;

public class SubCategoryListBuilder extends JList{

	private static final long serialVersionUID = 1L;

	public SubCategoryListBuilder(int selectedCathegory) {
		super();
		SubcategoryListHandler subcategories = new SubcategoryListHandler(selectedCathegory);
		setListData(subcategories.getSubCategories().keySet().toArray());
		this.setSelectionMode(VERTICAL);
		addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
    			System.out.println("aca");
    		}
		});
	}
}
