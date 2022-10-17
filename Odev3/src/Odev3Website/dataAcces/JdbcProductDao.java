package Odev3Website.dataAcces;

import Odev3Website.dataAcces.ProductDao;
import Odev3Category.entities.Website;


public class JdbcProductDao implements ProductDao {
	public void add(Website website) {
		//Sadece ve sadece db erişim kodları buraya yazılır...Sql
		System.out.println("JDB ile veritabanına eklendi");

	}
}