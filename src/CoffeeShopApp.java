

    

public class CoffeeShopApp {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop("BestCoffeeShop",10);

        Thread[] orderThreads = new Thread[7];

        for (int i = 0; i < orderThreads.length; i++) {
            orderThreads[i] = new Thread(new OrderThread(coffeeShop));
            orderThreads[i].start();
        }

        for (Thread orderThread : orderThreads) {
            try {
                orderThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Number of all the final orders in progress: " + coffeeShop.getOrdersInProgress() + " orders");
    }
}

