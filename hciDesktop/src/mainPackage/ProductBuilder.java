package mainPackage;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import utils.ProductShort;
import utils.ProductViewer;

public class ProductBuilder  extends JSplitPane{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductBuilder(ProductShort productBasic){
		super(JSplitPane.HORIZONTAL_SPLIT);
		this.setName("splitPanel");
		Dimension dim = new Dimension(10,150);
		this.setSize(dim);
		JButton view = new JButton("View");
		view.addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
    			new ProductViewer();
    		}
		});
		setLeftComponent(view);
		
		String content = "Name: "+productBasic.name+"\nRank: "+productBasic.rank+"\nPrice: "+productBasic.price;
		System.out.println(content);
		JTextArea aux = new JTextArea(content,5,150);
		aux.setLineWrap(true);
		aux.enable(false);

		//aux.se = aux.getLineCount()*getFont().getSize();
		setRightComponent(new JScrollPane(aux));
		
		setPreferredSize(dim);
		
	}
}
