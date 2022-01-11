import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(vanEckSequence(sc.nextInt()));
	}

	public static String vanEckSequence(int range) {
		int distance = 0;
		int nextNumber = 0;
		String sequence = "";
		Map<Integer, Integer> numberMap = new HashMap<>();
		for (int i = 0; i < range; i++) {
			if (numberMap.containsKey(nextNumber))
				distance = i - numberMap.get(nextNumber);
			else
				distance = 0;
			numberMap.put(nextNumber, i);
			sequence += nextNumber + " ";
			nextNumber = distance;
		}
		return sequence;
	}
}