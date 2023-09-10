import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		ServerSocket server = new ServerSocket(5060); //4444 port'tan dinleme
		Socket client = server.accept(); //server dinlemeye basliyor
		while(true) {
			
	
		InputStreamReader in = new InputStreamReader(client.getInputStream()); //byte byte okumasın diye satir satir okuyacak duruma geldi
		BufferedReader br = new BufferedReader(in); //satir satir okumak icin olusturduk
		PrintWriter print = new PrintWriter(client.getOutputStream()); //cliente veri gondermek icin olusturduk
		String data = br.readLine(); //istegi aldik
		System.out.println("Gelen veri : " + data); //ilk olarak istegi kullanicidan aldik, ekrana yazdirdik
		System.out.println("Sending...");
		String send = key.nextLine();
		print.println(send);
		//System.out.println("Gelen veri : " + data);
		print.flush(); //bekletmeden direkt gondermis olduk
		//in.read();
	}

	}
}
