public class ExceptionEx2 {
    public static void main(String[] args){
        int [] score = new int [3];
        score[0] = 100;
        score[1] = 80;
        score[2] = 70;
        score[3] = 85;
        for(int i = 0; i<score.length;i++){
            System.out.println("Score:" + score[i]);
        }
    }
}
