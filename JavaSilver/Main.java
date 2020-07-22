// //3_9
// public class Main {
//   public static void main(String[] args) {
//     Sample a = new Sample(10, "a");
//     Sample b = new Sample(10, "b");
//     System.out.println(a.equals(b));
//   }
// }
//3_21 yesと表示したい
// public class Main {
//   public static void main(String[] args){
//     String a = "A";
//     String b = "B";
//     String c = a.equals(b)? "no" : "yes"; //aとbは同値ではないのでが明らかなので、falseがyes出なければならない。
//     System.out.println(c);
//   }
// }

//3_22
// public class Main{
//   public static void main(String[] args){
//     int point = 80;
//     String val = point < 40 ? "D" //式A
//             : point < 60 ? "C"  //式B
//             : point < 80 ? "B"  //式C
//             : "A"; //false式
//     System.out.println(val);
//   }
// }

//4_1
// public class Main {
//   public static void main(String[] args) {
//     int[] array = new int[0];
//     System.out.println(array); 
//   }
// }
//結果 => [I@7852e922 //これは配列インスタンス//全ての配列はどのクラスから作られたのかと言う「生成元の情報」を持っている

//4_5
// public class Main {
//   public static void main(String[] args){
//     Item[] items = new Item[3];
//     int total = 0;
//     for(int i = 0; i < items.length; i++){
//       total += items[i].price;
//     }
//     System.out.println(total);
//   }
// }
//参照型変数にnull値が格納されている時に、参照型変数を参照しようとした場合に発生する例外です。 
//NullPointerException

//4_11
// public class Main {
//   public static void main(String[] args) {
//     char[] arrayA = {'a','b','c','d','e'};
//     char[] arrayB = new char[arrayA.length];
//     System.arraycopy(arrayA,1,arrayB,0,4);
//     for(char c : arrayB) {
//       System.out.println(c);
//     }
//   }
// }//arrayBの配列インスタンス生成の際、５の要素数を作成しているので出力時1スペース分空く

//5_9//問,10と出力したい
public class Main {
  public static void main(String[] args){
    int array[][] = new int[][] {{1,2},{2,3,4}};
    int total = 0;
    for(int i=0; i < array.length; i++){
      for(int j = i; j < array[i].length; j++){
        total += array[i][j];
      }
    }
    System.out.println(total);
  }
}