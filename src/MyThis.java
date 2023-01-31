class A {
 int x, y;
 A(int x, int y){
    this.x = x;
    this.y = y;
 }
 int sum(){
    return (x+y);
 }
}
class MyThis {
public static void main(String args[]){
   A ob = new A(12, 15);
   System.out.println("sum = " + ob.sum());
}
}