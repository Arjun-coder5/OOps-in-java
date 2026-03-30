
public class innerclass {
 static  class  test{
   String name;
  public test(String name){
    this.name = name;
  }
}
  public static void main(String[] args) {
    test obj1 = new test("Arjun");
    test obj2 = new test("Karan");
    
    System.out.println(obj1.name);
    System.out.println(obj2.name);

  }
}
