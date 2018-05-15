import java.io.PrintWriter;
import java.util.Arrays;

public class Array {

private int[] array = new int[0];
	
	public Array(int[] array) {
		this.array = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			this.array[i] = array[i];
		}
	}
	
	public int[] sortArray(){
		int[] sortArray = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			sortArray[i] = array[i];
		}

		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - 1; j++) {
			
				if (sortArray[j] > sortArray[j + 1]) {
					int a = sortArray[j];
					sortArray[j] = sortArray[j + 1];
					sortArray[j + 1] = a;
				}
			}
		}
		return sortArray;
	}

	@Override
	public String toString() {
		return "Array [array=" + Arrays.toString(array) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(array);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Array other = (Array) obj;
		if (!Arrays.equals(array, other.array))
			return false;
		return true;
	}

	public static void main(String[] args) {
		
		int[] array = {0, -2, 5, 10, 7};
		System.out.println("User array: " + Arrays.toString(array));
		
		Array sort = new Array(array);
		System.out.println("Sort array: " + Arrays.toString(sort.sortArray()));
	}
}
