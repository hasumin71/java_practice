//M-SOLUTIONS プロコンオープン 2020 //A
// import java.util.Scanner;
 
// public class Main {
 
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		int k = sc.nextInt();
// 		if(k>=1800) {
// 			System.out.println(1);
// 		}
// 		else if(k>=1600) {
// 			System.out.println(2);
// 		}
// 		else if(k>=1400) {
// 			System.out.println(3);
// 		}
// 		else if(k>=1200) {
// 			System.out.println(4);
// 		}
// 		else if(k>=1000) {
// 			System.out.println(5);
// 		}
// 		else if(k>=800) {
// 			System.out.println(6);
// 		}
// 		else if(k>=600) {
// 			System.out.println(7);
// 		}
// 		else if(k>=400) {
// 			System.out.println(8);
// 		}
// 	}
// }

//B
// import java.util.Scanner;
 
// public class Main {
//   public static void main(String[] args) throws Exception {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt(), 
//     b = sc.nextInt(), 
//     c = sc.nextInt(), 
//     k = sc.nextInt();
//     sc.close();

//     for (;k > 0; k--) {
//       if (a >= b) {
//           b *= 2;
//       } else if (b >= c) {
//           c *= 2;
//       } else {
//           break;
//       }
//   }

//   if (b > a && c > b) {
//       System.out.println("Yes");
//   } else {
//       System.out.println("No");
//     }
//   }
// }