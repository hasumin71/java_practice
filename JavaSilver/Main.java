// //3_9
// public class Main {
//   public static void main(String[] args) {
//     Sample a = new Sample(10, "a");
//     Sample b = new Sample(10, "b");
//     System.out.println(a.equals(b));
//   }
// }
//3_21 yesと表示したい
public class Main {
  public static void main(String[] args){
    String a = "A";
    String b = "B";
    String c = a.equals(b)? "no" : "yes"; //aとbは同値ではないのでが明らかなので、falseがyes出なければならない。
    System.out.println(c);
  }
}