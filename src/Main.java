import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    double kilo,boy,sonuc;
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen kilonuzu(kg) giriniz");
        kilo = input.nextDouble();
        System.out.println("lütfen boyunuzu(m) giriniz");
        boy = input.nextDouble();
        sonuc = kilo/(boy*boy);
        System.out.println("vucut kitle endeksiniz: "+sonuc);
    }
}
