package main.com.mitul.app;

public class App {
    private final String message = "Hello World!";
    //private final String message = "Hello World";

    // Constructor
    public App() {
    }

    // Main Function
    public static void main(String[] args){
        System.out.println(new App().getMessage());
    }

    // Normal Function
    // Returning a message
    public final String getMessage(){
        return message;
    }

}
