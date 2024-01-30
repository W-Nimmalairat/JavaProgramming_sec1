
public class FictionBook implements Author{
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	FictionBook(String title,int publieYear){
		this.title = title;
		this.publicYear =publicYear;
	}
	
	public void setAuthorName(String name) {
		this.author_name = author_name;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getLastName() {
		return this.author_name.toUpperCase();
	}
	public String getFirstName() {
		return this.author_name.toUpperCase();
	}
	public boolean checkEmail() {
		if(this.email == "@hotmail.com"||this.email=="@windowslive.com") {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean checkFormatName() {
		if(this.author_name == " ") {
			return true;
		}
		else {
			return false;
		}	
	}
	public String toString(){
		return title+" write by ";
	}
}
