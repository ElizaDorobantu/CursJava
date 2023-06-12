package curs9;

public class Laptop extends Product{

	private int buyingPrice;
	private int vat;
	private int adaos;
	
	public Laptop(int buyingPrice, int vat, int adaos) {
		//this.buyingPrice = buyingPrice;
		setBuyingPrice(buyingPrice);
		setVat(vat);
		setAdaos(adaos);
	}
	
	@Override
	public int calculatePrice() {
		
		return buyingPrice + vat + adaos;
	}

	public int getBuyingPrice() {
		return buyingPrice;
	}

	public void setBuyingPrice(int buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}

	public int getAdaos() {
		return adaos;
	}

	public void setAdaos(int adaos) {
		this.adaos = adaos;
	}
	
	

}
