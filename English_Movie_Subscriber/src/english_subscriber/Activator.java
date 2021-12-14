package english_subscriber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import publisher_englishmovie.EnglishMoviePublisher;
import publisher_sinhalamovie.SinhalaMoviePublisher;
import publisher_sinhalamovie.SinhalaMoviePublisher;


public class Activator implements BundleActivator {
	ServiceReference serviceReferenceEnglishMovies;
	ServiceReference serviceReferenceSinhalaMovies;
	
	Scanner cat = new Scanner(System.in);
	
	public void start(BundleContext bundleContext) throws Exception {
		serviceReferenceEnglishMovies = bundleContext.getServiceReference(EnglishMoviePublisher.class.getName());
		EnglishMoviePublisher englishMoviePublisher = (EnglishMoviePublisher) bundleContext.getService(serviceReferenceEnglishMovies);
		
		serviceReferenceSinhalaMovies = bundleContext.getServiceReference(SinhalaMoviePublisher.class.getName());
		SinhalaMoviePublisher sinhalaMoviePublisher = (SinhalaMoviePublisher) bundleContext.getService(serviceReferenceSinhalaMovies);
	
		System.out.println("English Subscriber has started.");
		System.out.println(" Publishers: ");
		System.out.println("1. English Movies");
		System.out.println("2. Sinhala Movies\n");
		
		double total = 0 ;
		double dis = 0 ;
		int category, emid, sel;
		ArrayList<String> PurchasedItems = new ArrayList<String>();
		
		try {
			System.out.print("Select a Category: ");
			category = cat.nextInt();
			
			if(category == 1) {
				System.out.println("\nEmid: ");
				System.out.println("1. Horror Movies");
				System.out.println("2. Comedy Movies");
				System.out.println("3. Action Movies");
				System.out.println("4. Romantic Movies");
				
				System.out.println("\nPress O to Exit\n");
				System.out.print("Select a Emid: ");
				emid = cat.nextInt();
				
				while(emid != 0) {	
					
					englishMoviePublisher.displayEnglishMovie(emid);
					System.out.println("\nType -1 to exit from the Current Emid.");
					System.out.print("\nSelect English Movies: ");
					sel = cat.nextInt();
					while( sel != -1) {
						total += englishMoviePublisher.getPrice(emid, sel);
						PurchasedItems.add(englishMoviePublisher.getName(emid, sel));
						System.out.print("Select English Movies: ");
						sel = cat.nextInt();
						
					}
					System.out.print("\nSelect a Emid: ");
					emid = cat.nextInt();
				}
				
			}else if(category == 2) {
				System.out.println("\nEmid: ");
				System.out.println("1. Horror Sinhala Movie");
				System.out.println("2. Comedy Sinhala Movie");
				System.out.println("3. Action Sinhala Movie");
				System.out.println("4. Romantic Sinhala Movie");
				
				System.out.println("\nPress O to Exit");
				System.out.print("\nSelect a Emid: ");
				emid = cat.nextInt();
				while(emid != 0){	
					
				    sinhalaMoviePublisher.displaySinhalaMovie(emid);;
					System.out.println("\nType -1 to exit from the Current Emid.");
					System.out.print("\nSelect Sinhala Movie: ");
					sel = cat.nextInt();
					while( sel != -1) {
						total += sinhalaMoviePublisher.getPrice(emid, sel);
						PurchasedItems.add(sinhalaMoviePublisher.getName(emid, sel));
						System.out.print("Select Sinhala Movie: ");
						sel = cat.nextInt();
					}
					System.out.print("\nSelect a Emid: ");
					emid = cat.nextInt();
				}
			}
			dis = (total * 5) / 100; 
			System.out.println("Purchased Items: " + PurchasedItems );
			System.out.println("Discount Amount: $" + dis);
			System.out.println("Total : $" + (total - dis));
		}catch(InputMismatchException e) {
			System.out.println("Integer Should be Entered.! " + e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("English Subscriber Has Stopped.");
		bundleContext.ungetService(serviceReferenceEnglishMovies);
		bundleContext.ungetService(serviceReferenceSinhalaMovies);
	}
}
