public class MultiThread1 {
    public static void main(String[] args){
        MyThread th = new MyThread();
        th.start();

        for(int i = 0; i <10; i++){
            System.out.println("<-- MultiThread1 の main 実行" + i);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
