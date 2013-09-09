package pkgB;
import pkgA.*;
public class FizMaster extends FooMaster {
  public static void main(String[] args) {
    FooMaster f = new FooMaster();
    //System.out.print("  " + f.a);
    //System.out.print(" " + f.b);
    //System.out.print(" " + new FizMaster().a);
    System.out.println(" " + new FizMaster().b);
  }
}
