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
// public class Main {
//   public static void main(String[] args){
//     int array[][] = new int[][] {{1,2},{2,3,4}};
//     int total = 0;
//     for(int i=0; i < array.length; i++){
//       for(int j = i; j < array[i].length; j++){
//         total += array[i][j];
//       }
//     }
//     System.out.println(total);
//   }
// }

//5_11
// public class Main {
//   public static void main(String[] args){
//     String[][] array = {{"A","B","C"}};
//     for(Object obj : array){
//       System.out.println(obj);
//     }
//   }
// }
//結果 [Ljava.lang.String;@7852e922

//5_12
// public class Main {
//   public static void main(String[] args){
//     String[] array = {"A","B","C"};
//     for(String str : array){
//       str = "D"; //変数strの参照先は変わるけれど集合の要素が変わるわけではない
//     }
//     for (String str : array ){
//       System.out.print(str);
//     }
//   }
// }

//5_14
// public class Main {
//   public static void main(String[] args){
//     String[] array = { "A", "B"};
//     for(String a : array){
//       for(String b : array){
//         if("B".equals(b))
//           break;
//         System.out.println(b);  
//       }
//     }
//   }
// }

//5_15
// public class Main {
//   public static void main(String[] args){
//     int[] array = {1,2,3,4,5};
//     int total = 0;
//     for(int i : array){
//       if(i%2 == 0)
//         continue;
//         total += i;
//     }
//     System.out.println(total);
//   }
// }

//5_17
// public class Main {
//   public static void main(String[] args){
//     int total = 0;
//     a: for(int i = 0; i < 5; i++){
//       b: for(int j =0; j < 5; j++){
//         if(i%2 == 0)continue a; //i==0の時もラベルaに
//         if(3 < j)break b;
//         total += j;
//       }
//     }
//     System.out.println(total);
//   }
// }

//6_7
// public class Main {
//   public static void main(String[] args){
//     Sample.num = 10; //staticなフィールドへのアクセス、クラス名.フィールド名 static領域は10 ヒープ領域は0
//     Sample s = new Sample();
//     Sample s2 = new Sample();
//     s.num += 10; //これはコンパイル時にSample.num += 10に置き換えられる
//     s2.num = 30;
//     System.out.println(Sample.num);
//   }
// }

//6_10
// public class Main {
//   public static void main(String[] args){
//     Main m = new Main();
//     System.out.println(m.calc(2,3));//引数の数値リテラルは暗黙でint画になる calcメソッドを呼び出しているが一致するオーバーロードがない
//   }
//   private double calc(double a, int b){ //しかし上下二つのcalcメソッドはどちらもdoubleを使用し、その型の受け取れる範囲が広いため,呼び出しがどちらを呼べばいいのかわからない
//     return (a + b) /2;
//   }
//   private double calc(int a, double b){
//     return (a + b) /2;
//   }
// }

//6_13
// public class Main {
//   public static void main(String[] args){
//     Sample s = new Sample();
//     s.Sample();
//   }
// }

//6_14
// public class Main {
//   public static void main(String[] args){
//     Sample s = new Sample();
//   }
// }

//6_17
// public class Main {
//   public static void main(String[] args){
//     Sample s = new Sample();
//   }
// }

//6_21
// public class Main {
//   public static void main(String[] args){ //mainメソッドと
//     Sample s = new Sample(10);
//     modify(s.num); //numフィールドの値がコピーされたものが引数に渡されている
//     System.out.println(s.num);
//   }
//   private static void modify(int num){ //Sampleのインスタンスがもつnumフィールドの値とは異なる変数
//     num *= 2;
//   }
// }

//6_22
// public class Main {
//   public static void main(String[] args) {
//     Sample s = new Sample(10);
//     modify(s);
//     System.out.println(s.num);
//   }
//   private static void modify(Sample s){
//     s.num *= 2;
//   }
// }

