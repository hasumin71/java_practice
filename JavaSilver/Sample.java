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
