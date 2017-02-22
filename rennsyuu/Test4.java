public class Test4{
	public static void main(String[]args){
		System.out.println("あなたの年齢を入力してください。");
		int yourage = new java.util.Scanner ( System.in ).nextInt ();
			if ( yourage > 22 ){
				System.out.println("私よりも年上ですね！");
			} else if ( yourage == 22){
				System.out.println("私と同い年ですね！");
			} else {
				System.out.println("私よりも年下ですね！");
		}
	}
}