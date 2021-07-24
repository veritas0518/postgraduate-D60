package Day25;

/**
 * 在局部内部类的方法中（比如：show）如果调用局部内部类所声明的方法（比如：method）中的局部变量（比如：num）的话，
 * 要求此局部变量声明为final
 *
 * jdk 7及之前版本，要求此局部变量显式的声明为final的
 * jdk 8及以后的版本，可以省略final的声明
 *
 */
public class InnerClassTest {
    public void method(){
        int num = 10;  //存在一个final
        class AA{
            public void show(){
                System.out.println(num);
            }
        }
    }
}
