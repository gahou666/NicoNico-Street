import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DataView {
	DataView(){
		
	}
	
	public void View(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1);
		System.out.println("Data Viewing. Press ENTER to back");
		try {
			String s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
