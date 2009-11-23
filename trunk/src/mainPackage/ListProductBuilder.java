package mainPackage;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import utils.ProductShort;

public class ListProductBuilder extends JPanel{

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("deprecation")
	public ListProductBuilder(ArrayList<ProductShort> list) {
		super();
		int i;
		GridLayout layout = new GridLayout(0,1);
		this.setLayout(layout);
		for(i=0;i<list.size();i++){
			ProductBuilder producto = new ProductBuilder(list.get(i));
			add(producto);
		}
		show();
	}
}
