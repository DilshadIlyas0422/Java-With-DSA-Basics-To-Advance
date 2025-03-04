import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        System.out.print("Please enter Your Age: ");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        
        if(age <= 12){
            System.out.println("You are a Child.");
        }else if(age > 12 && age <= 18){
            System.out.println("You are a TennAger.");
        }else if(age > 18 && age <= 45){
            System.out.println("You are an Adult.");
        }else{
            System.out.println("You are an Old Man.");
        }
    }
}