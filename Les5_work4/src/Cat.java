import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) {
        try {
            Class<?> animal = Animal.class;
            Animal a = new Animal();
            Field s = animal.getField("species");
            System.out.println("Значення public поля \"species\" було: " + s.get(a));
            s.set(a, "lion");
            System.out.println("Значення public поля \"species\" стало: " + s.get(a));

            Field age = animal.getDeclaredField("age");
            age.setAccessible(true);
            System.out.println("Значення protected поля \"age\" було: " + age.getInt(a));
            age.setInt(a, 6);
            System.out.println("Значення protected поля \"age\" стало: " + age.getInt(a));

            Field p = animal.getDeclaredField("price");
            p.setAccessible(true);
            System.out.println("Значення private поля \"price\" було: " + p.getInt(a));
            p.setInt(a, 8000);
            System.out.println("Значення private поля \"price\" стало: " + p.getInt(a));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
