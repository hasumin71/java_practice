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
// public class Sample {
//   int num;
//   public Sample(int num){
//     this.num = num;
//   }
// }

//7_14
// class Sample {
//   private int num;
//   public Sample(int num){
//     setNum(num);
//   }
//   public int getNum(){
//     return num;
//   }
//   public void setNum(int num){
//     this.num = num;
//   }
// }

//9_24
// public class Sample {
//   public static void main(String[] args){
//     int cnt = 0;
//     Runnable r = () -> {
//       for(cnt = 0; cnt < 10; cnt++); //for文の更新文がインクリメントしているのでローカル変数cntを変更してしまっている。
//     }
//   };
//   new Thread(r).start();
// }

//9_26
// import java.time.LocalDate;

// public class Sample {
//   public static void main(String[] args){    
//     LocalDate a = LocalDate.of(2015, 0, 1); //Calenderクラスでは0から始まったがLocalDateクラスでは月は1から始まる
//     //LocalDateクラスのインスタンスを生成するには、ofメソッド(日付を指定してインスタンスを生成)かnowメソッド(現在の日付でインスタンスを生成)のいずれかを使う。
//     LocalDate b = LocalDate.parse("2015-01-01"); //構文上問題はないが,java.time.DateTimeExceptionがスローされる
//     System.out.println(a.equals(b));
//   }
// }

//9_28
// import java.time.Duration;
// import java.time.LocalDateTime;

// public class Sample {
//   public static void main(String[] args){
//     LocalDateTime start = LocalDateTime.of(2015, 1, 1, 0, 0); //LocalDateTimeは日時の両方を扱えるクラス
//     LocalDateTime end = LocalDateTime.of(2015, 1, 2, 1, 0, 0);
//     Duration d = Duration.between(start, end); //Durationは時刻の差を扱うためのクラス betweenメソッドは二つの日時の差を計算し、その結果をDurationのインスタンスとして戻すメソッドです。
//     //betweenメソッドはTemporalインターフェース型のオブジェクトを二つ受け取る Temporalインターフェースは、LocalDateやLocalTime,LocaDateTimeが実装しているインターフェースです
//     System.out.println(d.toHours()); //時間の差を取り出すtoHoursメソッド この設問の場合は25時間を返す
//   }
// }

//9_30
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

// public class Sample{
//   public static void main(String[] args){
//     LocalDateTime time = LocalDateTime.of(2015, 8, 31, 0, 0);
//     String str = time.format(DateTimeFormatter.ISO_DATE_TIME); //ISO_DATE_TIMEは区切り記号や時刻情報をつける.BASIC_ISO_DATEは区切りなしの年月のみ
//     System.out.println(str);
//   }
// }    

// import java.util.function.Predicate;

// public class Sample {
//   public static void main(String[] args){
//     Predicate<String> p = str -> {
//       return "".equals(str);
//     };
//     System.out.println(p.test(args[0]));
//   }
// }

//10_21
// public class Sample {
//   int a;
//   static int b;
//   public Sample(int ns) {
//     if(b < ns){
//       b = ns;
//       this.a = ns;
//     }
//   }
//   void doPrint(){
//     System.out.println("a = " + a + " b = " + b);
//   }
// }

//10_23
// public class Sample {
//   String name;
//   int num;
//   public Sample(String name, int num){
//     this.name = name;
//     this.num = num;
//   }
// }

//10_59
// public class Sample {
//   public static void main(String[] args){
//     try{
//       test();
//     }catch(MyException e){
//       System.out.println("A");
//     }
//   }
//   public static void test(){
//     try{
//       throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
//     }catch(RuntimeException e){       //MyExceptionはRuntimeExceptionクラスのサブクラスよって非検査例外
//       System.out.println("B");        //非検査例外はコンパイラによるチェックが行われないためそのままcatchブロックが処理される
//     }
//   }
// }

// class MyException extends RuntimeException{}

//10_64
class Sample{
  int num;
  Sample(int num){
    this.num = num;
  }
}