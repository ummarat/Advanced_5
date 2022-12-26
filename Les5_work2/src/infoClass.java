import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class infoClass {
    static String s = (char) 27 + "[31m";//r
    static String s1 = (char) 27 + "[39m";//w
    static String s2 = (char) 27 + "[34m";//b
    static String s3 = (char) 27 + "[33m";

    public static void nameClass(Class<?> cl) {
        System.out.println(s3 + "Ім'я об'єкту: " + s1);
        System.out.println(cl.getName());
    }

    public static void fieldClass(Class<?> cl) {
        System.out.println(s3 + "Поля об'єкту: " + s1);
        Field[] fields = cl.getDeclaredFields();
        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            System.out.println(s + "\tName: " + s1 + field.getName());
            System.out.println(s2 + "\tType: " + s1 + fieldType.getName());
        }
    }

    public static void constructorsClass(Class<?> cl) {
        System.out.println(s3 + "Констуктори об'єкту: " + s1);
        Constructor<?>[] constructors = cl.getConstructors();
        int i = 0;
        for (Constructor<?> ctr : constructors) {
            System.out.print(s2 + "\n" + "\tConstructor " + s1 + (++i) + ": ");
            Class<?>[] paramTypes = ctr.getParameterTypes();
            for (Class<?> paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println();
        }
    }

    public static void methodsClass(Class<?> cl) {
        System.out.println(s3 + "Методи об'єкту: " + s1);
        Method[] methods = cl.getMethods();
        for (Method method : methods) {
            System.out.println("\n" + s + "Name: " + s2 + method.getName());
            System.out.println(s + "\tReturn type: " + s1 + method.getReturnType().getName());
            Class<?>[] paramTypes = method.getParameterTypes();
            System.out.print(s + "\tParam types:" + s1);
            for (Class<?> paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
        }
    }

    public static void modifiersClass(Class<?> cl) {
        System.out.println(s3 + "Модифікатори об'єкту: " + s1);
        int mods = cl.getModifiers();
        if (Modifier.isPublic(mods)) {
            System.out.print("public ");
        }
        if (Modifier.isPrivate(mods)) {
            System.out.print("private ");
        }
        if (Modifier.isProtected(mods)) {
            System.out.print("protected ");
        }
        if (Modifier.isInterface(mods)) {
            System.out.print("interface ");
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

    public static void allAboutClass(Class<?> cl) {
        nameClass(cl);
        System.out.println(s2 + "=================" + s1);
        fieldClass(cl);
        System.out.println(s2 + "=================" + s1);
        constructorsClass(cl);
        System.out.println(s2 + "=================" + s1);
        methodsClass(cl);
        System.out.println(s2 + "=================" + s1);
        modifiersClass(cl);
    }
}
