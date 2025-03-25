import java.lang.reflect.*;

public class ReflectionOfCat {
    public static void main(String[] args) throws Exception{
        Cat myCat = new Cat("Stella", 6);

        Field[] catFields = myCat.getClass().getDeclaredFields(); // Gets declared fields and stores them in a FIELD array

        for(Field field : catFields){
            System.out.println(field.getName()); // Prints out the declared fields
        }
        
        System.out.println(myCat.getName()); // Name should be STELLA

        for(Field field : catFields){
            if(field.getName().equals("name")){
                field.setAccessible(true); // Allows the PRIVATE AND FINAL variable be changed
                field.set(myCat, "Fred"); // Gives a CHECKED exception that the user must handle
            }
        }
        System.out.println(myCat.getName()); // Name should be FRED now

        System.out.println();

        Method[] catMethods = myCat.getClass().getDeclaredMethods(); // Gets a METHOD array

        for(Method method : catMethods){
            System.out.println(method.getName()); // Prints method names that are declared
        }

        for(Method method : catMethods){
            if(method.getName().equals("meow")){
                method.invoke(myCat); // Invokes the method specified in the IF. (OBJECT , ARGS)
            }
        }

        for(Method method : catMethods){
            if(method.getName().equals("heyThisIsPrivate")){
                method.setAccessible(true); // Allows the private method to be invoked and used
                method.invoke(myCat); // Invokes the method specified in the IF. (OBJECT , ARGS)
            }
        }

        for(Method method : catMethods){
            if(method.getName().equals("thisIsPublicAndStatic")){
                method.invoke(null); // Invokes the method specified in the IF. (OBJECT , ARGS)
            }
        }

        for(Method method : catMethods){
            if(method.getName().equals("thisIsPrivateAndStatic")){
                method.setAccessible(true); // Allows the private method to be invoked and used
                method.invoke(null); // Invokes the method specified in the IF. (OBJECT , ARGS), allows the PRIVATE and STATIC method be called and used
            }
        }
        
        
    }
}
