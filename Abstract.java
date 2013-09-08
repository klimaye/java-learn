class Electronic {
	public void testIt() {

	}
}
abstract class Radio extends Electronic {
	abstract void hearIt();
}
class CarRadio extends Radio {
	public void hearIt() {
		System.out.println("abstract class can inherit from a non abstract class");
	}
}