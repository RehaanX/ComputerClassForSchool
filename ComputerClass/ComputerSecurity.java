class ComputerSecurity extends Computer{
    String user;
    public ComputerSecurity(String user){
      this.user = user;
    }
    public String lastDate(){
      return "The last user to accsess the " + (super.name) + " was " + this.user;
    }
  }
    /* This is the computer class which is stored in another file:
class Computer{
  String name = "";
  String model; 
  String lastDate;
  public Computer() {}
  
  
  public Computer(String name, String model){
    this.name = name;
    this.model = model;
  }
  public String lastDate(){
    java.util.Date date = new java.util.Date(); 
    return date.toString();
  }
}

  /*
  /* This is the main class which is stored in another file:
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Computer laptop = new Computer("laptop", "XI");
    System.out.println(laptop.lastDate());
    
    Computer sec = new ComputerSecurity("Reehan");
    System.out.println(sec.lastDate());
  }
}

  }
  */ 