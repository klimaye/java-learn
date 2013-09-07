package other;
import certification.Parent;
class Child extends Parent {
  public void testIt() {
    System.out.println("This works. x is " + x);    
    Parent p = new Parent();
    System.out.println("This does not work. x in parent is " + p.x);
  }
}
