/*
Derek McPeak
CSC245 Secure Software Development
Doug Lundin
*/


public class NewMain {
    public static void main(String[] args) {

        //importing NotSafeClass
        NotsafeClass nsc = new NotsafeClass();

        //printing out the default tostring
        System.out.println(nsc.toString());
        System.out.println("\n");


        //printing out the changes made to the NotSafeClass.
        //variable to alter chosen through, Run -> Edit Configurations -> Program Arguments
        System.out.println("Altered Class");
        for (String arg : args) {
            nsc.zeroField(arg);
            System.out.println(nsc.toString());
        }


    }
}
