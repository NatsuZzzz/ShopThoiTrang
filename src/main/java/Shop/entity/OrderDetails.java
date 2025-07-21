/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shop.entity;

/**
 *
 * @author ADMIN
 */
public class OrderDetails {
    private int orderId;
    private int productDetailId;
    private int quantity;
    private double unitPrice;
    
       // Constructor không tham số
    public OrderDetails() {
    }
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductDetailId() {
        return productDetailId;
    }

    public void setProductDetailId(int productDetailId) {
        this.productDetailId = productDetailId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    // Constructor đầy đủ
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public OrderDetails(int orderId, int productDetailId, int quantity, double unitPrice) {
        this.orderId = orderId;
        this.productDetailId = productDetailId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    
}
