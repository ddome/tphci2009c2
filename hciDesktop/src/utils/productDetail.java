package utils;

import mainPackage.BookDetail;
import mainPackage.DVDDetail;
import servicesHandler.BookDetailHandler;
import servicesHandler.DVDDetailHandler;

public class productDetail{

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("deprecation")
	public productDetail(String id) {
		System.out.println("ACA1");
        try{
        	System.out.println("ACA2");
        	BookDetailHandler book = new BookDetailHandler(id);
        	System.out.println("ACA3");
        	(new BookDetail(book.product)).show();
        }
        catch(Exception e){
        	System.out.println("ACA4");
        	DVDDetailHandler dvd = new DVDDetailHandler(id);
        	(new DVDDetail(dvd.product)).show();
        }
    }

}
