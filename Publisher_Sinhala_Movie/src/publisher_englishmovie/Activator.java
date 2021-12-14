package publisher_englishmovie;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publisherServiceRegistration;
	
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("English Movie Publisher started successfully !");
		
		EnglishMoviePublisher englishmoviepublisher = new ServicePublisherImpl();
		publisherServiceRegistration = bundleContext.registerService(EnglishMoviePublisher.class.getName(), englishmoviepublisher, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("English Movie Publisher stopped Successfully!");
		publisherServiceRegistration.unregister();
	}

}
