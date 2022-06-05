package p13_Java高级技术_单元测试_反射_注解.d3_reflect_constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * 目标：反射_获取Constructor构造器对象.
 *
 * 反射的第一步是先得到Class类对象（Class文件)
 *
 * 反射中Class类型获取的构造器提供了很多API：
 *      1.Constructor getConstructor(Class... parameterTypes)
 *          根据参数匹配获取某个构造器，只能拿public修饰的构造器，几乎不用!
 *      2.Constructor getDeclaredConstructor(Class... parameterTypes)
 *          根据擦参数匹配某个构造器，只要申明就可以定位，不关心权限修饰符，建议使用！
 *      3.Constructor[] getConstructors()
 *          获取所有的构造器，只能拿public修饰的构造器，几乎不用，太弱了!
 *      4.Constructor[] getDeclaredConstructors()
 *          获取所有申明的构造器，只要你写我就能拿到，无所谓权限，建议使用！！
 *
 * 小结：
 *      获取类的全部构造器对象： Constructor[] getDeclaredConstructors()
 *          -- 获取所有申明的构造器，只要你写我就能拿到，无所谓权限。建议使用！！
 *      获取类的某个构造器对象：Constructor getDeclaredConstructor(Class... parameterTypes)
 *          -- 根据参数匹配获取某个构造器，只要申明就可以定位，不关心权限修饰符，建议使用！
 */
public class TestStudent01 {
    // 1.getConstructors:
    // 获取全部的构造器：只能获取public修饰的构造器
    // Constructor[] getConstructor()
    @Test
    public void getConstructors(){
        // a.第一步：获取类对象
        Class c = Student.class;
        // b.提取类中的全部的构造器对象（只能拿public修饰的）
        Constructor[] constructors = c.getConstructors();
        // c.遍历构造器
        for (Constructor constructor:constructors){
            System.out.println(constructor.getName()+"===>"+constructor.getParameterCount());
        }
    }
}
