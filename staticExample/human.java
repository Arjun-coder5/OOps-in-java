public class human{
  int age;
  int salary ;
  String name;
  boolean married;
   static long population;
  public  human(int age,int salary,String name,boolean married){
     this.age = age;
     this.salary = salary;
     this.name = name;
     this.married = married;
     human.population += 1;

     human.message1();
     
  }
  public static void message1(){
   System.out.println("Hi Arjun");
  }

   
}