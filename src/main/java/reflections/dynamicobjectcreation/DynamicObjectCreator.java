package reflections.dynamicobjectcreation;

import java.lang.reflect.Method;

public class DynamicObjectCreator {
    public static void main(String[] args) {
        try {

            Class<?> clazz = Class.forName("reflections.dynamicobjectcreation.Student");

            Object studentObject = clazz.getDeclaredConstructor().newInstance();

            Method displayMethod = clazz.getMethod("displayInfo");
            displayMethod.invoke(studentObject);

        } catch (ClassNotFoundException e) {
            System.err.println("Error: Class not found. Make sure Student.java is compiled.");
        } catch (NoSuchMethodException e) {
            System.err.println("Error: Method displayInfo() not found.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
