import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy,kilo,kitleindex;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz : ");
        boy = scanner.nextDouble();
        System.out.print("Lütfen kilouzu Kg Cinsinden Giriniz : ");
        kilo = scanner.nextDouble();
        kitleindex = kilo / (boy*boy);
        System.out.print("Vücut Kitle İndeksiniz = " + kitleindex);



    }
}