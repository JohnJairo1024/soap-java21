package co.com.inventory.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AddProductResponse {
    private String status;

    public AddProductResponse() {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
