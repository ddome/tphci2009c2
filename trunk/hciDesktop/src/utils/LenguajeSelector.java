package utils;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.jdesktop.application.Application;
import org.jdesktop.application.ApplicationContext;
import org.jdesktop.application.Resource;

public class LenguajeSelector extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Resource
	private String lsTitle;
	@Resource
	private String lsMessage;
	@Resource
	private String lsOptions;
	@Resource
	private Object lenguageSelected;
	@Resource
	private int optionType;
	
	public LenguajeSelector(Object selected){
		ApplicationContext ctx = Application.getInstance().getContext();
		ctx.getResourceMap(getClass()).injectFields(this);
		Object[] options = lsOptions.split("-");
		if( selected!=null ){
			lenguageSelected = selected;
		}
		
		Object ret = JOptionPane.showInputDialog(null,lsMessage,lsTitle,optionType,null,options,lenguageSelected);
		if (ret!=null){
			lenguageSelected=ret;
		}
	}
	
	public Object getSelected(){
		return lenguageSelected;
	}
	
}
