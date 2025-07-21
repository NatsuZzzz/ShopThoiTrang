/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shop.entity;

import java.util.Date;
/**
 *
 * @author ADMIN
 */
public class Orders {
    private int orderId;
    private int customerId;
    private String shippingAddress;
    private Date orderDate;
    private String status;
    private double totalAmount;
 // Constructor không tham số
    public Orders(){
        
    }
    public int getOrderId(){
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    // Constructor đầy đủ
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Orders(int orderId, int customerId, String shippingAddress, Date orderDate, String status, double totalAmoun) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.shippingAddress = shippingAddress;
        this.orderDate = orderDate;
        this.status =  status;
        this.totalAmount = totalAmoun;        
    }
    
    
}
