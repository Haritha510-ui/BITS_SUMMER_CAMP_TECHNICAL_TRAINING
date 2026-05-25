package Inheritance;

// class A {
   // public void m1 {
      //  System.out.println("m1 in class A");
  //  }
// }
 // class B {
   // public void m1(){
      //  System.out.println(",1 in class B");
    // }
// }

// java wont support multiple inheritance due to ambigous nature
// class C extends A,B {

// }

// Alternate approch of multiple inhrt consept using interface
interface A {
    public void m1();

}

interface B {
    public void m1();
}

class C implements A,B {
    public void m1() {
        System.out.println("m1 in C");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        
    }
    
}
