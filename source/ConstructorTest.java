class Avi {
  Avi () {
    System.out.println("ola");
  }
}

class Savi extends Avi {
  Savi() {
    super();
    System.out.println("ciao");
  }
  public static void main(String[] args) {
    Savi savi = new Savi();
  }
}
