public class Ex8{
	public static void main(String[] args){
		int[] score = {80, 40, 60, 90, 70, 50};
		System.out.println("Max=" + findMax(score));
		}
	public static int findMax(int[] score){
		int max = score[0];
		for(int i = 0; i < score.length; i++){
			if (score[i] > max) max = score[i];
		}
		return max;
	}
}
