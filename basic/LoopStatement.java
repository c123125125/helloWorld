import java.util.Scanner;
public class LoopStatement{ 
    public static void main(String[] args){
        // continue; 基本測試
        for(int i=0;i<=6;i++){
            if(i%3==0){ // 如果 i 被 3 整除
                continue; // 強制返回迴圈的上方，進入下一圈
            }
            System.out.println(i);
        }

        // break; 基本測試
        int i=0;
        while(i<=6){
            if(i==4){
                break; // 強制結束迴圈
            }
            System.out.println(i);
            i++;
        }
        
        // 應用案例:練續輸入直到正確為止
        Scanner s=new Scanner(System.in);
        int number;
        while(true){
            System.out.println("請輸入一個正整數:");
            number=s.nextInt();
            if(number>0){ // 如果輸入正確，強制結束迴圈
                System.out.println("輸入正確");
                break;
            }else{ // 如果輸入錯誤，繼續執行迴圈
                System.out.println("輸入錯誤，再來");
            }
        }
    }
}
