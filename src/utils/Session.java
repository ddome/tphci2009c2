package utils;

public class Session {
	public String id=null;
	public String username=null;
	public String name=null;
	public String last_login=null;
	public String token=null;
	
	static private Session session = null;
	
	public Session(){
		if(session!=null){
			getSession();
		}
		else{
			session=this;
		}
	}
	
	static public Session getSession(){
		return session;
	}
	
	public void CloseSession(){
		this.id=null;
		this.username=null;
		this.name=null;
		this.last_login=null;
		this.token=null;
	}
}
