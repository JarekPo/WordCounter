public class WordCounter{
	//vars
	private String userText;
	private int totalWords;
	//constructor
	public WordCounter(){
		totalWords=1;
	}
	//set
	public void setUserText(String userText){
		this.userText=userText;
	}
	//compute
	public void countWords(){
		for(int i=1;i<userText.length();i++){
			if((userText.charAt(i)==' ') && (userText.charAt(i-1)!=' ')){
				totalWords++;
			}
		}
	}
	//get
	public int getTotalWords(){
		return totalWords;
	}
}