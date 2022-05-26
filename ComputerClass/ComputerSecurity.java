// This is the child class of computer
class ComputerSecurity extends Computer{
    String user;
    public ComputerSecurity(String user){
      this.user = user;
    }
    public String lastDate(){
      return "The last user to accsess the " + (super.name) + " was " + this.user;
    }
  }
   
