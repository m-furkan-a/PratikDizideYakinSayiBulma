import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Sayı Giriniz : ");
	    int sayi = input.nextInt();

	    int [] dizi = {1,5,150,21,20,24,23,25,51,29,55,75,90,50,99};

	    int min = dizi [0];
		int max = dizi [0];

		for (int i : dizi) {
			if (i < min) {
				min = i;
			}
			if (i > max) {
				max = i;
			}
		}
	    for (int i : dizi){
	        if (i < sayi && i > min){
				min =i;

			}
			if (i > sayi && i < max){
				max =i;
			}
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);
    }
}
