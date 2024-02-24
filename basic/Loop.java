public class Loop{
    public static void main(String[] args){
        // while 無窮迴圈
        while(true){
            System.out.println("Loop");
        }
        // while 可被控制迴圈
        int x=2;
        while(x<=6){
            System.out.println(x);
            x++;
        }
        // 計算 1+2+3+4+5 的總和
        int total=0;
        int n=1;
        while(n<=5){
            total=total+n;
            n++;
        }
        System.out.println(total);

        // 控制 for 迴圈的運作
        for(int x=2;x<=6;x+=2){
            System.out.println(x);
        }
        // 計算 1+2+3+4+5+...+100 的總和
        int total=0;
        for(int n=1;n<=100;n++){
            total=total+n;
        }
        System.out.println(total);
    }
}