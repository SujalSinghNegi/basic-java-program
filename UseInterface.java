interface A {
int x = 10;
void display();
}
class B implements A {
public void display() {
System.out.println("Value of x: " + x);
}
}
public class UseInterface {
public static void main(String[] args) {
B obj = new B();
obj.display();
}
}