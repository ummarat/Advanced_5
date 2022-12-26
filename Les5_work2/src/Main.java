import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть повну назву класу (наприклад, java.util.ArrayList)");
        Class<?> cl =  Class.forName(scanner.next());

        //отримання усієї інформації про клас
        infoClass.allAboutClass(cl);

        //за потреби можна отримувати інформацію про вибіркові параметри класу
//        infoClass.nameClass(cl);
//        infoClass.fieldClass(cl);
//        infoClass.constructorsClass(cl);
//        infoClass.methodsClass(cl);
//        infoClass.modifiersClass(cl);
    }
}