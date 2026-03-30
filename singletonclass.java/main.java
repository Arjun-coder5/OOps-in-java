public class main {
  public static void main(String[] args) {
    singleton obj = singleton.getIntstance() ;
    singleton obj1 = singleton.getIntstance() ;
    singleton obj2 = singleton.getIntstance() ;

   System.out.println(obj);
   System.out.println(obj1);
   System.out.println(obj2);

  //  all the refrense variable are pointing to just one same object .
  }
}
