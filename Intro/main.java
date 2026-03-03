
public class main{
  public static void main(String[]args){
    // Strore 5 roll number : 
    int[] roll_number = new int[5];
    // Store name of 5 student :
    String[] names = new String[5];
    // data of 5 students : {roll no , name , marks};
    int[] rlno = new int[5];
    String[] name = new String[5];
    float[] marks = new float[5];

    // 
    Student[] students = new Student[5];
     Student Arjun =  new Student(11,"Arjun",98);
      Student Bhuvnesh =  new Student(12,"Bhuvnesh",100);
    //  Arjun.rlno = 11;
    //  Arjun.name = "Arjun";
    //  Arjun.marks  = 90;
    //  System.out.println(Arjun.rlno);
    //  System.out.println(Arjun.name);
    //  System.out.println(Arjun.marks);

    //  System.out.println(Bhuvnesh.rlno);
    //  System.out.println(Bhuvnesh.name);
    //  System.out.println(Bhuvnesh.marks);
     // Arjun.changeName("Don");
   // Arjun.greeting();
  
    Student random =  new Student(Arjun);
   // System.out.println(random.name);
    Student random2 = new Student();
   // System.out.println(random2.name);
    // System.out.println(Arrays.toString(students));

     Student one = new Student();
     Student two = one;
     one.name = "Bole jo koyal bago me...";
     System.out.println(two.name);
  }
  
  // Create a class : 
  // For Every Single Student :
  public static class Student{
    int rlno ;
    String name ;
    float marks;
    
    void greeting(){
    System.out.println("Hello my name is " + this.name);
  }
  void changeName(String newName){
   name = newName;
  }
  //  Student(){
  //   this.rlno = 11;
  //   this.name = "AS";
  //   this.marks = 98.5f;
  //  }
 
  public Student(Student other) {
   this.rlno = other.rlno;
   this.name = other.name;
   this.marks = other.marks;
   }

    Student(){
      // this is how you call one constructor to another one : 
   this(12,"Default",97.5f);
  }

   Student(int rollno,String naam,float mark){
    rlno = rollno;
    name = naam;
    marks = mark;
   }
  }
}