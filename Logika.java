/**
* Tugas 6 - Dasar dan Aturan PBO (operator logika)
* https://github.com/angrypin/operator_logika
* @author angrypin
* @version 1.0.0
* @since 2021-09-27
*/

/* M. Arifin Ilham - XII RPL 1 - 27/09/2021 */

// import package untuk random nilai
import java.util.concurrent.ThreadLocalRandom;
// import package untuk input
import java.util.Scanner;

// kelas utama "Logika"
public class Logika {
	public static int randomBanget() {
		// mengambil nilai random dari angka 1 - 100
		return ThreadLocalRandom.current().nextInt(1, 100);
	}

	public static void pemisah() {
		for(int x=0; x<50; x++) {
			System.out.print("=");
		}
		System.out.println();
	}

	// fungsi 3 terbesar
	public static int nilaiTerbesar(int[] nilai) {
		// deklarasi nilai terbesar
		int terbesar = 0;

		// menentukan nilai terbesar
		for(int x=0; x<nilai.length; x++) {
			System.out.println("angka"+(x+1)+": "+nilai[x]);
			terbesar = nilai[x] > terbesar ? nilai[x] : terbesar;
		}
		return terbesar;
	}

	public static void menDiskon(int bungkus) {
		final int
		// harga mie ayam
			hargaMie = 10000,

		// total harga dan diskon
			total = hargaMie*bungkus,
			diskon = 20*total/100;

		System.out.println("Mie Ayam x"+bungkus+"\t=\t"+total);
		// check total lebih besar atau sama dengan 100.000
		if(total >= 100000) {
			System.out.println(
				"Diskon 20%\t=\t-" + diskon +
				"\nTotal\t\t=\t" + (total-diskon)
			);
		}
	}

	// fungsi utama dari kelas Logika
	public static void main(String[] args) {
		int
		// deklarasi 3 angka
			angka1 = randomBanget(),
			angka2 = randomBanget(),
			angka3 = randomBanget(),
		// deklarasi variable bungkus
			bungkus;

		// deklarasi variable input
		Scanner ingput = new Scanner(System.in);
		pemisah();
		System.out.println("1. Menentukan bilangan yang paling besar dari ketiga angka");
		System.out.println("Nilai paling besar: " + nilaiTerbesar(new int[]{angka1, angka2, angka3}));
		pemisah();
		System.out.print(
			"2. menghitung suatu harga barang\n"+
			"Beli mie ayam 10 ribuan\n"+
			"berapa bungkus: "
		);

		// try..catch agar terhindar dari error saat input nilai
		try {
			bungkus = ingput.nextInt();
			menDiskon(bungkus);
		} catch(java.util.InputMismatchException ex) {
			System.out.println("Di sini gak terima bon");
		} catch(Exception ex) {
			System.out.println("Goodbye");
		}
		pemisah();
	}
}