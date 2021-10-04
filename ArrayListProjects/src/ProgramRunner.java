import java.util.ArrayList;
public class ProgramRunner
	{
		static ArrayList<Program>TVShows = new ArrayList<Program>();
		
		public static void main(String[] args)
		{
				addArrayList();
				printList();
				printList();
				printList();
		}
		public static void addArrayList()
		{
			TVShows.add(new Program("Game of Thrones", "Fantasy", 8));
			TVShows.add(new Program("South Park", "Comedy", 23));
			TVShows.add(new Program("Westworld", "Fantasy", 3));
			TVShows.add(new Program("Bobs Burgers", "Comedy", 8));
			TVShows.add(new Program("Family Guy", "Comedy", 24));
		}
		public static void printList()
			{
			    // Call Array List
				for(int i = 0; i < TVShows.size(); i++)
					{
				System.out.print(TVShows.get(i).getTitle() + ", "); 
				System.out.print(TVShows.get(i).getGenre() + ", "); 
				System.out.println(TVShows.get(i).getNumberOfSeasonsAired()); 
					}
				// Add year to numberOfSeasonsAired
				for(int i = 0; i < TVShows.size(); i++)
					{
					TVShows.get(i).setNumberOfSeasonsAired(TVShows.get(i).getNumberOfSeasonsAired() + 1);
					}
				//delete the show with the longest title 
				int longestTitle = 0;
				int length2 = 0;
				
				// for loop 
				for(int i = 0; i < TVShows.size(); i++)
					{
						if(longestTitle < TVShows.get(i).getTitle().length())
							{
								longestTitle = TVShows.get(i).getTitle().length();
								length2 = i;
							}
					}
				TVShows.remove(length2);
				System.out.println();
				TVShows.get(0).setTitle("The Simpsons");
				}
	}


