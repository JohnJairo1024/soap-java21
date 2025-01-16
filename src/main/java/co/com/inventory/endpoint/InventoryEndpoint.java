package co.com.inventory.endpoint;


import co.com.inventory.model.*;
import co.com.inventory.model.request.CheckInventoryRequest;
import co.com.inventory.model.response.CheckInventoryResponse;
import co.com.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class InventoryEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/inventory";

    private  InventoryService inventoryService;

    @Autowired
    public InventoryEndpoint(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CheckInventoryRequest")
    @ResponsePayload
    public CheckInventoryResponse checkInventory(@RequestPayload CheckInventoryRequest request) {
        CheckInventoryResponse response = inventoryService.checkInventory(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddProductRequest")
    @ResponsePayload
    public AddProductResponse addProduct(@RequestPayload AddProductRequest request) {
        AddProductResponse response = inventoryService.addProduct(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateInventoryRequest")
    @ResponsePayload
    public UpdateInventoryResponse updateInventory(@RequestPayload UpdateInventoryRequest request) {
        UpdateInventoryResponse response = inventoryService.updateInventory(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeleteProductRequest")
    @ResponsePayload
    public DeleteProductResponse deleteProduct(@RequestPayload DeleteProductRequest request) {
        DeleteProductResponse response = inventoryService.deleteProduct(request);
        return response;
    }



}
