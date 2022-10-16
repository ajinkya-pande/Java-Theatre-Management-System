package TheatreManagementSystem;

public class Feature extends Movie
{
	String type;
	
	public Feature(int movieID, String Mname, String language, String director,double duration, int screenID, int width, int height, int noOfShows, String Sname, String releaseDate, String type)
	{
		super(movieID,Mname,language,director,duration,screenID,width,height,noOfShows,Sname,releaseDate);
		this.type = type;
	}
}
