import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {
	List<String> list = new ArrayList<String>();

	List<String> printToList(char a) {
		int numLetters = a - 'A';
		char[][] array = new char[(numLetters * 2) + 1][(numLetters * 2) + 1];

		for (int i = 0; i <= numLetters * 2; i++) {
			for (int j = 0; j <= numLetters * 2; j++) {
				array[i][j] = ' ';
			}
		}

		for (int i = 0; i <= numLetters; i++) {
			array[i][numLetters + i] = (char) ('A' + i);
			array[numLetters * 2 - i][numLetters + i] = (char) ('A' + i);
			array[i][numLetters - i] = (char) ('A' + i);
			array[numLetters * 2 - i][numLetters - i] = (char) ('A' + i);
		}
		List<String> list = new ArrayList<>();
		for (int i = 0; i <= numLetters * 2; i++) {
			list.add(new String(array[i]));
		}
		return list;
	}
}
