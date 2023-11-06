import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println( bean1.getMessage());

        Cat cat = applicationContext.getBean("catBean", Cat.class);
        cat.setName("Мурзик");
        Cat cat1 = applicationContext.getBean("catBean", Cat.class);
        cat.setName("Пушок");

        System.out.println("Сравниваем ссылки cat и cat1: " + (cat == cat1));
        System.out.println("Сравниваем объекты bean и bean1: " + (bean.equals(bean1)));
        System.out.println("Имя кота cat: " + cat.getName());
        System.out.println("Имя кота cat1: " + cat1.getName());

    }
}