// class Parent {
//   String name;
//   String getName(){
//     return this.name; //Parentクラスのnameフィールドには値は何も入っていないのでnullを返す
//   }
// }

//7_17
class Parent {
  public Parent() {
    System.out.println("A");
  }
  public Parent(String val){
    this();
    System.out.println(val);
  }
}
