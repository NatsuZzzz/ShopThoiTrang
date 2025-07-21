/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shop.entity;

/**
 *
 * @author ADMIN
 */
public class ProductDetails {
      private int productDetailId;
    private int productId;
    private int sizeId;
    private int colorId;
    private int quantityInStock;
    
     // Constructor không tham số
    public ProductDetails() {
    }

    // Constructor đầy đủ
    public ProductDetails(int productDetailId, int productId, int sizeId, int colorId, int quantityInStock) {
        this.productDetailId = productDetailId;
        this.productId = productId;
        this.sizeId = sizeId;
        this.colorId = colorId;
        this.quantityInStock = quantityInStock;
    }

    public int getProductDetailId() {
        return productDetailId;
    }

    public void setProductDetailId(int productDetailId) {
        this.productDetailId = productDetailId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    
}


