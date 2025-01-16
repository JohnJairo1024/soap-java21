package co.com.inventory.model.request;

public class CheckInventoryRequest {
    private
    String productId;

    public CheckInventoryRequest(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
