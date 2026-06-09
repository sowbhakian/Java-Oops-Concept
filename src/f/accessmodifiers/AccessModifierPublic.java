package f.accessmodifiers;
// access modifier
// default - only in package
// public - every package
// private - with in the class
// protected - only in the Inheritable class & Same Package

// Non access modifier
// abstract (only declaration) - extends
// final - cant be Inheritable, Override, Assigned again

public class AccessModifierPublic{
    /**
     * Main method demonstrating public access modifier.
     * Shows that public members can be accessed from any class or package.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        
        //The datas can be accessed through any other java class ans Packages
        int rate = 10;
        
    }
}