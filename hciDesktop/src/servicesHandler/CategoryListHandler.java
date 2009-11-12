package servicesHandler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StringReader;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class CategoryListHandler {
	ArrayList <String> categories = new ArrayList<String>(10);
	
	public CategoryListHandler(){
		try{
			URL url = new URL("http://eiffel.itba.edu.ar/hci/service/Catalog.groovy?method=GetCategoryList&language_id=1");
		
		    //make connection, use post mode, and send query
		    URLConnection urlc = url.openConnection();
		    urlc.setDoOutput(false);
		    urlc.setAllowUserInteraction(false);
		    //String encodedPost = URLEncoder.encode(ret);
		    //PrintStream ps = new PrintStream(urlc.getOutputStream());
		    //ps.print("launchData=" + encodedPost);
		    //ps.close();
		
		    //retrieve result
		    BufferedReader br = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
		    String str;
		    StringBuffer sb = new StringBuffer();
		    while ((str = br.readLine()) != null) {
		        sb.append(str);
		        sb.append("\n");
		    }
		    br.close();
		    String response = sb.toString();
		
		    if (response == null) {
		        //setErrorMessage(, "Launch REST Web Service returned nothing");
		    	//jLabel1.setText("response null");
		    }
		    
		
		    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		    DocumentBuilder db = dbf.newDocumentBuilder();
		    InputSource is = new InputSource();
		    is.setCharacterStream(new StringReader(response));
		    Document dom = db.parse(is);
		    NodeList nl = dom.getElementsByTagName("categories");
		    
		    System.out.println("Antes del for");
		    for(int i=0; i<nl.getLength();i++) {
		        Element e = (Element) nl.item(i);
		        NodeList name = e.getElementsByTagName("name");
		        
		        Element line = (Element) name.item(1);
		        categories.add(line.toString());
		        System.out.println(line.toString());
		        //label += getCharacterDataFromElement(line) + "; ";
		    }
		    System.out.println("Despues del for");
		    //jLabel1.setText(label);
	
		} catch (Exception e) {
	    	e.printStackTrace();
	    //setErrorMessage(request, "Failed REST service call. Exception=" + e);
	    //response = null;
		}
	}
	
	public ArrayList<String> getCategories() {
		return categories;
	}
}
