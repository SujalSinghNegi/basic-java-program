abstract class AbstractClass{
   public void area(){};
}
class Rectangle extends AbstractClass{
   int l, b;
   public Rectangle(int l, int b){
      this.l = l;
      this.b = b;
   }
   @Override
   public void area(){
      System.out.println("Area of the rectangle is: "+(l*b));
   }
}
class Circle extends AbstractClass{
   int r;
   public Circle(int r){
      this.r = r;
   }
   @Override
   public void area(){
      System.out.println("Area of the circle is: "+(3.14*r*r));
   }
}
class Triangle extends AbstractClass{
   int b, h;
   public Triangle(int b, int h){
      this.b = b;
      this.h = h;
   }
   @Override
   public void area(){
      System.out.println("Area of the triangle is: "+(0.5*b*h));
   }
}
class Square extends AbstractClass{
   int side;
   Square(int side){
      this.side = side;
   }
   @Override
   public void area(){
      System.out.println("Area of the square is: "+(side*side));
   }

}

public class UseAbstractClass{
   public static void main(String[] args) {
      Rectangle r = new Rectangle(5, 10);
      r.area();
      Circle c = new Circle(5);
      c.area();
      Triangle t = new Triangle(5, 10);
      t.area();
      Square s = new Square(4);
      s.area();

   }
}
