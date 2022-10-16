package TheatreManagementSystem;

public class Documentry extends Movie
{
	String topic;
	
	public Documentry(int movieID, String Mname, String language, String director, double duration, int screenID, int width, int height, int noOfShows, String Sname, String releaseDate, String topic)
	{
		super(movieID,Mname,language,director,duration,screenID,width,height,noOfShows,Sname,releaseDate);
		this.topic = topic;
	}
}
