import java.util.Scanner;

public class taksimetre_hesapla {

    public static void main(String[] args) {

        double km, perkm=2.20, total=10, min=20 ;
        Scanner input= new Scanner(System.in);

        System.out.println("Lutfen kilometre degerini giriniz: ");
        km= input.nextDouble();

        total += (km*perkm);

        System.out.println(km<=9.1 ? ("Minimum odeme : "+ 20):total);






    }
}
