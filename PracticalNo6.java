//First file
package learnjava;
public class First{
  public void displayMessage() {
    System.out.println("Hello from First class!!");
  }
}

//Second file
package Ankita;
import learnjava.First;
public class Second {
    public static void main(String[] args) {
        First firstInstance = new First();
        firstInstance.displayMessage();
    }
}