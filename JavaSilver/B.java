class B extends A {
  public B(){
    //ここには表示されてないがコンパイルするとsuper();が追加されBクラスのインスタンス化によってこのコンストラクタの処理が行われるときsuperクラスのコンストラクタが呼び出される
    System.out.println("B");
  }
}