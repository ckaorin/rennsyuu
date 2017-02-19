public class Test2 {
	public static void main (String[]args){
		System.out.println("あなたの名前をローマ字で入力してください");
		String input = new java.util.Scanner(System.in).nextLine();
		
		if(input.equals("tomoki")){
			System.out.println("男性");
		}else{
			System.out.println("女性");
		}
	}
}