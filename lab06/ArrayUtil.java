public class ArrayUtil{
	static void reverse(String[] array){
		int length = array.length;

		String temp;
		for (int i = 0; i < length / 2; i++){
			temp = array[i];
			array[i] = array[length - i - 1];
			array[length - i - 1] = temp;
		}

		return;
	}	

	static String[] resize(String[] array){
		String[] newArray = new String[array.length * 2];

		for (int i = 0; i < array.length; i++){
			newArray[i] = array[i];
		}

		return newArray;
	}

	static String[] add(String element, String[] array){
		int position = -1;
		for (int i = 0; i < array.length; i++){
			if (array[i] == null){
				position = i; 
				break;
			}
		}

		if (position == -1){
			position = array.length;
			array = ArrayUtil.resize(array);
		}
		array[position] = element;
		return array;
	}

	static boolean contains(String element, String[] array){
		boolean contains = false;
		for (int i = 0; i < array.length; i++){
			if (element.equals(array[i])){
				contains = true;
				break;
			}
		}
		return contains;
	}

	static int findMinValue(int[] array){
		int min = array[0];
		for (int i = 1; i < array.length; i++){
			if (min > array[i]){
				min = array[i];
			}
		}
		return min;
	}

	static int findMaxValue(int[] array){
		int max = array[0];
		for (int i = 1; i < array.length; i++){
			if (max < array[i]){
				max = array[i];
			}
		}
		return max;
	}

	static int[] findMinIndex(int[] array){
		int min[] = {0, array[0]};
		for (int i = 1; i < array.length; i++){
			if (min[1] > array[i]){
				min[1] = array[1];
				min[0] = i;
			}
		}
		return min;
	}

	static int[] findMaxIndex(int[] array){
		int max[] = {0, array[0]};
		for (int i = 1; i < array.length; i++){
			if (max[1] < array[i]){
				max[1] = array[i];
				max[0] = i;
			}
		}
		return max;
	}
}