/**
 * build an Easter class
 * 
 * @author userx550jd
 *
 */
public class Easter {
	/**
	 * using Gauss’s algorithm to calculate the day of Easter
	 */
	public String caculateEaster(int year) {
		int a = year % 19;
		int b = year / 4;
		int c = year % 7;
		double k = Math.floor(year / 100);
		double p = Math.floor((13 + 8 * k) / 25);
		double q = Math.floor(k / 4);
		// 強制轉型或許會產生一些誤差喔, 要多留意(雖然在這次的case是不會出現這問題啦)
		int M = (int) (15 - p + k - q) % 30;
		int N = (int) (4 + k - q) % 7;
		int d = (int) (19 * a + M) % 30;
		int e = (int) (2 * b + 4 * c + 6d + N) % 7;
		if (d == 29 && e == 6) {
			return "Easter Sunday is: month = 4 and day = 19";
		} else if (d == 28 && e == 6 && ((11 * M + 11) % 30) < 19) {
			return "Easter Sunday is: month = 4 and day = 18";
		} else {
			if (22 + d + e <= 31) {
				return "Easter Sunday is: month = 3 and day = " + (22 + d + e);
			}
			if (d + e - 9 >= 0 && d + e - 9 <= 30) {
				return "Easter Sunday is: month = 4 and day = " + (d + e - 9);
			}
		}
		return null;
	}

}
