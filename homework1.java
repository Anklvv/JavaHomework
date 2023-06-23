// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// 2) Вывести все простые числа от 1 до 1000

// доделать до нужных чисел 

public class homework1 {

    for (int i = 2; i <= 100; i++) {

                for (int j = 2; j <= i; j++) {

                    if (j < i  & i % j == 0) {
                        break;
                    }
                    if (i % j == 0) {
                        System.out.println(i);
                    }
                }
            }
}



// 3) Реализовать простой калькулятор
// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.




// public class homework1 {
    
//     public static void name(String[] args) {
//         System.out.println();
//     }
// }


// // Scanner in = new Scanner(System.in); должно быть внутри main
// // import java.util.Scanner;


// import java.util.Scanner; // для ввода данных вроде бы

// public class Main
// {
// 	public static void main(String[] args) {
// 	    int n = 5;
// 	    String a = "Hello";
// 	    var x = 'f';
// 	    boolean flag = true;
// 	    System.out.println(a + " World");
// 		for (int i = 0;i <= 10 ;i++ ){
// 		    System.out.println(i);
// 		} 
// 		while(n < 20){
// 		    System.out.println(n);
// 		    n+=5;
// 		}
		
// 		int j = 7;
//         do{
//             System.out.println(j);
//             j--;
//         }
//         while (j > 0);
        
//         int[] nums = new int[5];
//         int[] x1 = {1,215,627,35684,3221,7658,96473};
        
//         for (int i = 0;i < x1.length;i++ ){
//             if(x1[i] % 2 == 0)
//                 System.out.println(x1[i]); 
//         } 
//         Scanner in = new Scanner(System.in);
//         String name = in.nextLine();
//         System.out.println(name);
        
        
        
        
        
        
// 	}
// }
