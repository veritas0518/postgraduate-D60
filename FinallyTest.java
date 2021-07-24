package Day25;

import org.junit.Test;

/**
 * finally的使用
 */
public class FinallyTest {
    @Test
    public void methodTest(){
        int test =  method();
        System.out.println(test);
    }
    public int method(){
        try {
            int[] arr =new int[10];
            System.out.println(arr[10]);

            return 1;

        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 2;
        }finally{
            System.out.println("我一定会被执行");
        }
    }


    @Test
    public void test1() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            int[] arr =new int[10];
            System.out.println(arr[10]);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("好帅啊");
        }
    }
}
