package Day25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 异常处理的方式二：throws + 异常类型
 *
 * 1.“throws + 异常类型 “ 写在方法的声明处。指明此方法执行时，可能会抛出的异常类型。
 *    一旦当方法体执行时，出现异常，仍会在异常代码处生成一个异常类ide对象，此对象满足throws后异常类型时，
 *    就会被抛出。异常代码后续的代码，就不再执行！
 *
 * 2.体会 try - catch -finally:真正的将异常给处理掉了。
 *       throws 的方式只是将异常抛给了方法的调用者。并没有真正将异常处理掉
 *
 * 3.并发中如何选择使用 try - catch - finally 还是使用throws?
 *   >如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能使用throws，则意味着如果子类重写的方法中有异常
 *   则必须使用try - catch -finally 方式处理
 *   >执行的方法中，先后又调用了另外的几个方法，这几个方法是递进关系执行的。我们建议这几个方法使用throws的方式进行处理。
 *   而执行的方法a可以考虑使用 try - catch - finally 方式处理
 *
 */

public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            method2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method2() throws IOException {
        method();
    }

    public static void method() throws FileNotFoundException, IOException {
        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);
        int data = fis.read();
        while (data != -1) {
            System.out.println((char) data);
            data = fis.read();
        }
        fis.close();
    }
}
