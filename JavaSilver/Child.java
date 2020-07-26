// public class Child extends Parent {
//   String name;
// }

//7_17
class Child extends Parent {
  public Child(){
    super("B");
    System.out.println("C");
  }
  public Child(String val){
    this();
    System.out.println(val);
  }
}