package mainPackage;

import javax.swing.JList;

public class SubCategoryListBuilder extends JList{

	private static final long serialVersionUID = 1L;

	public SubCategoryListBuilder() {
		super();
		Object[] hola = new Object[4];
		hola[0]="hola1";
		hola[1]="hola2";
		hola[2]="hola3";
		hola[3]="hola4";
		setListData(hola);
		this.setSelectionMode(VERTICAL);
		addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
    			System.out.println("aca");
    		}
		});
	}
}
