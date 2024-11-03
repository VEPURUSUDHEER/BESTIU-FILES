package assignment;

public class matrixArray {
	public static void main(String[] args) {
		int b[][]= {{1,2,3},{5,6,7},{8,9,10}};
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();			
		}
	}
}
