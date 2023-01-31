// Add range to Vehicle
class Vehicle {
 int passengers;      // number of passengers
 int fuelcap;    // fuel capacity in gallons
 int mpg;    // fuel consumption in miles per gallon

 // Display the range.
 void range(){
    System.out.println("Range is " + fuelcap * mpg);
 }
 double fuelneeded(int miles){
   return (double) miles / mpg;
 }
}
class AddMeth {
 public static void main(String args[]) {
   Vehicle minivan = new Vehicle();
 Vehicle sportscar = new Vehicle();

// assign values to instance variables (fields) in minivan
minivan.passengers  = 7;
minivan.fuelcap = 16;
minivan.mpg  = 21;

 // assign values to instance variables (fields) in sportscar
sportscar.passengers  = 2;
sportscar.fuelcap = 14;
sportscar.mpg  = 12;

System.out.print("Minivan can carry " + minivan.passengers + ".");

          minivan.range();      // display range of minivan

System.out.println("Sportscar can carry " + sportscar.passengers + ".");

          sportscar.range();    // display range of sportscar.
  
  System.out.println("Minivan needs fuel " + minivan.fuelneeded(150) + " galong.");

  // display range of minivan

System.out.println("Sportscar can carry " + sportscar.passengers + ".");

          sportscar.range(); 
 System.out.println("Sportscar needs fuel " + sportscar.fuelneeded(100) + " galong.");

 }
}