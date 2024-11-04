import java.lang.reflect.Method;

public class TestRunner{

    public void runTests(Class<?> class1){
        for(Method method:class1.getDeclaredMethods()){
            if(method.isAnnotationPresent(Test.class)){
                try {
                    Test a =  method.getAnnotation(Test.class);
                    if(a.enabled()){
                        System.out.println(a.name());
                        method.invoke(class1);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                
            }
        }
    }
}
