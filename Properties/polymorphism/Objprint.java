public class Objprint {
  int num;
  public Objprint(int num){
    this.num = num;
  }

  public static void main(String[] args) {
    Objprint obj1 = new Objprint(0);
    System.out.println(obj1);
  }
  @Override
  public String toString() {
    return "Objprint [num=" + num + "]";
  }
}

