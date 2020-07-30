public class SubSample extends Sample {
  int price; 
  //ここにSampleクラスのコンストラクタを呼び出す記述が必要なのにないのでコンパイラで自動生成するも
  public SubSample(int price){ 
    this.price = price;
  }
  public SubSample(String name, int num, int price){
    super(name, num);
    this(price);
  }
}