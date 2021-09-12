public class WordCounter{
	//vars
	private String userText;
	private int totalWords, totalCharacters, totalSentences;
	//constructor
	public WordCounter(){
		totalWords=1;
		totalCharacters=0;
		totalSentences=0;
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
	public void countCharacters(){
		for(int i=0; i<userText.length();i++){
			totalCharacters++;
		}
	}
	public void countSentences(){
		if(userText.length()>0){
			for(int i=1;i<userText.length();i++){
				if(((userText.charAt(i)=='.') || (userText.charAt(i)=='!') || (userText.charAt(i)=='?')) && ((userText.charAt(i-1)!='.') || (userText.charAt(i)!='!') || (userText.charAt(i)!='?'))){
					totalSentences++;
				}
			}
		}
		if (totalSentences==0){
			totalSentences=1;
		}
	}
	//get
	public int getTotalWords(){
		return totalWords;
	}
	public int getTotalCharacters(){
		return totalCharacters;
	}
	public int getSentences(){
		return totalSentences;
	}
}