public class Vehicle{
  private int location;

  public Vehicle(){
    this(0);
  }

  public Vehicle(int loc){
    if(loc >= -20 && loc <= 20){
      this.location = loc;
    }else{
      this.location = 0;
    }
  }

  public void forward(){
    if(location < 20){
      location++;
    }
  }

  public void backward(){
    if(location > -20){
      location--;
    }
  }
  
  public int getLocation(){
    return location;
  }
  
  public String toString(){
    String result = "";
    for(int i=-20; i<location; i++){
      result += " ";
    }
    return result + "@";
  }
}
