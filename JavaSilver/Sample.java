// //3_9
// public class Sample {
//   private int num;
//   private String name;
//   public Sample(int num, String name){
//     this.num = num; //Mainクラスでインスタンス生成しているので 値が10
//     this.name = name; //b
//   }              //a.equals(b)
//   public boolean equals(Object obj){ //equalsメソッドをオーバーライドしている //equalsメソッドで参照先にあるインスタンスが同じ値を持っているかどうか確認する
//     if(obj == null){
//       return false;
//     }
//     if(obj instanceof Sample){ //instanceofとは？ あるオブジェクトの型を動的に確認するための演算子(== + - みたいなやつ)
//       Sample s = (Sample)obj;
//       return s.num == this.num; //同じオブジェクトの値を比較する意味は？ ある意味aとbを比較してるんだな
//     }
//     return false;
//   }
// }

//6_2
// public class Sample {
//   private String value;
//   public void setValue(String value){ //戻り値型がvoid担っているので戻り値を戻しません
//     this.value = value;
//   }
//   public String getValue(){
//     return this.value;
//   }
// }

//6_7
// public class Sample {
//   static int num = 0; //static領域はインスタンス生成しなくても使える
// }

//6_13
// public class Sample {
//   void Sample() {
//     System.out.println("hello.");
//   }
// }

//6_14
// public class Sample {
//   Sample(){
//     System.out.println("A");
//   }
//   {
//     System.out.println("B");
//   }
// }

//6_17
// public class Sample {
//   public Sample() {
//     System.out.println("A");
//     this("B"); //オーバーロードされた別のコンストラクタを呼び出すコードは、最初に記述しなければいけない
//   }
//   public  Sample(String str){
//     System.out.println(str);
//   }
// }

//6_21
// public class Sample {
//   int num;
//   public Sample(int num){
//     this.num = num;
//   }
// }

//6_22
public class Sample {
  int num;
  public Sample(int num){
    this.num = num;
  }
}