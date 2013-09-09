import static java.lang.System.out;
import static java.lang.Integer.*;
class TestStaticImport {
  public static void main(String[] args) {
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.toHexString(42));

    out.println("with static imports");
    //with static imports
    out.println(MAX_VALUE);
    out.println(toHexString(42));
  }
 }
