// Static - KeyWord

// Static variables are stored at CLASS LOADER MEMORY not in Heap
// No obj required instead class name can be used
// static data members value is common thought the class
// eg - one place changes evey place changed
// Static method can use only Static data member 

// static - block
// initilized only once at the load of cls loader
// runs when the cls id loaded


public class StaticBlock{

    static int top;
    static{
        top = -1;
    }    


    public static void main(String[] args) {
        //Static Method Loads When the Class get Loaded
        System.out.println(StaticMethod.top);

    }
}
