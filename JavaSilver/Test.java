// public class Test {
//   public static void main(String[] args){
//     String[][] array = new String[2][];
//     array[0] = new String[2];
//     array[1] = new String[5];
//     int i = 97;
//     for(int a = 0; a < array.length; a++){
//       for(int b = 0; b < array.length; b++){
//         array[a][b] = "" + i;
//         i++; 
//       }
//     }
//     for(String[]tmp : array){
//       for(String s: tmp){
//         System.out.print(s + " ");
//       }
//     System.out.println();
//     }    
//   } 
// }

//11_24
// class Test {
//   static int value = 0;
//   int count = 0;
//   public void sample(){
//     while(count < 5){
//       count++;
//       value++;
//     }
//   }
// }

//11_32
class Test {
  static int num = 10;
  int num2 = 20;
  public String toString(){
    return num2 + ": " + num;
  }
}