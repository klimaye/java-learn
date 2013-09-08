package certification;
public class CloseChild extends Parent {
  static void main(String[] args) {
    CloseChild cc = new CloseChild();
    System.out.println("x is " + cc.x);
  }
}
