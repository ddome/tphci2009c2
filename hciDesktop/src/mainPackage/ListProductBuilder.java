package mainPackage;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import utils.ProductShort;
import utils.ProductViewer;

public class ListProductBuilder extends JPanel{

	private static final long serialVersionUID = 1L;

	public ListProductBuilder(ArrayList<ProductShort> list) {
		super();
		int i;
		GridLayout layout = new GridLayout(0,1);
		this.setLayout(layout);
		for(i=0;i<list.size();i++){
			ProductBuilder producto = new ProductBuilder(list.get(i));
			//producto.setSize(10,5);
			add(producto);
		}
	}
}
