import javax.swing.JOptionPane;
public class WordCounterApp{
	public static void main(String args[]){
		//vars
		String userText, errorMsg;
		int totalWords;
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
		//set
		wc.setUserText(userText);
		//compute
		wc.countWords();
		//get
		totalWords=wc.getTotalWords();
		//output
		JOptionPane.showMessageDialog(null, "Number of words in your text: "+totalWords);
	}
}