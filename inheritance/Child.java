package other;
import certification.Parent;
class Child extends Parent {
  public void testIt() {
    System.out.println("x is " + x);
    Parent p = new Parent();
    System.out.println("X in parent is " + p.x);
  }
}
