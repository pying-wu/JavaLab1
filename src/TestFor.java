
public class TestFor {

	public static void main(String[] args) {
		// for 迴圈
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) { // i=1,skip
								// i=2,不執行
								// i=3,skip
				continue;
			}
			if (i >= 50) {
				break; // 到50即停
			}

			System.out.println(i);
			sum = sum + i;

		}
		System.out.println("總和 = " + sum);
		System.out.println("---------------------");
		int i = 1;
		int summ = 0;
		while (i <= 100) {
			summ += i; // summ = summ + i
			i++;// 計數字+1 (沒放會無窮迴圈)
		}
		System.out.println("final i = " + i); // 101
		System.out.println("summ = " + summ);
		System.out.println("-------do while-------");
		
		int j = 1;
		int sumd = 0;
		do {
//		sumd = sumd + j;
		if (j % 2 == 0) {
			sumd = sumd + j;
			}
		j++;
		} while (j <= 100);

		System.out.println("sumd = " + sumd);

	}

}
