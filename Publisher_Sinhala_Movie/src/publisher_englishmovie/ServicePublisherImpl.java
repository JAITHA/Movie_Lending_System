package publisher_englishmovie;

import java.util.HashMap;

public class ServicePublisherImpl implements EnglishMoviePublisher{
	
	HashMap<String, Double> horror_english_movie = new HashMap<String, Double>();
	HashMap<String, Double> comedy_english_movie = new HashMap<String, Double>();
	HashMap<String, Double> action_english_movie = new HashMap<String, Double>();
	HashMap<String, Double> romantic_english_movie = new HashMap<String, Double>();
	
	public ServicePublisherImpl() {
		
		horror_english_movie.put("Black Box", 25.0);
		horror_english_movie.put("Crawl", 12.0);
		horror_english_movie.put("Doctor Sleep", 10.0);
		horror_english_movie.put("The Hunt", 20.0);
		
		comedy_english_movie.put("Mr.Bean", 11.0);
		comedy_english_movie.put("Extraction", 9.0);
		comedy_english_movie.put("Outside the wire", 13.0);
		comedy_english_movie.put("Project Power", 14.0);

		action_english_movie.put("Ava", 20.0);
		action_english_movie.put("Borat", 15.0);
		action_english_movie.put("Holidate", 16.0);
		action_english_movie.put("Work It", 19.0);
		
		romantic_english_movie.put("Emma", 18.0);
		romantic_english_movie.put("365 Days", 14.0);
		romantic_english_movie.put("Devs", 20.0);
		romantic_english_movie.put("Yesterday", 22.0);
		
	}

	@Override
	public void displayEnglishMovie(int a) {
		// TODO Auto-generated method stub
		int count ;
		switch (a) {
		case 1:
			count = 1 ;
			for(String name1 : action_english_movie.keySet()) {
				String key1 = name1.toString();
				String value1 = action_english_movie.get(name1).toString();
				System.out.println(count + ". " + key1 + " :- $" +value1);
				count++;
			};
			break;
		case 2:
			count = 1 ;
			for(String name2 : comedy_english_movie.keySet()) {
				String key2 = name2.toString();
				String value2 = comedy_english_movie.get(name2).toString();
				System.out.println(count + ". " + key2 + " :- $" +value2);
				count++;
			};
			break;
			
		case 3: 
			count = 1 ;
			for(String name3 : horror_english_movie.keySet()) {
				String key3 = name3.toString();
				String value3 = horror_english_movie.get(name3).toString();
				System.out.println(count + ". " + key3 + " :- $" +value3);
				count++;
			};
			break;
			
		case 4:
			count = 1 ;
			for(String name4 : romantic_english_movie.keySet()) {
				String key4 = name4.toString();
				String value4 = romantic_english_movie.get(name4).toString();
				System.out.println(count + ". " + key4 + " :- $" +value4);
				count++;
			};
			break;
		}
	}

	@Override
	public double getPrice(int emid, int ens) {
		// TODO Auto-generated method stub
		double price = 0; 
		if(emid == 1) {
			switch (ens) {
			case 1:
				price = action_english_movie.get("Ava");
				break;
			case 2:
				price = action_english_movie.get("Borat");
				break;
			case 3:
				price = action_english_movie.get("Holidate");
				break;
			case 4:
				price = action_english_movie.get("Work It");
				break;
			}
		}else if(emid == 2) {
			switch (ens) {
			case 1:
				price = comedy_english_movie.get("Mr.Bean");
				break;
			case 2:
				price = comedy_english_movie.get("Extraction");
				break;
			case 3:
				price = comedy_english_movie.get("Outside the wire");
				break;
			case 4:
				price = comedy_english_movie.get("Project Power");
				break;
			}
			
		}else if(emid == 3) {
			switch (ens) {
			case 1:
				price = horror_english_movie.get("Black Box");
				break;
			case 2:
				price = horror_english_movie.get("Crawl");
				break;
			case 3:
				price = horror_english_movie.get("Doctor Sleep");
				break;
			case 4:
				price = horror_english_movie.get("The Hunt");
				break;
			}
			
		}else if(emid == 4) {
			switch (ens) {
			case 1:
				price = romantic_english_movie.get("Emma");
				break;
			case 2:
				price = romantic_english_movie.get("365 Days");
				break;
			case 3:
				price = romantic_english_movie.get("Devs");
				break;
			case 4:
				price = romantic_english_movie.get("Yesterday");
				break;
			}	
		}
		return price;
	}
	
	@Override
	public String getName(int emid, int ens) {
		// TODO Auto-generated method stub
		String name = ""; 
		if(emid == 1) {
			switch (ens) {
			case 1:
				name = "Ava";
				break;
			case 2:
				name = "Borat";
				break;
			case 3:
				name = "Holidate";
				break;
			case 4:
				name = "Work It";
				break;
			}
		}else if(emid == 2) {
			switch (ens) {
			case 1:
				name = "Mr.Bean";
				break;
			case 2:
				name = "Extraction";
				break;
			case 3:
				name = "Outside the wire";
				break;
			case 4:
				name = "Project Power";
				break;
			}
			
		}else if(emid == 3) {
			switch (ens) {
			case 1:
				name = "Black Box";
				break;
			case 2:
				name = "Crawl";
				break;
			case 3:
				name = "Doctor Sleep";
				break;
			case 4:
				name = "The Hunt";
				break;
			}
			
		}else if(emid == 4) {
			switch (ens) {
			case 1:
				name = "Emma";
				break;
			case 2:
				name = "365 Days";
				break;
			case 3:
				name = "Devs";
				break;
			case 4:
				name = "Yesterday";
				break;
			}	
		}
		return name;	
	}

}
