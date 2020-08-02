// class B extends A {
//   public B(){
//     //ここには表示されてないがコンパイルするとsuper();が追加されBクラスのインスタンス化によってこのコンストラクタの処理が行われるときsuperクラスのコンストラクタが呼び出される
//     System.out.println("B");
//   }
// }

//11_75
public class B extends A{
  private String val;
  public B(String val, int num){
    super(num); //サブクラスにスーパークラスのコンストラクタの呼び出しが必要
  }
}