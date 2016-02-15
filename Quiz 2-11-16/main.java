public class main{

	public static void main(String[] args){
		String[][] strArray = {
			{"Name:...", "William Lin"},
			{"Major:.... ", "CS"},
			{"Year:... ", "First"},
			{"Courses Completed:.... ", "10"},
			{"Highest Grade.......", "A"},
			{"Lowest Grade....... ", "B-"},
		};
		printArr(strArray);
	}

	public static void printArr(String[][] strArray){
		for(int i = 0; i < 6; i++){
			for(int k = 0; k < 2; k++){
				System.out.print(strArray[i][k]);
			}
			System.out.println();
		}
	}
}