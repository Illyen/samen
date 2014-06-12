import java.util.ArrayList;
import java.util.Random;

public class SamenListe {

	// Liste aller Samenzustände
	private ArrayList<int[]> sAL = new ArrayList<int[]>();
	
	// Constructor
	public SamenListe()
	{
		sAL.add(new int[5]);
	}
	
	// Spawne neue Samen, schreibt NICHT direkt in die Liste, Array muss mit add() hinzugefügt werden
	public int[] createNext(int[] curSamen)
	{
		// Check ob überhaupt etwas getan werden muss
		if (curSamen[1]!=0)
		{
			int j=0;
			int nr=0;
			int[] newSamen = new int[5];
			Random rand = new Random();
			for (int i=0;i<5;i++)
			{
				newSamen[i]=curSamen[i];
				System.out.print(curSamen[i]+" ");
			}
			while(j<curSamen[1])
			{
				j++;
				//  Welcher Samen wurde gespawnt?
				nr = rand.nextInt(curSamen[0]);
				if(nr<curSamen[1])
			    	{
			            newSamen[1]++;
			            newSamen[0]++;
			        }
			        else if(nr<curSamen[1]+curSamen[2])
			        {
			            newSamen[2]++;
			            newSamen[0]++;
			        }
			        else if(nr<curSamen[1]+curSamen[2]+curSamen[3])
			        {
			        	newSamen[3]++;
			        	newSamen[0]++;
			        }
			        else if(nr<curSamen[0])
			        {
			        	newSamen[4]++;
			        	newSamen[0]++;
			        }
				// Gib neue Samenliste zurück		
				}
			return  newSamen;	
		}
		// Gib Eingabe zurück, falls nichts geändert wurde
		return curSamen;
	}
	
	// Gib letztes Element zurück
	public int[] getLast()
	{
		return sAL.get(sAL.size()-1);
	}
	
	// Entferne letztes Element und gib das neue letzte zurück
	public int[] stepBack()
	{
		if(sAL.size()!=1)
		{
			sAL.remove(sAL.size()-1);
		}			
		return sAL.get(sAL.size()-1);
	}
	
	// Füge neues Element am Ende hinzu
	public void add(int[] newEntry)
	{
		sAL.add(newEntry);
	}
	
	// Gib Größe der Liste zurück, unnötig?
	public int size()
	{
		return sAL.size();
	}
}
