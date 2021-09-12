import javax.swing.JOptionPane;
public class WordCounterApp{
	public static void main(String args[]){
		//vars
		String userText, errorMsg;
		int totalWords, totalCharacters, totalSentences;
		//object
		WordCounter wc=new WordCounter();
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
			//compute
			wc.countWords();
			wc.countCharacters();
			wc.countSentences();
			//get
			totalWords=wc.getTotalWords();
			totalCharacters=wc.getTotalCharacters();
			totalSentences=wc.getSentences();
			//output
			System.out.println(userText);
			JOptionPane.showMessageDialog(null, "Number of words in your text: "+totalWords+"\nNumber of characters in your text: "+totalCharacters+"\nNumber of sentences in your text: "+totalSentences);
		}
	}
}