public class Wrapper_Classes {
  public static void main(String[] args) {
    Integer a = 10;
    Integer b = 20;

    Integer num = 59;
   swap(a, b);
   System.out.println(a + " " + b);
   final int BONUS = 75;

   final A Arjun = new A("Arjun");
   Arjun.name = "Robo";
   //Arjun = new A("Kurkure"); cannot assign an new object when an object is final : 
    A obj;
    for(int i = 0;i<100000000;i++){
      obj = new A("Random Object");
    }
  }
  static void swap(Integer a,Integer b){
    Integer temp = a;
    a=b;
    b=temp;
  }
  public static class A{
    String name;
    A(String name){
     this.name = name;
    }
    @Override protected void finalize() throws Throwable { System.out.println("Object is destroyed : " + name); }
  }
}
