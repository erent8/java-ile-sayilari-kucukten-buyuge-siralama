import java.util.Scanner;

public class sayiyikucuktenBuyugesiralama {
    // Girilen 3 sayıyı küçükten büyüğe sıralama

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int biggest = 0;

        System.out.print("a sayisini giriniz : ");
        int a = inp.nextInt();

        System.out.print("b sayisini giriniz : ");
        int b = inp.nextInt();

        System.out.print("c sayisini giriniz : ");
        int c = inp.nextInt();


        if (b < a && c < a) biggest = a;
        else if (b < c && a < c) biggest = c;
        else if (c < b && a < b) biggest = b;

        System.out.println("\nEn buyuk sayi: " + biggest);
    }
}

// Eren Terzi
// İnst: erennt8
