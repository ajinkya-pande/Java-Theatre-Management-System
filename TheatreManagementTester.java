package TheatreManagementSystem;

public class TheatreManagementTester 
{
	public static void main(String[] args) 
	{
		TheatreSystem Nagpur = new TheatreSystem();
		TheatreSystem Mumbai = new TheatreSystem();
		
		Screen Bahubali = new Feature(1001,"Bahubali","Hindi","SS Rajamouli",2.30,2001,200,80,3,"Screen1","12/10/2020","Mystery");
		Screen Shershaha = new Documentry(1002,"Shershaha","Hindi","Vishnuvardhan",2.30,2002,200,80,5,"Screen2","14/11/2020","Soldier");
		Screen Pacific_Rim = new Feature(1003,"Pacific Rim","English","Guillermo del Toro",2.45,2003,220,100,5,"Screen3","10/05/2010","Action");
		Screen Avatar = new Feature(1004,"Avatar","English","James Cameron",3.30,2004,180,100,10,"Screen4","12/10/2020","Mythic");
		
		
		Nagpur.addTheatreWithScreen(3001, "NagpurTheatre1", "Nagpur, Maharashtra", 2, new Screen[] {Bahubali,Shershaha} );
		Nagpur.getMoviesInTheatre();
		Nagpur.addMovieToTheatre(3001,Pacific_Rim);
		Nagpur.addTheatreWithScreen(3002, "NagpurTheatre2", "Nagpur, Maharashtra", 1, new Screen[] {Bahubali});
		Nagpur.getMoviesInTheatre();
		Nagpur.addMovieToTheatre(3002, Shershaha);
		Nagpur.getMoviesInTheatre();
		
		Nagpur.dropMovieFromTheatre(3001,Pacific_Rim);
		Nagpur.getMoviesInTheatre();
		Nagpur.dropMovieFromTheatre(3001,Pacific_Rim);
		Nagpur.getMoviesInTheatre();
		
		
		Mumbai.addTheatreWithScreen(4001, "MumbaiTheatre1", "Mumbai", 2, new Screen[] {Avatar,Pacific_Rim});
		Mumbai.getMoviesInTheatre();
		Mumbai.addMovieToTheatre(4001, Bahubali);
		Mumbai.getMoviesInTheatre();
	}
}
