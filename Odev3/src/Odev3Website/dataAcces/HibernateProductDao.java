package Odev3Website.dataAcces;

import Odev3Category.entities.Website;

public class HibernateProductDao implements ProductDao {
	public void add(Website website) {
		//Sadece ve sadece db erişim kodları buraya yazılır...Sql
		System.out.println("Hibernate ile veritabanına eklendi");

	}
}
