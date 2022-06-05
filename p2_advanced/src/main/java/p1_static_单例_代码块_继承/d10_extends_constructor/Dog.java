package p1_static_单例_代码块_继承.d10_extends_contructor;

public class Dog extends Animal{
    public Dog(){
        super(); // 写不写都可以，默认找父类的无参构造器执行
        System.out.println("子类Dog的无参构造器被执行~");
    }

    public Dog(String name){
        super(); // 写不写都可以，默认找父类的无参构造器执行
        System.out.println("子类Dog的有参构造器被执行");
    }
}