//7_10
// public class Main {
//   public static void main(String[] args){
//     Worker a = new Engineer();
//     Employee b = new Engineer();
//     Employee c = new Engineer();
//     a.create(); //どの型で使っているかポイント //Worker型にcreateメソッドが使われていない
//     b.work(); //Employee型にworkメソッドがあるから
//     c.report();
//   }
// }

//7_14
// public class Main {
//   public static void main(String[] args){
//     Sample s = new Sample(10);
//     System.out.println(s.getNum());
//   }
// }

//7_15
// public class Main {
//   public static void main(String[] args){
//     Child child = new Child();
//     child.name = "sample"; //child型に定義されたnameフィールドに"sample”という値を入れている
//     System.out.println(child.getName()); //しかしgetNameはParentクラスで定義されており戻り値もParentクラスのフィールドを返すよう記述されているため
//   } 
// }

//7_16
// public class Main {
//   public static void main(String[] args){
//     A a = new B();
//   }
// }

//7_17
// public class Main {
//   public static void main(String[] args){
//     new Child("D");
//   }
// }

//8_1
// public class Main {
//   public static void main(String[] args){
//     try{ //例外が発生する可能性がある処理
//       int[] array = {};
//       array[0] = 10;//要素数0に対して値を代入しようとしているのでcatchの処理に移る
//       System.out.println("finish");
//     } catch (ArrayIndexOutOfBoundsException e){ //例外が発生した時の処理
//       System.out.println("error");
//     }
//   }
// }

//8_2
// public class Main {
//   public static void main(String[] args){
//     try{
//       if(args.length == 0){
//         System.out.println("A"); //起動パラメータは何も渡されないので処理が実行される
//       }
//     }catch (NullPointerException e){
//       System.out.println("B");
//     }finally{
//       System.out.println("C"); //例外発生の有無にかかわらず必ず実行したい処理を記述するのがこのfinallyブロック
//     }
//   }
// }

// //8_3
// public class Main {
//   public static void main(String[] args){
//     try{
//       sample();
//       sub();
//     }catch (SampleException e){
//       System.out.println("A");
//     }catch (SubSampleException e){
//       System.out.println("B");
//     }
//   }
//   private static void sample() throws SampleException{
//     throw new SampleException();
//   }
//   private static void sub() throws SubSampleException{
//     throw new SubSampleException();
//   }
// }

//8_5
// public class Main {
//   public static void main(String[] args){
//     System.out.println(test(null));
//   }
//   private static String test(Object obj){
//     try{
//       System.out.println(obj.toString());
//     }catch(NullPointerException e){
//       return "A";
//     }finally{ //finallyブロックが終了してから制御が戻される
//       System.out.println("B");
//     }
//     return "C";
//   }
// }

//8_17
// public class Main {
//   public static void main(String[] args){
//     String str = null;
//     if(str.equals("")){ //strはnullが入っている。このようにnullに対してメソッドを使うとNullPointerExceptionがスローされる
//       System.out.println("blank");
//     }else{
//       System.out.println("null");
//     }
//   }
// }

//9_6
// public class Main {
//   public static void main(String[] args){
//     String str = " a b c d e \t";
//     System.out.println("[" +str.trim() + "]");
//   }
// }

//9_7
// public class Main {
//   public static void main(String[] args){
//     String str = "aaaa"; //"aa"の二つ分が"b"になるから結果はbb
//     System.out.println(str.replace("aa", "b"));
//   }
// }

//9_8
// public class Main {
//   public static void main(String[] args){
//     String str = "abcde";
//     System.out.println(str.charAt(str.length())); //charAtは引数で指定された位置にある文字を抽出する　
//   } //範囲外を示すStringIndexOutOfBoundsExceptionを返す
// }

//9_9
// public class Main {
//   public static void main(String[] args){
//     String str = "abcde";
//     System.out.println(str.substring(1,3).startsWith("b")); //startsWithは文字列が指定された文字で始まるかどうかを調べるメソッド
//   }                        //bcを取得                        //真偽値で返す
// }

