import java.lang.reflect.*;
class ReflectionExample {
    public void sayHello() {
        System.out.println("Hello from reflection");
    }
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ReflectionExample");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
        }
        Object obj = clazz.getDeclaredConstructor().newInstance();
        Method method = clazz.getDeclaredMethod("sayHello");
        method.invoke(obj);
    }
}