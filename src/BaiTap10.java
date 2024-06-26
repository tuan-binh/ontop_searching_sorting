import java.util.ArrayList;
import java.util.List;

public class BaiTap10 {
	public static void main(String[] args) {
		String str = "abcabcdgabmnsxy";
		String[] arr = str.split("");
		List<String> result = new ArrayList<>();

//		String a = "a";
//		String b = "b";
//		System.out.println(a.compareTo(b));
		
		StringBuilder sub = new StringBuilder(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (i == (arr.length - 1)) {
				sub.append(arr[i]);
				result.add(sub.toString());
			} else if (arr[i].compareTo(arr[i + 1]) < 0) {
				sub.append(arr[i]);
			} else {
				sub.append(arr[i]);
				result.add(sub.toString());
				sub = new StringBuilder("");
			}
		}
		
		System.out.println(result);
		
	}
}
