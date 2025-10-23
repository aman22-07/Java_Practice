// Define a class named Animal8
class Animal8 
{
    // Method to display a running message
    void run() 
    {
        System.out.println("I'm running");
    }
}

// Define a class named Birds8
class Birds8 
{
    // Method to display a flying message
    void fly() 
    {
        System.out.println("I'm flying");
    }
}

// Define the main class MainApp8
public class Basic_Oops
{
    // Main method - program entry point
    public static void main(String[] args) 
    {
        // Create an object 'buzo' of Animal8 and call the run method
        Animal8 buzo = new Animal8();
        buzo.run();

        // Create an object 'sparrow' of Birds8 and call the fly method
        Birds8 sparrow = new Birds8();
        sparrow.fly();
    }
}
