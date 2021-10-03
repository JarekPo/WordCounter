import javax.swing.JOptionPane;
public class WordCounterApp{
	public static void main(String args[]){
		//vars
		String userText, errorMsg, mostCommonWord, reversedText;
		int totalWords, totalCharacters, totalSentences, mostOccurrences, mostWordOccurrences;
		char mostCommon;
		//object
		WordCounter wc=new WordCounter();
		TextReverser tr=new TextReverser();
		//input
		userText=(JOptionPane.showInputDialog(null, "Enter text")).toLowerCase();
		if(userText.length()<2){
			if(!(userText.contains("a") || userText.contains("i") || userText.contains("o"))){
				errorMsg="Enter valid text";
				JOptionPane.showMessageDialog(null, errorMsg);
			}
		}
		else{
			//set
			wc.setUserText(userText);
			tr.setUserText(userText);
			//compute
			wc.countWords();
			wc.countCharacters();
			wc.countSentences();
			wc.findMostCommonLetter();
		//	wc.findMostCommonWord();
			tr.reverseText();
			//get
			totalWords=wc.getTotalWords();
			totalCharacters=wc.getTotalCharacters();
			totalSentences=wc.getSentences();
			mostOccurrences=wc.getMostOccurrences();
			mostCommon=wc.getMostCommonLetter();
			//mostCommonWord=wc.getMostCommonWord();
			mostWordOccurrences=wc.getMostWordOccurrences();
			reversedText=tr.getReversedText();
			//output
			System.out.println("User text: "+userText);
			JOptionPane.showMessageDialog(null, "Number of words in your text: "+totalWords+"\nNumber of characters in your text: "+totalCharacters+"\nNumber of sentences in your text: "+totalSentences);
			JOptionPane.showMessageDialog(null, "Most common letter in your text is \'"+mostCommon+"\', it occurrs "+mostOccurrences+" times");
			//JOptionPane.showMessageDialog(null, "Most common word in your text is \'"+mostCommonWord+"\', it occurrs "+mostWordOccurrences+" times");
			System.out.println("Reversed text: "+reversedText);

		}
	}
}