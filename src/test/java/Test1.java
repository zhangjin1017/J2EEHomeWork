import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    public void fun1(){
        for (int i = 0; i < 10;i++) {
            double a=Math.random()*100;
            String str=String.format("%.2f",a);
            System.out.println(str);
        }
    }
    @Test
    public void fun2(){
       double d=20.2213;
       String str = String.format("%.2f",d);
        System.out.println(str);

    }

}
