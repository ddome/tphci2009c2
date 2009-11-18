package mainPackage;

import java.awt.Dimension;

import javax.swing.JSplitPane;

public class SplitPanelBuilder extends JSplitPane{

	private static final long serialVersionUID = 1L;

	public SplitPanelBuilder(int selectedCathegory){
		super(JSplitPane.HORIZONTAL_SPLIT);
		this.setName("splitPanel");
		setLeftComponent(new SubCategoryListBuilder(selectedCathegory));
		setRightComponent(new ListProductBuilderByCat(selectedCathegory));
		setPreferredSize(new Dimension(700,500));
		
	}
}
