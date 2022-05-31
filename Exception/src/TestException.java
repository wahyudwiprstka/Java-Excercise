public class TestException extends UserException{
    TestException(String msg) {
        super(msg);
    }

    public static void ageCheck(int age) throws UserException {
        if (age>40){
            throw new UserException("You're too old");
        }else{
            System.out.println("You are eligible");
        }
    }

    public static void main(String[] args) {
        try{
            ageCheck(50);
        }catch (UserException ue){
            ue.printStackTrace();
        }finally {
            System.out.println("finally");
        }
    }
}
