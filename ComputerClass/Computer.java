class Computer{
  String name = "laptop";
  String model; 
  String lastDate;
  String date;
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
