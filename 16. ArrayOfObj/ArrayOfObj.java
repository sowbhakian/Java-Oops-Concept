import java.util.*;

class Student{
    private String name;
    private int roll;

    Student(String name,int roll){
        this.name = name;
        this.roll = roll;
    }

    public static void displayDetails(Student obj){
        System.out.println("Name: "+obj.name);
        System.out.println("Roll: "+obj.roll);
        System.out.println();
    }
    
    public static void objs(Student arrObj[]){
        for(int i=0;i<5;i++){
            Student.displayDetails(arrObj[i]);
        }
    }
    

}

public class ArrayOfObj {

    public static void main(String[] args) {     
        
        Student[] arrObj  = new Student[5];
        ArrayList<String> NameL = new ArrayList<String>();
        ArrayList<Integer> RollL = new ArrayList<Integer>();

        NameL.add("Sowbi1");
        RollL.add(189);        
    
        NameL.add("Sowbi2");
        RollL.add(190);        
    
        NameL.add("Sowbi3");
        RollL.add(191);

        NameL.add("Sowbi4");
        RollL.add(192);

        NameL.add("Sowbi5");
        RollL.add(193);

        //Creating Obj
        for(int i=0;i<5;i++){
            String name = NameL.get(i);
            int roll = RollL.get(i);
            arrObj[i] = new Student(name,roll);
            
        }
        
        System.out.println("\nPassing of Objects:");
        // passing of obj
        for(int i=0;i<5;i++){
            Student.displayDetails(arrObj[i]);
        }
        System.out.println();
        
        System.out.println("\nPassing Of Array:");
        // Array Of Obj Passing
        Student.objs(arrObj);
    }
}
