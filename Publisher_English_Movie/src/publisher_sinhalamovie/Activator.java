package publisher_sinhalamovie;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import publisher_sinhalamovie.SinhalaMoviePublisher;
import publisher_sinhalamovie.ServicePublisherImpl;

public class Activator implements BundleActivator {
	
	ServiceRegistration publisherServiceRegistration;
	

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Sinhala Movie Publisher started successfully !");
		
		SinhalaMoviePublisher sinhalamoviepublisher = new ServicePublisherImpl();
		publisherServiceRegistration = bundleContext.registerService(SinhalaMoviePublisher.class.getName(), sinhalamoviepublisher, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("English Movie Publisher stopped Successfully!");
		publisherServiceRegistration.unregister();
	}

}
