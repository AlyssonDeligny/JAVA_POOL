import java.lang.reflect.*;

public class Inspector<T>{

    Class <T> inspectedClass;

    public Inspector(Class <T> inspectedClass){
        this.inspectedClass = inspectedClass;
    }
    public void displayInformations(){
        System.out.println("Information of the \"" + inspectedClass.getName() + "\" class:");
        System.out.println("Superclass: " + inspectedClass.getSuperclass().getName());
        
        Method[] methods = inspectedClass.getDeclaredMethods();
        System.out.println(methods.length + " methods:");
        for(int i =0;i<methods.length;i++){
            System.out.println("- " + methods[i].getName());
        }
        
        Field[] fields = inspectedClass.getDeclaredFields();
        System.out.println(fields.length + " fields:");
        for(int i=0; i<fields.length;i++){
            System.out.println("- " + fields[i].getName());
        }
    }

    public Inspector<T> createInstance(){
        try{
            Inspector <T> inspector = new Inspector<T>(inspectedClass);
        return inspector;
        }
        catch(Exception e){
            throw e;
        }
    }

}