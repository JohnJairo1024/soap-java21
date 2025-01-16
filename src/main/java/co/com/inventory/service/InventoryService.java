package co.com.inventory.service;

import co.com.inventory.model.*;
import co.com.inventory.model.request.CheckInventoryRequest;
import co.com.inventory.model.response.CheckInventoryResponse;

public interface InventoryService {
    CheckInventoryResponse checkInventory(CheckInventoryRequest request);
    AddProductResponse addProduct(AddProductRequest request);
    UpdateInventoryResponse updateInventory(UpdateInventoryRequest request);
    DeleteProductResponse deleteProduct(DeleteProductRequest request);
}
