package mainPackage;

import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import servicesHandler.BookDetailHandler;
import servicesHandler.DVDDetailHandler;
import utils.ProductShort;
import utils.productDetail;

public class ProductBuilder  extends JSplitPane{

	private String name;
	private String rank;
	private String price;
	private static final long serialVersionUID = 1L;
	private String viewTxt;
	@SuppressWarnings("deprecation")
	public ProductBuilder(ProductShort productBasic){
		super(JSplitPane.HORIZONTAL_SPLIT);
		
		this.setName(productBasic.id);
		
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(ProductBuilder.class);
        viewTxt = resourceMap.getString("view.text");
		name = resourceMap.getString("name.text");
		rank = resourceMap.getString("rank.text");
		price = resourceMap.getString("price.text");
		
		Dimension dim = new Dimension(10,150);
		this.setSize(dim);
		JButton view /*= new JButton("View")*/;
		BookDetailHandler book=null;
		DVDDetailHandler dvd = null;
		try{
        	book = new BookDetailHandler(productBasic.id);
        }
        catch(Exception e){
        	book=null;
        	dvd = new DVDDetailHandler(productBasic.id);
        }
		
		view = new JButton(viewTxt);
		view.setSize(5,5);
		
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
		this.setDividerLocation(60);
		show();
	}
}
