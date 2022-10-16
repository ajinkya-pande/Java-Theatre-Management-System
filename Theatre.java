package TheatreManagementSystem;

public class Theatre
{
	int theatreID, noOfScreen;
	String Tname,address;
	Screen[] ScreenList;
	
	public Theatre(int theatreID, String Tname, String address, int noOfScreen, Screen[] ScreenList)
	{
		this.theatreID = theatreID;
		this.Tname = Tname;
		this.address = address;
		this.noOfScreen = noOfScreen;
		this.ScreenList = ScreenList;
	}
	
	public int getTheatreID()
	{
		return theatreID;
	}
	
	public String getTheatreName()
	{
		return Tname;
	}
	
	public boolean checkVacantScreen(String newDate)
	{
		for(int i=0;i<noOfScreen;i++)
		{
			if(ScreenList[i].getDate().equals(newDate))
				return false;
		}
		return true;
	}
	
	public void addMovie(Screen m)
	{
		int i;
		Screen[] newList = new Screen[++noOfScreen];
		for(i=0;i<(noOfScreen-1);i++)
			newList[i] = ScreenList[i];
		newList[i] = m;
		ScreenList = newList;
	}
	
	public void removeMovie(Screen m)
	{
		int i,k=0;
		Screen[] newList = new Screen[--noOfScreen];
		for(i=0;i<(noOfScreen+1);i++)
		{
			if(!(ScreenList[i].getMovieName().equals(m.getMovieName())))
				newList[k++] = ScreenList[i];
		}
		ScreenList = newList;
	}
	
	public String[] getMovieList()
	{
		String[] Movies = new String[noOfScreen];
		for(int i=0;i<noOfScreen;i++)
		{
			Movies[i] = ScreenList[i].getMovieName();
		}
		return Movies;
	}
}
