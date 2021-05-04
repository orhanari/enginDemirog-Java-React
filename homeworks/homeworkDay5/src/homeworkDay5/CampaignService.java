package homeworkDay5;

public interface CampaignService {
	void newCampaign(Product product, double discountCampaign);
	void updateCampaign(Product product, double discountCampaign);
	void deleteCampaign(Product product);
}
