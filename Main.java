import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Scanner s1= new Scanner(System.in);
//        System.out.println("enter the number :");
//int num =s1.nextInt();
//if (num%2==0){
//    System.out.println("the number is even");
//} else if (num%2==1) {
//
//    System.out.println("the number is odd");
//}
        Scanner s2 = new Scanner(System.in);
        System.out.println("enter the number :");
        int num=s2.nextInt();
        int total=0;

        for (int i = 1; i<0; i++) {
            if (num != 0) {
                System.out.println("enter the number :");
                num = s2.nextInt();
                total = +num;
            }
            }
        System.out.println(total);


//int [] array = {10, -21 , 30, 31, -25};
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i]>0){
//                System.out.println(array[i]+" is a positive number ");
//            }
//            if(array[i]<0){
//                System.out.println(+array[i]+" is a negative number ");
//            }
//        }

String [] word ={"Tuwaiq”, “Bootcamp” , “Student”,”JAVA"};
        for (int i = 0; i <word.length ; i++) {
            if(word[0].length()<word[1].length()&& word[0].length()<word[2].length()){
                System.out.println(word[2]);
            }

        }


    }
}