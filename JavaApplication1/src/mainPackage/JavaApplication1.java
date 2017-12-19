package mainPackage;


public class JavaApplication1 {

    public static void main(String[] args) {
        // Loads classes and tests them
        System.out.println("main() loaded");
        TextFiles textFiles = new TextFiles();
        BasicIO myIO = new BasicIO();
        Message myMessage = new Message();
        
        
        // Do something
        
        myMessage.setMessage();
        myMessage.printMessage();


    }
    
}
