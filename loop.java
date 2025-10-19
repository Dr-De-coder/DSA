//while loop

// import java.util.*;

// public class loop{
//     public static void main(String[] args) {
//         int i = 1;

//         while(i <= 9){
//             System.out.println(i);
//             i++;
//         }
//     }
// }


//for loop


// import java.util.*;

// public class loop{
    
//     public static void main(String[] args) {

//         for( int i = 1; i <= 9; i++){
//             System.out.println(i);
//         }
//         System.out.println("done");
//     }
// }


//Another example with input

// import java.util.*;

// public class loop{
    
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         // System.out.println("enter your number");
//         // int n = scn.nextInt();
//         // for(int i = 0; i <= n; i++){
//         //     System.out.println(i);


//         System.out.println("enter your name");
//         String name = scn.nextLine();
//         System.out.println(" Hello " + name);
//         }
//     }



//Dealing with the both int and string both data type



import java.util.*;

public class loop{
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("enter your number");
        int n = Integer.parseInt(scn.nextLine());

        System.out.println("enter your name");
        String name = scn.nextLine();

        System.out.println("Dear " + name + ".Here is the Counting ");
        for(int i = 1; i <=n; i++){
            System.out.println(i);
        }
        }
    }