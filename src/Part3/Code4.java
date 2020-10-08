package Part3;

abstract class Student {
  abstract void Info();

  abstract void Result();
}

class Student1 extends Student {
  void Info() {
    System.out.println("Name-Vivek KAPADIA.");
  }

  void Result() {
    System.out.println("Cgpa-8.79");
  }
}

class Student2 extends Student {
  void Info() {
    System.out.println("Name-JAIPAL.");
  }

  void Result() {
    System.out.println("Cgpa-10");
  }
}

class Student3 extends Student {
  void Info() {
    System.out.println("Name-AMAR.");
  }

  void Result() {
    System.out.println("Cgpa-9.0");
  }
}

public class Code4 {
  public static void main(String[] args) {

    Student1 s1 = new Student1();
    Student2 s2 = new Student2();
    Student3 s3 = new Student3();
    s1.Info();
    s1.Result();
    s2.Info();
    s2.Result();
    s3.Info();
    s3.Result();
    System.out.println("Prepared by VIVEK KAPADIA 19CE055.");

  }

}
