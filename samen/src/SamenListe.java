import java.util.ArrayList;

public class SamenListe {

	private ArrayList<SamenArray> sAL = new ArrayList<SamenArray>();
	
	public SamenListe()
	{
		sAL.add(new SamenArray());
		System.out.print(sAL.size());
	}
	
	public void createNext()
	{
		SamenArray curSamenArr = sAL.get(sAL.size()-1);
		int j=0;
		int[] oldSamenArr = new int[5];
		int[] newSamenArr = new int[5];
		for (int i=0;i<5;i++)
		{
			oldSamenArr[i]=curSamenArr.getValues()[i];
			newSamenArr[i]=curSamenArr.getValues()[i];
		}
		int nr=0;
		//
		while(j<oldSamenArr[1])
		{
			j++;
			if(oldSamenArr[0]==1)
			{
				nr=1;
			}
			else
			{
				nr=(int)Math.random()*oldSamenArr[0];
			}
		if(nr<=oldSamenArr[1])
	    	{
	            newSamenArr[1]++;
	            newSamenArr[0]++;
	        }
	        else if(nr<=oldSamenArr[1]+oldSamenArr[2])
	        {
	            newSamenArr[2]++;
	            newSamenArr[0]++;
	        }
	        else if(nr<=oldSamenArr[1]+oldSamenArr[2]+oldSamenArr[3])
	        {
	        	newSamenArr[3]++;
	        	newSamenArr[0]++;
	        }
	        else if(nr<=oldSamenArr[0])
	        {
	        	newSamenArr[4]++;
	        	newSamenArr[0]++;
	        }			
		}
		// TODO: create new array and add
	}
	
	public SamenArray getLast()
	{
		//return sAL.get(sAL.size()-1);
		return sAL.get(0);
	}
	
	public void stepBack()
	{
		//sAL.remove(sAL.size()-1);
		sAL.remove(0);
	}
	
	public int size()
	{
		return sAL.size();
	}
}
