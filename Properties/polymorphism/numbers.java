public class numbers {
  int sum(int a,int b){
    return a+b;
  }
  int sum(int a,int b,int c){
    return a+b+c;
  }
  public static void main(String[] args) { 
    numbers obj = new numbers();
    obj.sum(10, 37);
    //System.out.println(obj);
    obj.sum(5, 8, 6);
  }


}
