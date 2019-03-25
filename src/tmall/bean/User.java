package tmall.bean;

public class User {

	private int id;
	private String name;
	private String password;
	
	public void setId(int id) {
		this.id =id ;
	}
	
	public int   getId() {
		return this.id;
		
	}
	
	public void setName(String name) {
		this.name =name ;
	}
	
	public String  getName() {
		return this.name;
		
	}
	
	public void setPassword(String password) {
		this.password=password ;
	}
	
	public String   getPassword() {
		return this.password;
		
	}
	
	//get  anonymous name for judge  
	public String getAnonymousName () {
		if(name==null)return null;
		
		if(name.length()<=1) return "*";
		
		if (name.length()==2) {
			return name.substring(0, 1)+"*";
		}
		
		char[] nameToChar = this.name.toCharArray();
		
		//from second to last but one 
		for (int i = 1; i < nameToChar.length-1; i++) {
			nameToChar[i]='*';
		}
		return  new  String(nameToChar);
		
	}
	
	
	
	
	
}
