package utils;

import mainPackage.BookDetail;
import mainPackage.DVDDetail;
import servicesHandler.BookDetailHandler;
import servicesHandler.DVDDetailHandler;

public class productDetail{

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("deprecation")
	public productDetail(String id) {
        try{
        	BookDetailHandler book = new BookDetailHandler(id);
        	(new BookDetail(book.product)).show();
        }
        catch(Exception e){
        	DVDDetailHandler dvd = new DVDDetailHandler(id);
        	(new DVDDetail(dvd.product)).show();
        }
    }

}
