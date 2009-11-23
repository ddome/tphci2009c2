package utils;

public class ProductShort {
	public String name;
	public String id;
	public String rank;
	public String price;
	public String url;
	public ProductShort(String id,String name,String rank,String price,String url){
		this.name=name;
		this.rank=rank;
		this.price=price;
		this.url=url;
		this.id=id;
	}
}
