package utils;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.jdesktop.application.Application;
import org.jdesktop.application.ApplicationContext;

public class ProductViewer extends JDialog{

	private static final long serialVersionUID = 1L;

	private String pwTitle;
	
	public ProductViewer(){
		super();
		ApplicationContext ctx = Application.getInstance().getContext();
		ctx.getResourceMap(getClass()).injectFields(this);
		
		JOptionPane.showMessageDialog(this,
			    "Descripcion",
			    pwTitle,
			    JOptionPane.INFORMATION_MESSAGE,
			    null);

	}
}
