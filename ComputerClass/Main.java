
 
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    //Run code on terminal to see returned values
    Scanner sc = new Scanner(System.in); // creation of scanner
    System.out.println("Enter the name of your computer: ");
    String compName = sc.nextLine();// getting name of computer
    System.out.println("Enter the model of your computer");
    String compModel = sc.nextLine();// getting model of computer
    Computer computerA = new Computer(compName, compModel);// creating the computer
    System.out.println("Computer was last turned on: " + computerA.lastDate());// last turn on
    System.out.println("Enter your name: ");
    String userName = sc.nextLine();// getting user name 
    Computer sec = new ComputerSecurity(userName);
    //This is a method overload beacuse our child class(of computer) Computer Security has a
    // method known as lastDate, we ate overriding said method to return the user.
    
    System.out.println(sec.lastDate());//proof of method overload
  }
}
