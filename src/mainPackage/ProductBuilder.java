package mainPackage;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import utils.ProductShort;
import utils.productDetail;

public class ProductBuilder  extends JSplitPane{

	private String name;
	private String rank;
	private String price;
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("deprecation")
	public ProductBuilder(ProductShort productBasic){
		super(JSplitPane.HORIZONTAL_SPLIT);
		
		this.setName(productBasic.id);
		
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(ProductBuilder.class);
        
		name = resourceMap.getString("name.text");
		rank = resourceMap.getString("rank.text");
		price = resourceMap.getString("price.text");
		
		Dimension dim = new Dimension(10,150);
		this.setSize(dim);
		JButton view = new JButton("View");

		view = new JButton();

		view.addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
        		new productDetail(getName());
    		}
		});
		setLeftComponent(view);
		
		String content = name+": "+productBasic.name+"\n"+rank+": "+productBasic.rank+"\n"+price+": "+productBasic.price;
		JTextArea aux = new JTextArea(content,5,150);
		aux.setLineWrap(true);
		aux.enable(false);

		//aux.se = aux.getLineCount()*getFont().getSize();
		setRightComponent(new JScrollPane(aux));
		
		setPreferredSize(dim);
		show();
	}
}
