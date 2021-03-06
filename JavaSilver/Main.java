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
// public class Main{
//   public static void main(String[] args){ //エラー valはすでにメソッド main(String[])で定義されています
//     String val = "A";
//     Function f = (val) -> { //ラムダ式はそれを囲むブロック(mainメソッド)と同じスコープを持つ
//       System.out.println(val);
//     };
//     f.test("B");
//   }
// }
// interface Function {
//   void test(String val);
// }

//9_27
// import java.time.LocalTime;

// public class Main {
//   public static void main(String[] args){
//     LocalTime time = LocalTime.of(0,1,2); //localtimeは不変オブジェクトのため
//     time.plusHours(12); //ここでplusHoursを使っても変更されない
//     System.out.println(time);
//   }
// }

//9_29
// import java.time.LocalDate;
// import java.time.Period;

// public class Main {
//   public static void main(String[] args){
//     LocalDate now = LocalDate.now(); //まさに現時刻
//     LocalDate target = now.plusDays(10); //現時刻に10日plus
//     Period x = now.until(target); //untilは日付の差を計算する
//     System.out.println(x.getDays());//getDaysで取得しないと10にならない
//   }
// }

//9_32
// import java.util.ArrayList;

// public class Main {
//   public static void main(String[] args){
//     ArrayList<Object> list = new ArrayList<Object>(); //<>は型パラメータ
//     list.add("A"); 
//     list.add(10);
//     list.add("C");
//     for(Object obj : list){
//       System.out.print(obj);
//     }
//   }
// }

//9_36
// import java.util.ArrayList;

// public class Main {
//   public static void main(String[] args){
//     ArrayList<String> list = new ArrayList<>();
//     list.add("A");
//     list.add("B");
//     list.add("C");
//     for(String str : list){ //ここに戻ってくるときにはインデックス2番目の要素はないって事、removeメソッドの時点で要素が繰り上げされているので
//       if("B".equals(str)){
//         list.remove(str); //removeメソッドを使用すると削除された要素の位置に次の要素が繰り上げされる、よって次に繰り返し処理する要素がないとみなされAのみ表示される
//       }else{
//         System.out.println(str);
//       }
//     }
//   }
// } //なぜ結果がAでCが出力されない？

