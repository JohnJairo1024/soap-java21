package co.com.inventory.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "AddProductRequest", namespace = "http://example.com/inventory")
@XmlType(propOrder = {"product"})
public class AddProductRequest {

    private Product product;

    @XmlElement(name = "product", namespace = "http://example.com/inventory")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
