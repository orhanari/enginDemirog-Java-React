package homeworkDay5;

public abstract class BaseCampaignManager implements CampaignService{

	@Override
	public void newCampaign(Product product, double discountCampaign) {
		product.setGameDiscount(discountCampaign);
		System.out.println(product.getGameName() + " ürünü için " + product.getGameDiscount() + " miktarlı kampanya oluşturuldu.");
	}

	@Override
	public void updateCampaign(Product product, double discountCampaign) {
		product.setGameDiscount(discountCampaign);
		System.out.println(product.getGameName() + " ürünü için kampanya " + discountCampaign + " olarak güncellendi.");
	}

	@Override
	public void deleteCampaign(Product product) {
		product.setGameDiscount(0);
		System.out.println(product.getGameName() + " ürünü için kampanya kaldırıldı.");
	}
	
}
