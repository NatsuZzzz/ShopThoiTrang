/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shop.entity;

/**
 *
 * @author ADMIN
 */
public class Sizes {
        private int sizeId;
    private String sizeName;

    // Constructor không tham số
    public Sizes() {
    }
    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public String getSizeName() {
        return sizeName;
    }

    // Constructor đầy đủ
    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public Sizes(int sizeId, String sizeName) {
        this.sizeId = sizeId;
        this.sizeName = sizeName;
    }
}
