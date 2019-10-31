import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MesoInherit extends MesoAbstract{
	public static ArrayList<String> list = new ArrayList<String>();
	private MesoStation mesoStation;
	
	
	public MesoInherit(){
		list = new ArrayList<String>();
		mesoStation = null;
	}
	public MesoInherit(MesoStation mesoStation) throws IOException{
		readStations();
		this.mesoStation = mesoStation;
		
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
		
		
		
		int ascCeiling = 0;
		for(int i = 0; i < 4; ++i) {
			char character = mesoStation.getStID().charAt(i);
			ascCeiling += (int)character;
		}
		ascCeiling = (int) Math.ceil(ascCeiling / 4.0);
		
		return ascCeiling;
		
	}
	
	public int AsciiFloor() {
		
		
		
		int AsciiFloor = 0;
		for(int i = 0; i < 4; ++i) {
			char character = mesoStation.getStID().charAt(i);
			AsciiFloor += (int)character;
		}
		AsciiFloor = AsciiFloor / 4;
		
		return AsciiFloor;
		
	}

public int AsciiAvg() {
		
		
		
		double sum = 0;
		for(int i = 0; i < 4; ++i) {
			char character = mesoStation.getStID().charAt(i);
			sum += (int)character;
		}
		int AsciiAvg = (int) Math.round(sum / 4.0);
		
		return AsciiAvg;
		
	}






	@Override
	

}
