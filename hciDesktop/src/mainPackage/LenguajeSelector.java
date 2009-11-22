package mainPackage;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import org.jdesktop.application.Application;
import org.jdesktop.application.ApplicationContext;
import org.jdesktop.application.Resource;
import servicesHandler.LanguageHandler;
import utils.LanguageSession;

public class LenguajeSelector extends JDialog{
	
	private static final long serialVersionUID = 1L;
	
	@Resource
	private String lsTitle;
	@Resource
	private String lsMessage;
	@Resource
	private Object lenguageSelected;
	@Resource
	private int optionType;
	
	public LenguajeSelector(Object selected){
		ApplicationContext ctx = Application.getInstance().getContext();
		ctx.getResourceMap(getClass()).injectFields(this);
		if( selected!=null ){
			lenguageSelected = selected;
		}
		LanguageHandler langSelector = new LanguageHandler();
		
		int size = langSelector.languages.size();
		Object[] options = new Object[size];
		for(int i=0;i<size;i++){
			String languages="";
			languages+=langSelector.languages.get(i).name+" ("+langSelector.languages.get(i).code+")";
			options[i]=languages;
		}
		String ret = (String) JOptionPane.showInputDialog(null,lsMessage,lsTitle,optionType,null,options,lenguageSelected);
		if(ret==null){
			System.exit(0);
		}
		int i=0;
		for(i=0;i<size;i++){
			if(options[i].equals(ret)){
				break;
			}
		}
		if(ret.equals("English (US)")){
			new LanguageSession(langSelector.languages.get(i));
		}
		else{
			new LanguageSession(langSelector.languages.get(i));
		}
		
	}
	
	public Object getSelected(){
		return lenguageSelected;
	}
}
