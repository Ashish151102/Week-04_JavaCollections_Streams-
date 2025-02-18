package reflections.retrieveannotation;

import java.lang.annotation.Annotation;

public class AnnotationRetriever {
    public static void main(String[] args) {
        try {
            // Corrected package name
            Class<?> clazz = Class.forName("reflections.retrieveannotation.AnnotatedClass");

            if (clazz.isAnnotationPresent(Author.class)) {
                // Retrieve the annotation
                Annotation annotation = clazz.getAnnotation(Author.class);
                Author author = (Author) annotation;
                System.out.println("Author: " + author.name());
            } else {
                System.out.println("No @Author annotation found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
