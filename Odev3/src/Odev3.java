import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import Odev3WebsiteManager.business.WebsiteManager;
import Odev3Website.dataAcces.HibernateProductDao;
import Odev3Category.entities.Website;

public class Odev3 {

	public static void main(String[] args) throws Exception {
		
		Website website = new Website("EnginDemiroğ","Java","Programlama",5000);
		Logger[] loggers = {new DatabaseLogger(),new FileLogger()};
		WebsiteManager websiteManager = new WebsiteManager(new HibernateProductDao(),loggers);
		websiteManager.add(website);
		System.out.println(website.getEgitmenadi());
		System.out.println(website.getKategoriler());
		System.out.println(website.getKursadi());

	}

}
