package TheatreManagementSystem;

public class Screen
{
	int screenID,width,height,noOfShows;
	String Sname, releaseDate;
	
	public Screen(int screenID, int width, int height, int noOfShows, String Sname, String releaseDate) 
	{
		this.screenID = screenID;
		this.width = width;
		this.height = height;
		this.noOfShows = noOfShows;
		this.Sname = Sname;
		this.releaseDate = releaseDate;
	}
	
	public String getDate()
	{
		return releaseDate;
	}
	
	public String getMovieName()
	{
		return null;
	}
}