//9_38
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class Main {
//   public static void main(String[] args){
//     List<String> list = new ArrayList<>(
//       Arrays.asList(new String[]{"A","B","C"})
//     );
//     list.removeIf(
//       (String s) -> {
//         return s.equals("B");
//       }
//     );
//     System.out.println(list);
//   }
// }

//10_3
// public class Main {
//   public static void main(String[] args){
//     String[] array = {"abcde", "fgh", "ijk"};
//     String[] array2 = new String[3];
//     int i = 0;
//     try{
//       for(String s : array){
//         array2[i] = s.substring(1,4); //substringは第一引数から第二引数の間にある文字列を抽出する 最初でいうとabcdeはbcdになる
//         i++;                          //ただ第二要素には4文字目を切り出す要素がありませんので例外がスローされcatchに処理が移る
//       }
//     }catch (Exception e){
//       System.out.println("Error"); //Errorが出力される
//     }
//     for(String s : array2){
//       System.out.println(s);
//     }
//   }
// }

//10_21
// public class Main {
//   public static void main(String[] args){
//     Sample s1 = new Sample(10);
//     Sample s2 = new Sample(30);
//     Sample s3 = new Sample(20);
//     s1.doPrint();
//     s2.doPrint();
//     s3.doPrint();
//   }
// }

//10_23
// public class Main {
//   public static void main(String[] args){
//     SubSample s1 = new SubSample(100);
//     SubSample s2 = new SubSample("sample", 200, 100);
//     System.out.println(s1.name + ", "+ s1.num + "," + s1.price);
//     System.out.println(s2.name + ", "+ s2.num + "," + s2.price);
    
//   }
// }

//10_34
// public class Main {
//   String val = "7";
//   public void doStuff(String str){
//     int num = 0;
//     try{
//       String val = str; //tryブロックの中でvalが宣言されているので外で使えない
//       num = Integer.parseInt(val);
//     }catch(NumberFormatException e){
//       System.out.println("error");
//     }
//     System.out.println("val = " + val + ", num = " + num);
//   }
//   public static void main(String[] args){
//     new Main().doStuff("9");
//   }
// }

//10_38
// public class Main {
//   static double total = 0;
//   int a = 2, b = 3; //一応初期化しているが、デフォルト値で初期化もできる
//   public static void main(String[] args){
//     double x = 0, a = 0, b = 0; //しかしローカル変数は初期化できていないので、プログラマが明示的に初期化する
//     if (total == 0){
//       a = 3;
//       b = 4;
//       x = 0.5;
//     }
//     total = x * a * b;
//     System.out.println(total);
//   }
// }

//10_53
// import java.time.*;
// import java.time.format.*;

// public class Main{
//   public static void main(String[] args){
//     String date = LocalDate.parse("2015-08-23").format(DateTimeFormatter.ISO_DATE_TIME);
//                             //しかしここの値には時間の情報がない//DateTimeFormatter.の定数ISO_DATE_TIMEで日付と時間を持った定数を指定している。
//     System.out.println(date);
//   }
// }

//10_58
// public class Main {
//   public static void main(String[] args){
//     int result = 30 - 12 / (2*5) + 1;
//     System.out.println(result);
//   }
// }

//10_64
// public class Main {
//   public static void main(String[] args){
//     Sample[] array={
//       new Sample(10),
//       new Sample(20)
//     };
//     Sample[] array2 = new Sample[2];
//     System.arraycopy(array, 0, array2, 0, array.length);
//     array2[1].num = 10;
//     System.out.println(array[1].num); //array[2]と同じインスタンスを持つので10になる
//   }
// }

//10_70
// public class Main {
//   public static void main(String[] args){
//     int num = 1;
//     x:
//     for (int i = 0; i < 3; i++) {
//       y:
//       for(int j = 0; j < 5; j++){
//         if (j==1){ //変数jが０と２の時だけ変数numに加算されるがnumに加算するのはiだけなので
//           continue;
//         }
//         if(j==3){
//           break x; //breakが実行されたときには外側のループを抜ける
//         }
//         num += i;
//       }
//     }
//     System.out.println(num);
//   }
// }

//10_74
// public class Main {
//   public static void main(String[] args){
//     A a = new B();
//     a.hello();
//   }
// }

//11_18
// import java.util.List;

// import sun.swing.UIAction;

// import java.util.ArrayList;

// public class Main {
//   public static void main(String[] args){
//     String[] array = {"apple","banana","orange"};
//     List<String> list = new ArrayList<>(Arrays.asList(array));
//     if(list.removeIf((String s) -> {return s.length() == 5;})){
//       System.out.println(s);
//     }
//   }
// }

//11_20
// public class Main {
//   public static void main(String[] args){
//     String[] array ={"A", "B"};
//     int i = 0;
//     while(i < array.length) {
//       int j = 0;
//       do {
//         ++j;
//       } while (j < array[i].length());
//       System.out.println(array[i] + ":" + j);
//       i++;
//     }
//   }
// }

//11_23
// public class Main {
//   public static void main(String[] args){
//     int num = 0;
//     String[] array ={"A","B","C","D"};
//     for(String s : array){
//       switch(s){
//         case "D":
//         case "A":
//           num -= 1;
//           break;
//         case "B":
//           num++;
//         case "C":
//           num += 2;    
//       }
//     }
//     System.out.println(num);
//   }
// }


//11_26
// public class Main {
//   public static void main(String[] args){
//     int a= 10;
//     int b= 20; //22
//     int c = b += a/5;
//     System.out.println(a + b + c); //10,22,22
//   }
// }

//11_27
// public class Main {
//   public static void main(String[] args){
//     int a = 0;
//     int b = 7;
//     for (a = 0; a < b - 1; a = a + 2){ //bの値が変わるわけではなくfor文で回すたびに6
//       System.out.println(a);
//     }
//   }
// }

//11_35
// public class Main {
//   public static void main(String[] args){
//     int[] arrayA = new int[3];
//     int[] arrayB = {1,2,3,4,5};
//     arrayA = arrayB; 
//     for(int i : arrayA){
//       System.out.println(i);
//     }
//   }
// }

//11_38
// public class Main {
//   public static void main(String[] args){
//     System.out.println(new StringBuilder("Java"));
//     //StringBuilderとは 
//     System.out.println(new TestString("Java"));
//   }
// }

//11_45
// public class Main {
//   public static void main(String[] args){
//     String str = "a b 3 d e";
//     String[] array = str.split("\\d"); //分割する箇所は正規表現で書く
//     System.out.println(array.length);
//   }
// }

//11_46
// import java.time.LocalDateTime;
// import java.time.format.*;

// public class Main {
//   public static void main(String[] args){
//     LocalDateTime date = LocalDateTime.of(2015, 9, 15, 1, 1);
//     date.plusDays(30);
//     date.plusMonths(1);
//     System.out.println(date.format(DateTimeFormatter.ISO_DATE));
//   }
// }

//11_48
// public class Main {
//   public static void main(String[] args){
//     for(int i = 0; i < 4; i++){
//       System.out.println(i);
//       i += 1;
//     }
//   }
// }

//11_49
// public class Main {
//   public static void main(String[] args){
//     int[] array = {1,2,3,4,5};
//     int x = array.length;
//     while(0 < x){
//       --x;
//       System.out.println(array[x]); //インデックスの四番目を取り出さないと5は取れない
      
//     }  
//   }
// }

//11_56
// public class Main {
//   private String val;
//   private int num;
//   public Main(int num){ //オーバーロードされたコンストラクタ①
//     this.num = num;
//   }
//   public Main(){ //オーバーロードされたコンストラクタ② この引数なしのコンストラクタは生成されていない
//     this.val = "test";
//     this.num = 10;
//   }
//   public static void main(String[] args){
//     Main m = new Main(20);
//     System.out.println(m.val + ", " + m.num);
//   }
// }

//11_57
// public class Main {
//   public static void main(String[] args){
//     String name = "Java";
//     int version = 7;
//     StringBuilder sb = new StringBuilder();
//     sb.append(name).append("SE").append(version);
//   }
// }

//11_59
// public class Main {
//   private static int num;
//   static{
//     num = 10;
//   }
//   static{
//     num = 30;
//   }
//   static void test(int num){
//     num = num * num;
//   }
//   public static void main(String[] args) {
//     test(num);
//     System.out.println(num);
//   }
// }

//11_60
// public class Main {
//   public static void main(String[] args){
//     String val = "1";
//     int num = 10;
//     if((num = num + 10) == 100) //if文の中で変数の値変更可能なんだ...
//       val = "A";
//     else if((num = num + 29) == 50)
//       val = "B";
//     else if((num = num + 200) == 10)
//       val = "C";
//     else
//       val = "F";
//     System.out.println(val + ":" + num);        
//   }
// }

 //11_61
//  public class Main {
//    public static void main(String[] args){
//      Sample s = new Sample();
//      s.name = "test";
//      s.num = 18;
//      s.version = 2; //Sampleクラスに存在しないフィールドを使おうとするとコンパイルエラーになる
//    }
//  }

//11_62
// import java.util.ArrayList;
// import java.util.List;

// public class Main {
//   public static void main(String[] args){
//     List<String> list = new ArrayList<>();
//     list.add("A");
//     list.add("B");
//     list.add("C");
//     list.remove(1);
//     System.out.println(list.get(1));
//   }
// }

//11_63
// public class Main {
//   public static void main(String[] args){
//     sample();
//     int a = b;
//     int b = num;
//   }
//   private static void sample(){
//     System.out.println(num);
//   }
//   static int num;
// }

//11_65 //配列の要素のデフォルト値について
// public class Main {
//   public static void main(String[] args){
//     try{
//       String[] array = new String[5];
//       array[1] = "A";
//       array[2] = "B";
//       array[3] = "C";
//       for(String str : array){
//         System.out.println(str);
//       }
//     }catch(Exception e){
//       System.out.println("Error");
//     }
//   }
// }

//11_66 ①
// public class Main {
//   public static void main(String[] args)throws Exception{
//     try{
//       if(args.length == 0){
//         sample(null);
//       }else{
//         sample(args[0]);
//       }
//     }catch(RuntimeException e){
//       System.out.println("error");
//     }
//   }
//   private static void sample(String str)throws Exception{
//     if(str == null) throw new Exception();
//     throw new RuntimeException();
//   }
// }
//11_66 ②
// public class Main {
//   public static void main(String[] args){ //sampleメソッドを呼び出しているmainメソッドでも宣言が必要
//     try{
//       if(args.length == 0){
//         sample(null); 
//       }else{
//         sample(args[0]);
//       }
//     }catch(Exception e){ //RuntimeExceptionは非検査例外
//       System.out.println("error");
//     }
//   }
//   private static void sample(String str)throws Exception{ //メソッドでの検査例外の可能性の宣言をしなくてはいけない
//     if(str == null) throw new Exception();
//     throw new RuntimeException();
//   }
// }

//11_68
// public class Main {
//   public static void main(String[] args){
//     System.out.println("result=" + 2 + 3 + 4);
//     System.out.println("result=" + 2 + 3 * 4);
//   }
// }

//11_69
// public class Main {
//   public static void main(String[] args){
//     char[] array = "HelloWorld".toCharArray();
//     char[] array2 = new char[array.length];
//     System.arraycopy(array,1,array2,1,array.length);
//     System.out.println(array2);       //第五引数 第二引数の位置から幾つの要素をコピーするか
//   }                                     //2文字目から10文字分をコピーするも存在しないため
// }                                       //ArrayIndexOutBoundsExceptionが発生

//11_70 //メソッドのオーバーロ-ドに関する問題
// public class Main {
//   public static void main(String[] args){
//     sample(2,3);
//   }
//   private static void sample(int a, int b){
//     System.out.println(a + b);
//   }
//   private static void sample(int... num){
//     for(int i : num){
//       System.out.println(i);
//     }
//   }
// }

//11_74
// public class Main { //全て同じシグニチャを持っているためコンパイルエラーになる
//   private int sample(double val){
//     System.out.println("A");
//     return 0;
//   }
//   private String sample(double val){
//     System.out.println("B");
//     return null;
//   }
//   private double sample(double val){
//     System.out.println("C");
//     return 0.0;
//   }
//   public static void main(String[] args){
//     new Main().sample(1.0);
//   }
// }

//11_76
// public class Main {
//   public static void main(String[] args){
//     int[] array = {2,3,4};
//     int[] array2 = array.clone();
//     array2[0] = 5;
//     for(int i : array){
//       System.out.println(i);
//     }
//   }
// }

//11_77
// public class Main {
//   public static void main(String[] args){
//     String[] array = {"A","B","C","D","E"};
//     for(String str : array){
//       if("B".equals(str)){
//         continue;
//       }
//       System.out.println(str);
//       if("C".equals(str)){
//         break;
//       }
//     }
//   }
// }

//10_67
// public class Main {
//   public static void main(String[] args){
//     String str = "Hello  World";
//     System.out.println(str.charAt(11));
//   }
// }

//9_34
import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    ArrayList<String> list = new ArrayList<>();
    list.add("A");
    list.set(0,"B"); //setメソッドは元の値を上書きする //B
    list.add("C"); //BC
    list.set(1,"D"); //BD
    for(String str : list){
      System.out.print(str);
    }
  }
}