public class Name{

	public static void main(String[] args){
		String myName = "William Lin";
		int len = Lin(myName);
		System.out.println("My Name is: " + myName);
		System.out.println("The Numbers of Chars in my name is: " + len);
	}

	public static int Lin(String name){
		int count = 0;
		for(char c : name.toCharArray()){
			count++;
		}
		return count;
	}

}