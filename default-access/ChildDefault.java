package other;
import certification.ParentDefault;
public class ChildDefault extends ParentDefault {
	public void doStuff() {
		System.out.println("x is" + x);
		System.out.println("this does not work since x is set to default access");
	}
}