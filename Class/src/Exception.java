public class Exception {
    public static void main(String[] args) {
        String text = null;
        int num;
        int result;

        // Arithmetic exception
        try{
            result = 5/0;
        }catch (ArithmeticException ae){
            ae.printStackTrace();
        }finally {
            System.out.println("Arithmetic Exception");
        }

        // Null Pointer Exception
        try{
            System.out.println(text.charAt(1));
        }catch (NullPointerException np){
            np.printStackTrace();
        }finally {
            System.out.println("Null Pointer Exception");
        }

        // Number Format Exception
        try{
            num = Integer.parseInt("Hello World!");
        }catch (NumberFormatException nf){
            nf.printStackTrace();
        }finally {
            System.out.println("Number Format Exception");
        }

        // Array Index Out Of Bound Exception
        try{
            int data[] = new int[5];
            System.out.println(data[5]);
        }catch (ArrayIndexOutOfBoundsException are){
            are.printStackTrace();
        }finally {
            System.out.println("Array Index Out of Bound Exception");
        }

    }
}
