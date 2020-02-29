class Main {
  public static void main(String[] args) {
    vehicle M3 = new vehicle();
    vehicle ModelX = new vehicle();
    vehicle Urus = new vehicle();
    
    M3.passengerCapacity = 5;
    M3.numberOfDoors = 4;
    M3.zeroToSixty = 7.1;
    M3.mpg = 28;
    M3.topSpeed = 130;
    M3.transmissionSpeeds = 8;
    M3.motors = 1;
    
    ModelX.passengerCapacity = 7;
    ModelX.numberOfDoors = 5;
    ModelX.zeroToSixty = 2.1;
    ModelX.mpg = 88;
    ModelX.topSpeed = 155;
    ModelX.transmissionSpeeds = 1;
    ModelX.motors = 2;
    
    Urus.passengerCapacity = 5;
    Urus.numberOfDoors = 5;
    Urus.zeroToSixty = 2.9;
    Urus.mpg = 14;
    Urus.topSpeed = 190;
    Urus.transmissionSpeeds = 8;
    Urus.motors = 1;
    
    System.out.println("The BMW 320i is a " + M3.numberOfDoors + " door car and can seat " +  M3.passengerCapacity + " passengers.");
    System.out.println("It has an mpg of " + M3.mpg + " mpg, has a 0 to 60 mph time of " + M3.zeroToSixty + " seconds, and has an electronically limited speed of " + M3.topSpeed + " mph.");
    System.out.println("The powertrain is an " + M3.transmissionSpeeds + " speed transmission powered by " + M3.motors + " gasoline engine.");
    
    System.out.println("\n\nThe Model X P100D is a " + ModelX.numberOfDoors + " door car and can seat " +  ModelX.passengerCapacity + " passengers.");
    System.out.println("It has an mpge (miles per gallon equivalent) of " + ModelX.mpg + " mpge, has a 0 to 60 mph time of " + ModelX.zeroToSixty + " seconds, and has an electronically limited speed of " + ModelX.topSpeed + " mph.");
    System.out.println("The powertrain is " + ModelX.transmissionSpeeds + " direct drive motor system with a total of " + ModelX.motors + " motors.");
    
    System.out.println("\n\nThe Lamborghini Urus is a " + Urus.numberOfDoors + " door car and can seat " +  Urus.passengerCapacity + " passengers.");
    System.out.println("It has an mpg of " + Urus.mpg + " mpg, has a 0 to 60 mph time of " + Urus.zeroToSixty + " seconds, and has an electronically limited speed of " + Urus.topSpeed + " mph.");
    System.out.println("The powertrain is an " + Urus.transmissionSpeeds + " speed transmission powered by " + Urus.motors + " gasoline engine.");
  }
}

class vehicle{
  int passengerCapacity;
  int numberOfDoors;
  double zeroToSixty;
  int mpg;
  int topSpeed;
  int transmissionSpeeds;
  int motors;
}
