/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */

class OrderThread implements Runnable {
  private CoffeeShop coffeeShop;

  public OrderThread(CoffeeShop coffeeShop) {
    this.coffeeShop = coffeeShop;
  }

  @Override
  public void run() {
   
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    coffeeShop.decrementOrdersInProgress();
    System.out.println("Order is successfully completed" );
  }
}

