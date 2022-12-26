import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        Class<?> cl = Arhiv.class;
        System.out.println("Найменування класу: " + cl.getName());

        System.out.println("Поля класу: ");
        //отримання полів з усіма модифікаторами
        Field[] fields = cl.getDeclaredFields();
        for (Field f : fields) {
            Class<?> fieldType = f.getType();
            System.out.println("\tІм'я: " + f.getName());
            System.out.println("\tТип: " + fieldType.getName());
        }

        System.out.println("Конструктори класу: ");
        Constructor[] constructors = cl.getConstructors();
        int i = 0;
        for (Constructor<?> ctr : constructors) {
            System.out.print("Constructor " + (++i) + ": ");
            Class<?>[] paramTypes = ctr.getParameterTypes();
            for (Class<?> paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println();
        }

        System.out.println("Методи класу: ");
        Method[] methods = cl.getMethods();
        for (Method method : methods) {
            System.out.println("Ім'я: " + method.getName());
            System.out.println("\tТип: " + method.getReturnType().getName());
            Class<?>[] paramTypes = method.getParameterTypes();
            System.out.print("\tТип параметра:");
            for (Class<?> paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
        }

        System.out.println("Модифікатори доступу: ");
        int mods = cl.getModifiers();
        if (Modifier.isPrivate(mods)) {
            System.out.print("private ");
        }
        if (Modifier.isPublic(mods)) {
            System.out.print("public ");
        }
        if (Modifier.isProtected(mods)) {
            System.out.print("protected ");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.print("abstract ");
        }
        if (Modifier.isStatic(mods)) {
            System.out.print("static ");
        }
        if (Modifier.isFinal(mods)) {
            System.out.print("final ");
        }
    }
}