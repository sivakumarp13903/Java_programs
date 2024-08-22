package loop;

public class RevPattern {
	public static void main(String arg[]) {
		for(int i=5;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("* ");
			}System.out.println();
		}
	}
}
