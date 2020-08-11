public class HelloNumbers{
	public static void main(String[] args) {
		int n= Integer.parseInt(args[0]);
		int result= 0;
		for(int i=0;i<n;++i) {
			result+=i;
			System.out.print(result+" ");
		}
	}
}