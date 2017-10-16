import java.lang.StringBuilder;

public class BasicGit {
	
	public String printOneTo(int n) {
		StringBuilder text = new StringBuilder();
		
		for (int i = 1; i <= n; i++) {
			text.append(i).append("\n");
		}
		
		return text.toString();
	}
	
	public static void main(String[] args) {
		BasicGit bg = new BasicGit();
		
		String textToPrint = bg.printOneTo(10);
		System.out.println(textToPrint);
	}
}