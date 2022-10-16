package TheatreManagementSystem;

public class TheatreSystem 
{
	int theatreCount;
	Theatre[] TheatreList;
	
	public TheatreSystem()
	{
		theatreCount = 0;
	}
	
	
	public boolean addTheatreWithScreen(int theatreID, String name, String address, int noOfScreen, Screen[] ScreenList)
	{
		if(noOfScreen==ScreenList.length)
		{
			int i;
			Theatre[] newList = new Theatre[++theatreCount];
			for(i=0;i<theatreCount-1;i++)
				newList[i] = TheatreList[i];
			newList[theatreCount-1] = new Theatre(theatreID,name,address,noOfScreen,ScreenList);
			TheatreList = newList;
		}
		else
		{
			System.out.println("\nNumber of Screens does not match the number of movies.");
			return false;
		}
		return true;
	}
	
	
	public boolean addMovieToTheatre(int theatreID, Screen m)
	{
		for(int i=0;i<theatreCount;i++)
		{
			if(TheatreList[i].getTheatreID()==theatreID)
			{
				if(TheatreList[i].checkVacantScreen(m.getDate()))
				{
					TheatreList[i].addMovie(m);
					return true;
				}
				else
				{
					System.out.println("There is no screen available to relase the movie '" + m.getMovieName() + "' in theatre '" + TheatreList[i].getTheatreName() + "'.");
					return false;
				}
			}
		}
		return false;
	}
	
	
	public boolean dropMovieFromTheatre(int theatreID, Screen m)
	{
		for(int i=0;i<theatreCount;i++)
		{
			if(TheatreList[i].getTheatreID()==theatreID)
			{
				String[] MovieList = TheatreList[i].getMovieList();
				for(int j=0;j<MovieList.length;j++)
				{
					if(MovieList[j].equals(m.getMovieName()))
					{
						TheatreList[i].removeMovie(m);
						return true;
					}
				}
				System.out.println("Unable to locate the movie with specified name '" + m.getMovieName() + "' in theatre '" + TheatreList[i].getTheatreName() + "'.");
				return false;
			}
		}
		System.out.println("Unable to locate the theatre with specified ID '" + theatreID + "'.");
		return false;
	}
	
	
	public void getMoviesInTheatre()
	{
		for(int i=0;i<theatreCount;i++)
		{
			String[] MovieList = TheatreList[i].getMovieList();
			System.out.print("\n" + TheatreList[i].getTheatreName() + " : ");
			for(int j=0;j<MovieList.length;j++)
				System.out.print(MovieList[j] + ", ");
		}
		System.out.println();
	}
}
