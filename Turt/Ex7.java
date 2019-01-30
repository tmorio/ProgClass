public class Ex7{
	public static void main(String[] args){
		int[] score = {80, 40, 60, 90, 70, 50};
		int sum = 0;
		double avg;
		for( int i = 0; i < score.length; i++){
			sum += score[i];
		}
		avg = (double)sum / score.length;
		System.out.println("Average=" + avg);
	}
}
