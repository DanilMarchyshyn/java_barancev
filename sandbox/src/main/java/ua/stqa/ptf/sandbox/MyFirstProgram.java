package ua.stqa.ptf.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("World");
    hello("Sveta");

    Square s = new Square(7);
    System.out.println("Площа квадрата " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площа прямокутника " + r.a + " и " + r.b + " = " + r.area());

  }

   public static void hello(String somebody) {
     System.out.println("Hello, " + somebody + "!");
   }

}
