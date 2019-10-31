import java.io.IOException;

public class PosAvg extends MesoInherit{

	private String stID;
	private Object stationMinus1;
	private Object stationMinus2;
	private Object stationPlus1;
	private Object stationPlus2;

	public PosAvg(String stID) throws IOException {
		this.stID = stID;
		readStations();
		
		
		// TODO Auto-generated constructor stub
	}
	public int indexOfStation() {
		
		int index = 0;
		for(int i = 0; i < list.size(); ++i) {
			if(stID.equals(list.get(i)))
			{
				index = i;
			}
		}
		
		otherStations(index);
		return index;
	}
	
	public void otherStations(int index)
	{
		
		if (index > 1 && index < 120) 
		{
		this.stationMinus1 = list.get(index - 1);
		this.stationMinus2 = list.get(index - 2);
		
		this.stationPlus1 = list.get(index + 1);
		this.stationPlus2 = list.get(index + 2);
		}
	}
		public String toString() {
			indexOfStation();
		return String.format("This index is average of %s and %s, %s and %s, and so on.", stationMinus1,
				stationPlus1, stationMinus2 ,
				stationPlus2);
	}
		
	}
	
	


