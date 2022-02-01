/*
Derek McPeak
CSC245 Secure Software Development
Doug Lundin
*/


import java.lang.reflect.Field;


class NotsafeClass {


    private String name = "Billy bob joe";
    private int age = 54;

    @Override
    public String toString() {
        return "NotsafeClass " + "\n"+
                "name = " + name + "\n" +
                "age = " + age;
    }


    //
    public void zeroField(String fieldName) {           // Not compliant
        //private void zeroField (String fieldName) {         // Compliant
        try {

            //try catch block
            //Calling the field class, getting the class of the argument that is passed into the method

            Field f = this.getClass().getDeclaredField(fieldName);                  // This is the reflection code
            // Subsequent access to field f passes language access checks
            // because zeroField() could have accessed the field via
            // ordinary field references


            //setting the value of the class to "ricky"
            f.set(this, "ricky");
            // Log appropriately or throw sanitized exception; see EXC06-J
        } catch (NoSuchFieldException ex) {
            // Report to handler
            System.out.println("NoSuchFieldException");
        } catch (IllegalAccessException ex) {
            // Report to handler
            System.out.println("IllegalAccessException");
        }
    }







}
