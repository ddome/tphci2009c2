package mainPackage;

import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import servicesHandler.ProductListByCatHandler;
import utils.LanguageSession;

public class SplitPanelBuilder extends JSplitPane{

	private static final long serialVersionUID = 1L;
	public static JSplitPane splitPanelAux;
	public SplitPanelBuilder(int selectedCathegory){
		super(JSplitPane.HORIZONTAL_SPLIT);
		this.setName("splitPanel");
		
		JScrollPane leftScroll = new JScrollPane(new SubCategoryListBuilder(selectedCathegory));
		leftScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		leftScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		JScrollPane rightScroll = new JScrollPane((new ListProductBuilder((new ProductListByCatHandler(selectedCathegory,LanguageSession.getActualLangugeId())).list)));
		rightScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		rightScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		rightScroll.setSize(400,200);
		setLeftComponent(leftScroll);
		setRightComponent(rightScroll);
		setPreferredSize(new Dimension(700,500));
		splitPanelAux=this;
	}

}
