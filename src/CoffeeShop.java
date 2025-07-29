/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class CoffeeShop {
    
    public String shopName;
    public int ordersInProgress;

    public CoffeeShop(String shopName, int ordersInProgress) {
        this.shopName = shopName;
        this.ordersInProgress = ordersInProgress;
    }

    public synchronized void decrementOrdersInProgress() {
        ordersInProgress--;
    }

    public int getOrdersInProgress() {
        return ordersInProgress;
    }

}
