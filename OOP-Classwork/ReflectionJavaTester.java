import java.lang.reflect.*;
public class ReflectionJavaTester {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException{
        ReflectionJavaCode rjc = new ReflectionJavaCode();

        Method[] rjcMethods = rjc.getClass().getDeclaredMethods();
        Field[] rjcFields = rjc.getClass().getDeclaredFields();

        for(Field field : rjcFields){
            System.out.println(field.getName());
        }


        // ANSWER 1
        for(Method method : rjcMethods){
            if(method.getName().equals("private_info")){
                method.setAccessible(true);
                method.invoke(null);
            }
        }

        // ANSWER 2
        for(Field field : rjcFields){
            if(field.getName().equals("michasUsername")){
                field.setAccessible(true);
                field.set(rjc, "ChangeYourNameNerd");
            }
        }
        System.out.println(rjc.getUser());

        // ANSWER 3
        System.out.println(rjc.getPassword());
        for(Field field : rjcFields){
            if(field.getName().equals("michasPassword")){
                field.setAccessible(true);
                field.set(rjc, "ChangeYourPasswordNerd");
            }
        }
        System.out.println(rjc.getPassword()); 

        String user = "ChangeYourNameNerd";
        String pass = "ChangeYourPasswordNerd";
        rjc.main_access_terminal(user, pass);
    }
}     
  
