import java.util.Scanner;

public class division_3_4{
    public static void main(String[] args) {
        int k , total=0 , count=0 ;
        double avarage;

        Scanner input = new Scanner(System.in);
        
        System.out.print("sayinizi giriniz: ");
        k = input.nextInt();

        int i = 1;
        while(i <= k){
            if(i % 3 ==0 && i % 4 ==0){
                count+=1;
                total+=i;
                System.out.println( i );
            }
           
            i++;
        }
        avarage = total / count;

        System.out.println("Toplamları : "+total);
        System.out.println("Ortalamaları : "+avarage);


    
    }
}