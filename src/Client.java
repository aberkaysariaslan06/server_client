import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws IOException {
		Socket client = new Socket("localhost", 5060); //sunucu adresimiz local ip adresimiz "localhost", ag icindeysek ag adresini girebiliriz, sunucuya actigimiz portu da yanina girebiliriz
		Scanner key = new Scanner(System.in);
		
		while(true) {
			
		
		
		InputStreamReader in = new InputStreamReader(client.getInputStream()); //byte byte okumasın diye satir satir okuyacak duruma geldi
		BufferedReader br = new BufferedReader(in); //satir satir okumak icin olusturduk
		PrintWriter print = new PrintWriter(client.getOutputStream()); //cliente veri gondermek icin olusturduk
		System.out.println("Send : ");
		
		print.println(key.nextLine());
		print.flush();
		System.out.println("Gelen veri : " + br.readLine() );
	}
	}

}
