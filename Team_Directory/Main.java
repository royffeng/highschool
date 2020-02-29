import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  	Scanner scan = new Scanner(System.in);
  	ArrayList<TeamMember> tm = new ArrayList<>();
  	String name = "";
  	String id = "";
  	System.out.println("Enter the next name:");
  		name = scan.nextLine();
  	while(!name.toUpperCase().equals("STOP")) {
  		System.out.println("Enter the next ID:");
  		id = scan.nextLine();
  		tm.add(new TeamMember(name, id));
  		System.out.println("Enter the next name:");
  		name = scan.nextLine();
  	}
  	for(int i = 0; i < tm.size(); i++) {
  		for(int j = 0; j < tm.size()-1; j++) {
  			if(tm.get(i).compareTo(tm.get(j)) == -1) {
  				TeamMember temp1 = tm.get(i);
  				TeamMember temp2 = tm.get(j);
  				tm.remove(i);
  				tm.add(i, temp2);
  				tm.remove(j);
  				tm.add(j, temp1);
  			}
  		}
  	}
 	
  	String array = "[";
  	for(int i = 0; i < tm.size(); i++) {
  		if(i == tm.size() - 1) {
  			array += tm.get(i);
  		} else {
  			array += tm.get(i) + ", ";
  		}
  	}
  	array += "]";
  	System.out.println(array);
  }
}
