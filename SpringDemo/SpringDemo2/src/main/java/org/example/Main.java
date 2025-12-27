package org.example;

import org.example.helper.Laptop;
import org.example.helper.Pen;
import org.example.helper.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student st = ctx.getBean(Student.class);
        Laptop lp = ctx.getBean(Laptop.class);
        Pen pen = ctx.getBean(Pen.class);

        st.name = "Prem Aman";
        st.age = 21;
        lp.model = "Mac Air";

        System.out.println(
                "my name is " + st.name +
                        " the model of laptop i use is " + lp.model +
                        " and my age is " + st.age
        );
        Student st2 = ctx.getBean(Student.class);
        System.out.println(st2.laptop.model);


        pen.type = "Ball";
        System.out.println(st.pen.type);
        System.out.println(st2.pen.type);
    }
}
