import java.io.*;

public class Title {
	Title(){
		System.out.println("Welcome, Nico-Street.");
		System.out.println("PRESS ENTER.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1);
		try {
			String s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
