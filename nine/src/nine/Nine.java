package nine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Nine {

	public static void main(String[] args) {
		char[] nine = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I' };

		System.out.println("aswewedff");
		List<String> tiles = new ArrayList<String>();
		for (char c : nine) {
			tiles.add(String.valueOf(c));
		}
		printTiles(tiles, 3);
		
		System.out.println("aswewedff");
		Collections.shuffle(tiles);
		System.out.println("sldfldjslf");
		
		printTiles(tiles, 3);
	}

	public static void printTiles(List<String> tiles, int d) {

		for (int i = 0; i < d * d; i++) {
			System.out.print(tiles.get(i));
			if ((i + 1) % d == 0)
				System.out.println();
		}
		
	}
}
