package TheatreManagementSystem;

abstract public class Movie extends Screen
{
	int movieID;
	String Mname,language,director;
	double duration;
	
	public Movie(int movieID,String Mname,String language,String director,double duration, int screenID, int width, int height, int noOfShows, String Sname, String releaseDate)
	{
		super(screenID, width, height, noOfShows, Sname, releaseDate);
		this.movieID = movieID;
		this.Mname = Mname;
		this.language = language;
		this.director = director;
		this.duration = duration;
	}
	
	public String getMovieName()
	{
		return Mname;
	}
}
