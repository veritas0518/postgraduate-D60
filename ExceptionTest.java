package Day25;

import org.junit.Test;

public class ExceptionTest {
    @Test
    public void test1(){
        String str ="123";
        str ="abc";
        try{
            int num =Integer.parseInt(str);

            System.out.println("hello  111");
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(NullPointerException e){
            System.out.println("出现了空指针异常");
        }
    }
}
