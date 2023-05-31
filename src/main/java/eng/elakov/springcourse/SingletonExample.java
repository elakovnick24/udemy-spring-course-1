package eng.elakov.springcourse;

/**
 *
 * Дополнительный материал к 7 уроку в курсе про Spring Framework
 *
 * Пример класса, реализующего паттерн Singleton (англ. Одиночка)
 * Можно будет использовать только один объект класса Lesson7Singleton
 */
public class SingletonExample {
    // В этой статической(!) переменной будет хранится единственный объект класса Lesson7Singleton
    private static SingletonExample instance;

    // Скажем, что у нашего единственного объекта должно быть поле value
    private String value;

    // Метод getter для поля value
    public String getValue() {
        return value;
    }

    // ВАЖНО: Конструктор должен быть приватным
    // Мы не хотим, чтобы пользователь мог создавать новые объекты класса Lesson7Singleton
    private SingletonExample(String value) {
        this.value = value;
    }

    // Вот этот статический метод будет вызывать пользователь, чтобы получить объект класса Lesson7Singleton
    public static SingletonExample getInstance(String value) {
        // если ранее не был создан единственный объект
        if (instance == null) {
            // код здесь выполняется только в момент первого вызова метода getInstance()

            // создаем объект один раз
            instance = new SingletonExample(value);
        }

        // все остальные вызовы метода getInstance() пользователю возвращается тот же самый объект
        return instance;
    }
}

// Тестируем
class SingletonTest {
    public static void main(String[] args) {
        SingletonExample first = SingletonExample.getInstance("Hello!");
        SingletonExample second = SingletonExample.getInstance("Goodbye!");

        // true
        System.out.println(first == second);

        // Hello!
        System.out.println(first.getValue());

        // Hello!
        System.out.println(second.getValue());
    }
}
