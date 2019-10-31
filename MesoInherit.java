import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class MesoInherit extends MesoAbstract{
	private static ArrayList<String> list = new ArrayList<String>();
	private String stID; 

	public MesoInherit(String stID) {
		this.stID = stID;
		readFile();
	}
	
	public void readFile() {
		try {
			readStations();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void readStations() throws IOException
	{
		
		BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
    	String str;
    	str = br.readLine();
    	str = br.readLine();
    	str = br.readLine();

    	
    	
    	while(str != null) 
    	{
    	
    		str = str.substring(1,5);
    		list.add(str);
    		
    		str = br.readLine();		
    	}
    	br.close();
	}
	
	
	
	
	
	public int AsciiCeiling() {
		char[] cArray= new char[4];
		
		cArray = stID.toCharArray();
		int ascCeiling = 0;
		for(int i = 0; i < cArray.length; ++i) {
			ascCeiling += (int)cArray[i];
		}
		
		
		return ascCeiling;
		
	}
	public int AsciiFloor() {
		char[] cArray= new char[4];
		
		cArray = stID.toCharArray();
		int AsciiFloor = 0;
		for(int i = 0; i < cArray.length; ++i) {
			AsciiFloor += (int)cArray[i];
		}
		
		
		return AsciiFloor;
		
	}
	








	@Override
	int[] calAverage() {
		// TODO Auto-generated method stub
		return null;
	}
}
