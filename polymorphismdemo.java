

package polymorphismsemo;


public class polymorphismdemo {
     public static void main(String[] args) {
       m(new GraduateStudent());
       m(new Student());
       m(new Person());
       m(new Object());
     }

    public static void m(Object a) {
      System.out.println(a.toString());
    }
  }

  class GraduateStudent extends Student {
  }

  class Student extends Person {
    public String toString() {
      return "I am a Student";
    }
  }

class Person extends Object {
    public String toString() {
      return "I am a Person";
    }
  }


