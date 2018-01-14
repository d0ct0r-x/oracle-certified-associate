package program;

public class VariableScope {

    static int myNewInt = 5;

    public static void main(String[] args) {
        int myLocalInt = 10;

        {
            int myOtherInt = 20;
            {
//                int myOtherInt = 10; // already defined in scope
            }
            System.out.println("myOtherInt = " + myOtherInt);
            System.out.println("inCodeBlock myLocalInt = " + myLocalInt);
        }

//        System.out.println("myOtherInt = " + myOtherInt);
        System.out.println("myLocalInt = " + myLocalInt);
        System.out.println("myNewInt = " + myNewInt);

        int myOtherInt = 30;

        System.out.println("myOtherInt = " + myOtherInt);
    }

    public static void myMethod() {

    }
}
