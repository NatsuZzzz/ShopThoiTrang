/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shop.entity;

/**
 *
 * @author ADMIN
 */
public class Colors {
      private int colorId;
    private String colorName;

    // Constructor không tham số
    public Colors() {
    }
    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    // Constructor đầy đủ
    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public Colors(int colorId, String colorName) {
        this.colorId = colorId;
        this.colorName = colorName;
    }
}
