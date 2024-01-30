
public class Theater extends Movie {
	private int theateNo;
	public Theater(String id,String name,Director director,int theaterNo){
		super(id,name,director);
		this.theateNo = theateNo;
	}
	public Theater() {
		this.theateNo = 1;
	}
	public String getTeaterName() {
		if(theateNo > 0 &&theateNo < 12)
		return "Basic Theater";
		else if(theateNo > 11 && theateNo < 15)
			return "Sweet Theater";
		else
			return "Premium Theater";
	}
	public String toString() {
		return getTeaterName()+":"+super.toString();
	}
}
