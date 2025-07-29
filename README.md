# CoffeeShop Java Simulation ☕

This is a simple Java console application simulating a coffee shop processing orders using multithreading. The purpose of the program is to demonstrate basic thread creation, synchronization and order management in a concurrent environment.

## 📌 Features

- Represents a `CoffeeShop` with orders in progress.
- Uses Java threads to simulate multiple order completions.
- Ensures thread-safe updates to shared data.
## 🧠 Concepts Used

- Java Multithreading (`Thread`, `Runnable`)
- Synchronization (`synchronized` methods)
- Thread lifecycle (`start`, `join`)
- Object-oriented design (`CoffeeShop`, `OrderThread`)

## 🏗️ Class Structure

### `CoffeeShop`
Represents a coffee shop with a name and the number of current orders.

- `decrementOrdersInProgress()` - synchronized method to safely reduce order count.
- `getOrdersInProgress()` - returns current active orders.

### `OrderThread`
Implements `Runnable` and simulates processing of a single coffee order.

- Waits for 5 seconds (`Thread.sleep(5000)`) to mimic preparation.
- Calls `decrementOrdersInProgress()` on completion.

### `CoffeeShopApp`
Main class to start the application.

- Creates a `CoffeeShop` with 10 orders.
- Starts 7 order-processing threads.
- Waits for all threads to complete.
- Displays the final number of pending orders.

## 🧪 How to Run

1. Compile the Java files:

   ```bash
   javac CoffeeShopApp.java
