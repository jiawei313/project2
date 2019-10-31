import java.util.ArrayList;

public class LetterAvg {
	private char letterAverage;
	public LetterAvg(char letterAverage) {
		readFile();
		this.letterAverage = letterAverage;
		
	}
	
	public int numberOfStationWithLetterAvg() {
		String a = String.valueOf(letterAverage);
		
		int count = 0;
		for(int i = 0; i < list.size();++i) {
			char str = list.get(i).charAt(0);
			String b = String.valueOf(str);
			if(a.equals(b)) {
				count++;
			}
		}
		return count;
		
	}
	
	public ArrayList<String> startingWithLetter() {
		String a = String.valueOf(letterAverage);
		ArrayList<String> Arrlist = new ArrayList<String>();
		
		for(int i = 0; i < list.size();++i) {
			char str = list.get(i).charAt(0);
			String b = String.valueOf(str);
			if(a.equals(b)) {
				
				Arrlist.add(list.get(i));
				
			}
		}
		
		return Arrlist;
	}

}
