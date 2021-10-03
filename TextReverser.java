public class TextReverser{
	//vars
	private String userText, reversedText;
	private StringBuffer strBuff;
	//constructor
	public TextReverser(){
		reversedText="";
		strBuff=new StringBuffer();
	}
	//set
	public void setUserText(String userText){
		this.userText=userText;
	}
	//compute
	public void reverseText(){
		for(int i=userText.length()-1;i>=0;i--){
			strBuff.append(userText.charAt(i));
		}
		reversedText=strBuff.toString();
	}
	//get
	public String getReversedText(){
		return reversedText;
	}
}