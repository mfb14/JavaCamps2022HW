package WeekOne;

import java.util.ArrayList;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int vertexCount = 3;
		
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		
		
		for (int i = 0; i < vertexCount; i++) {
			matrix.add(new ArrayList<>());
		}
		
	
		matrix.get(0).add(1);
		matrix.get(0).add(2);
		matrix.get(0).add(3);
		matrix.get(0).add(2);
		matrix.get(0).add(3);
		matrix.get(1).add(4);
		matrix.get(1).add(5);
		matrix.get(1).add(4);
		matrix.get(1).add(5);
		matrix.get(1).add(6);
		matrix.get(2).add(10);
		matrix.get(2).add(8);
		matrix.get(2).add(10);
		matrix.get(2).add(8);
		matrix.get(2).add(9);
		
		
		
		System.out.println("---------------------\n");
		
	
		int sumOne = 0;
		int sumTwo = 0;
		int colIndex = 2;
		for(int i = 0;i<matrix.size();i++) {
			for (int j = 0; j < matrix.get(0).size(); j++) {
				if(i == j)
					sumOne += matrix.get(i).get(j);
			}
			sumTwo+=matrix.get(i).get(colIndex);
			colIndex--;
		}
		
		System.out.println(sumOne-sumTwo);
		
	}
	

}
