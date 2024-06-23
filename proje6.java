import java.util.Scanner;

public class proje6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Yari Cap Değerini Giriniz:");
        double yariCap = input.nextDouble();
       
        double pi = 3.14;
        
        System.out.print("a Değerini Giriniz:");
        double merkezAci = input.nextDouble();
        
        double alan = pi * yariCap * yariCap;
        System.out.println("Dairenin Alani: " + alan);

        double cevre = 2 * pi* yariCap;
        System.out.println("Dairenin Cevresi:" + cevre);
        
        double daireDilimiAlani = (pi*(yariCap*yariCap)*merkezAci)/360;
        System.out.println("Daire Diliminin alani:" + daireDilimiAlani);

    }
}
