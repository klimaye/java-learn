enum Animals {
	DOG("woof"), Cat("meow"), FISH("burble");
	String sound;
	Animals(String s) {
		this.sound = s;
	}
}
class TestEnum {
	static Animals a;
	public static void main(String[] args) {
		//enum values can be accessed via a var that has not been set.
		//line below works.
		System.out.println(a.DOG.sound + " " + a.FISH.sound);

		//line below doesn't as you cannot delcare an enum in a method.
		enum Traffic { RED, GREEN, ORANGE };
	}
}