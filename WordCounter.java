public class WordCounter{
	//vars
	private String userText;
	private int totalWords, totalCharacters, totalSentences, mostOccurrences, charOccurrences;
	private char mostCommon;
	//constructor
	public WordCounter(){
		totalWords=1;
		totalCharacters=0;
		totalSentences=0;
		mostOccurrences=0;
		charOccurrences=0;
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
		/*for(int i=0; i<userText.length();i++){
			totalCharacters++;
		}*/
		totalCharacters=userText.length();
	}
	public void countSentences(){
		if(userText.length()>0){
			for(int i=1;i<userText.length();i++){
				if(((userText.charAt(i)=='.') || (userText.charAt(i)=='!') || (userText.charAt(i)=='?')) && ((userText.charAt(i-1)!='.') && (userText.charAt(i-1)!='!') && (userText.charAt(i-1)!='?'))){
					totalSentences++;
				}
			}
		}
		if (totalSentences==0){
			totalSentences=1;
		}
	}
	public void findMostCommonLetter(){
		for(int i=0;i<userText.length();i++){
			for(int j=(i+1);j<userText.length();j++){
				if(userText.charAt(i)==userText.charAt(j)){
					charOccurrences++;
				}
			}
			if(charOccurrences>=mostOccurrences){
				mostCommon=userText.charAt(i);
				mostOccurrences=charOccurrences;
				charOccurrences=0;
			}
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
	public int getMostOccurrences(){
		return mostOccurrences;
	}
	public char getMostCommonLetter(){
		return mostCommon;
	}
}