//9_10
// public class Main{
//   public static void main(String[] args){
//     String str = "a. b. c. d. e";
//     String[] array = str.split("\\w\\s"); //分割する箇所を正規表現で指定している \wは単語構成文字がアルファベットや数字\sは空白文字
//     for(String s: array){
//       System.out.println(s);
//     }
//   }
// } 
//ドットに続いて空白が現れる指定をしてないのでそのままを返す

//9_11
// public class Main {
//   public static void main(String[] args){
//     String str = "Hello, ".concat("Java!");
//     System.out.println(str);
//   }
// }

//9_12
// public class Main{
//   public static void main(String[] args){
//     System.out.println(10 + 20 + "30" + 40); //Javaの+演算子は文字列を連結する
//   }
// }

//9_13
// public class Main{
//   public static void main(String[] args){
//     String str = null;
//     str += "null"; //参照をもたいなString型変数に対してこのような演算をするとnullは"null"という文字列に置換されnullnullという結果になる
//     System.out.println(str);
//   }
// }

//9_14
// public class Main{
//   public static void main(String[] args){
//     StringBuilder sb = new StringBuilder("abcde");
//     System.out.println(sb.capacity()); 
//   }
// }

//9_15
// public class Main{
//   public static void main(String[] args){
//     StringBuilder sb = new StringBuilder();
//     sb.append(true);
//     sb.append(10);
//     sb.append('a');
//     sb.append("bcdef",1,3);

//     char[] array = {'h','e','l','l','o'};
//     sb.append(array);

//     System.out.println(sb);
//   }
// }

//9_16
// public class Main {
//   public static void main(String[] args){
//     StringBuilder sb = new StringBuilder("abc");
//     sb.append("de").insert(2,"g");
//     System.out.println(sb);
//   }
// }

//9_17
// public class Main{
//   public static void main(String[] args){
//     StringBuilder sb = new StringBuilder();
//     sb.append("a");
//     sb.insert(1,"b");
//     sb.append("cde");
//     sb.delete(1,2);
//     System.out.println(sb);
//   }
// }

//9_18
// public class Main{
//   public static void main(String[] args){
//     StringBuilder sb = new StringBuilder("absde");
//     sb.delete(1,3);//bs削除
//     sb.deleteCharAt(2); //e削除
//     System.out.println(sb);
//   }
// }

//9_19
// public class Main{
//   public static void main(String[] args){
//     StringBuilder sb = new StringBuilder();
//     sb.append("abcde");
//     sb.reverse(); //edcba
//     sb.replace(1,3,"a"); //dcをaに置換
//     System.out.println(sb);
//   }
// }

//9_20
// public class Main {
//   public static void main(String[] args){
//     StringBuilder sb = new StringBuilder();
//     sb.insert(0,"abcde"); //第一引数に1が入っていないと
//     CharSequence seq = sb.subSequence(1,5); //CharSequenceはインターフェイス //bcde
//     String str = new StringBuilder(seq).substring(1,3);
//     System.out.println(str);
//   }
// }

//9_21
// public class Main{
//   public static void main(String[] args){
//     Algorithm algorithm = (String name) ->{
//       System.out.println("hello, " + name);
//     };
//     Service s = new Service();
//     s.setLogic(algorithm);
//     s.doProcess("Lamda");
//   }
// }

//9_22
// public class Main{
//   public static void main(String[] args){
//     Function f = (name) -> "hello, " + name;
//     System.out.println(f.test("Lamda"));
//   }
//   private static interface Function {
//     String test(String name);
//   }
// }

//9_23
public class Main{
  public static void main(String[] args){ //エラー valはすでにメソッド main(String[])で定義されています
    String val = "A";
    Function f = (val) -> { //ラムダ式はそれを囲むブロック(mainメソッド)と同じスコープを持つ
      System.out.println(val);
    };
    f.test("B");
  }
}
interface Function {
  void test(String val);
}