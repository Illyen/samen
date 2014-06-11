
public class SamenArray {
	private int sG;
	private int sS;
	private int sA;
	private int sV;
	private int sD;
	
	public SamenArray(int sSG, int sSS, int sSA, int sSV, int sSD)
	{
		sG=sSG;
		sS=sSS;
		sA=sSA;
		sV=sSV;
		sD=sSD;
	}
	public SamenArray()
	{
		sG=0;
		sS=0;
		sA=0;
		sV=0;
		sD=0;
	}

	// SET methoden
	public void setSG(int newValue)
	{
		sG=newValue;
	}
	public void setSS(int newValue)
	{
		sG=newValue;
	}
	public void setSA(int newValue)
	{
		sG=newValue;
	}
	public void setSV(int newValue)
	{
		sG=newValue;
	}
	public void setSD(int newValue)
	{
		sG=newValue;
	}
	
	// GET methoden
	public int getSG()
	{
		return sG;
	}
	public int getSS()
	{
		return sS;
	}
	public int getSA()
	{
		return sA;
	}
	public int getSV()
	{
		return sV;
	}
	public int getSD()
	{
		return sD;
	}
	
	
	public void copy(SamenArray SArr)
	{
		this.setSG(SArr.getSG());
		this.setSS(SArr.getSS());
		this.setSA(SArr.getSA());
		this.setSV(SArr.getSV());
		this.setSD(SArr.getSD());
	}
	
	public SamenArray update()
	{
		//
		int i=0;
		int oldSG=sG;
		int oldSS=sS;
		int oldSA=sA;
		int oldSV=sV;
		int oldSD=sD;
		// 
		int newSG=sG;
		int newSS=sS;
		int newSA=sA;
		int newSV=sV;
		int newSD=sD;
		//
		int nr=0;
		//
		while(i<oldSS)
		{
			i++;
			if(oldSG==1)
			{
				nr=1;
			}
			else
			{
				nr=(int)Math.random()*oldSG;
			}
		if(nr<=oldSS)
	    	{
	            newSS++;
	            newSG++;
	        }
	        else if(nr<=oldSS+oldSA)
	        {
	            newSA++;
	            newSG++;
	        }
	        else if(nr<=oldSS+oldSA+oldSV)
	        {
	        	newSV++;
	        	newSG++;
	        }
	        else if(nr<=oldSS+oldSA+oldSV+oldSD)
	        {
	        	newSD++;
	        	newSG++;
	        }
			
		}
		return new SamenArray(newSG, newSS, newSA, newSV, newSD);
	}
}
