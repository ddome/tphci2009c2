package mainPackage;

import java.awt.Dimension;

import javax.swing.JSplitPane;

public class SplitPanelBuilder extends JSplitPane{

	private static final long serialVersionUID = 1L;

	public SplitPanelBuilder(int selectedCathegory){
		super(JSplitPane.HORIZONTAL_SPLIT);
		setLeftComponent(new SubCategoryListBuilder());
		setRightComponent(new ListProductBuilder());
		setPreferredSize(new Dimension(410, 500));
		
	}
}
