public class singleton {
  //  int num = 0;
   private singleton(){

  }
  private static  singleton instance;
   public static  singleton getIntstance(){
     if(instance==null){
      instance = new singleton();
     }
     return instance;
   }
}
