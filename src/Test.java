
public class Test {

	public static void main(String args[]){
		int x=10;
		{
			int y=2;
			x=y+1;
			System.out.println(x);
		}
		System.out.print(x);
	}
}
