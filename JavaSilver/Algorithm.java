interface Algorithm {
  void perform(String name); //このperformメソッドにラムダ式で処理を代入するには、次のように宣言します
}                            //(String name) -> { /* do something */}