class Test3{
    public static void main(String[] args){
        // 程式進入點
        Test.talk("Hello"); // 呼叫類別的方法
        Test.talk("你好");
        int ans=BasicMath3.add(3, 4);
        System.out.println(ans*20);
        ans=BasicMath3.multiply(4, 2);
        System.out.println("乘法的結果是:"+ans);
    }

    // 定義更多自己的類別方法
    static void talk(String content){
        System.out.println(content);
    }
}

class BasicMath3{
    static int add(int n1, int n2){
        int result=n1+n2;
        return result;
    }
    static int multiply(int n1, int n2){
        return n1*n2;
    }
}