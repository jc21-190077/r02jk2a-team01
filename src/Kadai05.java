
public class Kadai05 {

	/**
	 * 課題05
	 * 引数として渡された配列の中で、最大値を返す
	 * @param d 数値が入っている配列
	 * @return 配列の中の最大値
	 */
	int getMax(int[] d) {
/*		int [] d;*/
		d = new int[d.length];
		int max =d[0];
		for(int i=0;i<d.length;i++) {
			if(max<d[i]) {
				max=d[i];
			}
		}
		return max;
	}
}
