package publisher_sinhalamovie;

import java.util.HashMap;

public class ServicePublisherImpl implements SinhalaMoviePublisher {
	
	HashMap<String, Double> action_sinhala_movie = new HashMap<String, Double>();
	HashMap<String, Double> comedy_sinhala_movie = new HashMap<String, Double>();
	HashMap<String, Double> horror_sinhala_movie = new HashMap<String, Double>();
	HashMap<String, Double> romantic_sinhala_movie = new HashMap<String, Double>();
	
	public ServicePublisherImpl() {
		action_sinhala_movie.put("One Shot One", 42.0);
		action_sinhala_movie.put("Leader", 38.0);
		action_sinhala_movie.put("Ranja", 40.0);
		action_sinhala_movie.put("Peralikarayo", 45.0);
		
		comedy_sinhala_movie.put("Parliment Jokes", 20.0);
		comedy_sinhala_movie.put("Machan", 22.0);
		comedy_sinhala_movie.put("Somy Boys", 28.0);
		comedy_sinhala_movie.put("Kolompoor", 18.0);
		
		horror_sinhala_movie.put("Bandanaya", 22.0);
		horror_sinhala_movie.put("Gindari", 25.0);
		horror_sinhala_movie.put("Maya", 23.0);
		horror_sinhala_movie.put("Zoom", 20.0);
		
		romantic_sinhala_movie.put("Spandana", 30.0);
		romantic_sinhala_movie.put("Sarungal", 28.0);
		romantic_sinhala_movie.put("Dedunu Akase", 35.0);
		romantic_sinhala_movie.put("Once Upon a Time", 38.0);
	}
	
	@Override
	public void displaySinhalaMovie(int a) {
		// TODO Auto-generated method stub
		int count ;
		switch (a) {
		case 1:
			count = 1 ;
			for(String name1 : action_sinhala_movie.keySet()) {
				String key1 = name1.toString();
				String value1 = action_sinhala_movie.get(name1).toString();
				System.out.println(count + ". " + key1 + " :- $" +value1);
				count++;
			};
			break;
		case 2:
			count = 1 ;
			for(String name2 : comedy_sinhala_movie.keySet()) {
				String key2 = name2.toString();
				String value2 = comedy_sinhala_movie.get(name2).toString();
				System.out.println(count + ". " + key2 + " :- $" +value2);
				count++;
			};
			break;
			
		case 3: 
			count = 1 ;
			for(String name3 : horror_sinhala_movie.keySet()) {
				String key3 = name3.toString();
				String value3 = horror_sinhala_movie.get(name3).toString();
				System.out.println(count + ". " + key3 + " :- $" +value3);
				count++;
			};
			break;
			
		case 4:
			count = 1 ;
			for(String name4 : romantic_sinhala_movie.keySet()) {
				String key4 = name4.toString();
				String value4 = romantic_sinhala_movie.get(name4).toString();
				System.out.println(count + ". " + key4 + " :- $" +value4);
				count++;
			};
			break;
		}
		count = 0;
	}

	@Override
	public double getPrice(int emid, int ens) {
		// TODO Auto-generated method stub
		double price = 0; 
		if(emid == 1) {
			switch (ens) {
			case 1:
				price = action_sinhala_movie.get("One Shot One");
				break;
			case 2:
				price = action_sinhala_movie.get("Leader");
				break;
			case 3:
				price = action_sinhala_movie.get("Ranja");
				break;
			case 4:
				price = action_sinhala_movie.get("Peralikarayo");
				break;
			}
		}else if(emid == 2) {
			switch (ens) {
			case 1:
				price = comedy_sinhala_movie.get("Parliment Jokes");
				break;
			case 2:
				price = comedy_sinhala_movie.get("Machan");
				break;
			case 3:
				price = comedy_sinhala_movie.get("Somy Boys");
				break;
			case 4:
				price = comedy_sinhala_movie.get("Kolompoor");
				break;
			}
			
		}else if(emid == 3) {
			switch (ens) {
			case 1:
				price = horror_sinhala_movie.get("Bandanaya");
				break;
			case 2:
				price = horror_sinhala_movie.get("Gindari");
				break;
			case 3:
				price = horror_sinhala_movie.get("Maya");
				break;
			case 4:
				price = horror_sinhala_movie.get("Zoom");
				break;
			}
			
		}else if(emid == 4) {
			switch (ens) {
			case 1:
				price = romantic_sinhala_movie.get("Spandana");
				break;
			case 2:
				price = romantic_sinhala_movie.get("Sarungal");
				break;
			case 3:
				price = romantic_sinhala_movie.get("Dedunu Akase");
				break;
			case 4:
				price = romantic_sinhala_movie.get("Once Upon a Time");
				break;
			}	
		}
		return price;	
	}	
	
	@Override
	public String getName (int emid, int ens) {
		// TODO Auto-generated method stub
		String name = ""; 
		if(emid == 1) {
			switch (ens) {
			case 1:
				name = "One Shot One";
				break;
			case 2:
				name = "Leader";
				break;
			case 3:
				name = "Ranja";
				break;
			case 4:
				name = "Peralikarayo";
				break;
			}
		}else if(emid == 2) {
			switch (ens) {
			case 1:
				name = "Parliment Jokes";
				break;
			case 2:
				name = "Machan";
				break;
			case 3:
				name = "Somy Boys";
				break;
			case 4:
				name = "Kolompooor";
				break;
			}
			
		}else if(emid == 3) {
			switch (ens) {
			case 1:
				name = "Bandanaya";
				break;
			case 2:
				name = "Gindari";
				break;
			case 3:
				name = "Maya";
				break;
			case 4:
				name = "Zoom";
				break;
			}
			
		}else if(emid == 4) {
			switch (ens) {
			case 1:
				name = "Spandana";
				break;
			case 2:
				name = "Sarungal";
				break;
			case 3:
				name = "Dedunu Akase";
				break;
			case 4:
				name = "Once Upon a Time";
				break;
			}	
		}
		return name;	
	}
	
	
}


