public class Employee{
  private String name;
  private int id;
  private int rate;
  private int hours;

public Employee(String n, int i, int r, int h){
  name = n;
  id = i;
  rate = r;
  hours = h;
}

public String toString(){
  return "\n" + "Name: " + name + " Weekly Pay: $" + (rate * hours);
  }
}
