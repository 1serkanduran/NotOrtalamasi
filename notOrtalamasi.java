import java.util.Scanner;
public class notOrtalamasi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Matematik notunu giriniz");
		int mat=input.nextInt();
		System.out.println("Fizik notunu giriniz");
		int fizik=input.nextInt();
		System.out.println("Kimya notunu giriniz");
		int kimya=input.nextInt();
		System.out.println("Türkçe notunu giriniz");
		int turkce=input.nextInt();
		System.out.println("Tarih notunu giriniz");
		int tarih=input.nextInt();
		System.out.println("Müzik notunu giriniz");
		int muzik=input.nextInt();
		
		int toplam=mat+fizik+kimya+turkce+tarih+muzik;
		double sonuc=toplam/6.0;
		
		System.out.println("Ortalama"+sonuc);
		
		boolean sonuc2 = sonuc>=60 ;
		String str = sonuc2 ? "Geçtiniz." : "Kaldınız.";
		System.out.println(str);
		
		 
	}

}
