public class Test4{
	public static void main(String[]args){
		System.out.println("あなたの年齢を入力してください。");
		String yourage = new java.util.Scanner ( System.in ).nextLine ();
			int n = Integer.parseInt(yourage);
			if ( n > 22 ){
				System.out.println("私よりも年上ですね！");
			}else{
				System.out.println("私と同い年か年下ですね！");
		}
	}
}