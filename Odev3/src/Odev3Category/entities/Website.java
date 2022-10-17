package Odev3Category.entities;

public class Website {
	

	
		private	String Egitmenadi;
		private	String Kursadi;
		private	String Kategoriler;
		private int kursFiyatı;
		public Website() {
			
			
		}
		
		public Website(String Egitmenadi, String Kursadi,String Kategoriler, int kursFiyatı) {
			
			this.Egitmenadi = Egitmenadi;
			this.Kursadi = Kursadi;
			this.Kategoriler = Kategoriler;
			this.kursFiyatı = kursFiyatı;
		}
		
		
		public int getKursFiyatı() {
			return kursFiyatı;
		}
		public void setKursFiyatı(int kursFiyatı) {
			this.kursFiyatı = kursFiyatı;
		}
		public String getEgitmenadi() {
			return Egitmenadi;
		}
		public void setEgitmenadi(String egitmenadi) {
			Egitmenadi = egitmenadi;
		}
		public String getKursadi() {
			return Kursadi;
		}
		public void setKursadi(String kursadi) {
			Kursadi = kursadi;
		}
		public String getKategoriler() {
			return Kategoriler;
		}
		public void setKategoriler(String kategoriler) {
			Kategoriler = kategoriler;
		}
			
			
	}


