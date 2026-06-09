package e.statickeyword;
// Static - KeyWord

// Static variables are stored at CLASS LOADER MEMORY not in Heap
// No object required instead class name can be used
// static data members value is common thought the class
// eg - one place changes every place changed
// Static method can use only Static data member 

// static - block
// initilized only once at the load of class loader
// runs when the class id loaded


public class StaticBlock{

    static int top;
    static{
        top = -1;
    }    


    /**
     * Main method demonstrating static block initialization.
     * Shows that static blocks are executed when the class is loaded.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        //Static Method Loads When the Class get Loaded
    	StaticMethod.method();

    }
}
