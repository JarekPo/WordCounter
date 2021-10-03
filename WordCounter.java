public class WordCounter{
	//vars
	private String userText, mostCommonWord;
	private int totalWords, totalCharacters, totalSentences, mostOccurrences, charOccurrences, mostWordOccurrences, wordOccurrences, wordLength;
	private char mostCommon;
	private char[] letters={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	private StringBuffer strBuffFirstWord, strBuffSecondWord;
	//constructor
	public WordCounter(){
		totalWords=1;
		totalCharacters=0;
		totalSentences=0;
		mostOccurrences=1;
		charOccurrences=1;
		wordLength=0;
		strBuffFirstWord=new StringBuffer();
		strBuffSecondWord=new StringBuffer();
		mostWordOccurrences=1;
		wordOccurrences=1;
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
				if(userText.charAt(i)==userText.charAt(j) && (userText.charAt(j)!=mostCommon)){
					for(int k=0;k<letters.length;k++){
						if(letters[k]==userText.charAt(i)){
							charOccurrences++;
						}
					}
				}
			}
			if(charOccurrences>=mostOccurrences){
				mostCommon=userText.charAt(i);
				mostOccurrences=charOccurrences;
			}
			charOccurrences=1;
		}
	}
/*	public void findMostCommonWord(){
		for(int i=0;i<userText.length();i=i+wordLength){
			for(int j=0; (userText.charAt(j)!=' ') && j<userText.length();j++){
				strBuffFirstWord.append(userText.charAt(j));
				//create method isLastWord and apply before second word loop
			}
			wordLength=strBuffFirstWord.length();
			for(int k=wordLength; (userText.charAt(k)!=' ') && (k<userText.length());k++){
				strBuffSecondWord.append(userText.charAt(k));
			}
			if(strBuffFirstWord.equals(strBuffSecondWord)){
				wordOccurrences++;
			}
			//strBuffFirstWord=strBuffSecondWord;

			if(wordOccurrences>=mostWordOccurrences){
				mostCommonWord=strBuffFirstWord.toString();
				mostWordOccurrences=wordOccurrences;
			}
		strBuffSecondWord.delete(0, strBuffSecondWord.length());
		strBuffFirstWord.delete(0, strBuffFirstWord.length());
		wordOccurrences=1;
		}
	}*/
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
	public int getMostWordOccurrences(){
		return mostWordOccurrences;
	}
	public String getMostCommonWord(){
		return mostCommonWord;
	}
}