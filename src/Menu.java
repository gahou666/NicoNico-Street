import java.io.*;

public class Menu {
	int st;
	Menu(int st){
		this.st = st;
		System.out.println("1 : NEW GAME");
		System.out.println("2 : LOAD GAME");
		System.out.println("3 : DATA VIEW");
		System.out.println("4 : END GAME");
		Select();
	}
	
	public void Select(){
		int status = st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1);
		try {
			while(true){
				String s = br.readLine();
				if(s.isEmpty()) s = "0";
				status = Integer.parseInt(s);
				if(status==1||status==2||status==3||status==4) break;
				System.out.println("Please input 1, 2, 3, or 4");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		st = status;
	}
}
