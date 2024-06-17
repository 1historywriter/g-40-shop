package de.ait_tr.g_40_shop.exception_handling.exception;

public class ProductNoFoundException extends RuntimeException{

    public ProductNoFoundException(String productTitle) {
        super(String.format("Product with title %s not found", productTitle));
    }
}
