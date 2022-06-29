package myServlet;

public class ReturnResult {
	private String value;
	public ReturnResult(){
		this.value="hello";
	}
	public ReturnResult(String input){
		this.value=input;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
