import java.io.*;

public class Main {
	public static int status = 0;
	public static void main(String[] args) {
		Title t = new Title();
		Menu m = new Menu(status);
		DataView dv = new DataView();
		status = m.st;
		switch(status){
		case 1:
			break;
		case 2:
			break;
		case 3:
			dv.View();
		default :
			break;
		}
	}
}
