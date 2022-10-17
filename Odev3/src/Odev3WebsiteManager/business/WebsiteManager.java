package Odev3WebsiteManager.business;

import java.lang.System.LoggerFinder;
import java.util.ArrayList;
import java.util.List;

import Odev3Website.dataAcces.HibernateProductDao;
import core.logging.Logger;
import Odev3Website.dataAcces.ProductDao;
import Odev3Category.entities.Website;

public class WebsiteManager {

	private ProductDao productDao;
	private Logger[] loggers;
	
	List<Website> categories = new ArrayList<>();
	List<Website> courses = new ArrayList<>();
	
	
	
	
	public WebsiteManager(HibernateProductDao productDao,Logger[]loggers) {
	
		this.productDao = productDao;
		this.loggers = loggers;
		
	}
		public void add(Website website)throws Exception {
				//response requste göre ayarlanacak
				//iş kuralları
				if(website.getKursFiyatı()<0) {
					throw new Exception("Kurs fiyatı 0' dan küçük olamaz");
				}
				
					
				for (Website website2 : categories) {
						if(website2.getKategoriler().equals(website2.getKategoriler())) {
							throw new Exception("Kategori ismi tekrar edemez");
						}
					
				for (Website website1 : courses) {

							if (website1.getKursadi().equals(website1.getKursadi())) {
								throw new Exception("Kurs ismi tekrar edemez");
							}

						}
				
				ProductDao productDao = new HibernateProductDao();
				productDao.add(website);
				
				for (Logger logger:loggers) {
				logger.log(website.getEgitmenadi());
				}		
				
			}
	}
}
